public interface Auction {
    void registerBidder(Bidder bidder);
    void removeBidder(Bidder bidder);
    void notifyBidders(AuctionEvent event, String message);
}
