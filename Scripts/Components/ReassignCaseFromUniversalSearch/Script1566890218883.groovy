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

Thread.sleep(3000)

WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/span_Re-assign Case'))

WebUI.verifyElementVisible(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign Case'))

WebUI.setText(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/input__Assign To Officer'), findTestData('Datatable').getValue(
        'AssignToOfficer', 1))

WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/div_Reassign'))

Thread.sleep(3000)

WebUI.verifyElementVisible(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_CaseReassignedSuccessfully'))

WebUI.click(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/XPI_OK'))

