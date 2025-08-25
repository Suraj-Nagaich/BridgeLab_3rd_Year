package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Mean_Of_Player {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of players in the football team: ");
        int numberOfPlayers = sc.nextInt();
        if (numberOfPlayers <= 0) {
            System.out.println("Invalid number of players. Must be greater than 0.");
            return;
        }
        double sum = 0;
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.print("Enter height of player " + i + " (in cm): ");
            double height = sc.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid height. Must be a positive number.");
                i--;
                continue;
            }
            sum += height;
        }
        double mean = sum / numberOfPlayers;
        System.out.printf("\nMean height of the players: %.2f cm\n", mean);
	}

}
