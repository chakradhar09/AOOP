public class Client {
    public static void main(String[] args) {
        // Create an auction for an item
        AuctionImpl auction = new AuctionImpl("Antique Vase");

        // Create bidders
        Bidder bidder1 = new BidderImpl("Alice");
        Bidder bidder2 = new BidderImpl("Bob");
        Bidder bidder3 = new BidderImpl("Charlie");

        // Register bidders
        auction.registerBidder(bidder1);
        auction.registerBidder(bidder2);
        auction.registerBidder(bidder3);

        // Notify bidders about item availability
        auction.setItemAvailable();

        // Notify bidders about bidding start
        auction.startBidding();

        // Unregister a bidder
        auction.removeBidder(bidder2);

        // Notify bidders about bidding end
        auction.endBidding();
    }
}
