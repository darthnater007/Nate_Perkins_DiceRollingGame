import java.util.Scanner;

/*
 * Author: Nate Perkins
 * This is a simple dice rolling app from a project in Murach's Java (5th edition).
 * Calling this a game is somewhat a misnomer, as there is no way to win, but I've
 * already named it in github and my repos folder, so a "game" it will stay.
 */
public class DiceRollerGame 
{
	public static void welcome() {
		System.out.println("Welcome to the Dice Rolling Game App.\n\n");
	}
	
	public static  void rollDice(int d1, int d2, int sum) {
		d1 = (int)(Math.random()*6)+1;
		d2 = (int)(Math.random()*6)+1;
		sum = d1 + d2;
		
		
		String result = "Die 1: " + d1 + "\n"
					  + "Die 2: " + d2 + "\n"
					  + "Total: " + sum + "\n" ;
		if (d1 == 1 && d2 == 1)result += "Snake Eyes!!\n";
		else if (d1 == 6 && d2 ==6)result += "Boxcar!!\n";
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		int d1 = 0;
		int d2 = 0;
		int sum = 0;
		String choice = "Y";
		String switchContinueStatement = " the dice? ";
		Scanner sc = new Scanner(System.in);
		welcome();
		while(choice.equalsIgnoreCase("Y"))
		{
			System.out.println("Roll"+ switchContinueStatement + "(y/n)");
			choice= sc.next();
			switchContinueStatement = " Again? ";
			
			rollDice(d1, d2, sum);
		}
		
		System.out.println("Bye!!");
		
	}

}
