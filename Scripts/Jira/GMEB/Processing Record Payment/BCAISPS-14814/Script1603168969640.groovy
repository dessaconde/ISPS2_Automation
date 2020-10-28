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

'Login '
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Filter '
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process GM OSE Application'], FailureHandling.STOP_ON_FAILURE)

'Select item in Task description\r\n'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 1, ('extractedCaseTypeFromGV') : 'Process GM OSE Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Wait '
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10], FailureHandling.STOP_ON_FAILURE)

'Copy case reference number to a global variable\r\n'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [:], FailureHandling.STOP_ON_FAILURE)

'Copy case submission number to a global variable\r\n'
WebUI.callTestCase(findTestCase('Components/GetSubmissionNo'), [:], FailureHandling.STOP_ON_FAILURE)

'Click issue Disapproval menu'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Disapproval'], FailureHandling.STOP_ON_FAILURE)

'Click Generate button to Generate letter'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithIndex'), [('Button') : 'Generate', ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Click commit and dispatch to save '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Filter '
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process GM OSE Application'], FailureHandling.STOP_ON_FAILURE)

'Verify case issued disapproval diappearedin mytask list'
WebUI.callTestCase(findTestCase('Components/VerifyCaseNotPresentInMyTask'), [:], FailureHandling.STOP_ON_FAILURE)

'Search submission umber using universal search'
WebUI.callTestCase(findTestCase('Components/UniversalSearchSubmissionNo'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify case status in universal search case details'
WebUI.callTestCase(findTestCase('Components/VerifyCaseDetailsInUniversalSearch'), [('index') : '1', ('ftag') : 'font', ('atag') : 'font'
        , ('Status') : 'Closed', ('CaseRefNo') : GlobalVariable.CRN, ('text') : 'Status:'], FailureHandling.STOP_ON_FAILURE)

'Logout'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

