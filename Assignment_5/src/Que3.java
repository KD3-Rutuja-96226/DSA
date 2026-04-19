//Modify the insertion sort algorithm to sort the array in descending order

import java.util.Arrays;

public class Que3 {
	public static void InsertionOrder(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(temp > arr[j]) {
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {44,55,22,66,11,33};
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		InsertionOrder(arr);
		System.out.println("After Sorting : "+Arrays.toString(arr));
	}

}
