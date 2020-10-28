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
import java.util.Random as Random
import java.text.DecimalFormat as DecimalFormat
import java.util.regex.*;

/*========================================================================*
 * COMPONENT NAME: DecimalValidation		    					      *
 * TESTER: Krizia Manuel                                    			  *
 * CREATE DATE: 11-June-2020                                 			  *
 * PURPOSE: This is to verify the Precision&Scale for Decimal Values 	  *
 * =======================================================================*
 */

'Initialize Decimal Format.'
Random rand = new Random()

int num1 = rand.nextInt(9)

int num2 = rand.nextInt(9)

DecimalFormat d1 = new DecimalFormat('0')

DecimalFormat d2 = new DecimalFormat('00') 

String sample = (d1.format(num1) + '.') + d2.format(num2)

println(sample)

'This line of code will be modifying the tag of the object depending on the needed tag.'
modifiedTagOfField = WebUI.modifyObjectProperty(findTestObject('Objects.SetTextOnField/sampleField'), 'tag', 'equals', tagToBeUsed, 
    false)

'This line of code will be modifying the name(attribute) of the same object depending on the needed field.'
modifiedNameOfField = WebUI.modifyObjectProperty(modifiedTagOfField, 'name', 'equals', nameToBeUsed, true)

'Enter the auto-generated random decimal numbers.'
WebUI.setText(modifiedNameOfField, sample)

'Get the entered value'
GetInputVal = WebUI.getAttribute(modifiedNameOfField, 'value')

'Decimal Validation using regex pattern.'
Pattern DecimalPattern = Pattern.compile('^\\d+\\.\\d{2}$')

'Verify that the values are matched.'
Matcher VerifyDecimalFormat = DecimalPattern.matcher(sample)

'If-else statement to verify that values are matched.'
if (VerifyDecimalFormat.matches() == true){
	
	WebUI.comment('The field accepts decimal values.')
}
	
else {

KeywordUtil.markFailedAndStop('The field does not accept decimal values.')

}



