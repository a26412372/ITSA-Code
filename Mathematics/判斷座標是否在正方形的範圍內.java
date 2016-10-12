import java.util.*;
public class 判斷座標是否在正方形的範圍內{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<=100&&b<=100){
			System.out.println("inside");
		}else{
			System.out.println("outside");
		}
	}
}