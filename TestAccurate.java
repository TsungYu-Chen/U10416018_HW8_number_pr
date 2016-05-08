import java.util.Scanner;

public class TestAccurate{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		Double a = input.nextDouble();
		System.out.println("Enter the second number:");
		Double b = input.nextDouble();
		
		Accurate accurate = new Accurate();
		
		System.out.println("Choose what way you want to calculate: +, -, * ? ");
		char determine = (input.next()).charAt(0);
		
		if(determine == '+'){
			System.out.println(accurate.add(a,b));
		}
		else if(determine == '-'){
			System.out.println(accurate.sub(a,b));
		}
		else if(determine == '*'){
			System.out.println(accurate.mul(a,b));
		}
		else{
			System.out.println("error, you enter the wrong order.");
		}
	}
}
