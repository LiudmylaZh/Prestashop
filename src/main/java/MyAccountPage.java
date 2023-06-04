import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {
    private SelenideElement title = $(byClassName("page-heading"));

    public void myAccountPageShouldHaveTitle (){
        title.shouldHave(Condition.text("My account"));
    }
}
