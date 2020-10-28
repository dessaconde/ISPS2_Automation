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
import java.io.File
import java.io.IOException

/*==========================================================*
 * COMPONENT NAME: VerifyDropdownValues 				    *
 * TESTER: Rhodessa Conde                                   *
 * CREATE DATE: 15-May-2020                                 *
 * PURPOSE: This is to verify the values in dropdown fields *
 * =========================================================*
 */
'Wait for 1sec before proceeding on the next step'
Thread.sleep(1000)

'Initialize the Outfile to be used'
File OutputFile = new File('DropdownValuesResult.txt')

'Initialize the TimeStamp'
def TimeStamp = new Date()

'Modify Object Property: XPATH (input field)'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', ('(//*[contains(@name, \'' + FldNm + '\')])[' + index) + ']', true)

'Assign the value in the global variable'
GlobalVariable.comboNm = cmbNm

'Set focus in the input field'
WebUI.focus(NewInputNmField)

'Enter a value'
WebUI.setText(NewInputNmField, EnterValue)

'Loop until all the values in the dropdown are verified'
for (int i = 1; i <= NoOfVal; i++) {
	'Open the dropdown field'
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

	'Wait depends on the delay time set'
    WebUI.delay(DelayTime)

	'Select the value'
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

	'Get the value then assigned it to global variable'
    GlobalVariable.ComboBoxValue = WebUI.getAttribute(NewInputNmField, 'value')

	'Go to the Hashmapping table'
    WebUI.callTestCase(findTestCase(CallTCName), [('FindValue') : GlobalVariable.ComboBoxValue, ('DropdownNm') : GlobalVariable.comboNm], 
        FailureHandling.STOP_ON_FAILURE)

	'Print in the output file the results'
	OutputFile.append('Search Value: ' + GlobalVariable.ComboBoxValue + ' ' + 'Found Value: ' +GlobalVariable.ValueFound + TimeStamp + '\n')

	'Select another dropdown value'
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
}

'Close the dropdown field'
WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

