import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PaymentPage {

    JFrame frame = new JFrame();
    JPanel contentPane;
    JPanel contentPanel;
    JTextField textField;
    JTextField textField_1;
    JTextField textField_2;
    JTextField textField_3;
    JTextField textField_4;
    JLabel lblNewLabel_3;
    JLabel lblNewLabel_4;
    JLabel lblNewLabel_5;
    JLabel lblNewLabel_6;
    JButton homeButton;
    JRadioButton rdbtnNewRadioButton;
    JLabel lblNewLabel_1;
    private JButton btnNewButton_1;

    public PaymentPage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Use null layout to set explicit bounds
        
        contentPanel = new JPanel();
        contentPanel.setBackground(new Color(55, 89, 69));
        contentPanel.setBounds(10, 11, 97, 339);
        contentPane.add(contentPanel);
        contentPanel.setLayout(null); // Use null layout to set explicit bounds
        
        // Initialize homeButton
        homeButton = new JButton("home");
        homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    frame.dispose();
			    new WelcomePage();
			}
		});
        homeButton.setFocusable(false);
        homeButton.setBounds(10, 10, 77, 30); // Set bounds for homeButton
        contentPanel.add(homeButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(55, 89, 69));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(144, 11, 817, 339);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(161, 11, 542, 50);
        contentPane.add(lblNewLabel_2);

        ButtonGroup genderGroup = new ButtonGroup();
        
        lblNewLabel_6 = new JLabel("Amount to pay :");
        lblNewLabel.add(lblNewLabel_6);
        lblNewLabel_6.setBounds(173 - 50, 235, 120, 31); // Adjusted y position
        lblNewLabel_6.setForeground(Color.WHITE);
        
        textField_4 = new JTextField();
        lblNewLabel.add(textField_4);
        textField_4.setBounds(303 - 50, 235, 270, 31); // Adjusted y position
        textField_4.setColumns(10);
        
        lblNewLabel_5 = new JLabel("Email :");
        lblNewLabel.add(lblNewLabel_5);
        lblNewLabel_5.setBounds(223 - 50, 193, 69, 31); // Adjusted y position
        lblNewLabel_5.setForeground(Color.WHITE);
        
        textField_3 = new JTextField();
        lblNewLabel.add(textField_3);
        textField_3.setColumns(10);
        textField_3.setBounds(303 - 50, 193, 270, 31); // Adjusted y position
        
        lblNewLabel_4 = new JLabel("Phone Number :");
        lblNewLabel.add(lblNewLabel_4);
        lblNewLabel_4.setBounds(212 - 50, 151, 90, 31); // Adjusted y position
        lblNewLabel_4.setForeground(Color.WHITE);
        
        textField_2 = new JTextField();
        lblNewLabel.add(textField_2);
        textField_2.setColumns(10);
        textField_2.setBounds(303 - 50, 151, 270, 31); // Adjusted y position
        
        lblNewLabel_3 = new JLabel("Name :");
        lblNewLabel.add(lblNewLabel_3);
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(223 - 38, 109, 69, 31); // Adjusted y position
        
        textField_1 = new JTextField();
        lblNewLabel.add(textField_1);
        textField_1.setBounds(298 - 43, 109, 270, 31); // Adjusted y position
        textField_1.setColumns(10);
        
        JButton btnNewButton = new JButton("search");
        lblNewLabel.add(btnNewButton);
        btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
        btnNewButton.setBounds(262 - 120, 75, 89, 23); // Adjusted y position
        btnNewButton.setFocusable(false);
        
        textField = new JTextField();
        lblNewLabel.add(textField);
        textField.setBounds(303 - 50, 73, 434, 25); // Adjusted y position
        textField.setColumns(10);
      
        frame.setContentPane(contentPane);
        
        lblNewLabel_1 = new JLabel("Payment");
        lblNewLabel.add(lblNewLabel_1);
        lblNewLabel_1.setForeground(new Color(230, 232, 231));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
        lblNewLabel_1.setBounds(664, 27, 506, 40);
        frame.setVisible(true);
    }
}
