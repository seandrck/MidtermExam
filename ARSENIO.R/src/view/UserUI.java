package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import dataAccess.UserDA;
import model.User;

public class UserUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setSize(400,550);
		frame.setBackground(Color.white);
		
		String[] labels = {"Name","Password","Confirm Password","City","Gender","Email"};
		JLabel[] label = new JLabel[labels.length];
		for(int ctr = 0; ctr<labels.length; ctr++){
			label[ctr] = new JLabel(labels[ctr]);
		}
		JTextField[] textFields = new JTextField[6];
 		
		//MainPanel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(7,2));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // top, left, down , right
		for(int ctr = 0; ctr < 6 ; ctr++){
			mainPanel.add(label[ctr]);
			textFields[ctr] = new JTextField(20);
			mainPanel.add(textFields[ctr]);
		}
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				User user = new User();
				user.setName(textFields[0].getText().toString());
				user.setPassword(textFields[1].getText().toString());
				user.setCity(textFields[3].getText().toString());
				user.setGender(textFields[4].getText().toString());
				user.setEmail(textFields[5].getText().toString());
				
				UserDA userDA = new UserDA(user);
			}
		});
		mainPanel.add(confirmButton);
		frame.add(mainPanel,BorderLayout.CENTER);
		
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}