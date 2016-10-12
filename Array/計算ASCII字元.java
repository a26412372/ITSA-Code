    import java.util.*;  
    public class ≠p∫‚ASCII¶r§∏{  
        public static void main(String[] args) {  
            Scanner sc = new Scanner(System.in);  
            int i,k,j = 0,sum;  
            int a[] = new int[127];  
            int b[] = new int[127];  
            String st = sc.nextLine();  
            for(i=0;i<st.length();i++){  
                    j = st.charAt(i);  
                for(k=32;k<a.length;k++){  
                    if(k==j){  
                        b[k]=j;  
                        a[k]++;  
                    }  
                }  
            }  
            for(i=a.length-1;i>=0;i--){  
                if(a[i]>0){  
                    System.out.println(b[i] + " " + a[i]);  
                }  
            }  
        }  
    }  