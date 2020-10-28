import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Component Name: ReassignCaseFromMyTasks
//Dev: Shayne Cardona
//Purpose: To reassign case in My Tasks screen

'Wait for 3 secs.'
Thread.sleep(3000)

'Wait for the page to load before moving to the next action.'
WebUI.waitForPageLoad(30)

'3 seconds hard wait. '
Thread.sleep(3000)

not_run: WebUI.waitForElementNotPresent(findTestObject('Objects.ReassignCaseFromMyTask/div_Loading search result Please wait'), 
    120)

'Wait for 3 secs.'
Thread.sleep(3000)

'Right click the task description.'
WebUI.rightClick(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/a_task description'))

'Click re-assign case button.'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/span_Re-assign Case'))

'Verify that the re-assign case is visible.'
WebUI.verifyElementVisible(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign Case'))

'Wait for 3 secs.'
Thread.sleep(3000)

'Get the case ref no.'
extractedCaseRefNo = WebUI.getText(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_CaseRefNo'))

'Transfer the case ref no from local variable to a global variable.'
GlobalVariable.CRN = extractedCaseRefNo

not_run: WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign Case_tool-1731-toolEl'))

'Populate assign to officer field.'
WebUI.setText(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/input__Assign To Officer'), findTestData('Datatable').getValue(
        'AssignToOfficer', 1))

'Click re-assign button.'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign'))

'Wait for 3 secs.'
Thread.sleep(3000)

'Verify that a confirmation message is displayed.'
WebUI.verifyElementVisible(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_CaseReassignedSuccessfully'))

'Get the formatted time.'
formattedTime = new Date().format('hh:mm')

'Transfer time from a local variable to a global variable.'
GlobalVariable.currentTime = formattedTime

'Click OK button.'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_OK'))

