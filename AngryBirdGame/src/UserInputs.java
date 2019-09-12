import java.util.Scanner;

public class UserInputs
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userBird;
static String userName;
		
		public static void main(String[] args)
			{
				System.out.println("Welcome to the Angry Birds Game! Enter your name to begin: ");
				userName = stringInput.nextLine();
						
				System.out.println(userName + " are you a bird or a pig? (1)Bird or (2)Pig.");
				
				bird();
				pig();
			}
		
		public static int bird()
		{
			userBird = intInput.nextInt();
				if (userBird == 1)
					{
						System.out.println("Glad to hear it, birds are better. How was your day today? (10)Good, (5)Medium, (0)Bad.");
						
						int userDay = intInput.nextInt();
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
								System.out.println("A bad day, yes!! You are angry enough to be an effective angry bird :D.");
							}
					}
				return userBird;
				
		}
		
		public static int pig()
		{
				if(userBird == 2)
					{
						System.out.println("Story time! The AI Bird is angry, an Angry AI Bird if you will, and you are a pig...");
					}
				return userBird;
		}

	}
