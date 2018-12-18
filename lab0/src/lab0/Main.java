package lab0;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame{
	public static void main(String args[]) {
		 JFrame.setDefaultLookAndFeelDecorated(true);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
		JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
	    JButton button = new JButton("test");
		JTextField input = new JTextField();
	    JLabel label = new JLabel();
	    
	    panel.add(button);
	    
	}
}
