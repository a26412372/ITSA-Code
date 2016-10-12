import java.util.*;
public class 標準體重計算{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sex,height,i;
		int a = sc.nextInt();
		for(i=1;i<=a;i++){
		height =sc.nextInt();
		sex = sc.nextInt();
			if(sex==1){
				System.out.printf("%.1f\n",(height-80)*0.7);
			}else if(sex==2){
				System.out.printf("%.1f\n",(height-70)*0.6);
			}
		}
	}
}