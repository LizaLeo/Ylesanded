package ee.itcollege.exercises.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		
		int count = 3;
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.format("Insert %d names\n", count);
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			names.add(scanner.nextLine());
		}
		
		System.out.println();
		
		Collections.sort(names);
		for (String name : names) {
			System.out.format("%s\n", name);			
		}
		
		System.out.println();
		
		// lambda expression
		Collections.sort(names, (o1, o2) -> {
			if (o1.length() > o2.length()) {
				return 1;
			} else if (o1.length() < o2.length()) {
				return -1;
			} else {
				return o1.compareTo(o2);
			}	
		});
		
		for (String name : names) {
			System.out.format("%s\n", name);			
		}

		scanner.close();
	}

}
