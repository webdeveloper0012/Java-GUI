import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

class DrawPanell extends JPanel{
	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(50, 50, width, height);
		g.drawLine(0, height,width ,0);
		g.drawString("Enter your Birthdays", 80, 10);
	}
}
public class DrawpanellTest {
	public static void main(String args[]){
		DrawPanell panel = new DrawPanell();
		JFrame application = new JFrame();	
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}
}
