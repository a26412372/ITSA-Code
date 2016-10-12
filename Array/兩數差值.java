import java.util.Scanner;
public class ¨â¼Æ®t­È{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st;
		int i,j,k,x,y,z,sumbig = 0,sumsmall = 0,temp,c = 1,b = 0;
		st = sc.nextLine();
		int a[] = new int[st.length()];
		for(i=0;i<st.length();i++){
			a[i] = st.charAt(i);
		}
		for(k=0;k<st.length();k++){
			for(j=0;j<st.length()-1;j++){
				if(a[j+1]<a[j]||a[j+1]==a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<st.length();i++){
				sumsmall += a[i];
			if(i<st.length()-1){
				sumsmall *= 10;
			}
		}
		for(k=0;k<st.length();k++){
			for(j=0;j<st.length()-1;j++){
				if(a[j+1]>a[j]||a[j+1]==a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<st.length();i++){
				sumbig = sumbig + a[i];
			if(i<st.length()-1){
				sumbig = sumbig *10;
			}
		}
			System.out.println(sumbig-sumsmall);
	}
}