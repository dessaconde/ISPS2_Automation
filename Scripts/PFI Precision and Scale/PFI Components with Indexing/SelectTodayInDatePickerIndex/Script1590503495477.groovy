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
import java.text.SimpleDateFormat as SimpleDateFormat

Thread.sleep(1000)

'Define the New Date variable'
def date = new Date()

'Set Todays\'s date format to dd/MM/yyyy'
CurrentDate = new SimpleDateFormat('dd/MM/yyyy')

'Convert Today\'s Date format'
TodayDate = CurrentDate.format(date)

DateFieldNm = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field_index'), 'xpath', 'equals', 
    '(//*[contains(@class,\'x-form-text\') and (@name=\'' + FldNm + '\')])[' + idx + ']', true)

TodayBtn = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.DateValidation/Page_ISPS2/a_Today'), 'xpath', 
    'equals', ('(//*[text() = \'Today\'])[' + index) + ']', true)

'Open the Date Picker field'
WebUI.sendKeys(DateFieldNm, Keys.chord(Keys.ARROW_DOWN))

'Highlight the Today button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(TodayBtn)

'Click on Today button'
WebUI.click(TodayBtn)

GetEnteredDate = WebUI.getAttribute(DateFieldNm, 'value')

WebUI.verifyMatch(GetEnteredDate, TodayDate, true)