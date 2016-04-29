
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Riddle implements ActionListener{
	private static JLabel riddle;
	private static JLabel answer;
	private static JButton button;
	private static JFrame frame;
	private static JPanel panel;
	Riddle(){
		frame=new JFrame("Rui Qian");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel=new JPanel();
		//panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		frame.setVisible(true);
		
		riddle=new JLabel("How do you have a solar system party?");
		panel.add(riddle);
		answer=new JLabel(" ");
		panel.add(answer);
		
		
		button=new JButton("Show");
		button.setActionCommand("Show");
		button.addActionListener(this);
		panel.add(button);
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
		Riddle name=new Riddle();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		String event=e.getActionCommand();
		if (event.equals("Hide")){
			answer.setText(" ");
			button.setText("Show");
			button.setActionCommand("Show");
		}else{
			answer.setText("You Plan-it!");
			button.setText("Hide");
			button.setActionCommand("Hide");
		}

	}
}
