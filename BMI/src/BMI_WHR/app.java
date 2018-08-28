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
			
			System.out.println("Wybie¿ : ");
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
					System.out.println("Podaj obwód tali: ");
					waistCircumference = sc.nextDouble();
					sc.nextLine();
					System.out.println("Podaj obwód bioder: ");
					hipCircumference = sc.nextDouble();
					sc.nextLine();
					error = false;
				}catch(InputMismatchException e) {
					System.out.println("Poda³eœ nie poprawne dane");
				}
			}
			sc.close();
			System.out.println("Twój obwód tali to: "+waistCircumference+"cm");
			System.out.println("Twój obów bioder to:"+hipCircumference+"cm");
			System.out.print("WHR wynosi: ");
			System.out.printf("%4.2f", WHR.score2(waistCircumference, hipCircumference));
			System.out.println();
			
			if(WHR.score2(waistCircumference, hipCircumference)>=0.85) {

				System.out.println("Zrób coœ ze sob¹ ju¿ patrzeæ na cia nie idzie");
			}else {
				System.out.println("Jeruna to¿ to idealne cia³o");
			}
		}			
		

		private static void calculateBMI() {
			Scanner sc = new Scanner(System.in);
			double bodyWeight = 0;
			double height = 0;
			boolean error = true;
			
				while(error) {
					try {
						System.out.println("Podaj swoj¹ wagê w kg:");
						 bodyWeight = sc.nextDouble();
						sc.nextLine();
						System.out.println("Podaj wzrost w cm:");
						 height = sc.nextDouble();
						sc.nextLine();
						error = false;
					}catch(InputMismatchException e) {
						System.out.println("Poda³eœ niepoprawne dane. Spróbuj jeszcze raz");
						sc.nextLine();		
					}	
				}
				sc.close();
				System.out.println("Twoja waga to: "+bodyWeight+"kg");
				System.out.println("Twój wzrost to: "+height+"cm");
				System.out.print("BMI wynosi: ");
				System.out.printf("%4.2f",BMI.score(bodyWeight, height));
				System.out.println();			
				
				if(BMI.score(bodyWeight, height)<18.5){
					System.out.println("chyba Ciê muter g³odzi boœ wygl¹dasz jak szkapa. We¿ siê kamrata i biegusiem na kebaba");
				} else if(BMI.score(bodyWeight, height)>24.99) {
					System.out.println("Schudnij gorolu, udej siê do Sosnowca na szybka przebie¿ka  !! Masz nadwagê ciulu");
				}else {
					System.out.println("Gratulujê! Tak dalej a wszytscy byd¹ ci zazdroœciæ takiej figury");
				}		
			}
				
		}