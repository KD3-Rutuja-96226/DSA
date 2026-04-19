//1.Calculate the mode of an array. The mode is the element occurred maximum time in the array.

import java.util.HashMap;
import java.util.Map;

public class Que1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 2, 9, 4, 3, 8, 3,3,3,3};
		int max=0, ele=0;
		int i;
		for(i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			max = Math.max(max, count);
			 ele = arr[i];
		}
		System.out.println("The Mode of "+ele+ " is "+max);
	}

}
