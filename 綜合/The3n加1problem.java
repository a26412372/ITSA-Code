import java.util.*;
public class The3n¥[1problem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		int i,j,n,z = 0,max = 0,a = 0,temp = 0;
		i = sc.nextInt();
		j = sc.nextInt();
		if(i>j){
			temp=i;
			i=j;
			j=temp;
		}
		for(n=i;n<j+1;n++){
			z=n;
			max=1;
			while(z!=1){
				if(z%2==0){
					z=z/2;
				}else{
					z=3*z+1;
				}
				max++;
			}
			if(max>a){
				a=max;
			}
		}
		
		System.out.print(i+" "+j+" "+a);
		System.out.println();
		}
	}
}