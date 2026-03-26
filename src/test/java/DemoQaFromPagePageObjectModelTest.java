import PageObjects.DemoQaFormPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static drivers.WebDriverManager.*;

public class DemoQaFromPagePageObjectModelTest {

    DemoQaFormPage demoQAFormPage;

    @BeforeSuite
    public void setUp() {
        setupWebDriver();
        maxWindow();
        demoQAFormPage = new DemoQaFormPage();
    }

    @BeforeTest
    public void setUpTest() {
        demoQAFormPage.navigateToDemoQAPage();
    }

    @Test
    public void TC01_Fill_Form_POM() throws InterruptedException {
        demoQAFormPage.fillFirstName();
        demoQAFormPage.fillLastName();
        demoQAFormPage.fillEmail();
        demoQAFormPage.clickGender();
        demoQAFormPage.fillMobile();
      //  demoQAFormPage.fillDOB();
        demoQAFormPage.fillSubject();
        //demoQAFormPage.clickHobbies();
        demoQAFormPage.fillAddress();
       // demoQAFormPage.clickState();
       // demoQAFormPage.clickCity();
        demoQAFormPage.clickSubmitBtn();
    }

    @AfterSuite
    public void tearDown() {
//        demoQAFormPage = null;
//        quiteWebDriver();
    }

}
