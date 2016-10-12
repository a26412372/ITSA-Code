import java.util.Scanner;
public class ­pºâ±è§Î­±¿n{
	public static void main(String[] args){
		double on_bottom,lower,high;
			
			Scanner input_data = new Scanner(System.in);
			on_bottom = input_data.nextDouble();
			lower = input_data.nextDouble();
			high = input_data.nextDouble();
			
			System.out.println("Trapezoid area:" + (on_bottom + lower) * high / 2);
	}	
}