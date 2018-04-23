package sajat;

import java.io.*;
import java.util.*;

public class Proba3 {

	public static void main(String[] args) {

		int elemekSzama = 5;
		int[] egeszTomb = new int[elemekSzama];
		//Scanner beolvasas = new Scanner(System.in);

		for (int i = 0; i < egeszTomb.length; i++) {
			try {
				InputStreamReader bemenet = new InputStreamReader(System.in);
				BufferedReader beolvasas = new BufferedReader(bemenet);
				
				boolean rosszAdat = true;
				do {
					System.out.println("Kerem adja meg a(z) " + (i + 1)
							+ ". egesz szamot");
					System.out.println("szam:");
					try {
						egeszTomb[i] = Integer.valueOf(beolvasas.readLine()).intValue();
						rosszAdat = false;
					} catch (InputMismatchException e) {
						System.out.println("rossz input");
					} catch (NumberFormatException e) {
						System.out.println("rossz input");
					}
					
				} while (rosszAdat);
				
			} catch (IOException kivetel) {
				kivetel.printStackTrace();
			}
			
		}
		System.out.println("A tomb elemei:");
		
		for (int i : egeszTomb) {
			System.out.println(i);
		}
		//beolvasas.close();
	}

}
