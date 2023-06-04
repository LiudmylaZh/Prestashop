import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private SelenideElement loginButton = $ (byClassName ("header_user_info"));

    public void clickLoginButton () {
        loginButton.click();
    }
}
