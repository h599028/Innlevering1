package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {
		double trinnskattProsent;

		double inntekt = parseDouble(showInputDialog("Bruttoinntekt"));
		
		if (inntekt < 0)
			System.out.println("Ugyldig inntektsmengde");
		else {
			if (inntekt > 1021550)
				trinnskattProsent = 0.162;
			else if (inntekt > 651250)
				trinnskattProsent = 0.132;
			else if (inntekt > 260100)
				trinnskattProsent = 0.04;
			else if (inntekt > 184800)
				trinnskattProsent = 0.017;
			else
				trinnskattProsent = 0;
			System.out.println("Trinnskatt: " +  inntekt * trinnskattProsent);
		}
	}
}
