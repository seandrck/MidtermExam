import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MEFrame extends JFrame
{
	private JButton submit;
	private JLabel name, password, conPass, city, gender, gmail;
	private JTextField nameTf, passwordTf, conPassTf, cityTf, genderTf, gmailTf;
	
	public MEFrame()
	{	
		JLabel name = new JLabel("NAME");
		name.setBounds(30,20,100,20);
		name.setFont(new Font("Caladea", Font.BOLD, 20));
		name.setForeground(Color.BLACK);
		JLabel password = new JLabel("PASSWORD");
		password.setBounds(30,70,150,20);
		password.setFont(new Font("Caladea", Font.BOLD, 20));
		password.setForeground(Color.BLACK);
		JLabel conPass = new JLabel("CONFIRM PASSWORD");
		conPass.setBounds(30,120,200,20);
		conPass.setFont(new Font("Caladea", Font.BOLD, 20));
		conPass.setForeground(Color.BLACK);
		JLabel city = new JLabel("CITY");
		city.setBounds(30,170,100,20);
		city.setFont(new Font("Caladea", Font.BOLD, 20));
		city.setForeground(Color.BLACK);
		JLabel gender = new JLabel("GENDER");
		gender.setBounds(30,220,100,20);
		gender.setFont(new Font("Caladea", Font.BOLD, 20));
		gender.setForeground(Color.BLACK);
		JLabel gmail = new JLabel("GMAIL");
		gmail.setBounds(30,270,100,20);
		gmail.setFont(new Font("Caladea", Font.BOLD, 20));
		gmail.setForeground(Color.BLACK);
		
		JTextField nameTf = new JTextField(25);
		nameTf.setBounds(250, 20, 200, 25);
		JTextField passwordTf = new JTextField(25);
		passwordTf.setBounds(250, 70, 200, 25);
		JTextField conPassTf = new JTextField(30);
		conPassTf.setBounds(250, 120, 200, 25);
		JTextField cityTf = new JTextField(25);
		cityTf.setBounds(250, 170, 200, 25);
		JTextField genderTf = new JTextField(30);
		genderTf.setBounds(250, 220, 200, 25);
		JTextField gmailTf = new JTextField(25);
		gmailTf.setBounds(250, 270, 200, 25);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(30, 420, 100, 30);
		submit.setBackground(Color.GRAY);
		/*submit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				print.append(nameTf.getText()+ "\n");
				print.append(rollNoTf.getText()+"\n");
			}
			}
		);*/
		
		setVisible(true);
		setSize(500,500);
		setResizable(false);
		setLocation(100, 20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		add(nameTf);
		add(passwordTf);
		add(conPassTf);
		add(cityTf);
		add(genderTf);
		add(gmailTf);
		add(submit);
		add(name);
		add(password);
		add(conPass);
		add(city);
		add(gender);
		add(gmail);
	}
	public static void main(String[]args)
	{
		new MEFrame();
	}
}
