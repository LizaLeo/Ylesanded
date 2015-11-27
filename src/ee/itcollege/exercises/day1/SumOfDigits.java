package ee.itcollege.exercises.day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Insert number");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.printf("sisetasid: %s", line);		
		try {
			double parsedInt = Integer.parseInt(line);
			double result = 0;
			for (int i = line.length(); i > 0; i--) {
				result = result + parsedInt / Math.pow(10, i);
				parsedInt = parsedInt - (parsedInt / Math.pow(10, i)*Math.pow(10, i));
						
			}
			System.out.println("Summa of digits: " + result);
		}catch (NumberFormatException e) {
			System.out.println("Incorrect number");
		}
		
		
		scanner.close();

	}

}
