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

/*COMPONENT NAME: GetDynamicTextValueThenStoreToGV
 *TESTER: Rhodessa Conde
 *PURPOSE: To get the Dynamic Text Value from Summary Screen
 *			then store it to global variable
 */
Thread.sleep(3000)

ModifiedLabelFld = WebUI.modifyObjectProperty(findTestObject('Objects.ReusableObjects/LabelField'), 'xpath', 'equals', 
	'(//*[@href = \'#\'])[' + index + ']', true)

GlobalVariable.LabelNm = WebUI.getAttribute(ModifiedLabelFld, 'text')

CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedLabelFld)