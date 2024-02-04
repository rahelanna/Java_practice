import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// for-each = traversing technique to iterate through the elements in an array/collestion
		// 			  less steps, more readable
		//			  less flexible
		
		// String[] animals = {"cat", "dog", "rat", "bird"};
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rate");
		animals.add("bird");
		
		
		for(String i : animals) {
			System.out.println(i);
		}
		
	}
	}

