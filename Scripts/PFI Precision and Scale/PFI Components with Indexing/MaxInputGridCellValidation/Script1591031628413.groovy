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
import java.util.LinkedHashMap as GroovyHashMap

Thread.sleep(1000)

def CharLengthTBL = [
	('HB') : 20,
	]

'Initialize character set of alphanumeric and special characters'
String charset = (((('A'..'Z') + ('a'..'z')) + ('0'..'9'))).join()

'Initialize auto-generated maximum character set'
String RandomStringVal = RandomStringUtils.random(MaxCharLen, charset.toCharArray())

//NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'),
//	'xpath', 'equals', '(//*[contains(@class,\'x-form-text\') and (@name=\'' + FieldNm + '\')])[' + index + ']', true)

'Enter the auto-generated random alphanumeric and special character strings'
WebUI.setText(findTestObject('Objects.ReusableObjects/CellGridInput'), RandomStringVal)

'Get the entered values'
GetInputValue = WebUI.getAttribute(findTestObject('Objects.ReusableObjects/CellGridInput'), 'value', FailureHandling.STOP_ON_FAILURE)

'Get the total length of the entered values'
GetLenChar = GetInputValue.length()

MaxLength = CharLengthTBL.get(FieldNm)

if (MaxLength != null){
	
	WebUI.verifyEqual(GetLenChar, MaxLength)
}else{
	println(GetLenChar)
}
