import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PigUserLaunches
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userPig;
static double userDistance;
static String fake;

	public static void main(String[] args)
				{
				JFrame frame = new JFrame();
				ImageIcon iconPig = new ImageIcon(("pig.jpg"));
					
				JOptionPane.showMessageDialog(frame, "This is you.", fake, userPig, iconPig);
				
				ImageIcon iconBird = new ImageIcon(("bird.jpg"));
				
				JOptionPane.showMessageDialog(frame, "This is the AI Angry Bird.", fake, userPig, iconBird);
				
				launchDisplay();
				chooseDistance();
				pigDestruction();
				
				}

	public static void launchDisplay()
	{
		
		JFrame frame = new JFrame();
		ImageIcon iconPigSetup = new ImageIcon(("birdSetup.jpg"));
			
		JOptionPane.showMessageDialog(frame, "You silly PIG you, the AI Angry Bird is going to hit you, good luck.", fake, userPig, iconPigSetup);
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
		JFrame frame = new JFrame();
		ImageIcon iconHitPig = new ImageIcon(("birdHitPig.jpg"));
		JOptionPane.showMessageDialog(frame, iconHitPig);
		
		System.out.println("Hah! You got hit. Although you had a distance of " + userDistance + " the AI Angry Bird had an acceleration of: " + acceleration + "m/s^2 and therefore hit you!");
	
			
			}
		else 
			{
			JFrame frame = new JFrame();
			ImageIcon iconPigNotHit = new ImageIcon(("pigNotHit.png"));
			JOptionPane.showMessageDialog(frame, iconPigNotHit);
				System.out.println("You lukcy pig! Because you had a distance of " + userDistance + " you got away. You got a pass!");
			
				System.out.println("You have used: " + i + " tries. ");
			
				ImageIcon iconScaredPig = new ImageIcon(("scaredPig.jpg"));
				JOptionPane.showMessageDialog(frame,"However, you are still running! You are a frightened pig now.", fake, userPig, iconScaredPig);
				
				System.out.println("Enter another distance to keep running: ");
				userDistance = intInput.nextInt();
				
			}
		
			}
	}
		
		
		}

	
