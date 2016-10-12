import java.util.*;
public class itsaºâ¶¥­¼ {
	public static long fn(long n){//if n==5
		if(n>1){
			return n*fn(n-1);// return = 5 * fn(4) 
		}					//f(4) = 24 = 5 * 24 = 120
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long a = sc.nextLong();
		System.out.println(fn(a));
	}
}