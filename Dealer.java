public class Dealer extends Player {
    @Override
    public void draw(Deck deck) {
       // while (HandValue.calculate(hand) >= 16) {
           // super.draw(deck);
        //}

        if(HandValue.calculate(hand) <= 16) {
            super.draw(deck);
        }
        else if(HandValue.calculate(hand) >= 17) {
            System.out.println("Dealer stands.");
        }
    }
}