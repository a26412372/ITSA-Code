import java.util.*;
public class F91{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k,i,n;
		k = sc.nextInt();
		for(i=1;i<=k;i++){
			n = sc.nextInt();
			System.out.println(F91(n));
		}
	}
	public static int F91(int n){
		if(n<=100){
			return F91(F91(n+11));
		}else{
			return n-10;
		}
	}
}