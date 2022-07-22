import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thurday","Friday","Saturday"};
		
		
		Scanner scanner =new Scanner (System.in);
		
		// if today is sunday...
		System.out.println("after how many days...");
		int day=scanner.nextInt();
		
		
		int leapDay =day%7;
		
		System.out.println("today is: "+ days[leapDay]);
	
		
		
	}

}
