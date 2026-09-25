package helpdesk;

import java.time.LocalDateTime;
import java.util.Base64;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {


    public static void main(String[] args) {

        User user1 = new User(1, "Nina", "raima@gmail.com","1234567".getBytes(),Role.Client );

        Ticket ticket1 = new Ticket(1, "La vie est belle", "Et cetait lhistoire de deux femme, des soeurs", Priorite.Moyenne, Statut.Ouvert, LocalDateTime.now(), user1.getId());

        Ticket ticket2 = new Ticket(2,"Alice au pays des merveils", "qu'on lui coupe la tete", Priorite.Basse, Statut.EnCours, LocalDateTime.now(),user1.getId());

        Ticket ticket3 = new Ticket(3, "ladybug", "paris cest magique", Priorite.Critique, Statut.Resolu, LocalDateTime.now(), user1.getId());
              
        Ticket ticket4 = new Ticket(4, "ladybug", "paris cest magique", Priorite.Haute, Statut.Resolu, LocalDateTime.now(), user1.getId());

        // byte[] motdepasseHacher = user1.getMotDePasseHache();

        // String s = Base64.getEncoder().encodeToString(user1.getMotDePasseHache());

        System.out.println(Base64.getEncoder().encodeToString(user1.getMotDePasseHache()));

        System.out.println();





        PriorityQueue<Ticket> pq = new PriorityQueue<>( Comparator.comparing((Ticket t) -> t.getPriorite()).reversed());
        TicketManager ticketManager = new TicketManager(pq);

        ticketManager.ajouterTicket(ticket1);
        ticketManager.ajouterTicket(ticket3);
        ticketManager.ajouterTicket(ticket2);
        ticketManager.ajouterTicket(ticket4);


        Ticket t = ticketManager.traiterProchainTicket();
        while(t != null){
            System.out.println(t.getPriorite() + " : " + t.getDescription());

            t = ticketManager.traiterProchainTicket();
        }
        
        
    

    }
    
    
}
