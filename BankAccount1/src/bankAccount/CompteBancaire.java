package bankAccount;

import java.time.LocalDateTime;
import java.util.*;


public class CompteBancaire {
	
    static long nbComptes=0;

    private final Client proprietaire;
    protected double solde;
    private final long numeroCompte;
    final ArrayList<OperationBancaire> listeOperations;

    CompteBancaire (Client proprietaire) 
    {this.proprietaire=proprietaire;
      nbComptes=nbComptes+1;	
      numeroCompte=nbComptes;
      listeOperations=new ArrayList<OperationBancaire>();}

    public double getSolde() {return solde;}	  

    public long getNumeroCompte() {return numeroCompte;}

    public Client getProprietaire() {return proprietaire;}
    public ArrayList<OperationBancaire> getListeOperations(){
    	return listeOperations;
    }

    @Override
    public String toString() {
            return "Compte n°"+numeroCompte+" "+
                    proprietaire.identification()+" dispose de "+
                    solde+"Euros";
            }

    public synchronized double depot(double montant,String libelle) {
            solde=solde+montant;
            listeOperations.add(new OperationBancaire(montant,LocalDateTime.now(),libelle));
            return solde;}		

    public synchronized double retrait(double montant,String libelle) throws BancaireException {
        if (montant> solde) throw new BancaireException("Pas assez d'argent sur le compte");
            else solde=solde-montant;
            listeOperations.add(new OperationBancaire(-montant,LocalDateTime.now(),libelle));
        return solde;
    }
    
    public  String listeOperations(int n){
        Iterator<OperationBancaire> i =listeOperations.iterator();
        int index=0;
        String resultat="";
        while (index<n && i.hasNext()) {
            resultat=resultat+i.next().toString()+"\n";
            index=index+1;
        }
        return resultat;
    }
		
}