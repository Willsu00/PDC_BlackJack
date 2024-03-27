import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        

        Deck deck = new Deck();
        Player player = new Player();
        Dealer dealer = new Dealer();

        player.draw(deck);
        player.draw(deck);
        dealer.draw(deck);
        
        //System.out.println("Dealer's hand: "+dealer.getHand());

        
        Scanner scanner = new Scanner(System.in);
        boolean gameEnd = false;

        while (!gameEnd) {
            System.out.println("Player's hand: " + player.getHand());
            System.out.println("Dealer's hand: " + dealer.getHand() + " and [One Facedown Card]");
            int playerValue = HandValue.calculate(player.getHand());
            int dealerValue = HandValue.calculate(dealer.getHand());
            System.out.println("Player's hand value: " + playerValue);
            System.out.println("Dealer's hand value: " + dealerValue);
            if (playerValue == 21) {
                System.out.println("Winner winner chicken dinner! You got 21!");
                gameEnd = true;
                break;
            }
            else if(playerValue > 21) {
                System.out.println("Bust!");
                gameEnd = true;
                break;
            }



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
                break;
            } else {
                System.out.println("Invalid action. Please enter 'hit' or 'stand'.");
            }
        }

        int playerValue = HandValue.calculate(player.getHand());
        int dealerValue = HandValue.calculate(dealer.getHand());

        System.out.println("Player's hand value: " + playerValue);
        System.out.println("Dealer's hand: " + dealer.getHand());
        System.out.println("Dealer's hand value: " + dealerValue);


        while (HandValue.calculate(dealer.getHand()) <= 16) {
            dealer.draw(deck);
            dealerValue = HandValue.calculate(dealer.getHand());
            System.out.println("Dealer's hand: " + dealer.getHand() + " " + dealerValue);
        }

        if (playerValue > 21) {
            System.out.println("Dealer wins.");
        } else if (dealerValue > 21) {
            System.out.println("Player wins.");
        } else if (playerValue > dealerValue) {
            System.out.println("Player wins.");
        } else if (dealerValue >= playerValue && dealerValue > 21) {
            System.out.println("Player Loses.");
        } else if(dealerValue > playerValue) {
            System.out.println("Dealer wins.");
        }else {
            System.out.println("It's a tie.");
        }

        scanner.close();
    }
}