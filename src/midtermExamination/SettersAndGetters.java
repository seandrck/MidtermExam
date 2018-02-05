package midtermExamination;

public class SettersAndGetters 
{
	private String nameLbl, passwordLbl, confPassLbl, cityLbl, genderLbl, gmailLbl;

	public String getCityLbl() {
		return cityLbl;
	}

	public void setCityLbl(String cityLbl) {
		this.cityLbl = cityLbl;
	}

	public String getNameLbl() 
	{
		return nameLbl;
	}

	public void setNameLbl(String nameLbl) 
	{
		this.nameLbl = nameLbl;
	}

	public String getPasswordLbl()
	{
		return passwordLbl;
	}

	public void setPasswordLbl(String passwordLbl)
	{
		this.passwordLbl = passwordLbl;
	}

	public String getConfPassLbl()
	{
		return confPassLbl;
	}

	public void setConfPassLbl(String confPassLbl)
	{
		this.confPassLbl = confPassLbl;
	}

	public String getGenderLbl() {
		return genderLbl;
	}

	public void setGenderLbl(String genderLbl) {
		this.genderLbl = genderLbl;
	}


	public String getGmailLbl() {
		return gmailLbl;
	}

	public void setGmailLbl(String gmailLbl) {
		this.gmailLbl = gmailLbl;
	}
}