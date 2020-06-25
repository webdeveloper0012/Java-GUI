import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Shapes extends JPanel{

	private int choice;
	public Shapes(int userChoice){
		choice = userChoice;
	}
	public void paintComponent( Graphics g ){
		super.paintComponent( g);
		
		for(int i=0;i<10;i++){
			switch(choice){
			case 1:
				g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
			case 2:
				g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
			}
		}
	}
}
public class ShapesTest {
	public static void main(String args[]){
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangle\n" + "Enter 2 to draw oval\n");
		int choice = Integer.parseInt(input);
		
		Shapes panel = new Shapes(choice);
		JFrame application = new JFrame();
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}
}
