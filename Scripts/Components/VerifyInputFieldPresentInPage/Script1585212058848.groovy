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

//ComponentName: VerifyInputFieldPresentInPage
//Author: Krizia Manuel
//Purpose: To verify that the input is present.
'Best practice: Wait for 3 seconds after a page navigation component. '
Thread.sleep(3000)

'Modify the header property'
ModifiedInputField = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyInputFieldPresentInPage/InputField'), 'text', 
    'equals', textToModify, false)

'Modify the header property'
ModifiedInputField = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyInputFieldPresentInPage/InputField'), 'tag', 
    'equals', textToModify, false)

'Verify that the header name is present'
WebUI.verifyElementPresent(ModifiedInputField, 0)

'Highlight the header name'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedInputField)

