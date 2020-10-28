import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.Actions as Builder
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Component Name: CounterValidationDown
//Author: Krizia Manuel
//Purpose: To click and hold counter
//MODIFY COUNTER DOWN VALIDATION
'Modify Object then Click and Hold.'
counterDown = WebUI.modifyObjectProperty(findTestObject('Objects.CounterValidation/counter_icon_down'), 'xpath', 'equals', 
    ('(//div[@class=\'x-form-spinner x-form-spinner-default x-form-spinner-down x-form-spinner-down-default \'])[' + indexDown) + 
    ']', true)

WebDriver builders = DriverFactory.getWebDriver()

Builder modifiedactions = new Builder(builders)

WebElement elementcounter = WebUiCommonHelper.findWebElement(counterDown, secondsToHoldDown)

modifiedactions.clickAndHold(elementcounter).build().perform()

WebUI.delay(5)

modifiedactions.moveToElement(elementcounter).release().build().perform()

'Modify Input field property/attribute'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.RemarksValidation/input_Remarks'), 'name', 'equals',
	nameToBeUsed, true)

'Highlight the input field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

'Initialized Special character strings'
String NumericChar = '999999999999999'

WebUI.mouseOver(NewInputNmField)

WebUI.delay(5)

'Enter the auto-generated random numeric strings'
WebUI.setText(NewInputNmField, NumericChar)

'Get text.'
WebUI.getText(findTestObject(NewInputNmField))

'If-else statement for WEBUI comment.'
if (WebUI.verifyMatch(NumericChar, NewInputNmField, true))
	{WebUI.comment("Accepting Numeric")}
else  (WebUI.verifyNotMatch(NumericChar, NewInputNmField, true))
	{WebUI.comment("Not Accepting Numeric")}