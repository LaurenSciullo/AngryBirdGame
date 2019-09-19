
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BirdUserLaunches
	{
static Scanner stringInput = new Scanner(System.in);
static Scanner intInput = new Scanner(System.in);

static int userBird;
static int userDay;
static String fake;

		public static void main(String[] args)
			{
				
				System.out.print("\nGood luck!");
				System.out.println(" Since you are a bird, you will be launching yourself into the pigs to destory them.");
				JFrame frame = new JFrame();
				ImageIcon iconBird = new ImageIcon(("bird.jpg"));
				
				JOptionPane.showMessageDialog(frame, "This is you!", null, 0, iconBird);
				
				birdLevels();
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
			JFrame frame = new JFrame();
			ImageIcon iconBirdSetup = new ImageIcon(("birdSetup.jpg"));
			
			JOptionPane.showMessageDialog(frame, "You angry bird you, this is you on your launch platform, and this is the pig you will hit!", null, 0, iconBirdSetup);
			
		}
		
		public static void launchCalculations() 
		{
			for (int i = 0; i <= 4; i++)
				{
			System.out.println("\nNow you are going to launch into the pig by calculcating how far away the pig is. You have 5 tries. You have used: " + i );
			if (userDay == 10)
				{
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
							JFrame frame = new JFrame();
							ImageIcon iconBirdHitPig = new ImageIcon(("birdHitPig.jpg"));
							
							JOptionPane.showMessageDialog(frame, iconBirdHitPig);
							System.exit(0);
						}
					else if (calculatedDistance == 0)
						{
							System.out.println("Boooooo can't even calculate how off you were. ");
							
						}
					else 
						{
							JFrame frame = new JFrame();
							ImageIcon iconPigNotHit = new ImageIcon(("pigNotHit.png"));
							
							JOptionPane.showMessageDialog(frame, "Boooooo you missed!", null, 0, iconPigNotHit);
							
							double percentOff = Math.abs(randomDistance - calculatedDistance) / calculatedDistance;
							System.out.println("You were " + percentOff + "% off.");
				
						}
				}
			else if (userDay == 5)
				{
					System.out.println("Enter what acceleration you would like to launch at: ");
					int userAcceleration = intInput.nextInt();
					
					System.out.println("Enter what velocity you would like to launch at: ");
					int userVelocity = intInput.nextInt();
					
					int randomDistance = (int)(Math.random()*5 + 1);
				
					double calculatedDistance = ((userVelocity) * (userVelocity) ) / ( 2 * userAcceleration);
					
					System.out.println("Your calculated distance: " + calculatedDistance);
					System.out.println("Your actual distance: " + randomDistance);
					if (calculatedDistance == randomDistance)
						{
							System.out.println("Congrats! Your calculated distance matched the actual distance! ");
							JFrame frame = new JFrame();
							ImageIcon iconBirdHitPig = new ImageIcon(("birdHitPig.jpg"));
							
							JOptionPane.showMessageDialog(frame, iconBirdHitPig);
							System.exit(0);
						}
					else if (calculatedDistance == 0)
						{
							System.out.println("Boooooo can't even calculate how off you were. ");
						}
					else 
						{
							JFrame frame = new JFrame();
							ImageIcon iconPigNotHit = new ImageIcon(("pigNotHit.png"));
							
							JOptionPane.showMessageDialog(frame, "Boooooo you missed!", null, 0, iconPigNotHit);
							
							double percentOff = Math.abs(randomDistance - calculatedDistance) / calculatedDistance;
							System.out.println("Boooooo you missed! You were " + percentOff + "% off.");
						}
				}
			else 
				{
					System.out.println("Enter what acceleration you would like to launch at: ");
					int userAcceleration = intInput.nextInt();
					
					System.out.println("Enter what velocity you would like to launch at: ");
					int userVelocity = intInput.nextInt();
					
					double calculatedDistance = ((userVelocity) * (userVelocity) ) / ( 2 * userAcceleration);
					
					System.out.println("Your calculated distance: " + calculatedDistance);
					System.out.println("Your actual distance: " + calculatedDistance);
					
							System.out.println("Congrats! Your calculated distance matched the actual distance! ");
							
							JFrame frame = new JFrame();
							ImageIcon iconBirdHitPig = new ImageIcon(("birdHitPig.jpg"));
							
							JOptionPane.showMessageDialog(frame, iconBirdHitPig);
							
							System.out.println("You were 0% off.");
							System.exit(0);
						
				}
			
				}
		}
			
	}
