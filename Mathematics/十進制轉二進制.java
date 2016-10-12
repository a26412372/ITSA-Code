import java.util.Scanner;
public class 十進制轉二進制{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int a = 0,i,j,x,input,z = 0;
		boolean bol = true;
		int c[] = new int[8];
		input = sc.nextInt();
		if(input<0){
			while(a!=~input+1){
				a++;
			}
		}else{
			a = input;
			bol = false;
		}
		String st = Integer.toBinaryString(a);
		int b[] = new int[st.length()];
		for(i=0;i<st.length();i++){
			b[i] = (int)st.charAt(i)-'0';
		}
		x = c.length-b.length;
		for(i=0;i<b.length;i++){
			c[x] = b[i];
			x++;
		}
		if(bol){
			for(i=c.length-1;i>=0;i--){
				if(c[i]==1){
					z = i-1;
					break;
				}
			}
			for(i=z;i>=0;i--){
				if(c[i]>0){
					c[i] = 0;
				}else{
					c[i] =1;
				}
			}
			for(i=0;i<c.length;i++){
				System.out.print(c[i]);
			}
			System.out.println();
		}else{
			for(i=0;i<c.length;i++){
				System.out.print(c[i]);
			}
			System.out.println();
		}
		}
	}
}