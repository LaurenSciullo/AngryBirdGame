import java.util.Scanner;

public class PigUserLaunches
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userPig;
static double userDistance;
static String fake;

	public static void main(String[] args)
				{
				System.out.println("\n ('*(oo)*') ");
				System.out.print("\nGood luck!");
				System.out.println(" Since you are a pig,  you will be launched into by the AI Angry Bird... ( '*)>");
				
				launchDisplay();
				chooseDistance();
				pigDestruction();
				
				}

	public static void launchDisplay()
	{
		System.out.println("\nYou silly PIG you, the AI Angry Bird is going to hit you, good luck: ");
		System.out.println("                                         <(*' )");
		
		System.out.println("                                        *******");
		
		for (int i = 1; i <=2; i++)
			{
		System.out.println("                                        *     *");
			}
	
		System.out.println("('*(oo)*')                              *******");
	}
	
	public static void chooseDistance()
	{
		System.out.println("The AI Angry Bird always has an velocity of 2 m/s ... You have 5 tries to run away.");
		System.out.println("How far away from the AI Angry Bird would you like to be?");
		 userDistance = intInput.nextInt();
	}

	public static void pigDestruction()
	{
		for (int i = 0; i <= 4; i++)
			{
		if (userDistance%9 != 0 && userDistance%11 != 0)
			{
		double acceleration = 4 / userDistance;
		
		int sum = 0;
		for (int p = 0; p <= userDistance; p++)
			{
		sum += p;
			}
		System.out.println("Hah! You got hit. Although you had a distance of " + userDistance + " the AI Angry Bird had an acceleration of: " + acceleration + "m/s^2 and therefore hit you!");
		System.exit(0);
			
			}
		else 
			{
				System.out.println("You lukcy pig! Because you had a distance of " + userDistance + " you got away. You got a pass!");
				System.out.println(" ( ';)>    AI Angry Bird is sad.");
				System.out.println("You have used: " + i + " tries. ");
				System.out.println("\nHowever, you are still running!       (':(oo):')     you are a frightened pig now.");
				System.out.println("Enter another distance to keep running: ");
				userDistance = intInput.nextInt();
				
			}
		
			}
	}
		
		
		}

	
