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
		
		System.out.println();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("Seu IMC : %.2f%n",imc);
				
		if (imc < 18.5) {
			System.out.println("Baixo Peso ");
		} 
		else if (imc > 18.5 && imc < 24.99) {
			System.out.println("Normal");
		}
		else if (imc >= 25 && imc < 29.99) {
			System.out.println("Sobrepeso ");
			
		}
		else {
			System.out.println("Obesidade ");
		}
		
		sc.close();

	}

}
