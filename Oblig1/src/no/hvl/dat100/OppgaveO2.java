package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		int poengsum;

		for (int i = 1; i <= 10; i++) {
			poengsum = parseInt(showInputDialog("Poengsum:"));

			if (poengsum > 100 || poengsum < 0) {
				System.out.println("Ugyldig poengsum (" + poengsum + ") Prøv på nytt");
				i--;
			} else if (poengsum >= 90)
				System.out.println("Elev nr. " + i + ": Din karakter er A (" + poengsum + ")");
			else if (poengsum >= 80)
				System.out.println("Elev nr. " + i + ": Din karakter er B (" + poengsum + ")");
			else if (poengsum >= 60)
				System.out.println("Elev nr. " + i + ": Din karakter er C (" + poengsum + ")");
			else if (poengsum >= 50)
				System.out.println("Elev nr. " + i + ": Din karakter er D (" + poengsum + ")");
			else if (poengsum >= 40)
				System.out.println("Elev nr. " + i + ": Din karakter er E (" + poengsum + ")");
			else
				System.out.println("Elev nr. " + i + ": Din karakter er F (" + poengsum + ")");
		}
	}
}
