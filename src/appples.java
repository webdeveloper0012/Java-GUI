import javax.swing.JOptionPane;

public class appples {
	public static void main(String args[]){
		String fn = JOptionPane.showInputDialog("Entrer a number: ");
		String sn = JOptionPane.showInputDialog("Enter second number: ");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1+num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "The title", JOptionPane.PLAIN_MESSAGE);
	}
}
