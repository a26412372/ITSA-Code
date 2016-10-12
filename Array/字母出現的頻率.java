import java.util.Scanner;  
public  class 字母出現的次數{  
	public static void main(String[] args){  
		Scanner sc = new Scanner(System.in);  
		int z[] = new int[26];  
		String y[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
		String x[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};  
		String input = sc.nextLine();
		String[] a = input.split("");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<x.length;j++){ 
				if(a[i].equals(x[j])||a[i].equals(y[j])){  
					z[j]+=1;
				}
			}
		}
		for(int i=0;i<x.length;i++){
			if(i!=x.length-1){
				System.out.print(z[i] + " ");
			}else{
				System.out.println(z[i]);
			}
		}
	}
}