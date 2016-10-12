import java.util.*;
public class 計算i次方的值{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,k = 1;
		j = sc.nextInt();
		if(j<31){
			for(i=1;i<=j;i++){
				k*=2;
			}
			System.out.println(k);
		}else{
			System.out.println("Value of more than 31");
		}
	}
}