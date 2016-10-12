    import java.util.*;    
        public class ¹L¥b¤¸¯À {    
            public static void main(String[] args) {    
                Scanner sc = new Scanner(System.in);  
    while(sc.hasNext()){    
                String st = sc.nextLine();    
                String[] str = st.split(" ");    
                String st1 = "";    
                boolean bol = false;    
                int i,j,sum=0;    
                for(i=0;i<str.length;i++){    
                    sum = 1;    
                    for(j=0;j<str.length;j++){    
                        if(i==j){    
                            continue;    
                        }    
                        if(str[i].equals(str[j])){    
                            sum++;    
                        }    
                    }    
                    if(sum>str.length/2){    
                        System.out.println(str[i]);    
                        bol = true;    
                        break;    
                    }    
                }    
                if(!bol){    
                    System.out.println("NO");    
                }   
    }   
            }    
        }  