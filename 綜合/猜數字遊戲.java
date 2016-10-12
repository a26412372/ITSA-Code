import java.util.Scanner;
public class ²q¼Æ¦r¹CÀ¸{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String str[] = x.split("");
		int a[] = new int[4];
		int b[] = new int[4];
		for(int i=0;i<str.length;i++){
			b[i] = Integer.parseInt(str[i]);
		}
		while(true){
			int i,j,suma = 0,sumb = 0;
			String y = sc.next();
			String st[] = y.split("");
			for(i=0;i<st.length;i++){
				a[i] = Integer.parseInt(st[i]);
			}
			if(a[0]==0&&a[1]==0&&a[2]==0&&a[3]==0){
				break;
			}
			for(i=0;i<b.length;i++){
				if(a[i]==b[i]){
					suma++;
				}
				for(j=0;j<b.length;j++){
					if(a[i]==b[j]&&i!=j){
						sumb++;
					}
				}
			}
			System.out.println(suma + "A" + sumb + "B");
		}
	}
}