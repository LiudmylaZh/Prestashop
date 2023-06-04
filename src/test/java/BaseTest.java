import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Before;

import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    public final String BASE_URL = "http://prestashop.qatestlab.com.ua/ru/";
    public final String USER_EMAIL = "tester2678@gmail.com";
    public final String PASSWORD = "123456QWerty";
    public final String GENERATED_EMAIL = generateUserEmail();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    PersonalInformationPage personalInformationPage = new PersonalInformationPage();
    MyAccountPage myAccountPage = new MyAccountPage();


    public String generateUserEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String randomUserEmail = "Account" + randomInt + "@gmail.com";
        return randomUserEmail;}



    @Before
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        open(BASE_URL);
    }
}
