package bankAccount;

import java.time.LocalDate;

public class PersonnePhysique  implements Client {
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getNaissance() {
		return naissance;
	}

	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}

	private String nom;
    private String prenom;
    private LocalDate naissance;
    
    public PersonnePhysique(String nom, String prenom, LocalDate naissance) {
        this.nom=nom;
        this.prenom=prenom;
        this.naissance=naissance;
       
        
    }
    public void afficher() {
    	System.out.println("c'est le compte de "+nom+" ma date de naissance est:"+naissance);
    }
    
    @Override
      public String identification() {return toString();}

}
