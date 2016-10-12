import java.util.*;
public class Armstrong¼Æ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num,i = 0,j = 0,k = 0;
		num = sc.nextInt();
		i = num/100;
		j = (num%100)/10;
		k = num%10;
		if((i*i*i)+(j*j*j)+(k*k*k)==num){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}