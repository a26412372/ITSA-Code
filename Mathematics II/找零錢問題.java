import java.util.*;
public class §ä¹s¿ú°ÝÃD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] str = st.split(",");
		int money = Integer.parseInt(str[0]);
		int a1 = Integer.parseInt(str[1]);
		int a2 = Integer.parseInt(str[2]);
		int a3 = Integer.parseInt(str[3]);
		int fruit = (a1*15) + (a2*20) + (a3*30);
		if(money>fruit){
			int sum = money - fruit;
			int one_yuan = 0,five_yuan = 0,fifty_dollars = 0;
			while(sum>49){
				sum-=50;
				fifty_dollars++;
			}
			while(sum>4){
				sum-=5;
				five_yuan++;
			}
			while(sum>0){
				sum-=1;
				one_yuan++;
			}
			System.out.println(one_yuan + "," + five_yuan + "," + fifty_dollars);
		}else{
			System.out.println("0");
		}
	}
}