import java.util.*;    
public class ©M©|ºÝ´ö¤W¶ð{    
	public static void main(String[] args){    
		Scanner sc = new Scanner(System.in);    
		int i,n,k = 0;  
		
		for(i=1;i<=10;i++){    
			n = sc.nextInt();    
			if(n%i!=0){    
				k++;    
			}    
		}    
		if(k<=3){    
			System.out.println("yes");    
		}else{    
			System.out.println("no");    
		}    
	}    
}  