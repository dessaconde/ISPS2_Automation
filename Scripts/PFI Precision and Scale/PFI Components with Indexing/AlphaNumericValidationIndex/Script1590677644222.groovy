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
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/* ====================================================================
 * COMPONENT NAME: AlphaNumericSpecialTextboxValidation
 * TESTER: Krizia Manuel
 * CREATE DATE:
 * PURPOSE: This is to verify the precision of scale of textbox if it 
 * 			accepts alphanumeric and special characters
 * UPDATED BY: Rhodessa Conde
 * ====================================================================
 */

Thread.sleep(1000)

'Initialized alphanumeric strings'
String AlphaNumeric = ((('A'..'Z') + ('a'..'z')) + ('0'..'9')).join()

'Initialized Special character strings'
String SpecialChar = '`~!@#$%^&*()-=+_{}|\\][;\'":,./?><"'

'Initialize auto-generated random alphanumeric strings'
String RandomString = RandomStringUtils.random(LenChar, AlphaNumeric.toCharArray())

'Initialize auto-generated random special characters'
String RdmSpChar = RandomStringUtils.random(LenChar, SpecialChar)

'Initialize validation if the entered characters are alphanumeric strings'
Pattern regexPat = Pattern.compile('^[A-Za-z0-9 ]+$')

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', '(//*[contains(@class,\'x-form-text\') and (@name=\'' + FldNm + '\')])[' + index + ']', true)

'Enter the auto-generated random alphanumeric strings'
WebUI.setText(NewInputNmField, RandomString)

'Get the entered value'
RemarksAN = WebUI.getAttribute(NewInputNmField, 'value')

'Match if the entered value are alphanumeric strings'
Matcher matchStr = regexPat.matcher(RemarksAN)

'Verify if the entered value is alphanumeric'
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

'Verify if the entered value is special character'
if (matchSp.matches() == false) {
	WebUI.verifyMatch(RemarksSpChar, '', true)
}