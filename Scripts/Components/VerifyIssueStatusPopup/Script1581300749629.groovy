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
//****************** VerifyIssueStatusPopup ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 10th of February, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Verify that there is a pop up message '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyIssueStatusPopup/div_Issue Status'))

'Click OK'
WebUI.click(findTestObject('Objects.VerifyIssueStatusPopup/span_OK'))

