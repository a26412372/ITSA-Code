import java.util.Scanner;
public class �H�N�E�E���k{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n = 0;
		int a[] = new int[20];
		for(n=0;n<=5;n++){
			a[n] = sc.nextInt();//��J6�ӼƦr
		}
		for(i=0;i<=5;i++){
			for(j=0;j<=5;j++){
				if(j<5){//�p�G���O�̫�@��᭱�n�Ů�A�O���ܤ��ΦL�Ů�C
				n = a[i]*a[j];
					if(n<10){		//n�p�G�p��10�L���0
						System.out.print("00" + n + " ");
					}else if(n<100){//�j��9�p��100�L�X�@��0
						System.out.print("0" + n + " ");			
					}else{			//�j��99�p��1000���ΦL0
						System.out.print(n + " ");
					}
				}else{
				n = a[i]*a[j];
					if(n<10){
						System.out.print("00" + n);
					}else if(n<100){
						System.out.print("0" + n);							
					}else{
						System.out.print(n);
					}
				}
			}
			System.out.println();
		}
	}
}
