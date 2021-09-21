package co.com.chocair.certification.proyectofinal.tasks;

import co.com.chocair.certification.proyectofinal.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Login implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strZip;
    private String strPassword;
    private String strConfirmPassword;

    public Login(String strName, String strLastName, String strEmail, String strCity, String strZip,String strPassword, String strConfirmPassword){
            this.strName = strName;
            this.strLastName = strLastName;
            this.strEmail = strEmail;
            this.strCity = strCity;
            this.strZip = strZip;
            this.strPassword = strPassword;
            this.strConfirmPassword = strConfirmPassword;
        }


    public static Login the(String strName, String strLastName, String strEmail, String strCity, String strZip, String strPassword, String strConfirmPassword) {
            return Tasks.instrumented(Login.class,strName,strLastName,strEmail,strCity,strZip,strPassword,strConfirmPassword);
    }

    @Override
        public <T extends Actor> void performAs(T actor) {
            //-----------------Index-------------------\\
            actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
        //---------------------When----------------------------------------\\
            //----------------Firs Page-----------------\\
                    Enter.theValue(strName).into(UtestLoginPage.INPUT_NAME),
                    Enter.theValue(strLastName).into(UtestLoginPage.INPUT_LASTNAME),
                    Enter.theValue(strEmail).into(UtestLoginPage.INPUT_EMAIL),
                    Click.on(UtestLoginPage.SELECT_MONTH),
                    Click.on(UtestLoginPage.SELECT_DAY),
                    Click.on(UtestLoginPage.SELECT_YEAR),
                    Click.on(UtestLoginPage.BUTTON_NEXT),
            //------------------Second Page-------------------\\
                    Enter.theValue(strCity).into(UtestLoginPage.INPUT_CITY),
                    Hit.the(Keys.ARROW_DOWN).into(UtestLoginPage.INPUT_CITY),
                    Hit.the(Keys.ENTER).into(UtestLoginPage.INPUT_CITY),
                    Enter.theValue(strZip).into(UtestLoginPage.INPUT_ZIP),
                    Click.on(UtestLoginPage.BUTTON_NEXT2),
            //------------------There Page---------------------\\
                    Click.on(UtestLoginPage.BUTTON_NEXT3),
            //-----------------Quarter Page------------------\\
                    Enter.theValue(strPassword).into(UtestLoginPage.INPUT_PASS),
                    Enter.theValue(strConfirmPassword).into(UtestLoginPage.INPUT_CONF_PASS),
                    Click.on(UtestLoginPage.CHECK_BOX),
                    Click.on(UtestLoginPage.CHECK_BOX2),
        //------------------------Then------------------------------------------\\
                    Click.on(UtestLoginPage.BUTTON_FINAL)
                    );

    }
}
