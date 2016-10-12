import java.util.Scanner;
public class 提款機程式{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,i,account_number,password,j,k,b = 0;
		String x = " ";
		boolean z = true;
		int a[][] = {{123,456,9000},{456,789,5000},{789,888,6000},{336,558,10000},{775,666,12000},{566,221,7000}};
		n = sc.nextInt();
		for(i=1;i<=n;i++){
			account_number = sc.nextInt();
			password = sc.nextInt();
			for(j=0;j<a.length;j++){
				if(account_number==a[j][0]&&password==a[j][1]){
					b=a[j][2];
					z = true;
					break;
				}else{
					x = "error";
					z = false;
					continue;
				}
			}
			if(z){
				System.out.println(b);
			}else{
				System.out.println(x);
			}
		}
	}
}