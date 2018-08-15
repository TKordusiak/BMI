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
		
		System.out.println("¯eby obliczyæ BMI wybie¿ 1: ");
		System.out.println("1 - WHR");
		System.out.println("2 - BMI");
		
		if(options ==1) {
			options = sc.nextInt();
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
					System.out.println("Poda³eœ nie poprawne dane. Spróbuj jeszcze raz");
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
				System.out.println("Czas coœ zjeœæ i to szybko! Masz niedowagê");
			} else if(BMI.score(bodyWeight, height)>24.99) {
				System.out.println("Schudnij grubasie !! Masz nadwagê");
			}else {
				System.out.println("Gratulujê! Twoja waga jest prawid³owa.");
			}
		
		}else if(options ==2) {
			while(error) {
				try {
					System.out.println("Podaj obów tali: ");
					 bodyWeight = sc.nextDouble();
					sc.nextLine();
					System.out.println("Podaj obów bioder: ");
					 height = sc.nextDouble();
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
			System.out.printf("%4.2f", BMI.score2(waistCircumference, hipCircumference));
			System.out.println();
			
			if(BMI.score2(waistCircumference, hipCircumference)<0.7) {
				
			}else if(BMI.score2(waistCircumference, hipCircumference)<0.7) {
				System.out.println("Twoje WHR jest nie poprawne");
			}else {
				System.out.println("Masz perfekcyjn¹ sylwetkê");
			}
		}
		sc.close();
	}	
}

