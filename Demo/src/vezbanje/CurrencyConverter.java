package vezbanje;

import java.util.ArrayList;

public class CurrencyConverter {
	
	public static void main(String[] args) {
		

		System.out.println(euroConverter(15));
		
	}
		
	public static ArrayList<Double> euroConverter(double eur) {
		
		double den;
		double din;
		double hrk;
		
		den = (double) (eur*61.8);
		din = (double) (eur*117.93);
		hrk = (double) (eur*7.54);
		
	
		ArrayList<Double>eurList = new ArrayList<Double>();
		
		eurList.add(den);
		eurList.add(din);
		eurList.add(hrk);
		
		
		
		return eurList;
		
	}
	
	
		
				
		
		
	
		
	}
	
	
		

		
		
	
	
	

		
		
		
		

