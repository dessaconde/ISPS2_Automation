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

'Navigate to Issue Disapproval LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Disapproval'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Populate remarks and expiry date.'
WebUI.callTestCase(findTestCase('Components/PopulateIssueDisapproval'), [('expDate') : '05/11/2020', ('remarks') : 'Populate Issue Disapproval remarks test.'], 
    FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Manipulate type of letter.'
WebUI.callTestCase(findTestCase('Components/ManipulateTypeOfLetterV3'), [('generatedletterContains') : 'EME06500', ('letterToGenerateContains') : 'EME06500'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate attach external docs.'
WebUI.callTestCase(findTestCase('Components/ManipulateAttachExternalDocument'), [:], FailureHandling.STOP_ON_FAILURE)

'Manipulate recipients.'
WebUI.callTestCase(findTestCase('Components/ManipulateRecipients'), [('addedEmailAddress') : 'automation1@testing.com', ('inputRecipient') : 'Energy Market Authority'
        , ('addedEmailAddressCC') : 'automation2@testing.com', ('inputRecipientCC') : 'Singapore Land Authority'], FailureHandling.STOP_ON_FAILURE)

'Save decision as draft.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save as Draft', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Navigate to summary.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'2 seconds hard wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Disapproval LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Disapproval'], FailureHandling.STOP_ON_FAILURE)

'Click commit and dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Universal search.'
WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify case status'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStatusInUniversalSearch'), [('caseTypeCaseStatus') : 'EME As-Built Application || CLOSED'
        , ('caseStatus') : 'EME DISAPPROVED'], FailureHandling.STOP_ON_FAILURE)

'Verify case stage'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStageFromUniversalSearch'), [('caseOptions') : 'View Case Stages', ('applicationType') : 'EME As-Built Application'
        , ('officer') : 'Elijah Kovacek', ('stageDesc') : 'EME Disapproved', ('caseStat') : 'EME DISAPPROVED'], FailureHandling.STOP_ON_FAILURE)

'Switch to ISPS2 Main window.'
WebUI.callTestCase(findTestCase('Components/SwitchToMainISPS2Window'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

