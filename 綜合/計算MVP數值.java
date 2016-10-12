import java.util.*;
public class ­pºâMVP¼Æ­È{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int point,ast,rb,st,miss,sum;
		point = sc.nextInt();
		rb = sc.nextInt();
		ast = sc.nextInt();
		st = sc.nextInt();
		miss = sc.nextInt();
		sum = point+(ast*2)+(rb*2)+(st*2)-(miss*2);
		
		if(sum>45){
			System.out.println("A");
		}else if(sum>35&&sum<45){
			System.out.println("B");
		}else if(sum>24&&sum<35){
			System.out.println("C");
		}else{
			System.out.println("D");
		}
	}
}