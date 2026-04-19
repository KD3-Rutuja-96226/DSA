
public class LinearSearch {

	public static int lastOccurenceLinearSearch(int[] arr, int key) {
		for(int i = arr.length-1; i>=0;i--) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}	
	public static void main(String[] args) {
		int[] arr = {5,7,9,3,5,6,1,9,0};
		int key = 5;
		int res = lastOccurenceLinearSearch(arr, key);
		if(res == -1) {
			System.out.println("Key is not exits.");
		}
		else {
			System.out.println(key+" is found at index "+res);
		}
	}
}
