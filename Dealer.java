public class Dealer extends Player {
    @Override
    public void draw(Deck deck) {
        while (HandValue.calculate(hand) < 17) {
            super.draw(deck);
        }
    }
}