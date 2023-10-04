package Steps;

import Pages.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationPageSteps {
   RegistrationPage registrationPage = new RegistrationPage();
    @Step ("click on შესვლა")
    public RegistrationPageSteps clickOnopenRegisterform(){
        registrationPage.openregistrationForm.click();
        return this;
    }
    @Step ("click on რეგისტრაცია")
    public RegistrationPageSteps clickOnRegister(){
        registrationPage.registrationBtn.click();
        return this;
    }
    @Step ("set firstname")
    public RegistrationPageSteps setFirstName (String fname){
        registrationPage.firstName.sendKeys(fname);
        return this;
    }
    @Step ("set lastname")
    public RegistrationPageSteps setLastName (String lname){
        registrationPage.lastName.sendKeys(lname);
        return this;
    }

    @Step ("set email")
    public RegistrationPageSteps setEmail (String email){
        registrationPage.mail.sendKeys(email);
        return this;
    }

    @Step ("set mobile number")
    public RegistrationPageSteps setMobile (String mobile){
        registrationPage.phone.sendKeys(mobile);
        return this;
    }

    @Step ("set date")
    public RegistrationPageSteps setDate (String date){
        registrationPage.dateOfBirth.sendKeys(date);
        return this;
    }
    @Step ("set password")
    public RegistrationPageSteps setPassword (String pass){
        registrationPage.password.sendKeys(pass);
        return this;
    }
    @Step ("conform password")
    public RegistrationPageSteps confirmPassword (String pass){
        registrationPage.confirmPassword.sendKeys(pass);
        return this;
    }
    @Step ("check terms checkbox")
    public RegistrationPageSteps checkTerms (){
        registrationPage.agreeTerms.click();
        return this;
    }
    @Step ("click on registracia button")
    public RegistrationPageSteps registerNewAccount (){
        registrationPage.register.scrollTo().click();
        return this;
    }

}
