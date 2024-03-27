import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        

        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        player.draw(deck);
        player.draw(deck);
        dealer.draw(deck);
        
        System.out.println("Dealer has: "+dealer.getHand());

        dealer.draw(deck);
        
        Scanner scanner = new Scanner(System.in);
        boolean gameEnd = false;

        while (!gameEnd) {
            System.out.println("Player's hand: " + player.getHand());
            //System.out.println("Dealer's hand: " + dealer.getHand());

            System.out.println("Would you like to 'hit' or 'stand'?");
            String action = scanner.nextLine().toLowerCase();

            if (action.equals("hit")) {
                try {
                    player.draw(deck);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("The deck is empty. Game over.");
                    gameEnd = true;
                }
            } else if (action.equals("stand")) {
                dealer.draw(deck);
                gameEnd = true;
            } else {
                System.out.println("Invalid action. Please enter 'hit' or 'stand'.");
            }
        }

        int playerValue = HandValue.calculate(player.getHand());
        int dealerValue = HandValue.calculate(dealer.getHand());

        System.out.println("Player's hand value: " + playerValue);
        System.out.println("Dealer's hand value: " + dealerValue);

        if (playerValue > 21) {
            System.out.println("Dealer wins.");
        } else if (dealerValue > 21) {
            System.out.println("Player wins.");
        } else if (playerValue > dealerValue) {
            System.out.println("Player wins.");
        } else if (dealerValue > playerValue) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie.");
        }

        scanner.close();
    }
}