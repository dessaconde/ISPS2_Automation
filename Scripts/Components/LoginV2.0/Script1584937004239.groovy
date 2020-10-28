import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Component Name: LoginV2.0
//Dev: Shayne Cardona
//Purpose: To be able to access the page by just inputting the needed elements
'Open desired browser and navigate to the provided URL.'
WebUI.openBrowser(LinkToBeUsed)

'Maximize browser window.'
WebUI.maximizeWindow()

'Verify "Sign in to ISPS2-PROD-Verify" text is present to confirm that the user is in ISPS login page.'
WebUI.verifyTextPresent(LoginPageTextToBeVerified, false)

'Populates the userName field with desired value. '
WebUI.setText(findTestObject('Objects.LoginV2.0/Login Page/input_Sign in to ISPS2-PROD-Verify_username'), Username)

'Decrypts the encrypted value of password before populating the field. '
WebUI.setEncryptedText(findTestObject('Objects.LoginV2.0/Login Page/input_This field is required_password'), Password)

not_run: WebUI.setEncryptedText(findTestObject(null), Password)

'Click login button.'
WebUI.click(findTestObject('Objects.LoginV2.0/Login Page/div_Sign in to ISPS2-PROD-Verify_NovaGoButton-1021'), FailureHandling.OPTIONAL)

'Wait for page to load completely before continuing to other automated actions.'
WebUI.waitForPageLoad(30)

'Best practice: Wait for 3 seconds after a page navigation component. '
Thread.sleep(3000)

