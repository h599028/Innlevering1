package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("n!, skriv inn n"));
		int sum = 1;

		if (n > 0) {
			for (; n > 0; n--)
				sum = sum * n;
			System.out.println(sum);
		} else
			System.out.println("Ugyldig verdi!");
	}
}