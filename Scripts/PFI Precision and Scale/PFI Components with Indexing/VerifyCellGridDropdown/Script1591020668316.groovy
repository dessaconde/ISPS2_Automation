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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.LinkedHashMap as GroovyHashMap

/* COMPONENT NAME: VerifyCellGridDropdown
 * TESTER: Rhodessa Conde
 * CREATED DATE: -
 * PURPOSE: This is to verify the values of dropdown in table grid
 * REVIEWED BY: -
 * REVISION BY: -
 * REVISION DATE: -
 */

'Wait for 1 sec before performing the next step'
Thread.sleep(1000)

'HB hash mapping table'
def HB = [(1) : 'H', (2) : 'B']

'Modify Object Property: XPATH (dropdown field)'
modifiedCellGDD = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/CellGridDropdown'), 'xpath', 'equals', 
    ('//div[contains(@class,\'x-grid-row-checker\')]//following::div[' + index) + ']', true)

'Open dropdown field'
WebUI.click(modifiedCellGDD)

'Get the total number of HB hash mapping table'
NoOfVal = HB.size()

'Loop until all the dropdown values are verified'
for (NoOfVal in HB){
	
	'Get the value in hash mapping table'
	SetValue = NoOfVal.value
	
	'Enter the value from hashmapping table in dropdown field'
	modifiedOptionVal = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/SelectOptionDropdown'), 'value', 'equals', SetValue, true)
	
	'Wait for 5 sec'
	WebUI.delay(5)
	
	'Select the value'
	WebUI.click(modifiedOptionVal)
	
	'Wait for another 5 sec'
	WebUI.delay(5)
}