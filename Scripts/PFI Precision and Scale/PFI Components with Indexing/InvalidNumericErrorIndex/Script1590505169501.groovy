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

/* ======================================================================*
 * COMPONENT NAME: InvalidNumericError                                   *
 * TESTER: Rhodessa Conde                                                *
 * CREATED DATE: 15-May-2020                                             *
 * PURPOSE: This is a reusable component to verify invalid numeric input *
 *  =====================================================================*
 */

'Hard Wait for 1sec'
Thread.sleep(1000)

NewFieldNm = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', '(//*[contains(@class,\'x-form-text\') and (@name=\'' + FldNm + '\')])[' + index + ']', true)

WebUI.setText(NewFieldNm, EnterInvalidValue)

WebUI.mouseOver(NewFieldNm)

GetValue = WebUI.getAttribute(NewFieldNm, 'value')

ToolTipErr = WebUI.getAttribute(NewFieldNm, 'data-errorqtip')

TotalLength = ToolTipErr.length()

Get1stErr = ToolTipErr.substring(0, 63)

GetLen = Get1stErr.length()

FirstErrMsg = Get1stErr.substring(29, GetLen)

Get2ndErr = ToolTipErr.substring(GetLen, TotalLength)

SecondErrLen = Get2ndErr.length()-10

SecondErrMsg = Get2ndErr.substring(9, SecondErrLen)

ActualErrMsg = WebUI.concatenate(FirstErrMsg, ' ', SecondErrMsg)

ExpectedErrMsg = WebUI.concatenate('The value in this field is invalid',' ', GetValue,' ','is not a valid number')

WebUI.verifyMatch(ActualErrMsg, ExpectedErrMsg, true)