import java.util.*;
public class 相遇時間計算{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int meter;
		meter = sc.nextInt();
		System.out.println((int)Math.ceil(meter/(1-0.30*2.54)));
	}
}