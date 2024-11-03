package no.hvl.dat100.oppgave3;


import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteLedig;
	// TODO: objektvariable 

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
			return nesteLedig;
		
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
		
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
//		eksisterer innlegg
		if (finnes(innlegg)) {
			return false;
		}
//		ledig plass
		if (!ledigPlass()) {
			return false;
		}
//		legg innlegg i neste posisjon
		innleggtabell[nesteLedig] = innlegg;
		nesteLedig++;
		
		return true;

	}
	
	public String toString() {
		
		String result = nesteLedig + "\n";
		
		for (int i = 0; i < nesteLedig; i++) {
			result += innleggtabell[i].toString();
		}
		
		return result;
	}

	// valgfrie oppgaver nedenfor (kommentert ut)
	
//	public void utvid() {

//	}
//	
//	public boolean leggTilUtvid(Innlegg innlegg) {
//

//		
//	}
//	
//	public boolean slett(Innlegg innlegg) {
//		

//	}
//	
//	public int[] search(String keyword) {
//		

//
//	}
}