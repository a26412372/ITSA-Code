import java.util.*;
public class °j¤å§P§O{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0,i,j;
		String st = sc.nextLine();
		String st1="";
		for(i=st.length()-1;i>=0;i--){
			char ch = st.charAt(i);
			st1 += ch;
		}
			if(st.equals(st1)){
				System.out.println(st + " is a palindrome.");
			}else{
				System.out.println(st + " is not a palindrome.");
			}
	}
}