package BMI_WHR;

public class BMI {
	static double score(double bodyWeight, double height ) {
		height = height/100;
		return bodyWeight/(height * height);
	}
	static double score2(double waistCircumference, double hipCircumference ) {
		return waistCircumference/hipCircumference;
	}

	

}
