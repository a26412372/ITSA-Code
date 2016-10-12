import java.util.*;
public class 判斷座標是否在圓形的範圍內{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a,b;
			a = sc.nextInt();
			b = sc.nextInt();
			if(a<200&&b<200){
				System.out.println("inside");
			}else{
				System.out.println("outside");
			}
	}
}