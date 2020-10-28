import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.interactions.Actions as Actions1
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

//Component Name: CounterValidation
//Author: Krizia Manuel
//Purpose: To click and hold counter
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

//MODIFY COUNTER UP VALIDATION
'Then modify the label name'
NewLblNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/label_FieldName'), 'text', 'equals', labelName,
	true)

'Highlight the label field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNmField)

'Modify Object.'
counterUp = WebUI.modifyObjectProperty(findTestObject('Objects.CounterValidation/counter_icon_up'), 'xpath', 'equals', ('(//div[@class=\'x-form-spinner x-form-spinner-default x-form-spinner-up x-form-spinner-up-default \'])[' + indexUp) + ']', true)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

WebElement element = WebUiCommonHelper.findWebElement(counterUp, secondsToHoldUp)

actions.clickAndHold(element).build().perform()

WebUI.delay(5)

actions.moveToElement(element).release().build().perform()

//MODIFY COUNTER DOWN VALIDATION
'Modify Object.'
counterDown = WebUI.modifyObjectProperty(findTestObject('Objects.CounterValidation/counter_icon_down'), 'xpath', 'equals', ('(//div[@class=\'x-form-spinner x-form-spinner-default x-form-spinner-down x-form-spinner-down-default \'])[' + indexDown) + ']', true)

WebDriver builder = DriverFactory.getWebDriver()

Actions1 actions1 = new Actions1(builder)

WebElement element1 = WebUiCommonHelper.findWebElement(counterDown, secondsToHoldDown)

actions1.clickAndHold(element1).build().perform()

WebUI.delay(5)

actions1.moveToElement(element1).release().build().perform()


