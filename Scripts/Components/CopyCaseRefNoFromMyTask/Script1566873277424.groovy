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


//Component Name: CopyCaseRefNoFromMyTask
//Author: Shayne Cardona
//Purpose: To copy the case ref no of the case from the My Tasks


'3 seconds hard wait. '
Thread.sleep(3000)

not_run: WebUI.rightClick(findTestObject('Objects.ReassignCaseFromMyTask/Page_ISPS2/a_task description'))

not_run: WebUI.click(findTestObject('Objects.CopyCaseRefNoFromMyTask/span_Process Task'))

'3 seconds hard wait. '
Thread.sleep(3000)

'Get case ref no.'
extractedCaseRefNo = WebUI.getText(findTestObject('Objects.CopyCaseRefNoFromMyTask/a_case ref'))

'Transfer the copied case ref no into a global variable.'
GlobalVariable.CRN = extractedCaseRefNo

not_run: extractedSubmNo = WebUI.getText(findTestObject('Objects.CopyCaseRefNoFromMyTask/div_subm no'))

not_run: GlobalVariable.SN = extractedSubmNo

