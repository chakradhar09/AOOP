public class BidderImpl implements Bidder {
    private String name;

    public BidderImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(AuctionEvent event, String message) {
        System.out.println("Bidder " + name + " received update: " + message);
    }
}
