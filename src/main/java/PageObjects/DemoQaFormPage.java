package PageObjects;


import static ConfigLoaders.JsonUtils.getValue;
import Constants.FrameworkPathConstants;
import Enums.DemoQaEnums;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static drivers.WebDriverManager.getWebDriver;
import static PageObjects.DemoQAFromPageLocators.*;
import static Utilities.Utility.*;
import static PageObjects.DemoQAFormPageTestData.*;

public class DemoQaFormPage {


    public void navigateToDemoQAPage(){
        getWebDriver().get(getValue(DemoQaEnums.URL, FrameworkPathConstants.TEST_DATA_FILE_PATH));

    }

    public void fillFirstName(){
        WebElement firstname = getWebDriver().findElement(By.id(firstNameLocator));
        scrollToElement(firstname);
        firstname.sendKeys(firstNameTestData);
    }

    public void fillLastName(){
        WebElement lastname = getWebDriver().findElement(By.id(lastNameLocator));
        scrollToElement(lastname);
        lastname.sendKeys(lastNameTestData);
    }

    public void fillEmail(){
        WebElement email= getWebDriver().findElement(By.id(emailLocator));
        scrollToElement((email));
        email.sendKeys(emailTestData);
    }

    public void clickGender(){
        WebElement gender = getWebDriver().findElement(By.cssSelector(genderLocator));
        scrollToElement(gender);
        gender.click();
    }

    public void fillMobile(){
        WebElement mobile= getWebDriver().findElement(By.id(phoneNumberLocator));
        scrollToElement((mobile));
        mobile.sendKeys(mobileTestData);
    }

//    public void fillDOB(){
//        WebElement DOB= getWebDriver().findElement(By.id(dateOfBirthLocator));
//        scrollToElement((DOB));
//        DOB.sendKeys(dateOfBirthTestData);
//    }

    public void fillSubject(){
        WebElement subject= getWebDriver().findElement(By.id(subjectLocator));
        scrollToElement((subject));
        subject.sendKeys(subjectTestData);
    }

    public void clickHobbies(){
        WebElement hobbies = getWebDriver().findElement(By.xpath(sportsLocator));
        scrollToElement(hobbies);
        hobbies.click();
    }

    public void fillAddress(){
        WebElement address= getWebDriver().findElement(By.id(currentAddressLocator));
        scrollToElement((address));
        address.sendKeys(currentAddressTestData);
    }


    public void clickState(){

        WebElement state = getWebDriver().findElement(By.xpath(selectStateLocator));
        scrollToElement(state);
        state.click();

        try {
            // Sleep to wait for the element to become interactable, though it's better to use explicit waits
            Thread.sleep(1000);

            // Corrected: Pass WebDriver to Actions, not WebElement
            Actions actions = new Actions(getWebDriver());

            // Send SPACE key to the element
            actions.moveToElement(state).sendKeys(Keys.SPACE).perform();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


    public void clickCity(){
        WebElement city = getWebDriver().findElement(By.xpath(selectCityLocator));
        scrollToElement(city);
        city.click();

        try {
            // Sleep to wait for the element to become interactable, though it's better to use explicit waits
            Thread.sleep(1000);

            // Corrected: Pass WebDriver to Actions, not WebElement
            Actions actions = new Actions(getWebDriver());

            // Send SPACE key to the element
            actions.moveToElement(city).sendKeys(Keys.SPACE).perform();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void clickSubmitBtn(){
        WebElement btn = getWebDriver().findElement(By.id(submitBtnLocator));
        scrollToElement(btn);
        btn.click();
    }







}
