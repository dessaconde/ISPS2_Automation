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
import org.openqa.selenium.Keys as Keys

//Component Name: ManipulateRecordInspectionAttachedPlans
//Author: Shayne Cardona
//Purpose: To manipulate the attached plans tab in Record Inspection LHS

'Wait for 1 sec.\r\n'
Thread.sleep(1000)

'Modify object\'s attribute/s'
modifiedIRN = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/a_A0002-00002-2019-EP13-01'), 
    'xpath', 'equals', ('//a[text()="' + GlobalVariable.IRN) + '"]', true)

'Wait for 1 sec.'
Thread.sleep(1000)

'Click the modified object.'
WebUI.click(modifiedIRN)

'Wait for 1 sec.'
Thread.sleep(1000)

'Verify that the attached plans tab is clickable.'
WebUI.verifyElementClickable(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/span_Attached Plans'))

'Click the attached plans tab.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/span_Attached Plans'))

'Verify that the attached plans screen is displayed.'
WebUI.verifyElementPresent(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/div_ListOfAttachedPlans'), 0)

'Highlight the attached plans header.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/div_ListOfAttachedPlans'))

'Click Add.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/span_Add'))

'Set text on remarks field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/input_remarksInAttachedPlan'), 
    remarks)

'Send enter key on remarks field.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/input_remarksInAttachedPlan'), 
    Keys.chord(Keys.ENTER))

'Verify that the remarks was added successfully.'
WebUI.verifyTextPresent(remarks, false)

'Click Add.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/span_Add'))

'Set text on the remarks field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/input_remarksInAttachedPlan'), 
    remarks2)

'Send enter key on remarks field.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/Page_ISPS2/input_remarksInAttachedPlan'), 
    Keys.chord(Keys.ENTER))

'Verify that the remarks was added successfully.'
WebUI.verifyTextPresent(remarks2, false)

'Click delete button.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/span_delete'))

'Wait for 1 sec.'
Thread.sleep(1000)

'Click Yes.'
WebUI.click(findTestObject('Objects.ManipulateRecordInspectionAttachedPlans/span_yes'))

'Verify that the newly added remarks was deleted.'
WebUI.verifyTextNotPresent(remarks2, false)

'Verify that the first remarks added is still present.'
WebUI.verifyTextPresent(remarks, false)

