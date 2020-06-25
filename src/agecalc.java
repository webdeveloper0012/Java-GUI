import java.util.Scanner;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class agecalculator extends JFrame{
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JButton button;
	private JPanel key;
	
	
	
	agecalculator(){
		super("AgeCalculator");
		setLayout(new FlowLayout());
		
		text1 = new JTextField("Enter your birthday: ");
		text1.setEditable(false);
		add(text1);
		
		text2 = new JTextField(20);
		text2.setEditable(true);
		add(text2);
		
		text3 = new JTextField("Enter present age: ");
		text3.setEditable(false);
		add(text3);
		
		text4 = new JTextField(20);
		text4.setEditable(true);
		add(text4);
		
		text5 = new JTextField("Your current age is:");
		text5.setEditable(false);
		add(text5);
		
		text6 = new JTextField(20);
		text6.setEditable(true);
		add(text6);
		
	}
}
public class agecalc {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		agecalculator calc = new agecalculator();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc.setSize(300,300);
		calc.setVisible(true);
	}
}
