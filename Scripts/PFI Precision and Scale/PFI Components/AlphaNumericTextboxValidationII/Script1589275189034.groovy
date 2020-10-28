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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys


/*==========================================================================*
 * COMPONENT NAME: AlphaNumericTextboxValidationII				       		*
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 01-June-2020                                       			*
 * PURPOSE: This is to verify that the field accepts alphanumeric values    *
 * =========================================================================*
 */


'Hard wait for 3sec'
Thread.sleep(3000)

'Initialize character set of alphanumeric and special characters'
String charset = (((('A'..'Z') + ('a'..'z')) + ('0'..'9')) + '`~!@#$%^&*()-=+_{}|\\][;\'":,./?><"').join()

'Initialized alphanumeric strings'
String AlphaNumeric = ((('A'..'Z') + ('a'..'z')) + ('0'..'9')).join()

'Initialized Special character strings'
String SpecialChar = '`~!@#$%^&*()-=+_{}|\\][;\'":,./?><"'

'Initialize auto-generated random alphanumeric strings'
String RandomString = RandomStringUtils.random(minLen, AlphaNumeric.toCharArray())

'Initialize auto-generated random special characters'
String RdmSpChar = RandomStringUtils.random(minLen, SpecialChar)

'Initialize auto-generated maximum character set'
String MaxInputVal = RandomStringUtils.random(maxLen, charset.toCharArray())

'Initialize validation if the entered characters are alphanumeric strings'
Pattern regexPat = Pattern.compile('^[A-Za-z0-9 ]+$')

'Then modify Label Name property/attribute'
	NewLblNmField = WebUI.modifyObjectProperty(findTestObject('Objects.RemarksValidation/label_Remarks'), 'text', 'equals',
		labelToBeUsed, true)
	
'Highlight the label'
	CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNmField)

'Modify Input field property/attribute'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.RemarksValidation/input_Remarks'), 'name', 'equals',
	nameToBeUsed, true)

'Highlight the input field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

'Set focus in input field'
WebUI.focus(NewInputNmField)

'Get the default value'
DefVal = WebUI.getAttribute(NewInputNmField, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if the default value is blank'
WebUI.verifyMatch(DefVal, '', true, FailureHandling.STOP_ON_FAILURE)

'Enter the auto-generated random alphanumeric strings'
WebUI.setText(NewInputNmField, RandomString)

'Get the entered value'
RemarksAN = WebUI.getAttribute(NewInputNmField, 'value')

'Match if the entered value are alphanumeric strings'
Matcher matchStr = regexPat.matcher(RemarksAN)

'If the match strings are alphanumeric'
if (matchStr.matches() == true) {
	'Print that the input field is accepting alphanumeric values'
	WebUI.comment('Accepting Alphanumeric')
}

'Enter the auto-generated random special character strings'
WebUI.setText(NewInputNmField, RdmSpChar)

'Get the entered value'
RemarksSpChar = WebUI.getAttribute(NewInputNmField, 'value')

'Match if the entered value are non-alphanumeric strings'
Matcher matchSp = regexPat.matcher(RemarksSpChar)

'If non-alphanumeric strings then'
if (matchSp.matches() == false) {
	'Print that the input field is accepting special characters'
	WebUI.comment('Accepting Special Characters')
}

'Send arrow left keys in input field'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN), FailureHandling.STOP_ON_FAILURE)

'Select all the values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.CONTROL, 'a'), FailureHandling.STOP_ON_FAILURE)

'Remove the selected values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

'Wait for 5sec'
WebUI.delay(5)

'Enter the maximum auto-generated random alphanumeric and special character values'
WebUI.setText(NewInputNmField, MaxInputVal)

'Get the entered values'
MaxCharInput = WebUI.getAttribute(NewInputNmField, 'value', FailureHandling.STOP_ON_FAILURE)

'Get the total lenght of the entered values'
GetLenChar = MaxCharInput.length()

'If the character length input is equal to the maximum character'
if (GetLenChar == GlobalVariable.Max4KChar){
	'Then verify that it is equal to the maximum character'
	WebUI.verifyEqual(GetLenChar, GlobalVariable.Max4KChar, FailureHandling.STOP_ON_FAILURE)
}else{
	'Else verify if the input field is accepting more than 4000 characters'
	WebUI.verifyGreaterThan(GetLenChar, GlobalVariable.Max4KChar, FailureHandling.STOP_ON_FAILURE)
}

