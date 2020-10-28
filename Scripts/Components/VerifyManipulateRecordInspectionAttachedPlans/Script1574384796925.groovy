import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Component Name: VerifyManipulatedRecordInspectionAttachedPlans
//Dev: Shayne Cardona
//Purpose: To verify the manipulated data in record inspection attached plans tab

'Wait for 1 sec.\r\n'
Thread.sleep(1000)

'Modify object\'s property.'
modifiedIRN = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/a_A0002-00002-2019-EP13-01'), 
    'xpath', 'equals', ('//a[text()="' + GlobalVariable.IRN) + '"]', true)

'Wait for 1 sec.'
Thread.sleep(1000)

'Click modified object.'
WebUI.click(modifiedIRN)

'Wait for 1 sec.'
Thread.sleep(1000)

'Verify that the attached plans tab is clickable.'
WebUI.verifyElementClickable(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/span_Attached Plans'))

'Click attached plans tab.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/span_Attached Plans'))

'Verify the attached plans header is present.'
WebUI.verifyElementPresent(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/div_ListOfAttachedPlans'), 0)

'Highlight the attached plans header.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/div_ListOfAttachedPlans'))

'Wait for 1 sec.'
Thread.sleep(1000)

'Verify the attached plans is present.'
WebUI.verifyTextPresent(GlobalVariable.recordInspectionAttachedPlans, false)

