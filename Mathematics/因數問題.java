import java.util.Scanner;
public class 因數問題{
	public static void main(String[] args){
	int i,one_integer;
	Scanner	sc = new Scanner(System.in);
		
		while(sc.hasNext()){
		one_integer = sc.nextInt();
			for(i=1;i<=one_integer;i++){
			if(one_integer%i==0){	
				if(i==one_integer){
					System.out.print(i);
				}else{
					System.out.print(i + " ");
					}
				}	
			}
		System.out.println();
		}	
	}
}