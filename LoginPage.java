import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;

public class LoginPage implements ActionListener  {

    
     JPanel contentPanel;
     JTextField emailTextField;
     JPasswordField passwordField;
     JFrame frame = new JFrame();
     ImageIcon opennedEye;
     ImageIcon closedEye;

        LoginPage() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 400);
        contentPanel = new JPanel(); //contentPanel is the JPanel that holds all the components.
        contentPanel.setBackground(new Color(192, 192, 192));
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        frame.setContentPane(contentPanel);
        contentPanel.setLayout(null);

   //Login button set with the final keyword because a local variable because of this it cannot be accessed outside of the constructor, it is inside an anonymous actionListener class so it must be declared final
  //why is'nt the emailTextField and passwordField final? because they're declared outside of the constructor (login()) so they're global and can be accessed within and outside of the constructor
        final JButton LoginButton= new JButton("Login");
        LoginButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        LoginButton.setBackground(new Color(0, 0, 255));
        LoginButton.setOpaque(true);
        LoginButton.setFocusable(false);
        LoginButton.setForeground(Color.LIGHT_GRAY);
        LoginButton.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		 frame.dispose(); //throws away or hides the previous frame when the next frame opens
        		String email = emailTextField.getText();
        		String password = new String (passwordField.getPassword());
        		
        		if (email.endsWith("@gmail.com") &&( password.isEmpty() || password.trim().isEmpty())) {
        			JOptionPane.showMessageDialog(LoginButton, "please enter a password to proceed");
        		}

        		
        		else if (email.endsWith("@gmail.com") && email.matches("^[a-z]+@gmail.com$")) {
        			
        			WelcomePage welcome = new WelcomePage();
        			JOptionPane.showMessageDialog(LoginButton, "you're logged in..");	        			
    				
        		}
        		else  {
        			JOptionPane.showMessageDialog(LoginButton, "error! invalid email declaration or password");
    				
        		}
        		
        	}
        });
      
        LoginButton.setBounds(89, 291, 280, 54);
        contentPanel.add(LoginButton); 

       emailTextField = new JTextField();
       emailTextField.setToolTipText("Email");
       emailTextField.setBounds(89, 177, 280, 33);
        contentPanel.add(emailTextField);
       emailTextField.setColumns(10);

        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon("C:\\\\Users\\\\Merveille\\\\Downloads\\\\cover.jpg"); //instantiate the image that'll be added to the label
        label.setIcon(imageIcon); // adds image to label
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(434, 11, 540, 339);
        contentPanel.add(label); //adds label with image to the panel thats holding all the components

        JLabel label_1 = new JLabel("Gym Management");
        label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        label_1.setBounds(101, 114, 294, 52);
        contentPanel.add(label_1);

        JLabel label_2 = new JLabel("Fitness");
        label_2.setFont(new Font("Stencil", Font.BOLD, 50));
        label_2.setBounds(101, 75, 280, 54);
        contentPanel.add(label_2);

        passwordField = new JPasswordField();
        passwordField.setToolTipText("password");
        passwordField.setBounds(89, 221, 279, 33);
        contentPanel.add(passwordField);
       
        
         //JCheckBox is set to final because same as the login button it is not global its a local variable within the constructor so it has to be final
        //by making JCheckBox final you ensure that its reference remains unchanged within the scope of the constructor and the attached event listener
         final JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
         showPasswordCheckBox.setBackground(new Color(192, 192, 192));
         showPasswordCheckBox.setBounds(89, 261, 150, 23);
         contentPanel.add(showPasswordCheckBox);

         showPasswordCheckBox.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 if (showPasswordCheckBox.isSelected()) {
                     passwordField.setEchoChar((char) 0); // Show password
                 } else {
                     passwordField.setEchoChar('\u2022'); // Hide password, when the password is hidden you'll see bullet dots, these bullets dots are represented by the uni code \u2022
                 }
             }
         });
        
        

        JSeparator separator = new JSeparator(); // the little line between the H and the Fitness label for aesthetics
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBackground(new Color(0, 0, 0));
        separator.setBounds(89, 77, 2, 40);
        contentPanel.add(separator);

        JLabel label_3 = new JLabel("H");
        label_3.setFont(new Font("Snap ITC", Font.BOLD, 35));
        label_3.setBounds(55, 62, 32, 83);
        contentPanel.add(label_3);
        
        JLabel lblNewLabel = new JLabel("Email");
        lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
        lblNewLabel.setBounds(44, 187, 35, 23);
        contentPanel.add(lblNewLabel);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
        lblPassword.setBounds(22, 231, 62, 23);
        contentPanel.add(lblPassword);
        
        final JButton button = new JButton("speed dial log in");
        button.setBounds(203, 26, 178, 38);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                if (e.getSource() == button) {
                	WelcomePage welcome = new WelcomePage();
                } 
            }
        });
        contentPanel.add(button);
    
        frame.setVisible(true);
    }
}
