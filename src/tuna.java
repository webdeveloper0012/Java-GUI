import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tuna extends JFrame {
	private JLabel item1;
	
	public tuna(){
		super("The title bar");
		
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is test");
		item1.setToolTipText("I am raihan");
		add(item1);
	}
}
