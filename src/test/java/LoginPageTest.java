import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void successUserCreating (){
        homePage.clickLoginButton();
        loginPage.inputEmailToCreateUser(GENERATED_EMAIL);
        loginPage.clickCreateAccountButton();
        personalInformationPage.registrationFormIsExist();
    }

    @Test public void successLogin () {
        homePage.clickLoginButton();
        loginPage.login(USER_EMAIL, PASSWORD);
        myAccountPage.myAccountPageShouldHaveTitle();
    }

    @Test
    public void userCreatingWithExistEmail (){
        homePage.clickLoginButton();
        loginPage.inputEmailToCreateUser(USER_EMAIL);
        loginPage.clickCreateAccountButton();
        loginPage.errorMessageInvalidEmailIsVisible();
    }

    @Test public void createUserWithInvalidEmail (){
        homePage.clickLoginButton();
        loginPage.inputEmailToCreateUser("tester2678gmail.com");
        loginPage.clickCreateAccountButton();
        loginPage.errorMessageInvalidEmailIsVisible();
        loginPage.errorMessageShouldHaveText();
    }
}
