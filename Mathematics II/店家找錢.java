import java.util.*;
public class ©±®a§ä¿ú{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,price,five_hundred,one_hundred,fifty,ten,five,one;
		int money = 1000,i = 0,sum;
		
		n = sc.nextInt();
		price = sc.nextInt();
		five_hundred = sc.nextInt();
		one_hundred = sc.nextInt();
		fifty = sc.nextInt();
		ten = sc.nextInt();
		five = sc.nextInt();
		one = sc.nextInt();
		
		if(money>=(n*price)){
		money -= (n*price);
			}
			sum = 0;
			sum = (500*five_hundred);
			while(sum>0&&money>=500){
				sum -= 500;
				money -= 500; 
				i++;
			}
			sum = 0;
			sum = (100*one_hundred);
			while(sum>0&&money>=100){
				sum-=100;
				money-=100;
				i++;
			}
			sum = 0;
			sum = (50*fifty);
			while(sum>0&&money>=50){
				sum-=50;
				money-=50;
				i++;
			}
			sum = 0;
			sum = (10*ten);
			while(sum>0&&money>=10){
				sum-=10;
				money-=10;
				i++;	
			}
			sum = 0;
			sum = (5*five);
			while(sum>0&&money>=5){
				sum-=5;
				money-=5;
				i++;
			}
			sum = 0;
			sum = (1*one);
			while(sum>0&&money>=1){
				sum-=1;
				money-=1;
				i++;
			}
		System.out.println(i);
	}
}