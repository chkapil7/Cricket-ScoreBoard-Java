import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter team name: ");
        String teamName = scanner.nextLine();

        CricketScoreCard scoreCard = new CricketScoreCard(teamName);

        while (true) {
            System.out.print("Enter runs scored (or -1 to exit): ");
            int runs = scanner.nextInt();
            if (runs == -1)
                break;

            System.out.print("Enter wickets lost: ");
            int wickets = scanner.nextInt();

            System.out.print("Enter overs bowled: ");
            double overs = scanner.nextDouble();

            scoreCard.updateScore(runs, wickets, overs);
        }

        scoreCard.displayScoreCard();

        scanner.close();
    }
}
