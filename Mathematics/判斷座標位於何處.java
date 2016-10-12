import java.util.*;
public class 判斷座標位於何處{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double i,j;
		i = sc.nextDouble();
		j = sc.nextDouble();
		
		if(i>0&&j==0){
			System.out.println("x-axis");
		}
		if(i==0&&j>0){
			System.out.println("y-axis");
		}
		if(i>0&&j>0){
			System.out.println("1st Quadrant");
		}
		if(i<0&&j>0){
			System.out.println("2nd Quadrant");
		}
		if(i<0&&j<0){
			System.out.println("3rd Quadrant");
		}
		if(i>0&&j<0){
			System.out.println("4th Quadrant");
		}
	}
}