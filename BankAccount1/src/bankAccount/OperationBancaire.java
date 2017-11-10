package bankAccount;

import java.time.LocalDateTime;

public class OperationBancaire implements Comparable<OperationBancaire> {
    private final double montant;
    private final LocalDateTime dateTimeOperation;
    private final String libelle;

    public OperationBancaire(double montant, LocalDateTime dateTimeOperation, String libelle) {
        this.montant = montant;
        this.dateTimeOperation = dateTimeOperation;
        this.libelle = libelle;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDateTime getDateOperation() {
        return dateTimeOperation;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return "OperationBancaire{montant=" + montant + ", le  "+ dateTimeOperation + ", " + libelle + '}';
    }

    @Override
    public int compareTo(OperationBancaire o) {
        int c=o.dateTimeOperation.compareTo(this.dateTimeOperation);
        if (c==0) return o.libelle.compareTo(this.libelle);
        else return c;
    }
    
}

