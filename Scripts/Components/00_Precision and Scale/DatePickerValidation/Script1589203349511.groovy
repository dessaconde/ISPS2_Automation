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
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat

/*==================================================================================*
 * TESTER: Rhodessa Conde                                                           *
 * CREATE DATE: 11-May-2020                                                         *
 * PURPOSE: This is to verify the precision and scale of disabled date picker field *
 * =================================================================================*
 */
'Hard Wait for 3sec'
Thread.sleep(3000)

'Define the New Date variable'
def date = new Date()

'Set Todays\'s date format to dd/MM/yyyy'
CurrentDate = new SimpleDateFormat('dd/MM/yyyy')

'Convert Today\'s Date format'
TodayDate = CurrentDate.format(date)

'Modify the input date field'
ModifiedInputField = WebUI.modifyObjectProperty(findTestObject('Objects.DateValidation/Page_ISPS2/input__orderDt'), 'name', 
    'equals', DtName, true)

'Modify the Today button in Date Picker'
TodayBtn = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.DateValidation/Page_ISPS2/a_Today'), 'xpath', 
    'equals', ('(//*[text() = \'Today\'])[' + index) + ']', true)

'Highlight the input date field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedInputField)

'Check if this is the first run for this component'
if (FirstRun == 'Y') {
    'Open the date picker'
    WebUI.sendKeys(ModifiedInputField, Keys.chord(Keys.ARROW_DOWN))

    'Highlight the selection of days'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DateValidation/Page_ISPS2/Select_Day'))

    'Click any random days in Date picker'
    WebUI.click(findTestObject('Objects.DateValidation/Page_ISPS2/Select_Day'))

    'Get the entered date'
    GetEnteredDt1 = WebUI.getAttribute(ModifiedInputField, 'value')

    'Open the date picker'
    WebUI.sendKeys(ModifiedInputField, Keys.chord(Keys.ARROW_DOWN))

    'Go to next month in date picker'
    WebUI.click(findTestObject('Object Repository/Objects.DateValidation/Page_ISPS2/NextMonth_Picker'))

    'Highlight the selection of days'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DateValidation/Page_ISPS2/Select_Day'))

    'Click any random days in Date picker'
    WebUI.click(findTestObject('Objects.DateValidation/Page_ISPS2/Select_Day'))

    'Get the new entered date'
    GetEnteredDt2 = WebUI.getAttribute(ModifiedInputField, 'value')

    'Verify that the value changes'
    WebUI.verifyNotMatch(GetEnteredDt2, GetEnteredDt1, true)
} else {

	'Open the date picker'
	WebUI.sendKeys(ModifiedInputField, Keys.chord(Keys.ARROW_DOWN))
	
	'Highlight the selection of days'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DateValidation/Page_ISPS2/div_21'))
	
	'Select a day'
	WebUI.click(findTestObject('Objects.DateValidation/Page_ISPS2/div_21'))
	
	'Get the entered date'
	GetEnteredDt1 = WebUI.getAttribute(ModifiedInputField, 'value')
	
	'Open the date picker'
	WebUI.sendKeys(ModifiedInputField, Keys.chord(Keys.ARROW_DOWN))
	
	'Go to the previous month'
	WebUI.click(findTestObject('Objects.DateValidation/Page_ISPS2/div_PrevMonth'))
	
	'Highlight the selection of days'
	CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DateValidation/Page_ISPS2/div_21'))
	
	'Select a day'
    WebUI.click(findTestObject('Objects.DateValidation/Page_ISPS2/div_21'))
	
	'Get the new entered date'
	GetEnteredDt2 = WebUI.getAttribute(ModifiedInputField, 'value')

	'Verify that the value changes'
	WebUI.verifyNotMatch(GetEnteredDt2, GetEnteredDt1, true)
}

'Open the date picker'
WebUI.sendKeys(ModifiedInputField, Keys.chord(Keys.ARROW_DOWN))

'Highlight Today\'s button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(TodayBtn)

'Click Today button'
WebUI.click(TodayBtn)

'Get the new entered date'
GetEnteredDt3 = WebUI.getAttribute(ModifiedInputField, 'value')

'Verify that the selected current date is the same to the system current date'
WebUI.verifyMatch(GetEnteredDt3, TodayDate, true)
