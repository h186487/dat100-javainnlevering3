package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String filsti = mappe + "/" + filnavn;
		
		try (PrintWriter writer = new PrintWriter(filsti)){
			
			writer.print(samling.toString());
			return true;
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: kunne ikke opprette fil");
			return false;
		}
	}
}
