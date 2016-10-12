import java.util.*;
public class 帕斯卡三角形 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int n = sc.nextInt();
		int x,i,j;
		for(x=1;x<=n;x++){
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a[][] = new int[21][];
		for(i=0;i<a.length;i++){
			a[i] = new int[i+1];
		}
		for(i=0;i<a.length;i++){
			a[i][0] = 1;
			a[i][a[i].length-1] = 1;
		}
		for(i=2;i<a.length;i++){
			for(j=1;j<a[i].length-1;j++){
				a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
			System.out.println(a[y][z]);
		}
		}
	}
}