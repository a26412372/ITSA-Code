import java.util.*;
public class 判斷3整數是否能構成三角形之三邊長{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		
		if((i+j>k)&&(i+k>j)&&(j+k>i)&&(k+i>j)){
			System.out.println("fit");
		}else{
			System.out.println("unfit");
		}
	}
}