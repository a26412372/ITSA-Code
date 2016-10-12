import java.util.*;
public class ¬P®y¬d¸ß{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int day,month = 0;
		String input;
		String a1="01",a2="02",a3="03",a4="04",a5="05",a6="06",a7="07",a8="08",a9="09",a10="10",a11="11",a12="12";
		input = sc.next();
		day = sc.nextInt();
		if(input.equals(a1)){
			month=1;
		}else if(input.equals(a2)){
			month=2;
		}else if(input.equals(a3)){
			month=3;
		}else if(input.equals(a4)){
			month=4;
		}else if(input.equals(a5)){
			month=5;
		}else if(input.equals(a6)){
			month=6;
		}else if(input.equals(a7)){
			month=7;
		}else if(input.equals(a8)){
			month=8;
		}else if(input.equals(a9)){
			month=9;
		}else if(input.equals(a10)){
			month=10;
		}else if(input.equals(a11)){
			month=11;
		}else if(input.equals(a12)){
			month=12;
		}
		if((month==1&&day>=21)||(month==2&&day<=18)){
			System.out.println("Aquarius");
		}else if((month==2&&day>=19)||(month==3&&day<=20)){
			System.out.println("Pisces");
		}else if((month==3&&day>=21)||(month==4&&day<=20)){
			System.out.println("Aries");
		}else if((month==4&&day>=21)||(month==5&&day<=21)){
			System.out.println("Taurus");
		}else if((month==5&&day>=22)||(month==6&&day<=21)){
			System.out.println("Gemini");
		}else if((month==6&&day>=22)||(month==7&&day<=22)){
			System.out.println("Cancer");
		}else if((month==7&&day>=23)||(month==8&&day<=23)){
			System.out.println("Leo");
		}else if((month==8&&day>=24)||(month==9&&day<=23)){
			System.out.println("Virgo");
		}else if((month==9&&day>=24)||(month==10&&day<=23)){
			System.out.println("Libra");
		}else if((month==10&&day>=24)||(month==11&&day<=22)){
			System.out.println("Scorpio");
		}else if((month==11&&day>=23)||(month==12&&day<=21)){
			System.out.println("Sagittarius");
		}else if((month==12&&day>=22)||(month==1&&day<=20)){
			System.out.println("Capricorn");
		}
	}
}