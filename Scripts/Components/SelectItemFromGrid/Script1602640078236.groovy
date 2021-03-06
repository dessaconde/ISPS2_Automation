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

'Hard wait for 2 seconds.'
Thread.sleep(2000)

WebUI.waitForPageLoad(180)

//modifiedTaskDescription = WebUI.modifyObjectProperty(findTestObject('Objects.SelectItemFromFilteredTasks/Page_ISPS2/a_caseType'), 
//  'xPath', 'equals', ((('(//a[text() = "' + extractedCaseTypeFromGV) + '"])[') + Index ) + ']', true)
'Modify the case type and the index.'
modifiedPaymentAmt = WebUI.modifyObjectProperty(findTestObject('Object.UtilitiesPaymentHistory/Page_ISPS2/span_Payment Amount()'), 
    'xPath', 'equals', ((('(//a[text()="' + extractedCaseTypeFromGV) + '"])[') + Index) + ']', true)

'Pass the value of the user inputted index into the global variable.'
GlobalVariable.Index = Index

'Highlight the modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedPaymentAmt)

'Click the modified object.'
WebUI.click(modifiedPaymentAmt)

'Hard wait for 2 seconds.'
Thread.sleep(2000)

