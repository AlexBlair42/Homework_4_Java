import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.URL;
import java.util.Random;

/**
 * This program replicates a Yahtzee dice roll.
 * @author ablair18
 * @version 1.0
 */
public class DiceRoll extends JFrame {
	/**
	 * This constructor sets a frame and also adds a button to the frame. 
	 */
	public DiceRoll()
	{
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Roll");
		this.add(btn);
		Roll[] diceroll = new Roll[5];
		for(int i = 0; i<5; i++)
		{
			JLabel one = new JLabel();
			diceroll[i] = new Roll(one);
			this.add(one);
		}
		this.setVisible(true);
		btn.addActionListener(new ActionListener()
		{
			
			/**
			 * This function creates a new thread for each dice rolling on the screen. 
			 * It also keeps track of if the button has been pressed. 
			 */
			public void actionPerformed(ActionEvent e)
			{
				for (int i = 0; i<5; i++)
				{
					Thread t = new Thread(dr[i]);
					t.start();
				}
			}
		});
		try
		{
			Thread.sleep(150);
		}catch (InterruptedException ex){;}
	}

	public static void main(String[] args) 
	{
		DiceRoll r = new DiceRoll();

	}

}

