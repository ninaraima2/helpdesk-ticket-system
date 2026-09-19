package helpdesk;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {

        User user1 = new User(1, "Nina", "raima@gmail.com","1234567",Role.Client );

        Ticket ticket1 = new Ticket(1, "La vie est belle", "Et cetait lhistoire de deux femme, des soeurs", Priorite.Moyenne, Statut.Ouvert, LocalDateTime.now(), user1.getId());

        Ticket ticket2 = new Ticket(2,"Alice au pays des merveils", "qu'on lui coupe la tete", Priorite.Basse, Statut.EnCours, LocalDateTime.now(),user1.getId());

        Ticket ticket3 = new Ticket(3, "ladybug", "paris cest magique", Priorite.Critique, Statut.Resolu, LocalDateTime.now(), user1.getId());
              
        Ticket ticket4 = new Ticket(4, "ladybug", "paris cest magique", Priorite.Haute, Statut.Resolu, LocalDateTime.now(), user1.getId());


        //  pq : stocke des objets de type ticket, 
        // (t1,t2)-> t1.priorite.compareTo(t2.priorite) : expresion qui sert de comparator, indique a la file d'attente comment classer les tickets
        // PriorityQueue<Ticket> pq = new PriorityQueue<>((t1, t2) -> t2.priorite.compareTo(t1.priorite));

        PriorityQueue<Ticket> pq = new PriorityQueue<>( Comparator.comparing((Ticket t) -> t.getPriorite()).reversed());

        System.out.println("Le titre du ticket est : "+ ticket1.getTitre() + " et la priorite du ticket est : " + ticket1.getPriorite());
        System.out.println("Le titre du ticket est : "+ ticket2.getTitre() + " et la priorite du ticket est : " + ticket2.getPriorite());
        pq.offer(ticket1);
        pq.offer(ticket2);
        pq.offer(ticket3);
        pq.offer(ticket4);

        while(!pq.isEmpty()){
            Ticket t = pq.poll();
            System.out.println(t.getPriorite() + " : " + t.getDescription());

        }
        



    }
    
    
}
