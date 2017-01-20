import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Roll implements Runnable
{
	
	private JLabel Label;
	public Roll (JLabel label)
	{
		Label = label;
		
	}
	public void run()
	{
		
		Random rand = new Random();
		Random n = new Random();
		int num = rand.nextInt(50)+1;
		
		
		for(int i = num; i >= 1;i--)
		{
			int pickedNumber = rand.nextInt(6)+1;
			
			if (pickedNumber ==6)
			{
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL iu =getClass().getResource("/resource/six.png");
			Image img = toolkit.getImage(iu);
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(img);
			Label.setIcon(icon);
			}
			else if (pickedNumber ==5)
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/five.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==4)
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/four.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==3)
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/three.jpg");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==2)
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/two.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==1)
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/one.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			
			try
			{
				Thread.sleep(100);
			}catch(InterruptedException ex){;}
		}
	}
}