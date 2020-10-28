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

'Filter out \'Process EME Waiver Application\' cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Verification Check\' LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Verification Check'], FailureHandling.STOP_ON_FAILURE)

'Get CRM of the chosen case.'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the first link \'Developer is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyDeveloperIsChanged'), [('remarks') : 'Verification Check - Developer Is Changed'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate and verify the link \'QP is Changed?\'.'
WebUI.callTestCase(findTestCase('Components/VerifyQPIsChanged'), [('link') : 'QP is changed', ('qpLHS') : 'Qualified Person'
        , ('qpName') : 'SOON LAY KIA', ('remarks') : 'Verification Check - QP(Installation) Is Changed'], FailureHandling.STOP_ON_FAILURE)

'Navigate inside of \'Waiver Fee\'.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Waiver Fee'], FailureHandling.STOP_ON_FAILURE)

'Click the \'Save\' button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Navigate inside of \'Waiver Fee\'.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Waiver Fee'], FailureHandling.STOP_ON_FAILURE)

'Manipulates \'Waiver Fee\'.'
WebUI.callTestCase(findTestCase('Components/PopulateRemarksAndTickNoActionRequired'), [('Remarks') : '\'Remarks\' field autopopulate test.'], 
    FailureHandling.STOP_ON_FAILURE)

'Click the \'Save\' button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify remarks present in page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.Remarks], FailureHandling.STOP_ON_FAILURE)

'Navigate the user back to the homepage. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

