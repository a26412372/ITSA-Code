    import java.util.*;  
    public class 計算平方值與立方值{  
        public static void main(String argv[]){  
            int i = 0,j = 0;  
            Scanner sc = new Scanner(System.in);  
            while(sc.hasNext()){  
            i = sc.nextInt();  
            System.out.println(i+" "+(i*i)+" "+(i*i*i));  
            }  
        }  
    }  