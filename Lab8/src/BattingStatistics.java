import java.util.InputMismatchException;
import java.util.Scanner;

public class BattingStatistics {

	public static double calculateBattingAvarage(int[] result1) {
		int strike = 0;
		for (int i = 0; i < result1.length; i++) {
			if (result1[i] == 0) {
				continue;
			}
			strike++;
		}
		double battingAvarage = (double) strike / result1.length;
		return battingAvarage;
	}

	public static double calculateSluggingPercentages(int[] result2) {
		double percentage = 0;
		for (int j = 0; j < result2.length; j++) {
			percentage = percentage + result2[j];
		}
		double sluggingP = (double) percentage / result2.length;
		return sluggingP;
	}

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		System.out.println("welcome to batting avarage calculator");
		while (choice.equalsIgnoreCase("yes")) {
			System.out.println("please enter number of times at bat for the player");
			int userInput1 = scan1.nextInt();
			scan1.nextLine();
			System.out.println("please enter the result for each bat."
					+ "Enter 0 for out, 1 for single, 2 for double, 3 for triple, 4 for home run:");

			int[] userInput2 = new int[userInput1];

			for (int a = 0; a < userInput1; a++) {
				System.out.println("please enter the result for" + a + " bat.");
				userInput2[a] = scan1.nextInt();
				scan1.nextLine();
				while (userInput2[a] < 0 || userInput2[a] > 4) {
					try {
						throw new InputMismatchException();
					} catch (InputMismatchException e) {
						System.out.println("enter number from 0 to 4");
						System.out.println("please enter the result for" + a + " bat.");
						userInput2[a] = scan1.nextInt();
						scan1.nextLine();
					}

				}
			}
			double battingAvarage = calculateBattingAvarage(userInput2);
			System.out.println("Batting Avarage=" + battingAvarage);
			double sluggingPercentage = calculateSluggingPercentages(userInput2);
			System.out.println("SluggingPercentage=" + sluggingPercentage);
			System.out.println("would you want to know the batting avarage ang slugging percentage of another batter?"
					+ "enter yes /no");
			choice = scan1.nextLine();
			scan1.nextLine();
		}
		scan1.close();

	}

}
