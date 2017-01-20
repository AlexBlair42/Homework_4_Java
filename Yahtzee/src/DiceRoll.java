import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.URL;
import java.util.Random;

public class DiceRoll extends JFrame {
	
	public DiceRoll(){
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Roll");
		this.add(btn);
		Roll[] dr = new Roll[5];
		for(int i = 0; i<5; i++){
			JLabel 1 = new JLabel();
			dr[i] = new Roll(1);
			this.add(1);
		}
		this.setVisible(true);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				for (int i = 0; i<5; i++){
					Thread t = new Thread(dr[i]);
					t.start();
				}
			}
		});
		try{
			Thread.sleep(150);
		}catch (InterruptedException ex){;}
	}

	public static void main(String[] args) {
		DiceRoll r = new DiceRoll();

	}

}

class Roll implements Runnable{
	
	private JLabel Label;
	public Roll (JLabel label){
		Label = label;
		
	}
	public void run(){
		Random rand = new Random();
		Random n = new Random();
		int num = rand.nextInt(50)+1;
		for(int i = num; i >= 1;i--){
			int pickedNumber = rand.nextInt(6)+1;
			
			if (pickedNumber ==6){
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			URL iu =getClass().getResource("/resource/six.png");
			Image img = toolkit.getImage(iu);
			img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(img);
			Label.setIcon(icon);
			}
			else if (pickedNumber ==5){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/five.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==4){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/four.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==3){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/three.jpg");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==2){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/two.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			else if (pickedNumber ==1){
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				URL iu =getClass().getResource("/resource/one.png");
				Image img = toolkit.getImage(iu);
				img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
				ImageIcon icon = new ImageIcon(img);
				Label.setIcon(icon);
				}
			
			try{
				Thread.sleep(100);
			}catch(InterruptedException ex){;}
		}
	}
}