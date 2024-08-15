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

public class UpdateAndDeletePage implements ActionListener {

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
    JLabel lblNewLabel_1;
    JButton deleteButton;
    JButton updateButton;
    private JButton btnNewButton_1;

    UpdateAndDeletePage() {
         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 400);
        contentPanel = new JPanel();
        contentPanel.setBackground(new Color(128, 128, 128));
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        frame.setContentPane(contentPanel);
        contentPanel.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(81, 44, 97));
        panel.setBounds(10, 11, 97, 339);
        contentPanel.add(panel);
        panel.setLayout(null); // Use null layout to set explicit bounds
        
        // Initialize homeButton
        homeButton = new JButton("home");
        homeButton.addActionListener(this);
        homeButton.setFocusable(false);
        homeButton.setBounds(10, 10, 77, 30); // Set bounds for homeButton
        panel.add(homeButton);
        
        // Initialize deleteButton
        deleteButton = new JButton("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setBounds(10, 50, 77, 30); // Set bounds for deleteButton (same width as homeButton, below it)
        panel.add(deleteButton);
        
        updateButton = new JButton("Update");
        updateButton.setFocusable(false);
        updateButton.setBounds(10, 90, 77, 30); // Set bounds for deleteButton (same width as homeButton, below it)
        panel.add(updateButton);
        
      
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(81, 44, 97));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(144, 11, 817, 339);
        contentPanel.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(161, 11, 542, 50);
        contentPanel.add(lblNewLabel_2);

        ButtonGroup genderGroup = new ButtonGroup();
        
        lblNewLabel_8 = new JLabel("Gender");
        lblNewLabel.add(lblNewLabel_8);
        lblNewLabel_8.setBounds(223 - 50, 319 - 20, 69, 31); // Moved left by 50 and up by 20
        lblNewLabel_8.setForeground(Color.WHITE);
        
        JRadioButton maleRadioButton = new JRadioButton("Male");
        lblNewLabel.add(maleRadioButton);
        maleRadioButton.setBounds(298 - 50, 323 - 20, 80, 23); // Moved left by 50 and up by 20
        genderGroup.add(maleRadioButton);
        
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        lblNewLabel.add(femaleRadioButton);
        femaleRadioButton.setBounds(404 - 50, 323 - 20, 80, 23); // Moved left by 50 and up by 20
        genderGroup.add(femaleRadioButton);
        
        lblNewLabel_7 = new JLabel("Age :");
        lblNewLabel.add(lblNewLabel_7);
        lblNewLabel_7.setBounds(212 - 50, 277 - 20, 69, 31); // Moved left by 50 and up by 20
        lblNewLabel_7.setForeground(Color.WHITE);
        
        textField_5 = new JTextField();
        lblNewLabel.add(textField_5);
        textField_5.setBounds(305 - 50, 277 - 20, 55, 31); // Moved left by 50 and up by 20
        textField_5.setColumns(10);
        
        lblNewLabel_6 = new JLabel("Phone Number :");
        lblNewLabel.add(lblNewLabel_6);
        lblNewLabel_6.setBounds(173 - 50, 235 - 20, 120, 31); // Moved left by 50 and up by 20
        lblNewLabel_6.setForeground(Color.WHITE);
        
        textField_4 = new JTextField();
        lblNewLabel.add(textField_4);
        textField_4.setBounds(303 - 50, 235 - 20, 270, 31); // Moved left by 50 and up by 20
        textField_4.setColumns(10);
        
        lblNewLabel_5 = new JLabel("Email :");
        lblNewLabel.add(lblNewLabel_5);
        lblNewLabel_5.setBounds(223 - 50, 193 - 20, 69, 31); // Moved left by 50 and up by 20
        lblNewLabel_5.setForeground(Color.WHITE);
        
        textField_3 = new JTextField();
        lblNewLabel.add(textField_3);
        textField_3.setColumns(10);
        textField_3.setBounds(303 - 50, 193 - 20, 270, 31); // Moved left by 50 and up by 20
        
        lblNewLabel_4 = new JLabel("Address :");
        lblNewLabel.add(lblNewLabel_4);
        lblNewLabel_4.setBounds(212 - 50, 151 - 20, 87, 31); // Moved left by 50 and up by 20
        lblNewLabel_4.setForeground(Color.WHITE);
        
        textField_2 = new JTextField();
        lblNewLabel.add(textField_2);
        textField_2.setColumns(10);
        textField_2.setBounds(303 - 50, 151 - 20, 270, 31); // Moved left by 50 and up by 20
        
        lblNewLabel_3 = new JLabel("Name :");
        lblNewLabel.add(lblNewLabel_3);
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(223 - 50, 109 - 20, 69, 31); // Moved left by 50 and up by 20
        
        textField_1 = new JTextField();
        lblNewLabel.add(textField_1);
        textField_1.setBounds(298 - 50, 109 - 20, 270, 31); // Moved left by 50 and up by 20
        textField_1.setColumns(10);
        
        lblNewLabel_9 = new JLabel("Duration");
        lblNewLabel.add(lblNewLabel_9);
        lblNewLabel_9.setBounds(628 - 50, 109 - 20, 69, 31); // Moved left by 50 and up by 20
        lblNewLabel_9.setForeground(Color.WHITE);
        
        JComboBox<String> comboBox = new JComboBox<String>();
        lblNewLabel.add(comboBox);
        comboBox.addItem("1 month");
        comboBox.addItem("3 months");
        comboBox.addItem("6 months");
        comboBox.addItem("12 months");
        comboBox.setBounds(707 - 50, 108 - 20, 96, 32); // Moved left by 50 and up by 20
        
        JButton btnNewButton = new JButton("search");
        lblNewLabel.add(btnNewButton);
        btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 13));
        btnNewButton.setBounds(262 - 120, 75 - 20, 89, 23); // Moved left by 50 and up by 20
        btnNewButton.setFocusable(false);
        
        textField = new JTextField();
        lblNewLabel.add(textField);
        textField.setBounds(303 - 50, 73 - 20, 434, 25); // Moved left by 50 and up by 20
        textField.setColumns(10);
        
        lblNewLabel_1 = new JLabel("Update/Delete member");
        lblNewLabel_1.setForeground(new Color(230, 232, 231));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
        lblNewLabel_1.setBounds(442, 21 - 22, 506, 40);
        lblNewLabel.add(lblNewLabel_1);
  
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        if (e.getSource() == homeButton) {
            WelcomePage welcomePage = new WelcomePage();
        }
    }
}
