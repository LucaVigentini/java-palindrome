package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una parola: ");
		String parola = scanner.nextLine();

		char c;
		String parolaRev = "";

		for (int i = parola.length() - 1; i >= 0; i--) {
			c = parola.charAt(i);
			parolaRev = parolaRev + c;

		}

		int lunghezza = parolaRev.length();

		System.out.println("La tua parola è lunga " + lunghezza + " caratteri!");

		if (parola.equals(parolaRev)) {
			System.out.println("La parola " + parola + " è un ossimoro!");
		} else {
			System.out.println("La parola " + parola + " non è un ossimoro!");
		}

		scanner.close();
	}
}
