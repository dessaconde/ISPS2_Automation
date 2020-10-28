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

 /*
  * COMPONENT NAME: NumericTextboxValidationII
  * TESTER: Krizia Manuel
  * PURPOSE: This is to verify the precision of scale of numeric textbox
  * UPDATED BY: Rhodessa Conde
  */
 
'Wait for 1sec'
Thread.sleep(1000)

'Initialize character set of numeric characters'
String Numeric = ('0123456789')

'Initialized Alphabets and special character strings'
String AlphaSpecialChar = ((('A'..'Z') + ('a'..'z')) + '`~!@#$%^&*()=_{}|\\][;\'":,?><"').join()

'Initialize auto-generated random alphanumeric strings'
String RandomNumeric = RandomStringUtils.random(minLen, Numeric.toCharArray())

'Initialize auto-generated random alphabet and special characters'
String RandomString = RandomStringUtils.random(minLen, AlphaSpecialChar)

'Initialize validation if the entered characters are numeric strings'
Pattern regexPat = Pattern.compile('^[0-9]+[0.99]$')


'Modify Input field property/attribute'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.RemarksValidation/input_Remarks'), 'name', 'equals', 
    nameToBeUsed, true)

'Set focus in input field'
WebUI.focus(NewInputNmField)

'Enter the auto-generated random alphabet and special character strings'
WebUI.setText(NewInputNmField, RandomString)

'Get the entered value'
GetInputVal = WebUI.getAttribute(NewInputNmField, 'value')

'Verify if the values have \'e\' value'
if (GetInputVal.contains('e')) {
	WebUI.comment('This is for exponential value')
} else {
	'Verify that the input field is not accepting alphabets and special characters'
	WebUI.verifyMatch(GetInputVal, '', true)
}

'Enter the auto-generated random numeric strings'
WebUI.setText(NewInputNmField, RandomNumeric)

'Get the entered value'
GetEnteredIntegers = WebUI.getAttribute(NewInputNmField, 'value')

'Match if the entered value are numeric strings'
Matcher matchStr = regexPat.matcher(GetEnteredIntegers)

'If the match strings are alphanumeric'
if (matchStr.matches() == true) {
	'Print that the input field is accepting numeric values'
	WebUI.comment('Accepting Numeric')
}