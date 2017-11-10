package bankAccount;

import java.time.LocalDate;
import java.time.Month;

public class Banque {
    public static void main(String[] args) throws BancaireException {
        PersonneMorale Fn =new PersonneMorale("Fn",412908048);
        String prenoms="Rami";
        PersonnePhysique rami=new PersonnePhysique("Ben Mohamed",
                prenoms,
               LocalDate.of(1991, Month.FEBRUARY, 7));
       
       rami.afficher();
        
        CompteEpargne ce=new CompteEpargne(rami,0.2f);
        ce.depot(700,"eco");
        ce.retrait(80,"eco");
        ce.depot(700,"eco");
        ce.retrait(80,"eco");
        ce.depot(700,"eco");
        ce.retrait(80,"eco");
      
    
        System.out.println(ce.listeOperations(10));
        System.out.println(ce.listeOperations.size());
    }
}
