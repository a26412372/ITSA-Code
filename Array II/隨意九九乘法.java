import java.util.Scanner;
public class 隨意九九乘法{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n = 0;
		int a[] = new int[20];
		for(n=0;n<=5;n++){
			a[n] = sc.nextInt();//輸入6個數字
		}
		for(i=0;i<=5;i++){
			for(j=0;j<=5;j++){
				if(j<5){//如果不是最後一行後面要空格，是的話不用印空格。
				n = a[i]*a[j];
					if(n<10){		//n如果小於10印兩個0
						System.out.print("00" + n + " ");
					}else if(n<100){//大於9小於100印出一個0
						System.out.print("0" + n + " ");			
					}else{			//大於99小於1000不用印0
						System.out.print(n + " ");
					}
				}else{
				n = a[i]*a[j];
					if(n<10){
						System.out.print("00" + n);
					}else if(n<100){
						System.out.print("0" + n);							
					}else{
						System.out.print(n);
					}
				}
			}
			System.out.println();
		}
	}
}
