package mod1.TA;

import org.testng.annotations.DataProvider;

public class ProjectLoginData
{
	@DataProvider(name="LoginDataDP")
	public static Object[][] dataForLogin()
	{
		Object[][] login = new Object[4][3];
		
		login[0][0] = "Username";
		login[0][1] = "Password";
		login[0][2] = "Browser";
		
		login[1][0] = "Username1";
		login[1][1] = "Password1";
		login[1][2] = "Google Chrome";
		
		login[2][0] = "Username2";
		login[2][1] = "Password2";
		login[2][2] = "Microsoft Edge";
		
		login[3][0] = "Username3";
		login[3][1] = "Password3";
		login[3][2] = "Mozilla Firefox";
		
		return login;
	}
}
