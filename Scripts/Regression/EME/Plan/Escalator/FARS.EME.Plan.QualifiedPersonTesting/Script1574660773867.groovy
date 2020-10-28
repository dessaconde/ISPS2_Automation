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

'Navigate to Qualified Person (Testing) LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Qualified Person (Testing)'], FailureHandling.STOP_ON_FAILURE)

'Verify if there is an existing record.'
WebUI.callTestCase(findTestCase('Components/VerifyQualifiedPersonExists'), [:], FailureHandling.STOP_ON_FAILURE)

'Click add.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Add qualified person.'
WebUI.callTestCase(findTestCase('Components/AddQualifiedPerson'), [('qpName') : 'Testing Name'], FailureHandling.STOP_ON_FAILURE)

'Click reset.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/AddQualifiedPerson'), [('qpName') : 'Testing Nam'], FailureHandling.STOP_ON_FAILURE)

'Click cancel.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click add.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/AddQualifiedPerson'), [('qpName') : 'TAN BOON NGE'], FailureHandling.STOP_ON_FAILURE)

'Click save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify record was saved successful.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the existence of the added qp.'
WebUI.callTestCase(findTestCase('Components/VerifyQualifiedPersonV2'), [('qpSecInSummary') : 'QUALIFIED PERSON FOR SUBMISSION OF THE PLANS FOR LIFT WORKS'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Qualified Person (Testing) LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Qualified Person (Testing)'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/EditDeleteQualifiedPerson'), [('qpNameToDelete') : 'TAN BOON NGE'], FailureHandling.STOP_ON_FAILURE)

'Click add.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/AddQualifiedPerson'), [('qpName') : 'Testing Nam'], FailureHandling.STOP_ON_FAILURE)

'Click save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify record was saved successful.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

