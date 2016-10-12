import java.util.Scanner;
public class 求最大公因數{
	public static void main(String[] args){
		int num1,num2,i = 0,k = 0;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for(i=num1;i>=1;i--){
			for(k=num2;k>=1;k--){
				if((num1%i==0&&num1%k==0)&&(num2%i==0&&num2%k==0)){
					break;
				}
			}
		}
		System.out.println(k);
		}
	}
}