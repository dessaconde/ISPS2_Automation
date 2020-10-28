import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//import org.openqa.selenium.ie.InternetExplorerDriver;
//
//InternetExplorerDriver  driver = new InternetExplorerDriver();
//driver.get("URL for which certificate error is coming");
//driver.navigate().to("javascript:document.getElementById('overridelink').click()"); 
//String service = "C:\\Users\\19033-JWVP\\Documents\\Automation Testing\\Selenium\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe";
//System.setProperty("webdriver.ie.driver", service);
//InternetExplorerDriver  driver = new InternetExplorerDriver();
'Open desired browser and navigate to the provided URL.'
WebUI.openBrowser(LinkToBeUsed)

WebUI.maximizeWindow()

//WebUI.maximizeWindow()
'Verify "Sign in to ISPS2-PROD-Verify" text is present to confirm that the user is in ISPS login page.'
WebUI.verifyTextPresent(LoginPageTextToBeVerified, true)

'Once "Sign in to ISPS2-PROD-Verify" text was found, automation suite highlights it for visual execution purposes.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify'))

'Highlights the userName field before proceeding to populate. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.LoginV2.0/Login Page/input_Sign in to ISPS2-PROD-Verify_username'))

'Populates the userName field with desired value. '
WebUI.setText(findTestObject('Objects.LoginV2.0/Login Page/input_Sign in to ISPS2-PROD-Verify_username'), Username)

'Highlights the password field before proceeding to populate. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.LoginV2.0/Login Page/input_This field is required_password'))

'Decrypts the encrypted value of password before populating the field. '
WebUI.setEncryptedText(findTestObject('Objects.LoginV2.0/Login Page/input_This field is required_password'), Password)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021'))

//For crossbrowser testing purposes: If Login button is visible, then click. Else, press enter key in password field.
//if (WebUI.verifyElementVisible(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021')) == 
//true) {
//    WebUI.click(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021'), FailureHandling.OPTIONAL)
//} else if (WebUI.verifyElementVisible(findTestObject('Objects.Login/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021.Enabled'), 
//    2) == true) {
//    WebUI.click(findTestObject('Objects.Login/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021.Enabled'), FailureHandling.OPTIONAL)
//} else {
//    WebUI.sendKeys(findTestObject('Objects.LoginV2.0/Login Page/input_This field is required_password'), Keys.chord(Keys.ENTER))
//}
'Click login button.'
WebUI.click(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021'), FailureHandling.OPTIONAL)

'For cross browser testing purposes: press enter if clicking the login button didn\'t work. '
not_run: WebUI.sendKeys(findTestObject('Objects.LoginV2.0/Login Page/input_This field is required_password'), Keys.chord(
        Keys.ENTER), FailureHandling.OPTIONAL)

'Wait for page to load completely before continuing to other automated actions.'
WebUI.waitForPageLoad(30)

'Verify that the user was navigated to the ISPS2 homepage.'
not_run: WebUI.verifyElementVisible(findTestObject('Objects.Login/Dashboard/a_ISPS2-PROD-Verify'), FailureHandling.OPTIONAL)

'Best practice: Wait for 3 seconds after a page navigation component. '
Thread.sleep(3000)

