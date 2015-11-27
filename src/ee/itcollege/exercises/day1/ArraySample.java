package ee.itcollege.exercises.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		
		int[] arvud = {1, 2, 3}; 
		System.out.printf("Massiiv arvud: %s\n", Arrays.toString(arvud));

		int[] arvud2 = new int[10]; 
		arvud2[0] = 4; 
		System.out.printf("Massiiv arvud2: %s\n", Arrays.toString(arvud2));

		ArrayList<Integer> arvud3 = new ArrayList<Integer>(); 
		arvud3.add(3);
		System.out.printf("ArrayList arvud3: %s\n", arvud3.toString());
	}

}
