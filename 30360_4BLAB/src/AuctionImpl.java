import java.util.ArrayList;
import java.util.List;

public class AuctionImpl implements Auction {
    private List<Bidder> bidders;
    private String itemName;

    public AuctionImpl(String itemName) {
        this.itemName = itemName;
        this.bidders = new ArrayList<>();
    }

    @Override
    public void registerBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    @Override
    public void notifyBidders(AuctionEvent event, String message) {
        for (Bidder bidder : bidders) {
            bidder.update(event, message);
        }
    }

    public void setItemAvailable() {
        notifyBidders(AuctionEvent.ITEM_AVAILABLE, "Item " + itemName + " is now available.");
    }

    public void startBidding() {
        notifyBidders(AuctionEvent.BIDDING_STARTED, "Bidding for item " + itemName + " has started.");
    }

    public void endBidding() {
        notifyBidders(AuctionEvent.BIDDING_ENDED, "Bidding for item " + itemName + " has ended.");
    }
}
