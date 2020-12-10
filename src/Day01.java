import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01 {

	public static void partOne(ArrayList<Integer> numbers) {

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {

				int added = numbers.get(i) + numbers.get(j);
				if (added == 2020) {
					int multiplied = numbers.get(i) * numbers.get(j);
					System.out.println(multiplied);
				}

			}
		}
	}

	public static void partTwo(ArrayList<Integer> numbers) {
		
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				for (int k = j + 1; k < numbers.size(); k++) {

					int added = numbers.get(i) + numbers.get(j) + numbers.get(k);
					if (added == 2020) {
						int multiplied = numbers.get(i) * numbers.get(j) * numbers.get(k);
						System.out.println(multiplied);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		File answerText = new File("advent01.txt");
		Scanner textScanner;
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		try {

			textScanner = new Scanner(answerText);
			while (textScanner.hasNextInt()) {

				int line = textScanner.nextInt();
				numbers.add(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		partOne(numbers);
		partTwo(numbers);

	}
}
