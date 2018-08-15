package BMI_WHR;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class app {

	public static void main(String[] args)throws IOException {
		BMI bmi = new BMI();
		WHR whr = new WHR();
		Scanner sc = new Scanner(System.in);
		double bodyWeight = 0;
		double height = 0;
		boolean error = true;
		double waistCircumference = 0;
		double hipCircumference = 0;
		int options = 1;
		
		System.out.println("�eby obliczy� BMI wybie� 1: ");
		System.out.println("1 - WHR");
		System.out.println("2 - BMI");
		
		if(options ==1) {
			options = sc.nextInt();
			while(error) {
				try {
					System.out.println("Podaj swoj� wag� w kg:");
					 bodyWeight = sc.nextDouble();
					sc.nextLine();
					System.out.println("Podaj wzrost w cm:");
					 height = sc.nextDouble();
					sc.nextLine();
					error = false;
				}catch(InputMismatchException e) {
					System.out.println("Poda�e� nie poprawne dane. Spr�buj jeszcze raz");
					sc.nextLine();		
				}	
			}
			sc.close();
			System.out.println("Twoja waga to: "+bodyWeight+"kg");
			System.out.println("Tw�j wzrost to: "+height+"cm");
			System.out.print("BMI wynosi: ");
			System.out.printf("%4.2f",BMI.score(bodyWeight, height));
			System.out.println();			
			
			if(BMI.score(bodyWeight, height)<18.5){
				System.out.println("Czas co� zje�� i to szybko! Masz niedowag�");
			} else if(BMI.score(bodyWeight, height)>24.99) {
				System.out.println("Schudnij grubasie !! Masz nadwag�");
			}else {
				System.out.println("Gratuluj�! Twoja waga jest prawid�owa.");
			}
		
		}else if(options ==2) {
			while(error) {
				try {
					System.out.println("Podaj ob�w tali: ");
					 bodyWeight = sc.nextDouble();
					sc.nextLine();
					System.out.println("Podaj ob�w bioder: ");
					 height = sc.nextDouble();
					sc.nextLine();
					error = false;
				}catch(InputMismatchException e) {
					System.out.println("Poda�e� nie poprawne dane");
				}
			}
			sc.close();
			System.out.println("Tw�j obw�d tali to: "+waistCircumference+"cm");
			System.out.println("Tw�j ob�w bioder to:"+hipCircumference+"cm");
			System.out.print("WHR wynosi: ");
			System.out.printf("%4.2f", BMI.score2(waistCircumference, hipCircumference));
			System.out.println();
			
			if(BMI.score2(waistCircumference, hipCircumference)<0.7) {
				
			}else if(BMI.score2(waistCircumference, hipCircumference)<0.7) {
				System.out.println("Twoje WHR jest nie poprawne");
			}else {
				System.out.println("Masz perfekcyjn� sylwetk�");
			}
		}
		sc.close();
	}	
}

