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
import static java.util.Calendar.*

//Component Name: ClickDatePickerIcon
//Author: Krizia Manuel
//Purpose: Click on calendar picker.
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Modify Object '
modifiedIcon = WebUI.modifyObjectProperty(findTestObject('Objects.DateValidation/Page_ISPS2/calendar_icon'), 'xpath', 'equals', 
    ('(//div[@class=\'x-form-trigger x-form-trigger-default x-form-date-trigger x-form-date-trigger-default \'])[' + Index) + 
    ']', true)

'Click.'
WebUI.click(modifiedIcon)

'Modify Object '
not_run: modifiedPicker = WebUI.modifyObjectProperty(findTestObject('null'), 'xpath', 
    'equals', ('(//td[@class = \'x-datepicker-active x-datepicker-cell\'])[' + IndexforDate) + ']', true)

'Highlight the field.'
WebUI.click('Objects.DateValidation/Page_ISPS2/div_21')