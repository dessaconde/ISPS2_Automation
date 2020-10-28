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
import com.kms.katalon.core.util.KeywordUtil

/* COMPONENT NAME: MaxValueErrorIndex
 * TESTER: Rhodessa Conde
 * CREATED DATE: -
 * PURPOSE: This is to verify the tool tip error message: "The maximum value for this field is 2147483647"
 * REVIEWED BY: -
 * REVISION BY: -
 * REVISION DATE: -
 */

Thread.sleep(1000)

String constantNum = 9999999999

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', ((('(//*[contains(@class,\'x-form-text\') and (@name=\'' + InputName) + '\')])[') + index) + ']', 
    true)

GetValue = WebUI.getAttribute(NewInputNmField, 'value')

GetToolTipErr = WebUI.getAttribute(NewInputNmField, 'data-errorqtip')

if (GetToolTipErr == ''){
	
	WebUI.setText(NewInputNmField, constantNum)

}

WebUI.delay(5)

TotalLength = (GetToolTipErr.length() - 10)

RmvULcd = GetToolTipErr.substring(0, TotalLength)

NewLen = RmvULcd.length()

ActualErrMessage = RmvULcd.substring(29, NewLen)

WebUI.mouseOver(NewInputNmField)

WebUI.verifyMatch(ActualErrMessage, findTestData('PrecisionAndScaleDB').getValue('ErrorMessage', 8), true)