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
		
		public static void bird()
		{
			userBird = intInput.nextInt();
				if (userBird == 1)
					{
						System.out.println("Glad to hear it, birds are better.");
						BirdUserLaunches.main(null);
					}
				
		}
		
		public static void pig()
		{
				if(userBird == 2)
					{
						System.out.println("Story time! The AI Bird is angry, an Angry AI Bird if you will, and you are a pig...");
						
						PigUserLaunches.main(null);
					}
		}

	}
