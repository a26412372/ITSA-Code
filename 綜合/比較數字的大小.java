import java.util.Scanner;
public class 比較數字的大小{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j+1]>a[j]){
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println(a[0] + ">" + a[1] + ">" + a[2]);
	}
}