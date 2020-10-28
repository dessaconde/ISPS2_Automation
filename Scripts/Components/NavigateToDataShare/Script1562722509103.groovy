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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

'Hard coded wait for visualization purposes. '
Thread.sleep(3000)

WebUI.verifyTextPresent('Loading search result. Please wait...', false)

WebUI.waitForElementNotPresent(findTestObject('Objects.NavigateToDataShare/XP_LoadingPopUp'), 120)

'Verify that the menu beside ISPS2 banner is visible before clicking it. '
WebUI.verifyElementVisible(findTestObject('Objects.NavigateToDataShare/div_ISPS2-PROD-Verify_component-1013'))

'Click the menu after successful verification that the menu is visible.'
WebUI.click(findTestObject('Objects.NavigateToDataShare/div_ISPS2-PROD-Verify_component-1013'))

'Hover to \'Enquiries\' inside the pane.'
WebUI.mouseOver(findTestObject('Objects.NavigateToDataShare/span_Enquiries'))

'Inside \'Enquiries\' pane, hover to \'Common\'.'
WebUI.mouseOver(findTestObject('Objects.NavigateToDataShare/span_Common'))

not_run: WebUI.click(findTestObject('Objects.NavigateToDataShare/span_Data Share'))

'[CrossBrowserTesting Purposes] Hard-coded JS for clicking since the \'Click\' keyword of Selenium is not working for this element.'
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Objects.NavigateToDataShare/span_Data Share'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

