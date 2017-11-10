package test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import bankAccount.*;

public class Depot {

	@Test
	public void test() {
		 PersonnePhysique rami =new PersonnePhysique("Ben Mohamed",
	                "Rami",
	               LocalDate.of(1991, Month.FEBRUARY, 7));
		 CompteEpargne ce=new CompteEpargne(rami,0.2f);
		 ce.depot(500, "eco");
		 ce.getSolde();
		 assertEquals("les solde est",ce.depot(500, "eco"),ce.getSolde(),0);
		
		
	}

}
