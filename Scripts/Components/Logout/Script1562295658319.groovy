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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Thread.sleep(3000)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/accountDropdown'))

not_run: WebUI.click(findTestObject('Objects.Logout/accountDropdown'))

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.Logout/accountDropdown'), 
    0)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Objects.Logout/accountDropdown'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/span_Logout'))

WebUI.click(findTestObject('Objects.Logout/span_Logout'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(30)

Thread.sleep(3000)

WebUI.verifyTextPresent(LogoutPageTextToBeVerified, true)

WebUI.delay(5)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/div_Sign in to ISPS2-PROD-Verify'))

WebUI.closeBrowser()

