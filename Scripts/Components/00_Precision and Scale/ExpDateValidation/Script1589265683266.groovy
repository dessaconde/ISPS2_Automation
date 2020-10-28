import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
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
import java.text.SimpleDateFormat as SimpleDateFormat
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/* =================================================================
 * TESTER: Rhodessa Conde
 * CREATED DATE: 29-Apr-2020
 * PURPOSE: This is a reusable component to validate the date fields
 *  =================================================================
 */

'Hard Wait for 3sec'
Thread.sleep(3000)

'Define the New Date variable'
def date = new Date()

'Set Todays\'s date format to dd/MM/yyyy'
CurrentDate = new SimpleDateFormat('dd/MM/yyyy')

'Convert Today\'s Date format'
TodayDate = CurrentDate.format(date)

'Initialize Alphabetic string'
String Alphabetic = (('A'..'Z') + ('a'..'z')).join()

'Initialize Numeric string'
String Numeric = ('0'..'9').join()

'Initialize Special Character string'
String SpecialChar = '`~!@#$%^&*()-=+_{}|\\][;\'":,.?><"'

'Initialize auto-generate random Alphabetic strings'
String RandomAlpha = RandomStringUtils.random(MinLen, Alphabetic.toCharArray())

'Initialize auto-generate random Numeric strings'
String RandomNumeric = RandomStringUtils.random(MinLen, Numeric)

'initialize auto-generate random Special Character strings'
String RdmSpChar = RandomStringUtils.random(MinLen, SpecialChar)

'Modify the Label Name'
NewLblNm = WebUI.modifyObjectProperty(findTestObject('Objects.DateValidation/Page_ISPS2/label_Name'), 'text', 'equals', 
    LblNm, true)

'Modify the Today button in Date Picker'
TodayBtn = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.DateValidation/Page_ISPS2/a_Today'), 'xpath', 'equals', 
    '(//*[text() = \'Today\'])[' + index + ']', true)

'Highlight the Label'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNm)

'Modify the Input Name'
DateFieldNm = WebUI.modifyObjectProperty(findTestObject('Objects.DateValidation/Page_ISPS2/input__expiryDate'),
		  'xpath', 'equals', '(//*[@name = \'expiryDate\'])[' + idx + ']', true)

'Highlight the Input field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(DateFieldNm)

/*=========================================*
 * Verify the default value of input field *
 * ========================================*
 */
'Set focus in input field'
WebUI.focus(DateFieldNm)

'Get default value'
DefaultValue = WebUI.getAttribute(DateFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if the Default Value is blank'
WebUI.verifyMatch(DefaultValue, '', true)

/*==================================================*
 * Verify if the date field only accepts Valid Date *
 * =================================================*
 */

'Enter auto-generated alphabets'
WebUI.setText(DateFieldNm, RandomAlpha)

'Get entered alphabets'
getInputAlpha = WebUI.getAttribute(DateFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if date field is unable to enter alphabet characters'
WebUI.verifyMatch('', getInputAlpha, true, FailureHandling.STOP_ON_FAILURE)

'Wait for 5sec'
WebUI.delay(5)

'Enter auto-generated special character'
WebUI.setText(DateFieldNm, RdmSpChar)

'Get entered Special Character'
getInputSpecialChar = WebUI.getAttribute(DateFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if the date field is unable to enter special characters'
WebUI.verifyMatch('', getInputSpecialChar, true, FailureHandling.STOP_ON_FAILURE)

'Wait for 5sec'
WebUI.delay(5)

'Enter auto-generated numeric'
WebUI.setText(DateFieldNm, RandomNumeric)

'Get the entered numeric'
getInputInvalidDate = WebUI.getAttribute(findTestObject('Objects.DateValidation/Page_ISPS2/tooltipErrMsgInvalidDate'), 'value', 
    FailureHandling.STOP_ON_FAILURE)

'Hover over the date field'
WebUI.mouseOver(findTestObject('Objects.DateValidation/Page_ISPS2/tooltipErrMsgInvalidDate'), FailureHandling.STOP_ON_FAILURE)

'Get the tool tip error message'
getErrMsg = WebUI.getAttribute(findTestObject('Objects.DateValidation/Page_ISPS2/tooltipErrMsgInvalidDate'), 'data-errorqtip', 
    FailureHandling.STOP_ON_FAILURE)

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


/*==================================================*
 * Verify that no error message is displayed if the *
 * entered date is valid                            *
 * =================================================*
 */

'Send left arrow keys to date field'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.ARROW_LEFT))

'Select all the values'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.LEFT_CONTROL, 'a'))

'Remove the values'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.BACK_SPACE))

'Wait for 5sec'
WebUI.delay(5)

'Enter the current date'
WebUI.setText(DateFieldNm, TodayDate)

'Verify if the invalid error tooltip message is displayed'
WebUI.verifyElementNotPresent(findTestObject('Objects.DateValidation/Page_ISPS2/tooltipReqErrMsg'), 0)

/*==================================================*
 * Verify if the date field is a required field     *
 * =================================================*
 */

'Send left arrow keys to date field'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.ARROW_LEFT))

'Select all the values'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.LEFT_CONTROL, 'a'))

'Remove the values'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.BACK_SPACE))

'Wait for 5sec'
WebUI.delay(5)

'Set focus in date field'
WebUI.focus(DateFieldNm)

'Hover of the date field to see the tool tip error message for required field'
WebUI.mouseOver(DateFieldNm)

'Get the error message for required field'
getRqErrMsg = WebUI.getAttribute(DateFieldNm, 'data-errorqtip', FailureHandling.STOP_ON_FAILURE)

'Remove the unnecessary values'
strToolTip = getRqErrMsg.substring(29, 61)

'Get the error message display in tool tip'
toolTipReqErrMsg = strToolTip.substring(0, 22)

'Verify if the tooltip error message display is the same of the error message in DB'
WebUI.verifyMatch(toolTipReqErrMsg, GlobalVariable.RqField, true, FailureHandling.STOP_ON_FAILURE)

'Open the Date Picker field'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.ARROW_DOWN))

'Highlight the Today button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(TodayBtn)

'Click on Today button'
WebUI.click(TodayBtn)

'Get the current value entered in date field'
GetEnteredDt = WebUI.getAttribute(DateFieldNm, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if the date Today selected from picker match the system today\'s date'
WebUI.verifyMatch(GetEnteredDt, TodayDate, true)