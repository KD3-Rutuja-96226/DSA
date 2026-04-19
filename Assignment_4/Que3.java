import java.util.Scanner;

public class Que3 {

	public static int linearSearch(int arr[], int k, int n) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == k) {
				count++;
				if(count == n)
					return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {4,95,6,95,3,7,95};
		System.out.println("Enter the key : ");
		int k = sc.nextInt();
		int res = linearSearch(arr, k, 3);
		if(res==-1) {
			System.out.println("Key not Exits");
		}
		else {
			System.out.println(k+" is found at index "+res);
		}
	}
}
