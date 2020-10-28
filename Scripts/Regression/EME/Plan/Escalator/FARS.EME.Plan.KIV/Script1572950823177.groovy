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

'Filter out Process EME Plan Application cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Escalator'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

'Navigate to KIV LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'KIV'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Manipulate "on" expiry date fields.'
WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'on', ('noOfDays') : '12', ('periodType') : 'Working Day(s)'
        , ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

'Manipulate "in" expiry date fields.'
WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'in', ('noOfDays') : '3', ('periodType') : 'Calendar Day(s)'
        , ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/PopulateKIV'), [('followUpDesc') : 'Follow up desc test'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'KIV', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyCaseStatusInUniversalSearch'), [('caseTypeCaseStatus') : 'EME Plan Approval || KIV'
        , ('caseStatus') : 'CASE KIV'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyCaseStageFromUniversalSearch'), [('caseOptions') : 'View Case Stages', ('applicationType') : 'EME Plan Approval'
        , ('officer') : 'Michelle Gorczany', ('stageDesc') : 'Case Kiv', ('caseStat') : 'CASE KIV'], FailureHandling.STOP_ON_FAILURE)

'Switch to ISPS2 Main window.'
WebUI.callTestCase(findTestCase('Components/SwitchToMainISPS2Window'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

