package helpdesk;

import java.time.LocalDateTime;


public class Ticket{

    private int id;
    private String titre;
    private String description;
    private Priorite priorite;
    private Statut statut;
    private LocalDateTime dateCreation;
    private int clientId;
    private Integer technicienAssigneId;


    public Ticket(int id, String titre, String description, Priorite priorite, Statut statut,LocalDateTime dateCreation,int clientId){

        this.id = id;
        this.titre= titre;
        this.description= description;
        this.priorite= priorite;
        this.statut= statut;
        this.dateCreation= dateCreation;
        this.clientId= clientId;
    }

    public int getId(){
        return id;
    }
    public void setId(int nouvelId){
        this.id= nouvelId;
    }

    public String getTitre(){
        return titre;
    }
    public void setTitre(String nouveauTitre){
        this.titre= nouveauTitre;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String nouvelleDescription){
        this.description= nouvelleDescription;
    }


     public Priorite getPriorite(){
        return priorite;
    }
    public void setPriorite(Priorite nouvellePriorite){
        this.priorite= nouvellePriorite;
    }

     public Statut getStatut(){
        return statut;
    }
    public void setStatut(Statut nouveauStatut){
        this.statut= nouveauStatut;
    }

     public LocalDateTime getDateCreation(){
        return dateCreation;
    }
    public void setDateCreation(LocalDateTime nouvelleDate){
        this.dateCreation= nouvelleDate;
    }

     public int getClientId(){
        return clientId;
    }
    public void setClientId(int nouveauClientId){
        this.clientId= nouveauClientId;
    }

     public Integer getTechnicienAssigneId(){
        return technicienAssigneId;
    }
    public void setTechnicienAssigneId(Integer nouveauTechnicienAssigneId){
        this.technicienAssigneId= nouveauTechnicienAssigneId;
    }
}
