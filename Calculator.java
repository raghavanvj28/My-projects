import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	static double a=0,b=0,result=0,square=0;
	static int operator=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_4)
					textField_1.setText(textField_1.getText().concat("7"));
			}
		});
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_12)
					textField_1.setText(textField_1.getText().concat("1"));
			}
		});
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_16)
					textField_1.setText(textField_1.getText().concat("0"));
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_16, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_16, 7, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_16, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_16, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_12, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_12, 7, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_12, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_12, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_4, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_4, 7, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_4, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_4, 88, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		
		JLabel label = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label, 7, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label, 169, SpringLayout.WEST, contentPane);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_2, 7, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_2, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_2, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_2, 331, SpringLayout.WEST, contentPane);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_3, 7, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_3, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_3, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_3, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_4, 7, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_4, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_4, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_4, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_4);
		
		
		JButton btnNewButton_2 = new JButton("Sqr");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2)
				{
					
					a=Double.parseDouble(textField_1.getText());
					square=a*a;
					textField_1.setText(""+square);
					
				} 
				
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_2, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 7, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_2, 88, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3) {
					textField_1.setText("");
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_3, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_3, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_3, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_3, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("%");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 250, SpringLayout.WEST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton)
				{
					
					a=Double.parseDouble(textField_1.getText());
					operator=5;
					textField_1.setText("%");
					
				} 
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					String full=textField_1.getText();
					textField_1.setText("");
					for(int i=0;i<full.length()-1;i++) {
						textField_1.setText(textField_1.getText()+full.charAt(i));
					}
					
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, 331, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_1);
		
		JLabel label_5 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_5, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_5, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_5, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_5, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_6, 71, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_6, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_6, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_6, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_6);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_5) {
					textField_1.setText(textField_1.getText().concat("8"));
					
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_5, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_5, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_5, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_5, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_6) {
					textField_1.setText(textField_1.getText().concat("9"));
					
				}
			}
			
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_6, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_6, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_6, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_6, 250, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Mul");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_7)
				{
					
					a=Double.parseDouble(textField_1.getText());
					operator=4;
					textField_1.setText("*");
					
				} 
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_7, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_7, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_7, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_7, 331, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_7);
		
		JLabel label_7 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_7, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_7, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_7, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_7, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_8, 135, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_8, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_8, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_8, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_8);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_8)
					textField_1.setText(textField_1.getText().concat("4"));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_8, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_8, 7, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_8, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_8, 88, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_9)
					textField_1.setText(textField_1.getText().concat("5"));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_9, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_9, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_9, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_9, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_10)
					textField_1.setText(textField_1.getText().concat("6"));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_10, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_10, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_10, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_10, 250, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_11)
				{
					
					a=Double.parseDouble(textField_1.getText());
					operator=2;
					textField_1.setText("-");
					
				} 
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_11, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_11, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_11, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_11, 331, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_11);
		
		JLabel label_9 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_9, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_9, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_9, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_9, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_10, 199, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_10, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_10, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_10, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_10);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("2");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_13)
					textField_1.setText(textField_1.getText().concat("2"));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_13, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_13, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_13, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_13, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("3");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_14)
					textField_1.setText(textField_1.getText().concat("3"));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_14, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_14, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_14, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_14, 250, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_15)
				{
					
					a=Double.parseDouble(textField_1.getText());
					operator=1;
					textField_1.setText("+");
					
				} 
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_15, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_15, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_15, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_15, 331, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_15);
		
		JLabel label_11 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_11, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_11, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_11, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_11, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_12, 263, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_12, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_12, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_12, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_12);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_17)
					textField_1.setText(textField_1.getText().concat("."));
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_17, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_17, 88, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_17, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_17, 169, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("=");
		btnNewButton_18.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_18)
				{
				b=Double.parseDouble(textField_1.getText());
				switch(operator) {
				case 1:
					result=a+b;
					break;
				case 2:
					result=a-b;
					break;
				case 3:
					result=a/b;
					break;
				case 4:
					result=a*b;
					break;
				case 5:
					result=a%b;
					break;
				}
			}
				textField_1.setText(""+result);
				
			}
			});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_18, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_18, 169, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_18, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_18, 250, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("/");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_19)
				{
					
					a=Double.parseDouble(textField_1.getText());
					operator=3;
					textField_1.setText("");
					
				} 
				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_19, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_19, 250, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_19, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_19, 331, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton_19);
		
		JLabel label_13 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_13, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_13, 331, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_13, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_13, 412, SpringLayout.WEST, contentPane);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, label_14, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, label_14, 412, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, label_14, 391, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, label_14, 493, SpringLayout.WEST, contentPane);
		contentPane.add(label_14);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, 400, SpringLayout.WEST, label);
		contentPane.add(textField_1);
		textField_1.setColumns(150);
	}
}



	

