package BrowsingHistory;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowsingHistory {
    private final Deque<String> backwardBrowsingHistory;
    private final Deque<String> forwardBrowsingHistory;

    public BrowsingHistory(){
        this.backwardBrowsingHistory = new ArrayDeque<>();
        this.forwardBrowsingHistory = new ArrayDeque<>();
    }

    public boolean isPreviousEmpty(){
        return !backwardBrowsingHistory.isEmpty();
    }
    public boolean isNextEmpty(){
        return !forwardBrowsingHistory.isEmpty();
    }

    public String currentPage(){
        return backwardBrowsingHistory.peek();
    }
    public String addNewPage(String page){
        backwardBrowsingHistory.offerFirst(page);
        return backwardBrowsingHistory.peek();
    }
    public void previousPage(){
        forwardBrowsingHistory.offerLast(backwardBrowsingHistory.pollFirst());
    }
    public void nextPage(){
        backwardBrowsingHistory.offerFirst(forwardBrowsingHistory.pollLast());
    }
}
