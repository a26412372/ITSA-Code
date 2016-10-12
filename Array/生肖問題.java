import java.util.*;
public class ¥Í¨v°ÝÃD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 2008;
		int date = sc.nextInt();
		int b = 0;
		String st[] = {"rat","ox","tiger","rabbit","dragon","snake","horse","sheep","monkey","rooster","dog","pig"};
		int i,j;
			b = date - a;
			b %= 12;
			if(b<0){
				b += 12;
			}
			System.out.println(st[b]);
	}
}