package co.com.chocair.certification.proyectofinal.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class UtestLoginPage extends PageObject {
    //-----------------Index-----------------------------\\
    public static final Target LOGIN_BUTTON;

    static {
        LOGIN_BUTTON = Target.the("button that shows us the form to login")
                .located(By.className("unauthenticated-nav-bar__sign-up"));
    }
    //----------------Firs Page-------------------\]
    public static final Target INPUT_NAME;

    static {
        INPUT_NAME = Target.the("where do we write the first name")
                .located(By.id("firstName"));
    }
    public static final Target INPUT_LASTNAME;

    static {
        INPUT_LASTNAME = Target.the("where do you write the last name")
                .located(By.id("lastName"));
    }
    public static final Target INPUT_EMAIL;

    static {
        INPUT_EMAIL = Target.the("where do you write the email")
                .located(By.id("email"));
    }

    public static final Target SELECT_MONTH;

    static {
        SELECT_MONTH = Target.the("where do you select a month of the birth day")
                .located(By.xpath("//*[@id=\"birthMonth\"]/option[5]"));
    }
    public static final  Target SELECT_DAY;

    static {
        SELECT_DAY = Target.the("where do you select a day of the birth day")
                .located(By.xpath("//*[@id=\"birthDay\"]/option[22]"));
    }
    public static final  Target SELECT_YEAR;

    static {
        SELECT_YEAR = Target.the("where do you select a year of the birth day")
                .located(By.xpath("//*[@id=\"birthYear\"]/option[4]"));
    }
    public static final  Target BUTTON_NEXT;

    static {
        BUTTON_NEXT = Target.the("button that show the next page ")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    }
    //--------------------------Second Page-------------------\\
    public static final Target INPUT_CITY;

    static {
        INPUT_CITY = Target.the("were do you write the city")
                .located(By.id("city"));
    }
    public static final Target INPUT_ZIP;

    static {
        INPUT_ZIP = Target.the("where do you write the postal code or zip")
                .located(By.id("zip"));
    }

    public  static final Target BUTTON_NEXT2;

    static {
        BUTTON_NEXT2 = Target.the("button that show the next page")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    }
    //-------------------------Third Page------------\\
    public static final Target BUTTON_NEXT3;

    static {
        BUTTON_NEXT3 = Target.the("Button that show the next page")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    }
    //-------------------Quarter Page----------------------\\
    public  static  final  Target INPUT_PASS;

    static {
        INPUT_PASS = Target.the("where do you write the password")
                .located(By.id("password"));
    }

    public static final Target INPUT_CONF_PASS;

    static {
        INPUT_CONF_PASS = Target.the("were do you write confirm the password")
                .located(By.id("confirmPassword"));
    }

    public static final Target CHECK_BOX;

    static  {
        CHECK_BOX = Target.the("CheckBox accept")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    }

    public static final Target CHECK_BOX2;

    static {
        CHECK_BOX2 = Target.the("CheckBox accept Privacy & Security")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    }

    public static final Target BUTTON_FINAL;

    static {
        BUTTON_FINAL = Target.the("Button that show registation sucesfull")
                .located(By.xpath("//*[@id=\"laddaBtn\"]"));
    }

    public static final Target NAME_REGISTER;

    static {
        NAME_REGISTER = Target.the("Extract welcome")
                .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
    }
}
