import java.util.Scanner;

public class ExtendedBattingStatics {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("welcome to batting avarage calculator");
		System.out.println("please enter the number of player :");
		int inputNumberOfPlayer = scan1.nextInt();
		scan1.nextLine();
		System.out.println("please enter number of times at bat for the player"
				+ "Enter 0 for out, 1 for single, 2 for double, 3 for triple, 4 for home run:");
		int inputNumberOfTimesAtBat = scan1.nextInt();
		scan1.nextLine();
		BattingStatistics bs = new BattingStatistics();
		int[][] playerData = new int[inputNumberOfPlayer][inputNumberOfTimesAtBat];
		for (int i = 0; i < inputNumberOfPlayer; i++) {
			for (int j = 0; j < inputNumberOfTimesAtBat; j++) {
				System.out.println("enter result for" + j + "bat.");
				playerData[i][j] = scan1.nextInt();
				scan1.nextLine();
			}
		
			double batterAvarage = bs.calculateBattingAvarage(playerData[i]);
			System.out.println("batter " + i + " Avarage: " + batterAvarage);
			double sluggingPercentage = bs.calculateSluggingPercentages(playerData[i]);
			System.out.println("batter " + i + " sluggingPercentage: " + sluggingPercentage);
		}
     scan1.close();
	}

}
