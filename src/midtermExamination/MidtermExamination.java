package midtermExamination;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class MidtermExamination extends JFrame implements ActionListener
{
	SettersAndGetters SnG = new SettersAndGetters();
	
	GridLayout gridLayout = new GridLayout(0, 2);
	
	String[] cities = {"Select City","Quezon City", "Caloocan City", "Manila City", "Davao City", 
			"San Juan City"};
	
	private JPanel panel;
	
	private JLabel nameLbl;
	private JLabel passwordLbl;
	private JLabel confPassLbl;
	private JLabel cityLbl;
	private JLabel genderLbl;
	private JLabel blankLbl;
	private JLabel gmailLbl;

	private JTextField nameTF;
	private JTextField gmailTF;
	
	private JPasswordField passwordPF;
	private JPasswordField confPassPF;

	private JComboBox cityCB;
	
	private JButton submitB;
	
	private JRadioButton genderMaleRB;
	private JRadioButton genderFemaleRB;
	
	private ButtonGroup buttonGroup;

	public MidtermExamination()
	{
		super("Simple Registration Form");
		panel = new JPanel();
		panel.setLayout(gridLayout);
	
		nameLbl = new JLabel("Name: ");
		passwordLbl = new JLabel("Password: ");
		confPassLbl = new JLabel("Confirm Password: ");
		cityLbl = new JLabel("City: ");
		genderLbl = new JLabel("Gender: ");
		blankLbl = new JLabel("");
		gmailLbl = new JLabel("Gmail: ");
	
		nameTF = new JTextField(30);
		passwordPF = new JPasswordField(20);
		confPassPF = new JPasswordField(20);
		gmailTF = new JTextField(40);
	
		cityCB = new JComboBox(cities);
		cityCB.setBackground(Color.WHITE);
		
		submitB = new JButton("Submit");
	
		genderMaleRB = new JRadioButton("Male");
		genderMaleRB.setActionCommand("Male");
		genderMaleRB.setSelected(false);
		genderMaleRB.setBackground(Color.WHITE);
	
		genderFemaleRB = new JRadioButton("Female");
		genderFemaleRB.setActionCommand("Female");
		genderFemaleRB.setSelected(false);
		genderFemaleRB.setBackground(Color.WHITE);
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(genderMaleRB);
		buttonGroup.add(genderFemaleRB);
		
		panel.add(nameLbl);
		panel.add(nameTF);
		panel.add(passwordLbl);
		panel.add(passwordPF);
		panel.add(confPassLbl);
		panel.add(confPassPF);
		panel.add(cityLbl);
		panel.add(cityCB);
		panel.add(genderLbl);
		panel.add(genderMaleRB);
		panel.add(blankLbl);
		panel.add(genderFemaleRB);
		panel.add(gmailLbl);
		panel.add(gmailTF);
		panel.add(submitB);
		add(panel);
		
		setSize(425, 325);
		setVisible(true);
		setResizable(false);
		panel.setBackground(Color.WHITE);
		
		nameTF.addActionListener(this);
		passwordPF.addActionListener(this);
		confPassPF.addActionListener(this);
		cityCB.addActionListener(this);
		genderMaleRB.addActionListener(this);
		genderFemaleRB.addActionListener(this);
		gmailTF.addActionListener(this);
		submitB.addActionListener(this);
	}	
	
	public void actionPerformed(ActionEvent event) 
	{
		// PASSWORD SECTION
		if(!(Arrays.equals(passwordPF.getPassword(), confPassPF.getPassword())))
		{
			JOptionPane.showMessageDialog(null, "Password do not match.", "Error Message",
					JOptionPane.ERROR_MESSAGE);
        }
		
		// SUBMIT BUTTON
		String action = event.getActionCommand();
		
		if(action.equals("Submit"))
		{
			if(nameTF.getText().equals("") || passwordPF.getText().equals("") || confPassPF.getText().equals("")
					|| cityCB.getSelectedItem().equals("Select City") || gmailTF.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill out the information given.", "Warning Message", 
							JOptionPane.WARNING_MESSAGE);
				}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Thank you for completing the form!", "Message",
						JOptionPane.PLAIN_MESSAGE);
				try
				{
					File file = new File("C:/Users/sean/Desktop/output form/forms.doc");
					PrintWriter pw = new PrintWriter(new FileWriter(file, true));
					
					SnG.setNameLbl(nameTF.getText());
					SnG.setPasswordLbl(passwordPF.getText());
					SnG.setConfPassLbl(confPassPF.getText());
					SnG.setCityLbl(cityCB.getSelectedItem().toString());
					SnG.setGenderLbl(buttonGroup.getSelection().getActionCommand().toString());
					SnG.setGmailLbl(gmailTF.getText());
					
					String name = SnG.getNameLbl();
					String password = SnG.getPasswordLbl();
					String confPass = SnG.getConfPassLbl();
					String city = SnG.getCityLbl();
					String gender = SnG.getGenderLbl();
					String gmail = SnG.getGmailLbl();
					
					pw.print(name + ";\n" + password + ";\n" + confPass + ";\n" + city + ";\n"
							+ gender + ";\n" + gmail + "\n");
					pw.close();
				}
				
				catch (Exception a)
				{
					System.out.println("Good");
				}
			}
			nameTF.setText(null);
			passwordPF.setText(null);
			confPassPF.setText(null);
			cityCB.setSelectedIndex(0);
			buttonGroup.clearSelection();
			gmailTF.setText(null);
		}
	}

	public static void main(String[] sdrflores)
	{
		new MidtermExamination();
	}
}