//U10416018 陳宗佑

import java.math.BigDecimal;

public class Accurate{
	//method for add number
	public static double add(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.add(num2).doubleValue();
	}
	//method for subtract number
	public static double sub(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.subtract(num2).doubleValue();
	}
	//method for mutiply number
	public static double mul(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.multiply(num2).doubleValue();
	}
}
   
        
