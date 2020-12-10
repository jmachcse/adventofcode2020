import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {

		File answerText = new File("advent02.txt");
		Scanner textScanner;
		ArrayList<String> passwords = new ArrayList<String>();

		try {

			textScanner = new Scanner(answerText);
			while (textScanner.hasNextLine()) {

				String line = textScanner.nextLine();
				passwords.add(line);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int good = 0;
		for (String s : passwords) {

			int dash = s.indexOf("-");
			int minimum = Integer.parseInt(s.substring(0, dash));

			int space = s.indexOf(" ");
			int maximum = Integer.parseInt(s.substring(dash + 1, space));

			char c = s.charAt(space + 1);

			int colon = s.indexOf(":");

			String password = s.substring(colon + 2);

			int counter = 0;
			for (int i = 0; i < password.length(); i++) {
				if (password.charAt(i) == c) {
					counter++;
				}
			}
			
			if (counter <= maximum && counter >= minimum) {
				good++;
			}
			
		}
		System.out.println(good);
	}

}
