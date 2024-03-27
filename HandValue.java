import java.util.List;

public class HandValue {
    public static int calculate(List<Card> hand) {
        int value = 0;
        for (Card card : hand) {
            String rank = card.getRank();
            if (rank.equals("A")) {
                value += 11;
            } else if (rank.matches("K|Q|J")) {
                value += 10;
            } else {
                value += Integer.parseInt(rank);
            }

        }
        return value;
    }

    
}