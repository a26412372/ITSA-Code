import java.util.Scanner;
public class ����`�M{
	public static void main(String[] args){
		int num1,num2,sum;
		Scanner number = new Scanner(System.in);
		while(number.hasNextInt()){
		num1 = number.nextInt();
		num2 = number.nextInt();
		sum = num1 + num2;
		System.out.println(sum);
		}
	}
}