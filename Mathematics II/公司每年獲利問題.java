import java.util.*;
public class 公司每年獲利問題{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,i;
		
		while(sc.hasNext()){
			double revenue = 50000.0,cost = 10000;
			double exchange_rate = 35.2f,sum = 0;
		n = sc.nextInt();
		if(n<21){
			for(i=1;i<n+1;i++){	
				revenue*=1.36;
				cost *= 1.02;
				exchange_rate -= 0.2;
			}
			sum = (revenue - cost) / exchange_rate;
			System.out.println("The Company will earn " + (int)sum + " US dollars after " + n + " year");
			}
		}
	}
}