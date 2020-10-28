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

/* ========================================================================
 * COMPONENT NAME: InvalidDateErrorValidation
 * TESTER: Rhodessa Conde
 * CREATED DATE: 15-May-2020
 * PURPOSE: This is a reusable component to validate the invalid date error
 *  ========================================================================
 */

'Wait for 1sec'
Thread.sleep(1000)

'Modify the Input Name'
DateFieldNm = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.DateValidation/Page_ISPS2/input__orderDt'), 
    'name', 'equals', FldNm, true)

WebUI.focus(DateFieldNm)

getInputInvalidDate = WebUI.getAttribute(DateFieldNm, 'value')

WebUI.mouseOver(DateFieldNm)

getErrMsg = WebUI.getAttribute(DateFieldNm, 'data-errorqtip')

'Get the total length of tooltip invalid date error message'
getTotalLength = getErrMsg.length()

'Remove the html codes'
RemoveULClass = getErrMsg.substring(29, getTotalLength)

'Get the total length of tooltip error message without html codes'
LengthNoUlClass = (RemoveULClass.length() - 10)

'Get the string of tooltip error message without html codes'
ToolTipInvErrMsg = RemoveULClass.substring(0, LengthNoUlClass)

'Get the concatenated expected invalid date error message'
ExpectedInvalidErrMsg = WebUI.concatenate(getInputInvalidDate, ' ', GlobalVariable.NotValidDt)

'Verify that the tooltip error message is the same to the expected invalid date error message'
WebUI.verifyMatch(ToolTipInvErrMsg, ExpectedInvalidErrMsg, true)