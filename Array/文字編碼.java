import java.util.*;
public class ¤å¦r½s½X {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int i,j,a = 0,k = 0;
		String str = sc.nextLine();
		for(i=1;i<=16;i++){
			if(i*i>=str.length()){
				a = i;
				break;
			}
		}
		String st[][] = new String[a][a];
		for(i=0;i<st.length;i++){
			for(j=0;j<st[i].length;j++){
				if(k<str.length()){
					st[i][j] = String.valueOf(str.charAt(k));
					k++;
				}else{
					st[i][j] = " ";
				}
			}
		}
		for(i=0;i<st.length;i++){
			for(j=0;j<st[i].length;j++){
				System.out.print(st[j][i]);
			}
		}
		System.out.println();
		}
	}
}