import java.util.Scanner;
public class 計算1到N之間屬於5和7的倍數{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int num,y,z,p;
		num=sc.nextInt();
		
	for(z=num;z>=1;z--){
		if(z%5==0&&z%7==0){
			break;
		}
	}
	for(y=1;y<=z;y++)
		if(y%5==0&&y%7==0){
			if(y==z){
				System.out.println(y);
			}else{
				System.out.print(y+" ");
			}
		}
	}
}