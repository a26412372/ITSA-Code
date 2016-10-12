import java.util.*;
public class 計算正整數被3整除之數值之總和{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,i,sum = 0;
		a = sc.nextInt();
		for(i=1;i<=a;i++){
			if(i%3==0){
				sum+=i;
			}
		}
			System.out.println(sum);
	}
}