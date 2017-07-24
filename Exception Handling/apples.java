import java.util.*;

class apples{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int x = 1;
		do{
			try{
				int num1, num2;
				System.out.println("Enter first number: ");		
				num1 = input.nextInt();
				System.out.println("Enter second number: ");
				num2 = input.nextInt();
				int ans = num1/num2;
				System.out.println(ans);
				x = 2;
			}
			catch(Exception e){
				System.out.println("you can't do that.");
			}
		}while(x == 1);
	}
}
