package helpdesk;
import java.util.PriorityQueue;

public class TicketManager {

    private PriorityQueue <Ticket> pq;

    public TicketManager(PriorityQueue <Ticket> pq){
        this.pq   =  pq;
    }

    public PriorityQueue <Ticket> getPq(){
        return pq;
    }
    public void setPq(PriorityQueue <Ticket> nouveauPq ){
        this.pq= nouveauPq;
    }

    public  void ajouterTicket(Ticket t){
        pq.offer(t);
    }

    public Ticket traiterProchainTicket(){
         return  pq.poll();
    }
        
}
