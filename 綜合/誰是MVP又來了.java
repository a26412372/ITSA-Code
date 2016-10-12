import java.util.Scanner;
public class 誰是MVP又來了{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n,k,z,x = 0,y = 0,temp = 0,temp1 = 0;
		String temp2 = "";
		String name[] = new String[20];
		int a[] = new int[20];
		int	b[] = new int[20];
			n = sc.nextInt();
			for(i=0;i<n;i++){
				name[i] = sc.next();
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
		}
			for(z=0;z<n;z++){
				for(j=0;j<n;j++){
					if(a[j+1]>a[j]||a[j+1]==a[j]){
						temp=a[j+1];
						a[j+1]=a[j];
						a[j]=temp;
						temp1=b[j+1];
						b[j+1]=b[j];
						b[j]=temp1;
						temp2=name[j+1];
						name[j+1]=name[j];
						name[j]=temp2;
				}
			}
		}
			for(y=0;y<n;y++){
				for(k=0;k<n;k++){
					if(a[k+1]==a[k]&&b[k+1]>b[k]){
						temp=a[k+1];
						a[k+1]=a[k];
						a[k]=temp;
						temp1=b[k+1];
						b[k+1]=b[k];
						b[k]=temp1;
						temp2=name[k+1];
						name[k+1]=name[k];
						name[k]=temp2;
					}
				}
			}
			for(x=0;x<n;x++){
				if(x==n-1){
					System.out.println(name[x]);
				}else{
					System.out.print(name[x] + " ");
				}
			}
	}
}