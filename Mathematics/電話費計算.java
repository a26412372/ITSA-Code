import java.text.DecimalFormat;
import java.util.Scanner;
public class 電話費計算{
	public static void main(String[] args){
		int phone;
		Scanner Call_minutes = new Scanner(System.in);
		
		while(Call_minutes.hasNextInt()){
			phone = Call_minutes.nextInt();
			double Call_costs = phone*0.9;
			
			if(phone>800&&phone<1500){
				Call_costs*=0.9;
			}
			if(phone>=1500){
				Call_costs*=0.79;
			}
			DecimalFormat a = new DecimalFormat("#.0");
			Call_costs = Double.parseDouble(a.format(Call_costs));
			System.out.println(Call_costs);
		}
	}
}