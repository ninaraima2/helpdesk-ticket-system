package helpdesk;


public class User{

    private int id;
    private String name;
    private String email;
    private String motDePasse;
    private Role role;

    public User( int id, String name, String email, String motDePasse, Role role){

        this.id = id;
        this.name = name;
        this. email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int nouvelId){
        this.id= nouvelId;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String nouveauNom){
        this.name = nouveauNom;
    }

    public String getEmail(){
        return email;
    }
    
    public void setEmail(String nouveauEmail){
        this.email = nouveauEmail;
    }

    public String getMotDePasse(){
        return motDePasse;
    }
    
    public void setMotDePasse(String nouveauMotDePasse){
        this.motDePasse = nouveauMotDePasse;
    }

    public Role getRole(){
        return role;
    }
    public void setRole(Role nouveauRole){
        this.role = nouveauRole;
    
    }
}