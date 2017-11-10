
package bankAccount;

import java.time.LocalDateTime;

public class CompteCourant extends CompteBancaire {
    private double montantDecouvertAutorise;
    
    public CompteCourant(Client proprietaire, double decouvert) {
        super(proprietaire);
        montantDecouvertAutorise=decouvert;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }
    
    @Override
    public synchronized double retrait(double montant,String libelle) throws BancaireException {
    	
    	if (montant> solde+montantDecouvertAutorise) throw new BancaireException("Pas assez d'argent sur le compte");
            else solde=solde-montant;
        listeOperations.add(new OperationBancaire(montant,LocalDateTime.now(),libelle));
        return solde;
    }

}
