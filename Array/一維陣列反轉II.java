import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class  ¤@ºû°}¦C¤ÏÂàII{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		StringTokenizer stk = new StringTokenizer(st);
		String[] str = new String[50];
		boolean bol = true;
		int i = 0,n;
		
		while(stk.hasMoreTokens()){
			str[i] = stk.nextToken();
				i++;
		}
		
		for(n=i-1;n>=0;n--){
			if(bol){
				System.out.print(str[n]);
				bol = false;
			}else{
				System.out.print(" "+str[n]);
			}
		}
			System.out.println();
	}
}