class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        deck = Arrays.stream(deck).sorted().toArray();

        return solution(deck);
    }

    public int[] solution(int[] deck) {
        if (deck.length <= 2)
            return deck;
        int length1 = deck.length / 2 + deck.length % 2;
        int length2 = deck.length - length1;
        int[] sub1 = new int[length1];
        int[] sub2 = new int[length2];

        System.arraycopy(deck, 0, sub1, 0, sub1.length);
        System.arraycopy(deck, sub1.length, sub2, 0, deck.length - sub1.length);

        sub2 = solution(sub2);
        if (length1 > length2) {
            swapLastElement(sub2);
        }

        return concatSubDecks(sub1, sub2);
    }

    public int[] concatSubDecks(int[] sub1, int[] sub2) {
        int length = sub1.length + sub2.length;
        int[] concatenateSubDecks = new int[length];
        for (int i = 0, j = 0, k = 0; i < length; i++) {
            if ((i % 2) == 0) {
                concatenateSubDecks[i] = sub1[j];
                j++;
            } else {
                concatenateSubDecks[i] = sub2[k];
                k++;
            }
        }
        return concatenateSubDecks;
    }


    public void swapLastElement(int[] deck) {
        int lastElement = deck[deck.length - 1];
        for (int i = deck.length - 1; i >= 1; i--) {
            deck[i] = deck[i - 1];
        }
        deck[0] = lastElement;
    }
}