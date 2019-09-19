import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LaunchDisplays
	{

		public static void main(String[] args)
			{
				birdDisplay();
				pigDisplay();

			}
		
		public static void birdDisplay()
		{

			JFrame frame = new JFrame();
			ImageIcon iconBird = new ImageIcon(("bird.jpg"));
			
			JOptionPane.showMessageDialog(frame, "This is the bird!", null, 0, iconBird);
		}

		public static void pigDisplay()
		{
			JFrame frame = new JFrame();
			ImageIcon iconPig = new ImageIcon(("pig.jpg"));
			
			JOptionPane.showMessageDialog(frame, "This is the pig!", null, 0, iconPig);
		}

	}
