import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlayGame
	{
static Scanner stringInput = new Scanner(System.in);
static String birdOrPig;
static JFrame frame = new JFrame();
	
		public static void main(String[] args)
			{
				UserInputs.takesInput();
				UserInputs.bird();
				UserInputs.pig();
				BirdUserLaunches.launchesBird();
				BirdUserLaunches.launchDisplay();
				BirdUserLaunches.birdLevels();
				BirdUserLaunches.launchCalculations();
			}

	}
