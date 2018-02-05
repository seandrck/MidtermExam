package dataAccess;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import model.User;

public class UserDA {
	User user;
	
	public UserDA(User user){
		this.user = user;
	}
	
	public void setUser(){
		String userValues = user.getName()+";"+user.getPassword()+";"+user.getCity()+";"+user.getGender()+";"+user.getEmail();
		
		File pres=new File("C:/Users/Jarvis/JavaProject/SoftEng/MidtermExam/trunk/ARSENIO.R/UserInformation.txt");
		if(!pres.exists())
		{
			try
			{
					PrintWriter pw=new PrintWriter(new FileWriter(pres,true));
					pw.println(userValues);
					pw.close();
				
			}catch(Exception a)
			{
				System.out.println("fake");
			}
		} else {
			
		}
	}
}
