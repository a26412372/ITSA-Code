import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ¤@ºû°}¦C¤ÏÂàI{
	public static void main(String[] argv)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		boolean bol = true;
		int n,i=0;
		String str = br.readLine();
		StringTokenizer stk = new StringTokenizer(str);
		String[] a = new String[101];
		
		while(stk.hasMoreTokens()){
			a[i] = stk.nextToken();
			i++;
		}
		
		for(n=i-1;n>=0;n--){
			if(bol){
				System.out.print(a[n]);
				bol = false;
			}else{
				System.out.print(" "+a[n]);
			}
		}
			System.out.println();
	}
}