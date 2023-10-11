package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {


    public SelenideElement openregistrationForm =$(By.xpath("//*[@id=\"body\"]/header/div[1]/div[4]/div[3]"));
    public SelenideElement registrationBtn = $(".register");
    public SelenideElement firstName = $("#pFirstName");
    public SelenideElement lastName =$("#pLastName");
    public SelenideElement phone =$("#pPhone");
    public SelenideElement mail = $("#pEmail");
    public SelenideElement dateOfBirth = $("#pDateBirth");
    public SelenideElement password = $("#pPassword");
    public SelenideElement confirmPassword = $("#pConfirmPassword");
    public SelenideElement agreeTerms = $("#pIsAgreeTerns");
    public SelenideElement register = $ (By.xpath("//a[@onclick='checkPhysicalFormSubmit()']//div[@class='dashbord-registration']"));
    public SelenideElement messageChooseGender = $("#physicalInfoMassage");


}
