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

'Login.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 21)
        , ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open Process Case (PSI-TOPCSC) case.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (PSI-TOPCSC)'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '1', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Process PSI-TOP/CSC Details LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Process PSI-TOP/CSC Details'], FailureHandling.STOP_ON_FAILURE)

