package PageObjects;
import Constants.FrameworkPathConstants;
import Enums.DemoQaEnums;
import static ConfigLoaders.JsonUtils.getValue;

public class DemoQAFromPageLocators {

        public static final String firstNameLocator = getValue(DemoQaEnums.FIRST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String lastNameLocator = getValue(DemoQaEnums.LAST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String emailLocator = getValue(DemoQaEnums.EMAIL , FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String genderLocator = getValue(DemoQaEnums.GENDER_MALE, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String phoneNumberLocator = getValue(DemoQaEnums.MOBILE, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String currentAddressLocator = getValue(DemoQaEnums.CURRENT_ADDRESS, FrameworkPathConstants.LOCATORS_FILE_PATH);
       // public static final String dateOfBirthLocator = getValue(DemoQaEnums.DATE_OF_BIRTH, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String uploadPictureLocator = getValue(DemoQaEnums.UPLOAD_PICTURE, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String subjectLocator = getValue(DemoQaEnums.SUBJECT, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String sportsLocator = getValue(DemoQaEnums.SPORTS, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String selectStateLocator = getValue(DemoQaEnums.SELECT_STATE, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String selectCityLocator = getValue(DemoQaEnums.SELECT_CITY, FrameworkPathConstants.LOCATORS_FILE_PATH);
        public static final String submitBtnLocator = getValue(DemoQaEnums.SUBMIT_BTN, FrameworkPathConstants.LOCATORS_FILE_PATH);

}
