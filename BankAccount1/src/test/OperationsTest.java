package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import bankAccount.BancaireException;
import bankAccount.CompteEpargne;
import bankAccount.PersonnePhysique;

public class OperationsTest {

	@Test
	public void test() throws BancaireException {
		 PersonnePhysique rami=new PersonnePhysique("Ben Mohamed",
	                "Rami",
	               LocalDate.of(1991, Month.FEBRUARY, 7));
	       
	
	        CompteEpargne ce=new CompteEpargne(rami,0.2f);
	        System.out.println(ce.getSolde());
	        ce.depot(700,"eco");//operaiotn 1
	        ce.retrait(80,"eco");//operation 2
	        ce.depot(700,"eco");//operation 3
	        ce.retrait(80,"eco");//operation 4
	       assertEquals("les nombres d'operations ",4,ce.getListeOperations().size());
	      
	      
	      
	}

}
