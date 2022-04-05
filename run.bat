set projectpath=E:\Eclipse\Eclipse_Workspace_Java\TestAutomation.Project
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\testng.xml
pause