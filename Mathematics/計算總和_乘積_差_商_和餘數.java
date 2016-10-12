    import java.util.*;    
        public class Main{    
            public static void main(String argv[]){    
                int i = 0,j = 0;    
                Scanner sc = new Scanner(System.in);    
                    
                i = sc.nextInt();    
                j = sc.nextInt();    
                    
                System.out.println(i + "+" + j + "=" + (i+j));    
                System.out.println(i + "*" + j + "=" + (i*j));    
                System.out.println(i + "-" + j + "=" + (i-j));    
                System.out.println(i + "/" + j + "=" + i/j + "..." + i%j);    
            }    
        }  