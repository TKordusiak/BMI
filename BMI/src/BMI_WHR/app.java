package BMI_WHR;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class app {

	public static void main(String[] args)throws IOException {
			BMI bmi = new BMI();
			WHR whr = new WHR();
			Scanner sc = new Scanner(System.in);

			int options = 1;
			
			System.out.println("Wybie� : ");
			System.out.println("1 - BMI");
			System.out.println("2 - WHR");
			
			options = sc.nextInt();
			if(options ==1) {
				calculateBMI();
			}else if(options ==2) {
				calculateWHR();
			}
			sc.close();
		}

		private static void calculateWHR() {
			Scanner sc = new Scanner(System.in);
			double waistCircumference = 0;
			double hipCircumference = 0;
			boolean error = true;
			
			
			while(error) {
				try {
					System.out.println("Podaj obw�d tali: ");
					waistCircumference = sc.nextDouble();
					sc.nextLine();
					System.out.println("Podaj obw�d bioder: ");
					hipCircumference = sc.nextDouble();
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
			System.out.printf("%4.2f", WHR.score2(waistCircumference, hipCircumference));
			System.out.println();
			
			if(WHR.score2(waistCircumference, hipCircumference)>=0.85) {

				System.out.println("Zr�b co� ze sob� ju� patrze� na cia nie idzie");
			}else {
				System.out.println("Jeruna to� to idealne cia�o");
			}
		}			
		

		private static void calculateBMI() {
			Scanner sc = new Scanner(System.in);
			double bodyWeight = 0;
			double height = 0;
			boolean error = true;
			
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
						System.out.println("Poda�e� niepoprawne dane. Spr�buj jeszcze raz");
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
					System.out.println("chyba Ci� muter g�odzi bo� wygl�dasz jak szkapa. We� si� kamrata i biegusiem na kebaba");
				} else if(BMI.score(bodyWeight, height)>24.99) {
					System.out.println("Schudnij gorolu, udej si� do Sosnowca na szybka przebie�ka  !! Masz nadwag� ciulu");
				}else {
					System.out.println("Gratuluj�! Tak dalej a wszytscy byd� ci zazdro�ci� takiej figury");
				}		
			}
				
		}