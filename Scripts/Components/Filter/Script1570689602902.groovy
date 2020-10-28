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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Revision
//01Apr2020|Shayne|Added waitForPageLoad and waitForElementNotPresent components.

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(5000)

WebUI.waitForPageLoad(180)

WebUI.waitForElementNotPresent(findTestObject('Objects.Filter/Page_ISPS2/div_Loading search result Please wait'), 180)

'Click the filter icon. '
WebUI.click(findTestObject('Objects.Filter/Page_ISPS2/XP.Embutidooo'))

'Verify that the \'Reset\' button is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/span_Reset'))

'Click the \'Reset\' button.'
WebUI.click(findTestObject('Objects.Filter/Page_ISPS2/span_Reset'))

'Verify and highight the \'Task Description\' textbox. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/TextBoxTaskDescription'))

'Populate the \'Task Description\' field with a dynamic variable.'
WebUI.setText(findTestObject('Objects.Filter/Page_ISPS2/TextBoxTaskDescription'), taskDescription)

'Transfer the value into a global variable.'
GlobalVariable.caseType = taskDescription

'Press the \'Enter\' key after successful input of the filter. '
WebUI.sendKeys(findTestObject('Objects.Filter/Page_ISPS2/TextBoxTaskDescription'), Keys.chord(Keys.ENTER))

'Verify that the \'Search\' button is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/span_Search'))

'Click the \'Search\' button.'
WebUI.click(findTestObject('Objects.Filter/Page_ISPS2/span_Search'))

'Verify that the loading pop-up appeared.'
not_run: WebUI.verifyTextPresent('Loading search result. Please wait...', false)

'Wait for the loading pop-up to disappear.'
not_run: WebUI.waitForElementNotPresent(findTestObject('Objects.Filter/Page_ISPS2/div_Loading search result Please wait'), 
    120)

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(5000)

