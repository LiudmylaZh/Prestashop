import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private SelenideElement emailInputField = $(byId("email_create"));
    private SelenideElement createAccountButton = $(byId("SubmitCreate"));
    private SelenideElement registeredEmailInputFields = $(byId("email"));
    private SelenideElement passwordInputFields = $(byId("passwd"));
    private SelenideElement submitLoginButton = $(byId("SubmitLogin"));

    private SelenideElement errorMessageInvalidEmail = $ (byId("create_account_error"));
    private SelenideElement textInvalidEmail = $ (byXpath("//*[@id=\"create_account_error\"]/ol/li"));



    public void inputEmailToCreateUser(String Email) {
        emailInputField.setValue(Email);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }



    public void login (String enterEmail, String enterPassword) {
        registeredEmailInputFields.setValue(enterEmail);
        passwordInputFields.setValue(enterPassword);
        submitLoginButton.click();

    }

    public void errorMessageInvalidEmailIsVisible(){
        errorMessageInvalidEmail.shouldBe(Condition.visible);
    }

    public void errorMessageShouldHaveText (){
        textInvalidEmail.shouldHave(Condition.text("Invalid email address."));
    }

}
