import java.util.Scanner;

public class UserInputs
	{

		public static void main(String[] args)
			{
				Scanner stringInput = new Scanner(System.in);
				Scanner intInput = new Scanner(System.in);
				
				System.out.println("Welcome to the Angry Birds Game! Enter your name to begin: ");
				String userName = stringInput.nextLine();
				
				System.out.println(userName + " are you a bird? (1)Yes or (2)No.");
				int userBird = intInput.nextInt();
				
				if (userBird == 1)
					{
						System.out.println("Glad to hear it. How was your day today? (1)Good, (2)Medium, (3)Bad.");
					}
				else
					{
						System.out.println("Bummer... guess you don't want to play angry birds then.");
					}

			}

	}
