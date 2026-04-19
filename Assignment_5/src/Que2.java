//2.Count occurrences of each word in a line/file.

import java.util.HashMap;
import java.util.Map;

public class Que2 {
	public static void CountOccurence(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], 1);
			}
		}	
		
		for (String str : map.keySet()) {
			System.out.println(str+"->"+map.get(str));
		}
	}
	public static void main(String[] args) {
		String s  = "I Love Java and Java is very very Important";
		CountOccurence(s);
	}

}
