import java.util.Scanner;
public class 計算正方形面積{
	public static void main(String[] args){
		double side_length;
		Scanner area = new Scanner(System.in);
		side_length = area.nextDouble();
		System.out.printf("%.1f\n",side_length*side_length);
	}
}