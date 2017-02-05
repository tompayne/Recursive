package Playground;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class faces {

	public static void main(String[] args) throws Exception {
		
		/*
		JOptionPane.showMessageDialog(null, "Hello, Tom");
		System.exit(0);
		
		String showName = JOptionPane.showInputDialog("What would you like me to do?");
		JOptionPane.showMessageDialog(null, "Sorry Tom, I cant do that");
		//System.out.println("hello " + showName);
		System.exit(0);
		
		*/
		URL imageLocation = new URL ("http://horstmann.com/bigjava/duke.gif") ;
		JOptionPane.showMessageDialog(null, "Tom,get up and focus your energy", "Toms Morning Cheer", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
		
		
	}

}
