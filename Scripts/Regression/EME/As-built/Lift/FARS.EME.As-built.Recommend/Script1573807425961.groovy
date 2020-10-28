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

'Login.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 17), ('Password') : findTestData(
            'Datatable').getValue('Password', 18)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME AS-built Submission cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME AS-built Submission'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME AS-built Submission case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Recommend LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Populate recommend lhs'
WebUI.callTestCase(findTestCase('Components/PopulateRecommendAssignLHS'), [('recommendStatus') : 'Recommend Approval', ('recommendToModule') : 'EME'
        , ('remarks') : 'Populate recommend lhs testing.', ('recommendToOfficer') : 'Jordan Vandervort III'], FailureHandling.STOP_ON_FAILURE)

'Click reset button'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populate recommend screen'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateRecommendAssignLHS'), [('recommendStatus') : 'Recommend Approval'
        , ('recommendToModule') : 'EME', ('remarks') : 'Populate recommend lhs testing.', ('recommendToOfficer') : 'emetester1'], 
    FailureHandling.STOP_ON_FAILURE)

'Click submit button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Submit', ('Index') : 5], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Log in.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : 'jordi44', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Verify the recommended case is in the tray of the officer'
WebUI.callTestCase(findTestCase('Components/CaseReassignedIsInTray'), [('taskDescription') : 'Process EME As-built Recommendation'], 
    FailureHandling.STOP_ON_FAILURE)

'Universal search'
WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Verify the oic was updated in the universal search'
WebUI.callTestCase(findTestCase('Components/VerifyOICinUniversalSearch'), [('oic') : 'Jordan Vandervort III'], FailureHandling.STOP_ON_FAILURE)

'Verify case stage status'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStageFromUniversalSearch'), [('caseOptions') : 'View Case Stages', ('applicationType') : 'EME As-Built Application'
        , ('officer') : 'Jordan Vandervort III', ('stageDesc') : '', ('caseStat') : ''], FailureHandling.STOP_ON_FAILURE)

'Switch to ISPS2 Main window.'
WebUI.callTestCase(findTestCase('Components/SwitchToMainISPS2Window'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

