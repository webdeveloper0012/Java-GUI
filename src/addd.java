import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import tuny.thehandler;

class he extends JFrame{
	private JTextField pi;
	private JTextField ti;
	private JButton bi;
	private JTextField res[];
	
	he(){
		super("Addition");
		setLayout(new FlowLayout());
		
		pi = new JTextField("Enter an Integer", 15);
		add(pi);
		
		ti = new JTextField("Enter another integer", 15);
		add(ti);
		
		
		bi = new JButton("Result");
		add(bi);
		
		res = new JTextField("output", 15);
		add(res);
		
		thehandler handler = new thehandler();
		pi.addActionListener(handler);
		bi.addActionListener(handler);
		res.addActionListener(handler);
		
		private class thehandler implements ActionListener{
			public void actionPerformed(ActionEvent event){
				if(pi == event.getSource())
					double d = pi.getActionCommand();
				else if(ti==event.getSource())
					fg
				
			}
		}
		
	}
}

class addd {
	public static void main(String args[]){
		he app = new he();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200,200);
		app.setVisible(true);
		
		
	}
}
