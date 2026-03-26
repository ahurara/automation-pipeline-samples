package PageObjects;
import Constants.FrameworkPathConstants;
import Enums.DemoQaEnums;
import static ConfigLoaders.JsonUtils.getValue;

public class DemoQAFormPageTestData {

    public static final String firstNameTestData= getValue(DemoQaEnums.FIRST_NAME ,FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String lastNameTestData = getValue(DemoQaEnums.LAST_NAME, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String emailTestData = getValue(DemoQaEnums.EMAIL , FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String mobileTestData = getValue(DemoQaEnums.MOBILE , FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String currentAddressTestData = getValue(DemoQaEnums.CURRENT_ADDRESS, FrameworkPathConstants.TEST_DATA_FILE_PATH);
  //  public static final String dateOfBirthTestData = getValue(DemoQaEnums.DATE_OF_BIRTH, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String subjectTestData = getValue(DemoQaEnums.SUBJECT, FrameworkPathConstants.TEST_DATA_FILE_PATH);

}
