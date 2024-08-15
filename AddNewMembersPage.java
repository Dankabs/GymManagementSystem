import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import javax.swing.JRadioButton;

public class AddNewMembersPage implements ActionListener {

JFrame frame = new JFrame();	
JPanel contentPanel;
 JTextField textField;
 JTextField textField_1;
 JTextField textField_2;
 JTextField textField_3;
 JTextField textField_4;
 JTextField textField_5;
 JLabel lblNewLabel_3;
 JLabel lblNewLabel_4;
 JLabel lblNewLabel_5;
 JLabel lblNewLabel_6;
 JLabel lblNewLabel_7;
 JLabel lblNewLabel_8;
 JLabel lblNewLabel_9;
JButton homeButton;
 JRadioButton rdbtnNewRadioButton;

	 AddNewMembersPage() {
		 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 400);
		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(128, 128, 128));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 56, 81));
		panel.setBounds(10, 11, 81, 339);
		contentPanel.add(panel);
		
		  homeButton = new JButton("home");
		 homeButton.addActionListener(this);
		 homeButton.setFocusable(false);
		 panel.add( homeButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(47, 56, 81));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(144, 11, 817, 339);
		contentPanel.add(lblNewLabel);
		
		
		textField = new JTextField();
		textField.setBounds(258, 24, 434, 25);
		lblNewLabel.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(161, 11, 542, 50);
		contentPanel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(258, 72, 270, 31);
		lblNewLabel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(258, 114, 270, 31);
		lblNewLabel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(258, 156, 270, 31);
		lblNewLabel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(258, 198, 270, 31);
		lblNewLabel.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Name :");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(179, 72, 69, 31);
		lblNewLabel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Address :");
		lblNewLabel_4.setBounds(161, 114, 87, 31);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Email :");
		lblNewLabel_5.setBounds(179, 156, 69, 31);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel(" Phone Number :");
		lblNewLabel_6.setBounds(128, 198, 120, 31);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Age :");
		lblNewLabel_7.setBounds(179, 240, 69, 31);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Gender");
		lblNewLabel_8.setBounds(179, 282, 69, 31);
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Duration");
		lblNewLabel_9.setBounds(538, 72, 69, 31);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
		btnNewButton.setBounds(161, 25, 89, 23);
		btnNewButton.setFocusable(false);
		
		lblNewLabel.add(btnNewButton);
		
		textField_5 = new JTextField();
		lblNewLabel.add(textField_5);
		textField_5.setBounds(260, 239, 55, 31);
		textField_5.setColumns(10);
		
		
		
		 JRadioButton maleRadioButton = new JRadioButton("Male");
	        maleRadioButton.setBounds(260, 289, 80, 23);
	        lblNewLabel.add(maleRadioButton);

	        JRadioButton femaleRadioButton = new JRadioButton("Female");
	        femaleRadioButton.setBounds(360, 289, 80, 23);
	        lblNewLabel.add(femaleRadioButton);

	        ButtonGroup genderGroup = new ButtonGroup();
	        genderGroup.add(maleRadioButton);
	        genderGroup.add(femaleRadioButton);
	        
	        JComboBox<String> comboBox = new JComboBox<String>();
	        lblNewLabel.add(comboBox);
	        comboBox.addItem("1 month");
	        comboBox.addItem("3 months");
	        comboBox.addItem("6 months");
	        comboBox.addItem("12 months");
	        comboBox.setBounds(610, 72, 96, 32);
	
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if (e.getSource() ==  homeButton) {
			WelcomePage welcomePage = new WelcomePage();
		}
	}
}
