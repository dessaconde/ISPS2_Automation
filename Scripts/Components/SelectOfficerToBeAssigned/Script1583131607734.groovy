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
//****************** SelectOfficerToBeAssigned ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 2nd of March, 2020 ************//
//*** Purpose: To select a certain officer ********************************//
//*** Reviewer: Shayne Cardona ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Highlights the Reassign Case window'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign Case'))

'Clicks on the assign to officer field'
WebUI.click(findTestObject('Objects.SelectOfficerToBeAssigned/AssignToOfficerField'))

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(3000)

'Input desired text in the field'
WebUI.setText(findTestObject('Objects.SelectOfficerToBeAssigned/Page_ISPS2/input__officerInCharge'), officer)

'Click reassign button'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign'))

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(3000)

'Clikc OK.'
WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_OK'))

