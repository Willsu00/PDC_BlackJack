public int handValue() {
    int value = 0;
    int aceCount = 0;

    for (Card card : hand) {
        String rank = card.getRank();
        if (rank.equals("A")) {
            value += 11;
            aceCount++;
        } else if (rank.matches("K|Q|J")) {
            value += 10;
        } else {
            value += Integer.parseInt(rank);
        }
    }

    // If value is over 21 and we have aces in hand, reduce value by 10 for each ace
    while (value > 21 && aceCount > 0) {
        value -= 10;
        aceCount--;
    }

    return value;
}