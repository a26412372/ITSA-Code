import java.util.*;
public class ¥ï¤ì´ËªL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int i,sum = k+1;
		for(i=1;i<=n;i++){
			sum *= 2; 
			sum += 1;
		}
		System.out.println(sum-1);
	}
}