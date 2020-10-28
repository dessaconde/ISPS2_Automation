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
import java.util.regex.Matcher
import java.util.regex.Pattern
import com.kms.katalon.core.util.KeywordUtil

Thread.sleep(1000)

DateFieldNm = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field'), 'name', 'equals', FldNm, 
    true)

ModifyDay = WebUI.modifyObjectProperty(findTestObject('Objects.DateValidation/Page_ISPS2/Select_Day'), 'aria-label', 'equals', 
    SelectDay, true)

WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.ARROW_DOWN))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifyDay)

WebUI.delay(1)

WebUI.click(ModifyDay)

GetError = WebUI.getAttribute(DateFieldNm, 'data-errorqtip')

if (GetError == '') {

	GetEnteredDate = WebUI.getAttribute(DateFieldNm, 'value')
	
	Pattern DatePattern = Pattern.compile('^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$')
	
	Matcher VerifyDateFormat = DatePattern.matcher(GetEnteredDate)
	
	if (VerifyDateFormat.matches() == true){
		
		WebUI.comment('Date Format is valid')
	}
		
} else {

	KeywordUtil.markFailedAndStop('Invalid Date Format!')
}