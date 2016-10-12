    import java.util.Scanner;  
    public class 輸出 1乘1、2乘2、...、N乘N之結果{  
        public static void main(String[] args){  
            Scanner sc = new Scanner(System.in);  
            int a,i;  
            a = sc.nextInt();  
            for(i=1;i<=a;i++){  
                System.out.println(i+"*"+i+"="+i*i);  
            }  
        }  
    }  