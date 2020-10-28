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
import java.util.*

/*=============================================================================*
 * TESTER: Rhodessa Conde                                                      *
 * CREATE DATE: 12-May-2020                                                    *
 * PURPOSE: This is to verify the precision and scale of D Form dropdown field *
 * ============================================================================*
 */

def ReportList = [(1) : [('DForm') : 'D3'], (2) : [('DForm') : 'D4'], (3) : [('DForm') : 'D5'], (4) : [('DForm') : 'D6']
    , (5) : [('DForm') : 'D7'], (6) : [('ReportType') : 'Visual Inspection Report'],
	(7): [('ReportType'):'Supplementary Visual Inspection Report'],
	(8):[('ReportType'):'Supplementary Visual Inspection Report 2'],
	(9):[('ReportType'):'Full Structural Inspection Report'],
	(10):[('ReportType'):'Supplementary Full Structural Inspection Report'],
	(11):[('ReportType'):'Supplementary Full Structural Inspection Report 2'],
	(12):[('ReportType'):'Audit Report'],
	(13):[('ReportType'):'Site Inspection Report']]

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals', 
    FldNm, true)

WebUI.focus(NewInputNmField)

DefaultValue = WebUI.getAttribute(NewInputNmField, 'value')

WebUI.verifyMatch(DefaultValue, '', true)

WebUI.setText(NewInputNmField, EnterValue)

SearchEnteredVal = WebUI.getAttribute(NewInputNmField, 'value')

println(ReportList.keySet())

println(ReportList.values())

switch (DropdownNm) {
	case 'DForm':
		ValueFound = ReportList.find({
			it.value.DForm == SearchEnteredVal
		})
		break
	case 'ReportType':
		ValueFound = ReportList.find({
			it.value.ReportType == SearchEnteredVal
		})
		break
	default:
		WebUI.comment('DropdownNm should be \'DForm\' or \'ReportType\'')
		break
}

if (ValueFound == null) {
    WebUI.comment('No matching record found')
} else {
    WebUI.comment('Match recordFound!')

    println(ValueFound)
}

'Send left arrow keys in input field'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_LEFT))

'Select all values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.LEFT_CONTROL, 'a'))

'Remove all the values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.BACK_SPACE))

for (int itr = 1; itr <= NoOfOpt; itr++) {
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
	
	EnteredVal = WebUI.getAttribute(NewInputNmField, 'value')
	
	switch (DropdownNm) {
		case 'DForm':
			ValueFound = ReportList.find({
				it.value.DForm == SearchEnteredVal
			})
			
			println(ValueFound)
			break
		case 'ReportType':
			ValueFound = ReportList.find({
				it.value.ReportType == SearchEnteredVal
			})
			
			println(ValueFound)
			break
		default:
			WebUI.comment('DropdownNm should be \'DForm\' or \'ReportType\'')
			break
	}

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
}

