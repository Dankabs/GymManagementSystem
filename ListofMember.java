import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;

public class ListofMember  implements ActionListener {

	JFrame frame = new JFrame();
	 JPanel contentPane;
	 JTable table;
	 JButton homeButton;

	
	 ListofMember() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1000, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Member Name", "Mobile Number", "Member Address", "Member Email", "Age", "Duration", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(86);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(92);
		table.getColumnModel().getColumn(3).setPreferredWidth(89);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(86);
		table.getColumnModel().getColumn(6).setPreferredWidth(88);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(10, 64, 951, 286);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("List of members");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(645, 0, 316, 42);
		contentPane.add(lblNewLabel);
		
	    homeButton = new JButton("home");
		homeButton.setBounds(10, 11, 82, 31);
		homeButton.setFocusable(false);
		homeButton.addActionListener(this);
		
		contentPane.add(homeButton);
		
		frame.setContentPane(contentPane);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		frame.dispose();
		if (e.getSource() == homeButton) {
			WelcomePage welcome = new WelcomePage();
		}
		
	}
}
