import java.util.*;
public class 計算時間的組合{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int second;
		second = sc.nextInt();
		System.out.println(second/86400 + " days");
		System.out.println((second-((second/86400)*86400))/3600 + " hours");
		System.out.println((second-((second/86400)*86400))%3600/60 +" minutes");
		System.out.println((second-((second/86400)*86400))%3600%60 + " seconds");
	}
}