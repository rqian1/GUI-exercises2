import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BloodDrive extends JFrame implements ActionListener {
	private static JLabel prompt1,prompt2,prompt3,prompt4,prompt5, temp;
	private static Double num1,num2,num3,num4,num5;
	private static JFrame frame;
	private static JPanel panel;
	private static JTextField intbox1,intbox2,intbox3,intbox4,intbox5;

	BloodDrive(){
		frame=new JFrame("Rui Qian");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setLayout(new GridLayout(0,2,10,5));
		panel.setBorder(BorderFactory.createEmptyBorder(10,20,10,10));
		frame.setVisible(true);

		intbox1= new JTextField(15);
		prompt1=new JLabel("Enter the number of pints of blood donated in department 1");
		panel.add(prompt1);
		panel.add(intbox1);

		intbox2= new JTextField(15);
		prompt2=new JLabel("Enter the number of pints of blood donated in department 2");
		panel.add(prompt2);
		panel.add(intbox2);

		intbox3= new JTextField(15);
		prompt3=new JLabel("Enter the number of pints of blood donated in department 3");
		panel.add(prompt3);
		panel.add(intbox3);

		intbox4= new JTextField(15);
		prompt4=new JLabel("Enter the number of pints of blood donated in department 4");
		panel.add(prompt4);
		panel.add(intbox4);

		intbox5= new JTextField(15);
		intbox5.setActionCommand("Num");
		intbox5.addActionListener(this);
		prompt5=new JLabel("Enter the number of pints of blood donated in department 5");
		panel.add(prompt5);
		panel.add(intbox5);

		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);

	}

	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runthis();
			}
		});
	}
	private static void runthis(){
		//JFrame.setDefaultLookAndFeelDecorated(true);
		BloodDrive name=new BloodDrive();
	}

	public void paintComponent(Graphics g){
		super.paintComponents(g);
	}
	public void actionPerformed(ActionEvent e) {
		String event=e.getActionCommand();
		if (event.equals("Num")){
			String number1=intbox1.getText();
			String number2=intbox2.getText();
			String number3=intbox3.getText();
			String number4=intbox4.getText();
			String number5=intbox5.getText();
			num1=Double.parseDouble(number1);
			num2=Double.parseDouble(number2);
			num3=Double.parseDouble(number3);
			num4=Double.parseDouble(number4);
			num5=Double.parseDouble(number5);
			DrawPanel newone=new DrawPanel();
			newone.runthis(num1,num2,num3,num4,num5);
		}
	}
}
