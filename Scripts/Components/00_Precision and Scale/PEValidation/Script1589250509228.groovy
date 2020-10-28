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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.Keys as Keys
import java.util.*

/* =================================================================
 * TESTER: Rhodessa Conde
 * CREATED DATE: 29-Apr-2020
 * PURPOSE: This is a reusable component to validate the PE fields
 *  =================================================================
 */
'Hard wait for 3sec'
Thread.sleep(3000)

'Define PE array list table'
def PEList = [('1002') : 'Dummy PE', ('6789') : 'Test Name 1', ('1140') : 'Test new', ('1596') : 'Dummy QP', ('1567') : 'TAN BOON NGEE'
    , ('1234') : 'ENG1']

'Modify input field'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals',
	FldNm, true)

'If PE field is enabled'
if (PEEnabled == 'Y'){
	
	'Then modify the label name'
	NewLblNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/label_FieldName'), 'text', 'equals', LblNm, 
	    true)
	
	'Highlight the label field'
	CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNmField)
	
}else if (PEEnabled == 'N'){
	
	'If the field is PE No'
	if (PEName == 'N'){
		'Then double click PE No field to enabled the input field'
		WebUI.doubleClick(findTestObject('Objects.PELSH/PENoReadOnly'))
	}else{
		'else double click PE Name field to enabled the input field'
		WebUI.doubleClick(findTestObject('Objects.PELSH/PENameReadOnly'))
	}
}

'Highlight the input field name'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

'Set focus in the Input field name'
WebUI.focus(NewInputNmField)

'Get the default value'
GetValue = WebUI.getAttribute(NewInputNmField, 'value', FailureHandling.STOP_ON_FAILURE)

'Verify if the default value is blank'
WebUI.verifyMatch(GetValue, '', true)

'Enter invalid PE value'
WebUI.setText(NewInputNmField, EnterInvalidPE)

'Wait for 5 sec'
WebUI.delay(5)

'Send arrow down keys'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

'Hit Enter'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

'Get the entered value'
GetValue = WebUI.getAttribute(NewInputNmField, 'value', FailureHandling.STOP_ON_FAILURE)

'If the entered value is able to search using Key'
if (PEList.containsKey(GetValue) == false) {
	
    'If entered value has no matching in Keys then search the value'
	SearchValue = PEList.find({ 
            it.value == GetValue
        })
	
	'If the entered value is not found'
    if (SearchValue == null) {
		
		'Print no matching found'
        WebUI.comment('No matching qp found')
    }
} else {
	
	'Else if the entered value is found in Keys then print its matching values'
    println(((GetValue + ' (') + PEList.get(GetValue).toString()) + ')')
}

'Send left arrow keys in input field'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_LEFT))

'Select all values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.LEFT_CONTROL, 'a'))

'Remove all the values'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.BACK_SPACE))

'If the field is a required field'
if (RqdField == 'Y') {

	'Enter tab keys'
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.TAB))
	
	'Hover over the input field'
	WebUI.mouseOver(findTestObject('Objects.NameValidation/RqFieldNm'))
	
	'Get the tooltip error message'
	getRqErrMsg = WebUI.getAttribute(NewInputNmField, 'data-errorqtip', FailureHandling.STOP_ON_FAILURE)
	
	'Remove the unnecessary values'
	strToolTip = getRqErrMsg.substring(29, 61)
	
	'Get the error message display in tool tip'
	toolTipReqErrMsg = strToolTip.substring(0, 22)
	
	'Verify if the tooltip error message display is the same of the error message in DB'
	WebUI.verifyMatch(toolTipReqErrMsg, GlobalVariable.RqField, true, FailureHandling.STOP_ON_FAILURE)
	
	'Set focus in input field'
	WebUI.focus(NewInputNmField)
}

'Iterate to verify the values in dropdown'
for (int i = 0; i < NoOfOpt; i++) {
	
	'Select the next option'
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	
	'Wait for 8 secs'
	WebUI.delay(8)

	'Hit Enter key'
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

	'Get the entered value'
    SearchDropdownVal = WebUI.getAttribute(NewInputNmField, 'value')
	
	'If the field is PE No'
	if (PEName == 'N'){
		
		'Print its matching values'
		println(((SearchDropdownVal + ' (') + PEList.get(SearchDropdownVal).toString()) + ')')
	} else {
	
		'Search for its matching Key'
		ValueFound = PEList.find {it.value == SearchDropdownVal}
		
		'Print its matching Key'
		println(ValueFound)
	}

	'Send arrow down Key'
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	
}

'Hit enter key'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

'If PE is enabled'
if (PEEnabled == 'N'){
	
	'Hit another enter key to accept the value'
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
}