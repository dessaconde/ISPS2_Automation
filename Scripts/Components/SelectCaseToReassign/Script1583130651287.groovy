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

//*******************************************************//
//****************** SelectCaseToReassign ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 2nd of March, 2020 ************//
//*** Purpose: To click on reassign case button ********************************//
//*** Reviewer: Shayne Cardona ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Clicks the desired test data'
modifiedTaskDescription = WebUI.modifyObjectProperty(findTestObject('Objects.SelectCaseToReassign/taskDescription'), 'xpath', 
    'equals', ('(//a[@class = \'nova-action-pointer\'])[' + Index) + ']', true)

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(3000)

'Right clicks on the link in task description'
WebUI.rightClick(findTestObject('Objects.SelectCaseToReassign/taskDescription'))

'Clicks reassign case button'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/span_Re-assign Case'))

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(3000)

'Get case ref no.'
extractedCaseRefNo = WebUI.getText(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_CaseRefNo'))

'Transfer local variable to a global variable.'
GlobalVariable.CRN = extractedCaseRefNo

