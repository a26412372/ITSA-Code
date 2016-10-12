import java.util.Scanner;
public class ©u¸`§P©w{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int month = sc.nextInt();
			
			if(month>=3&&month<5){
				System.out.println("Spring");
			}
			if(month>=6&&month<=8){
				System.out.println("Summer");
			}
			if(month>=9&&month<=11){
				System.out.println("Autumn");
			}
			if(month==12||month<=2){
				System.out.println("Winter");
			}
		}
	}
}