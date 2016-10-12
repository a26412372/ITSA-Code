import java.util.*;
public class ¥­¶|¦~§P©w{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			System.out.println("Bissextile Year");
		}else{
			System.out.println("Common Year");
		}
	}
}