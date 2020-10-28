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

//Component Name: CounterValidationUp
//Author: Krizia Manuel
//Purpose: To click and hold counter
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

//MODIFY COUNTER UP VALIDATION
'Modify Object then Click and Hold.'
counterUp = WebUI.modifyObjectProperty(findTestObject('Objects.CounterValidation/counter_icon_up'), 'xpath', 'equals', ('(//*[contains(@class,\'x-form-spinner-up\')])[' + 
    indexUp) + ']', true)

modifiedInputNm = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', ((('(//*[contains(@class,\'x-form-text\') and (@name=\'' + InputName) + '\')])[') + nmIndex) + ']', 
    true)

GetCurrentValue = WebUI.getAttribute(modifiedInputNm, 'value')

for (int i = 0; i <= itr; i++) {
    WebUI.click(counterUp)
}

NewValue = WebUI.getAttribute(modifiedInputNm, 'value')

if (NewValue != findTestData('PrecisionAndScaleDB').getValue('MaxValue', 1)) {
	
	WebUI.verifyGreaterThan(NewValue, GetCurrentValue, FailureHandling.STOP_ON_FAILURE)
}else{

	WebUI.comment('Maximum Value')
}

