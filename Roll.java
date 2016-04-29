import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Roll implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton rollDie;
	JLabel dieFace,dieFace2;
	Roll(){
		frame=new JFrame("Rui Qian");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.setBackground(Color.MAGENTA);
		panel.setLayout(new FlowLayout());
		//panel.setLayout(new GridLayout(0,2,10,5));

		dieFace=new JLabel(new ImageIcon("die3.gif"));
		dieFace.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		dieFace.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
		panel.add(dieFace);

		dieFace2=new JLabel(new ImageIcon("die3.gif"));
		dieFace2.setAlignmentX(JLabel.LEFT_ALIGNMENT);
		dieFace2.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
		panel.add(dieFace2);

		rollDie=new JButton("Roll Die");
		rollDie.setBackground(Color.lightGray);
		rollDie.setForeground(Color.RED);
		rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
		rollDie.addActionListener(this);
		panel.add(rollDie);
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
		JFrame.setDefaultLookAndFeelDecorated(true);
		Roll die=new Roll();
	}
	public void actionPerformed(ActionEvent e) {
		int roll,roll2;
		roll=(int)(6*Math.random()+1);
		if (roll==1){
			dieFace.setIcon(new ImageIcon("die1.gif"));
		}else if (roll==2){
			dieFace.setIcon(new ImageIcon("die2.gif"));
		}else if (roll==3){
			dieFace.setIcon(new ImageIcon("die3.gif"));
		}else if (roll==4){
			dieFace.setIcon(new ImageIcon("die4.gif"));
		}else if (roll==5){
			dieFace.setIcon(new ImageIcon("die5.gif"));
		}else if (roll==6){
			dieFace.setIcon(new ImageIcon("die6.gif"));
		}

		
		roll2=(int)(6*Math.random()+1);
		if (roll2==1){
			dieFace2.setIcon(new ImageIcon("die1.gif"));
		}else if (roll2==2){
			dieFace2.setIcon(new ImageIcon("die2.gif"));
		}else if (roll2==3){
			dieFace2.setIcon(new ImageIcon("die3.gif"));
		}else if (roll2==4){
			dieFace2.setIcon(new ImageIcon("die4.gif"));
		}else if (roll2==5){
			dieFace2.setIcon(new ImageIcon("die5.gif"));
		}else if (roll2==6){
			dieFace2.setIcon(new ImageIcon("die6.gif"));
		}

	}

}
