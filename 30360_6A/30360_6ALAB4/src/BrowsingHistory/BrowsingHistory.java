package BrowsingHistory;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class BrowsingHistory {
    private static final Deque<String> backwardBrowsingHistory = new ArrayDeque<>();
    private static final Deque<String> forwardBrowsingHistory = new ArrayDeque<>();
    private final Iterator<String> backwardIterator;
    private final Iterator<String> forwardIterator;

    public BrowsingHistory(){
        this.backwardIterator = backwardBrowsingHistory.iterator();
        this.forwardIterator = forwardBrowsingHistory.descendingIterator();
    }

    public boolean backwardHasNext(){
        if(backwardIterator.hasNext()){
            backwardIterator.next();
            return true;
        }
        return false;
    }
    public boolean forwardHasNext(){
        if(forwardIterator.hasNext()){
            forwardIterator.next();
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return !backwardBrowsingHistory.isEmpty();
    }

    public String currentPage(){
        return backwardBrowsingHistory.peek();
    }
    public String addNewPage(String page){
        backwardBrowsingHistory.offerFirst(page);
        return backwardBrowsingHistory.peek();
    }
    public String previousPage(){
        forwardBrowsingHistory.offerLast(backwardBrowsingHistory.pollFirst());
        return backwardBrowsingHistory.peek();
    }
    public String nextPage(){
        backwardBrowsingHistory.offerFirst(forwardBrowsingHistory.pollLast());
        return backwardBrowsingHistory.peek();
    }
}
