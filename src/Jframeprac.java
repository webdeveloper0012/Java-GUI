import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

	
public class Jframeprac extends JFrame{
	private JLabel item1;
	
	public Jframeprac(){
		super("The title bar");
		setLayout(new Flowlayout());
		
		item1 = new JLabel("This is a test");
		item1.setToolTipText("This is gona show up on hover");
		add(item1);
	}
}
	
