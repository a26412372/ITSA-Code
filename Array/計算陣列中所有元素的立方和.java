import java.util.Scanner;
public class �p��}�C���Ҧ��������ߤ�M{
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