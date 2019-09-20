import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserInputs
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userBird;
static String userName;
		
		public static void takesInput()
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
						BirdUserLaunches.launchesBird();
						BirdUserLaunches.launchDisplay();
						BirdUserLaunches.birdLevels();
						BirdUserLaunches.launchCalculations();
					}
				
		}
		
		public static void pig()
		{
				if(userBird == 2)
					{
						System.out.println("Story time! The AI Bird is angry, an Angry AI Bird if you will, and you are a pig...");
						
						PigUserLaunches.launchesPig();
					}
		}

	}
