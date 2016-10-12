import java.util.Scanner;
public class °±¨®¶O­pºâ{
	public static void main(String argv[]){
		int hour1,min1,hour2,min2,sum = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++){
		hour1 = sc.nextInt();
		min1 = sc.nextInt();
		hour2 = sc.nextInt();
		min2 = sc.nextInt();
		
		if((hour2-hour1)*60+(min2-min1)>240){
			sum=280+((((hour2-hour1)*60+(min2-min1))/30)-8)*60;
			System.out.println(sum);
		}else if((hour2-hour1)*60+(min2-min1)>120){
			sum=120+((((hour2-hour1)*60+(min2-min1))/30)-4)*40;
			System.out.println(sum);
		}else{
			sum=((((hour2-hour1)*60+(min2-min1))/30))*30;
			System.out.println(sum);
		}
		}
	}
}