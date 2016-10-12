import java.util.Scanner;
public class 計算陣列中所有元素的立方和{
	public static void main(String[] argv){
		int i,sum = 0;
		int[] num;
		num = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=5;i++){
		num[i] = sc.nextInt();
			sum+=num[i]*num[i]*num[i];
		}
		System.out.println(sum);
	}
}