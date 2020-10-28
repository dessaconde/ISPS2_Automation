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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Log in.\r\n'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search for Process Submission Quality Points.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Temporary Building Permit'], FailureHandling.STOP_ON_FAILURE)

'Select a case from the filtered case type.'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '1', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the selected/opened case matches the required case type.'
WebUI.callTestCase(findTestCase('Components/VerifySelectedCaseMatchesRequiredCaseType'), [('requiredCaseType') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Verification Check'], FailureHandling.STOP_ON_FAILURE)

'Click specified link.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Check Plan Fees declaration ?'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/GetTextOfDivInVerificationCheckAndStoreInAGlobalVar'), [('Index') : '173'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifySpecifiedLHSIsPresentInThePage'), [('LHS') : 'Verification Check'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifySpecifiedLHSIsPresentInThePage'), [('LHS') : 'Verification Check', ('extractedCaseTypeFromGV') : GlobalVariable.caseType
        , ('Index') : 0, ('caseRefNo') : GlobalVariable.CRN, ('taskDescription') : 'Process BP Application'], FailureHandling.STOP_ON_FAILURE)

