import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WelcomePage implements ActionListener {
	JFrame frame = new JFrame("Home");
	JLabel ButtonLabel = new JLabel();
    JButton button1 = new JButton("New member");
    JButton button2 = new JButton("Update & delete");
    JButton button3 = new JButton("List of members");
    JButton button4 = new JButton("Payment");
    JButton button5 = new JButton("Logout");
    JButton button6 = new JButton("Exit");
    
	
	WelcomePage() {
		
		JLabel label = new JLabel();
        
        JPanel panel = new JPanel(new BorderLayout());
        
        
        
        ImageIcon button1Image = new ImageIcon("C:\\Users\\Merveille\\Downloads\\add.png");
        ImageIcon button2Image = new ImageIcon("C:\\Users\\Merveille\\\\Downloads\\delete.png");
        ImageIcon button3Image = new ImageIcon("C:\\Users\\Merveille\\Downloads\\list.png");
        ImageIcon button4Image = new ImageIcon("C:\\\\Users\\\\Merveille\\\\\\\\Downloads\\\\payment.png");
        ImageIcon button5Image = new ImageIcon("C:\\\\Users\\\\Merveille\\\\\\\\Downloads\\\\logout.png");
        ImageIcon button6Image = new ImageIcon("C:\\\\Users\\\\Merveille\\\\\\\\Downloads\\\\exit.png");
        
        Dimension buttonSize = new Dimension(150, 70); // Adjust width and height as needed
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        
        
        
        button1.setBorder(BorderFactory.createRaisedBevelBorder());
        button2.setBorder(BorderFactory.createRaisedBevelBorder());
        button3.setBorder(BorderFactory.createRaisedBevelBorder());
        button4.setBorder(BorderFactory.createRaisedBevelBorder());
        button5.setBorder(BorderFactory.createRaisedBevelBorder());
        button6.setBorder(BorderFactory.createRaisedBevelBorder());
        
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        
        Image scaledImage1 = button1Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Adjust width and height as needed
        Image scaledImage2 = button2Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image scaledImage3 = button3Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image scaledImage4 = button4Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image scaledImage5 = button5Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image scaledImage6 = button6Image.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        	        
        
        button1.setIcon(new ImageIcon(scaledImage1));
        button2.setIcon(new ImageIcon(scaledImage2));
        button3.setIcon(new ImageIcon(scaledImage3));
        button4.setIcon(new ImageIcon(scaledImage4));
        button5.setIcon(new ImageIcon(scaledImage5));   
        button6.setIcon(new ImageIcon(scaledImage6));
        
        
        button1.setHorizontalTextPosition(SwingConstants.LEFT);	       
        button2.setHorizontalTextPosition(SwingConstants.LEFT);
        button3.setHorizontalTextPosition(SwingConstants.LEFT);
        button4.setHorizontalTextPosition(SwingConstants.LEFT);
        button5.setHorizontalTextPosition(SwingConstants.LEFT);
        button6.setHorizontalTextPosition(SwingConstants.LEFT);	
        
        
        button1.setForeground(Color.WHITE);
        button2.setForeground(Color.WHITE);
        button3.setForeground(Color.WHITE);
        button4.setForeground(Color.WHITE);
        button5.setForeground(Color.WHITE);
        button6.setForeground(Color.WHITE);
        
        
        button1.setBackground(new Color(0x8B4513));
        button2.setBackground(new Color(0x8B4513));
        button3.setBackground(new Color(0x8B4513));
        button4.setBackground(new Color(0x8B4513));
        button5.setBackground(new Color(0x8B4513));
        button6.setBackground(new Color(0x8B4513));
        
       
     
          
      
        ImageIcon image = new ImageIcon("C:\\Users\\Merveille\\Downloads\\browngym.jpg");	      
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setAlignmentX(Component.TOP_ALIGNMENT);
        label.setBounds(100, 50, 50, 100);      
        label.setLayout(new GridLayout());
                
        
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(new Color(0x6C, 0xA9,0xC8 ));
        panel.add(ButtonLabel, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER); 
        
        
        
        ButtonLabel.setLayout(new GridLayout());
        ButtonLabel.setBackground(new Color(0x6C, 0xA6,0xCD ));
        ButtonLabel.add(button1);
        ButtonLabel.add(button2);
        ButtonLabel.add(button3);
        ButtonLabel.add(button5);
        ButtonLabel.add(button4);
        ButtonLabel.add(button6);
        ButtonLabel.setPreferredSize(new Dimension(60, 60));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around buttons
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        ButtonLabel.add(button1, gbc);
        
        gbc.gridx = 1;
        ButtonLabel.add(button2, gbc);
        
        gbc.gridx = 2;
        ButtonLabel.add(button3, gbc);
       
        gbc.gridx = 3;
        ButtonLabel.add(button4, gbc);
       
        gbc.gridx = 4;
        ButtonLabel.add(button5, gbc);
       
        gbc.gridx = 5;
        ButtonLabel.add(button6, gbc);
       
        
                
        
        
        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        
        
        
        frame.setSize(1000, 400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setResizable(false);
        frame.setBackground(Color.GRAY);	        
        frame.add(panel);	       
        frame.setVisible(true);
     
	}

	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if (e.getSource() == button1) {
			AddNewMembersPage addNewMembers = new AddNewMembersPage();
			 int choice = JOptionPane.showConfirmDialog(button3, "Do you want to go back to home page?","back", JOptionPane.YES_NO_OPTION);
        	 
      	   
	           if (choice == JOptionPane.YES_OPTION) {
	        	   WelcomePage welcome = new WelcomePage();
	        	   
	           }
	           else if (choice ==  JOptionPane.NO_OPTION) {
	        	  
	           }
		}
		
		else if (e.getSource() == button2) {
			 UpdateAndDeletePage updateAndDelete = new  UpdateAndDeletePage();
			
			 int choice = JOptionPane.showConfirmDialog(button2, "Do you want to go back to home page?","back", JOptionPane.YES_NO_OPTION);
        	 
      	   
	           if (choice == JOptionPane.YES_OPTION) {
	        	   WelcomePage welcome = new WelcomePage();
	        	   
	           }
	           else if (choice ==  JOptionPane.NO_OPTION) {
	        	  
	           }
		}
		
        else if (e.getSource() == button3) {
        	ListofMember list = new ListofMember();
        	 int choice = JOptionPane.showConfirmDialog(button3, "Do you want to go back to home page?","back", JOptionPane.YES_NO_OPTION);
        	 
        	   
	           if (choice == JOptionPane.YES_OPTION) {
	        	   WelcomePage welcome = new WelcomePage();
	        	   
	           }
	           else if (choice ==  JOptionPane.NO_OPTION) {
	        	  
	           }  	
			
		}
		
        else if (e.getSource() == button4) {
        	 PaymentPage payment = new PaymentPage(); 
        	 int choice = JOptionPane.showConfirmDialog(button4, "Do you want to go back to home page?","back", JOptionPane.YES_NO_OPTION);
        	 
      	   
	           if (choice == JOptionPane.YES_OPTION) {
	        	   WelcomePage welcome = new WelcomePage();
	        	   
	           }
	           else if (choice ==  JOptionPane.NO_OPTION) {
	        	  
	           }      	
        	
}
		
        else if (e.getSource() == button5) {
            int choice = JOptionPane.showConfirmDialog(button5, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {    
                frame.dispose();

                LoginPage loginPage = new LoginPage();
            }
            else if (choice == JOptionPane.NO_OPTION) {
            	 WelcomePage welcome = new WelcomePage();
            }
        }

		
       else if (e.getSource() == button6) {
    	   Exit exit = new Exit();
    	   int choice = JOptionPane.showConfirmDialog(button6, "are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
 
    	   
    	           if (choice == JOptionPane.YES_OPTION) {
    	        	   
    	        	   
    	           }
    	           else if (choice ==  JOptionPane.NO_OPTION) {
    	        	   WelcomePage welcome = new WelcomePage();
    	           }
    	  
    	   
}
		
	}
}
