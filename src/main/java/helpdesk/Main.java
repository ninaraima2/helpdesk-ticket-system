package helpdesk;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Systeme de Gestion de tickets ===");
        System.out.println("1. Créer un ticket");
        System.out.println("2. Traiter le prochain ticket");
        System.out.println("3. Quitter");
        System.out.println("Ton choix :");

    
        User user1 = new User(1, "Nina", "raima@gmail.com","1234567".getBytes(), Role.Client );
        PriorityQueue<Ticket> pq = new PriorityQueue<>( Comparator.comparing((Ticket t) -> t.getPriorite()).reversed());
        TicketManager ticketManager = new TicketManager(pq);
        int id = 1;

        menu: while(true)
        {
            String choix = scanner.nextLine();

            switch (choix)
            {
                case "1":
                   
                    System.out.println("Entrer le titre, la description, la priorite");
                    String titre = scanner.nextLine();
                    String description = scanner.nextLine();
                    String priorite = scanner.nextLine();
                    Priorite p = Priorite.valueOf(priorite);
                    Ticket t1 = new Ticket(id, titre, description, p, Statut.Ouvert, LocalDateTime.now(),user1.getId());
                    ticketManager.ajouterTicket(t1);
                    id++;
                    break;


                case "2":

                    Ticket t = ticketManager.traiterProchainTicket();
                    if(t != null){
                        System.out.println(t.getPriorite() + " : " + t.getDescription());
                    }else{
                        System.out.println("Aucun ticket a traiter.");
                    }

                    break;

                case "3":
                    break menu;
                    
            }

            System.out.println("=== Systeme de Gestion de tickets ===");
            System.out.println("1. Créer un ticket");
            System.out.println("2. Traiter le prochain ticket");
            System.out.println("3. Quitter");
            System.out.println("Ton choix :");


        }
        
    

    }
    
    
}
