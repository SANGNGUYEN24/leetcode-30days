class solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int skip = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i < k) {
                if (tickets[k] - tickets[i] > 0) {
                    skip += tickets[k] - tickets[i];
                }
            } else if (i > k) {
                if (tickets[k] - tickets[i] > 1) {
                    skip += (tickets[k] - tickets[i] - 1);
                }
            }

        }
        return tickets[k] * tickets.length - (tickets.length - k - 1) - skip;
    }
}