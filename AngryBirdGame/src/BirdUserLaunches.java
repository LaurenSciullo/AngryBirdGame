
import java.util.Scanner;

public class BirdUserLaunches
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userBird;
static int userDay;

		public static void main(String[] args)
			{
				System.out.println("\n (`*v*`) ");
				System.out.print("\nGood luck!");
				System.out.println(" Since you are a bird, you will be launching yourself into the pigs to destory them.");
				
				//birdLevels();
				launchDisplay();
				launchCalculations();
			}
		public static void birdLevels()
			{
					System.out.println("How was your day today? (10)Good, (5)Medium, (0)Bad.");		
					userDay = intInput.nextInt();
					if (userDay == 10)
						{
							System.out.println("A good day means an easy level, you are not angry enough.");
						}
					else if (userDay == 5)
						{
							System.out.println("A medium day means medium level, you're sort of angry, but not quite there.");
						}
					else 
						{
							System.out.println("A bad day, yes!! You are angry enough to be an effective angry bird! :D");
						}
						
					}
		
		public static void launchDisplay()
		{
			System.out.println("\nYou angry bird you, this is you on your launch platform, and this is the pig you will hit: ");
			System.out.println("(`*v*`)");
			
			System.out.println("*******");
			
			for (int i = 1; i <=2; i++)
				{
					System.out.println("*     *");
				}
		
			System.out.println("*******                                                      ('*(oo)*')");
		}
		
		public static void launchCalculations() 
		{
			System.out.println("\nNow you are going to launch into the pig by calculcating how far away the pig is. ");
			//if (userDay == 10)
				//{
					System.out.println("Enter what acceleration you would like to launch at: ");
					int userAcceleration = intInput.nextInt();
					
					System.out.println("Enter what velocity you would like to launch at: ");
					int userVelocity = intInput.nextInt();
					
					int randomDistance = (int)(Math.random()*20 + 1);
				
					double calculatedDistance = ((userVelocity) * (userVelocity) ) / ( 2 * userAcceleration);
					
					System.out.println("Your calculated distance: " + calculatedDistance);
					System.out.println("Your actual distance: " + randomDistance);
					if (calculatedDistance == randomDistance)
						{
							System.out.println("Congrats! Your calculated distance matched the actual distance! ");
						}
					else if (calculatedDistance == 0)
						{
							System.out.println("Boooooo can't even calculate how off you were. ");
						}
					else 
						{
							double percentOff = Math.abs(randomDistance - calculatedDistance) / calculatedDistance;
							System.out.println("Boooooo you missed! You were " + percentOff + "% off.");
						}
				//}
			//else if (userDay == 5)
			//	{
					
			//	}
			//else 
			//	{
					
			//	}
		}
			
	}
