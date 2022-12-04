package application;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print ("Digite o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.print ("Digite a sua Altura: ");
		double altura = sc.nextDouble();
		
		
		
		sc.close();

	}

}
