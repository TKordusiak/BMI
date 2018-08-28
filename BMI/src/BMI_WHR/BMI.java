package BMI_WHR;

public class BMI {
	static double score(double bodyWeight, double height ) {
		height = height/100;
		return bodyWeight/(height * height);
	}
}
