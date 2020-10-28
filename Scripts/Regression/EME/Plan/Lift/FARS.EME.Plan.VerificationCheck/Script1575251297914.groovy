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
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Verification Check\' LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Verification Check'], FailureHandling.STOP_ON_FAILURE)

'Get CRM of the chosen case.'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the first link \'Developer is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyDeveloperIsChanged'), [('remarks') : 'Verification Check - Developer Is Changed'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the link \'QP (Installation) is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyQPIsChanged'), [('link') : 'QP(Installation) is changed', ('qpLHS') : 'Qualified Person (Installation)'
        , ('qpName') : 'Testing Nam', ('remarks') : 'Verification Check - QP(Installation) Is Changed'], FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the link \'QP (Submission) is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyQPIsChanged'), [('link') : 'QP(Submission) is changed', ('qpLHS') : 'Qualified Person (Submission)'
        , ('qpName') : 'Testing Nam', ('remarks') : 'Verification Check - QP(Submission) Is Changed'], FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the link \'QP (Testing) is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyQPIsChanged'), [('link') : 'QP(Testing) is changed', ('qpLHS') : 'Qualified Person (Testing)'
        , ('qpName') : 'Testing Nam', ('remarks') : 'Verification Check - QP(Testing) Is Changed'], FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the link \'Check Plan Fees\'.'
WebUI.callTestCase(findTestCase('Components/ManipulateCheckPlanFeesDeclaration'), [('link') : 'Check Plan Fees declaration ?'], 
    FailureHandling.STOP_ON_FAILURE)

'After successful changes, navigate back to \'Check Plan Fees\' page.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Check Plan Fees declaration ?'], FailureHandling.STOP_ON_FAILURE)

'Navigate the user back to the homepage. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

