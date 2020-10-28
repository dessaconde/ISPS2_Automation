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

WebUI.delay(1)

'modify object xpath'
ModifiedObject = WebUI.modifyObjectProperty(findTestObject('Object.GetObjectToMOdify/GetObject'),
	'xpath', 'equals', ('//*[contains(text(),\'' + text  + '\')]//following::td[' + index) + ']', true)

'Highlight the modified object.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedObject)

'Get text from the modified object'
CopiedTextVariable = WebUI.getText(ModifiedObject)

'Store text on a variable'
GlobalVariable.textFrXpath = CopiedTextVariable

