import java.util.Scanner;
public class ¶i¨îÂà´«{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int n,m,j,c = 0,i = 0,s = 0,x = 7,z;
		char y[] = new char[50];
		int a[] = new int[50];
		n = sc.nextInt();
		m = sc.nextInt();
		s = n;
		if(n==0){
			x = 0;
		}
		while(n!=0){
			a[i]=n%m;
			for(z=0;z<=a[i];z++){
				y[i]=ch[z];
			}
			n/=m;
			i++;
		}
			i--;
			System.out.print("The base " + m + " representation of " + s + " is ");
		if(x==0){
			System.out.print("0");
		}else{
			for(c=i;c>=0;c--){
				System.out.print(y[c]);
			}
		}
			System.out.println(".");	
	}
}