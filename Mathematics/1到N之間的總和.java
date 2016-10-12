import java.util.Scanner;
public class itsa1到N之間的總和{
	public static void main(String[] args){
		int one_integer,i,sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		one_integer = sc.nextInt();
			for(i=1;i<one_integer;i++){
				sum += i;
				System.out.print(i + " " + "+" + " ");
			}
			sum += one_integer;
			System.out.println(one_integer + " " + "=" + " " + sum);
		}
	}
}