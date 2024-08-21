package CustomerTicketSupportSystem;

import java.util.LinkedList;

public class CustomerTicketSupportSystem {
    private final LinkedList<String> customerTicketSupportSystem;

    public CustomerTicketSupportSystem(){
        this.customerTicketSupportSystem = new LinkedList<>();
    }

    public boolean isEmpty(){
        return !customerTicketSupportSystem.isEmpty();
    }
    public boolean isTicket(String ticketId){
        return customerTicketSupportSystem.contains(ticketId);
    }

    public boolean addTicket(String ticketId){
        return customerTicketSupportSystem.offer(ticketId);
    }
    public String processTicket(){
        return customerTicketSupportSystem.poll();
    }
    public String peek(){
        return customerTicketSupportSystem.peek();
    }
    public LinkedList<String> list(){
        return customerTicketSupportSystem;
    }
}
