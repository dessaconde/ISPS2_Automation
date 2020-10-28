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
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Waiver Application cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Pre-Submission Consultation Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Letter LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Letter'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Manipulate "on" expiry date fields.'
WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'on', ('noOfDays') : '12', ('periodType') : 'Working Day(s)'
        , ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

'Manipulate "in" expiry date fields.'
WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'in', ('noOfDays') : '3', ('periodType') : 'Calendar Day(s)'
        , ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

'Manipulate type of letter'
WebUI.callTestCase(findTestCase('Components/ManipulateTypeOfLetterV3'), [('generatedletterContains') : 'EME0155A', ('letterToGenerateContains') : 'EME0155A'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate attach external documents'
WebUI.callTestCase(findTestCase('Components/ManipulateAttachExternalDocument'), [:], FailureHandling.STOP_ON_FAILURE)

'Manipulate recipients'
WebUI.callTestCase(findTestCase('Components/ManipulateRecipients'), [('addedEmailAddress') : 'automation1@testing.com', ('inputRecipient') : 'HDBCS'
        , ('addedEmailAddressCC') : 'automation2@testing.com', ('inputRecipientCC') : 'Singapore Land Authority'], FailureHandling.STOP_ON_FAILURE)

'Click Save as draft.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save as Draft', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the decision was saved as draft succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Summary LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Verify the the saved information are still displayed.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Letter'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Click Commit and Dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Search case in the Universal Search.'
WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the case status is correct in the universal search.'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStatusInUniversalSearch'), [('caseTypeCaseStatus') : 'EME Process Waiver || CLOSED'
        , ('caseStatus') : 'WAIVER LETTER ISSUED'], FailureHandling.STOP_ON_FAILURE)

'Universal Search'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStageFromUniversalSearch'), [('caseOptions') : 'View Case Stages', ('applicationType') : 'EME Process Waiver'
        , ('officer') : 'Michelle Gorczany', ('stageDesc') : 'Waiver Letter Issued', ('caseStat') : 'WAIVER LETTER ISSUED'], 
    FailureHandling.STOP_ON_FAILURE)

'Switch to Main ISPS2 window.'
WebUI.callTestCase(findTestCase('Components/SwitchToMainISPS2Window'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

