package mod1.TA;

import org.testng.annotations.Test;

public class LoginDataProvider
{
	@Test(dataProviderClass= ProjectLoginData.class, dataProvider = "LoginDataDP")
	public void login(String uname, String pwd, String browser) 
	{
		System.out.println("\n Username: " + uname + "\n Password: " + pwd + "\n Browser: " + browser + "\n");
	}
}
