import java.util.*;
public class ÁÊ²¼­pºâ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,i = 0,j = 0,k = 0;
		a = sc.nextInt();
		while(a>=10){
			a-=10;
			i++;
		}
		while(a>=5){
			a-=5;
			j++;
		}
		while(a>=1){
			a-=1;
			k++;
		}
		System.out.println("NT10=" + i);
		System.out.println("NT5=" + j);
		System.out.println("NT1=" + k);
	}
}