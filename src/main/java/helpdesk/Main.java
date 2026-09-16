package helpdesk;

import java.time.LocalDateTime;

public class Main {


    public static void main(String[] args) {

        User user1 = new User(1, "Nina", "raima@gmail.com","1234567",Role.Client );

        Ticket ticket1 = new Ticket(1, "La vie est belle", "Et cetait lhistoire de deux femme, des soeurs", Priorite.Moyenne, Statut.Ouvert, LocalDateTime.now(), user1.getId());


        System.out.println("Le titre du ticket est : "+ ticket1.getTitre() + " et la priorite du ticket est : " + ticket1.getPriorite());
    }
    
    
}
