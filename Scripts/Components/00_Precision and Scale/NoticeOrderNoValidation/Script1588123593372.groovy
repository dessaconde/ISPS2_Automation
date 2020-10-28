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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.ArrayUtils as ArrayUtils

'Get data from ISPS2 DB excel file - PFIPrecisionAndScale sheet'
PrecisionAndScaleDB = ExcelFactory.getExcelDataWithDefaultSheet(DBPath, SheetName, true)

'Wait until all attributes are loaded'
WebUI.enableSmartWait()

//**************************************************************//
//*** This section is to verify the default value of input *****//
//*** field is same with the Case Ref No ***********************//
//**************************************************************//
'Highlight Notice Order No field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/span_Notice Order No'))

'Highlight Notice Order No textbox'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'))

'Get the Case Reference No text'
getCaseRef = WebUI.getText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/div_Case Ref No'))

'Get the length of SubmNo'
lengthSubmNo = (getCaseRef.length() - 35)

'Get the length of Case Reference No'
lengthCaseRef = (getCaseRef.length() - 17)

'Remove the Submission No'
RemoveSubmissionNo = getCaseRef.substring(0, lengthCaseRef)

'Get the SM Case Ref No'
SMCaseRef = getCaseRef.substring(16, lengthSubmNo)

'Get the value of Notice Order No'
NoticeOrderNo = WebUI.getAttribute(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), 
    'value')

'Verify if the Case Reference is equal to the default value in Notic Order No field'
WebUI.verifyMatch(SMCaseRef, NoticeOrderNo, true, FailureHandling.STOP_ON_FAILURE)

//**************************************************************//
//*** This section is to verify that the input field is a ******//
//*** mandatory field ******************************************//
//**************************************************************//
'Set focus on an input field'
WebUI.focus(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'))

'Send arrow left keys in input field'
WebUI.sendKeys(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), Keys.chord(Keys.ARROW_LEFT), 
    FailureHandling.STOP_ON_FAILURE)

'Select all the values'
WebUI.sendKeys(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), Keys.chord(Keys.CONTROL, 
        'a'), FailureHandling.STOP_ON_FAILURE)

'Remove the selected values'
WebUI.sendKeys(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), Keys.chord(Keys.BACK_SPACE), 
    FailureHandling.STOP_ON_FAILURE)

'Hover the mouse in an input field to verify the tooltip error message'
WebUI.mouseOver(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/NoticeOrderErrorReq'), FailureHandling.STOP_ON_FAILURE)

'Get the Tool Tip Error Text'
getToolTipError = WebUI.getAttribute(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/NoticeOrderErrorReq'), 
    'data-errorqtip', FailureHandling.STOP_ON_FAILURE)

'Remove the unnecessary values'
strToolTip = getToolTipError.substring(29, 61)

'Get the error message display in tool tip'
toolTipErrMsg = strToolTip.substring(0, 22)

'Verify if the tooltip error message display is the same of the error message in DB'
WebUI.verifyMatch(toolTipErrMsg, PrecisionAndScaleDB.getValue('NoticeOrderNoValidation', 1), true, FailureHandling.STOP_ON_FAILURE)

//**************************************************************//
//*** This section is to verify that the input field is only ***//
//*** accepts maximum character ********************************//
//**************************************************************//
'Delay for 5 sec'
WebUI.delay(5)

'Enter a value'
WebUI.setText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), PrecisionAndScaleDB.getValue('NoticeOrderNoValidation', 4))

'Get the value and saved in a temporary variable'
varNoticeOrderNo = WebUI.getAttribute(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), 
    'value')

'Get the length of the entered value'
LenghtEnteredNOrderNo = varNoticeOrderNo.length()

'Verify that the lenght of the entered value is the same with the accepted maximum character length'
WebUI.verifyLessThanOrEqual(LenghtEnteredNOrderNo, PrecisionAndScaleDB.getValue('NoticeOrderNoValidation', 2), FailureHandling.STOP_ON_FAILURE)

//**************************************************************//
//*** This section is to verify that the input field accepts ***//
//*** alpha numeric and special characters *********************//
//**************************************************************//
'Delay for 5 sec'
WebUI.delay(5)

'Enter a alphabet character'
VerifyAlpha = WebUI.setText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), enterAlpha)

'Verify if the entered alpha character is accepted in input field'
if (VerifyAlpha != '') {
	'Display PASSED status'
	WebUI.comment('Accepting Alphabets - PASSED')
} else {
	'Stop test execution when there is a null value'
	WebUI.verifyMatch(enterAlpha, VerifyAlpha, true, FailureHandling.STOP_ON_FAILURE)
}

'Remove previous entered value'
WebUI.sendKeys(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), Keys.chord(Keys.BACK_SPACE), 
    FailureHandling.STOP_ON_FAILURE)

'Enter a numeric character'
VerifyNumeric = WebUI.setText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), enterNumeric)

'Verify if the entered numeric character is accepted in input field'
if (VerifyNumeric != '') {
	'Display PASSED status'
	WebUI.comment('Accepting Numeric - PASSED')
} else {
	'Stop test execution when there is a null value'
	WebUI.verifyMatch(enterNumeric, VerifyNumeric, true, FailureHandling.STOP_ON_FAILURE)
}

'Remove previous entered value'
WebUI.sendKeys(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), Keys.chord(Keys.BACK_SPACE), 
    FailureHandling.STOP_ON_FAILURE)

'Enter a special character'
VerifySpecialChar = WebUI.setText(findTestObject('Objects.VerifyCourtActionsPrecisionAndScale/Page_ISPS2/input__courtNo'), enterSpecialChar)

'Verify if the entered special character is accepted in input field'
if (VerifySpecialChar != '') {
	'Display PASSED status'
	WebUI.comment('Accepting Special Character - PASSED')
} else {
	'Stop test execution when there is a null value'
	WebUI.verifyMatch(enterSpecialChar, VerifySpecialChar, true, FailureHandling.STOP_ON_FAILURE)
}