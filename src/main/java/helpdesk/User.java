package helpdesk;


public class User{

    private int id;
    private String name;
    private String email;
    private byte[] sel;
    private byte[] motDePasseHacher;
    private Role role;


    public User( int id, String name, String email, byte[] motDePasse, Role role){

        this.id = id;
        this.name = name;
        this. email = email;
        this.role = role;
        this.sel= PasswordUtils.genererSel(16);
        this.motDePasseHacher = PasswordUtils.hacher(motDePasse, sel);
        


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

    public byte[] getMotDePasseHache(){
        return motDePasseHacher;
    }
    


    public byte[] getSel(){
        return sel;
    }



    public Role getRole(){
        return role;
    }
    public void setRole(Role nouveauRole){
        this.role = nouveauRole;
    
    }
}