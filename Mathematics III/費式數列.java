import java.util.Scanner;
public class ¶O¦¡¼Æ¦C{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a;
		a = sc.nextLong();
		System.out.println(fac(a));
	}
public static long fac(long n){
		if(n<=1){
			return n;
		}else{
			return fac(n-1)+fac(n-2);
		}
	}
}