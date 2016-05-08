import java.math.BigInteger;

 
public class Accurate{
	public static double add(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.add(num2).doubleValue();
	}
	public static double sub(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.subtract(num2).doubleValue();
	}
	public static double mul(double a, double b){
		BigDecimal num1;
		BigDecimal num2;
		
		num1 = new BigDecimal(Double.toString(a));
		num2 = new BigDecimal(Double.toString(b));
		
		return num1.multiply(num2).doubleValue();
	}
}
   
        
