import java.util.*;  
    public class �p����ƶ��Ҧ���ƪ��`�M{  
        public static void main(String[] args){  
            Scanner sc = new Scanner(System.in);  
            int a,b,temp = 0,i,sum = 0;  
            a = sc.nextInt();  
            b = sc.nextInt();  
            if(b<a){  
                temp=a;  
                a=b;  
                b=temp;  
            }  
            for(i=a;i<=b;i++){  
                sum+=i;  
            }  
            System.out.println(sum);  
        }  
    }  