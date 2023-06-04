import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class PersonalInformationPage {
   private SelenideElement registrationForm = $(byId ("center_column"));

   public void registrationFormIsExist (){
       registrationForm.shouldBe(Condition.visible);
   }

}
