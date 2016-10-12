import java.util.*;
public class ≠p∫‚¡~§Ù {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<=60){
			System.out.printf("%.1f\n",(double)a*b);
		}else if(a>=61&&120<=a){
			System.out.printf("%.1f\n", (double)(a*b) + ((a-60) * b * 1.33));
		}else{
			System.out.printf("%.1f\n",(double)(60*b) + (60 * b * 1.33) + ((a-120) * b * 1.66));
		}
	}
}