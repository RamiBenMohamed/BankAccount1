package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import bankAccount.BancaireException;
import bankAccount.CompteEpargne;
import bankAccount.PersonnePhysique;

public class Retrait {

	@Test
	public void test() throws BancaireException {
		 PersonnePhysique rami =new PersonnePhysique("Ben Mohamed",
	                "Rami",
	               LocalDate.of(1991, Month.FEBRUARY, 7));
		 CompteEpargne ce=new CompteEpargne(rami,0.2f);
		 	ce.depot(1300, "eco");
			 ce.retrait(500, "dep");
			 assertEquals("le solde est " ,ce.retrait(500, "dep"), ce.getSolde(),0);
			
		 
		 
		
	}
}
