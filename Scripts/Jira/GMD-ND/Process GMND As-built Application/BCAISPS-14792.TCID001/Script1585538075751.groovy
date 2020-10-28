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
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open process GMND As-built Application.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process GMND As-built Application'], FailureHandling.STOP_ON_FAILURE)

'Click the first case.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process GMND As-built Application'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Submission Details.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Submission Details'], FailureHandling.STOP_ON_FAILURE)

'Verify that Submission Details is loaded successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Submission Details'], FailureHandling.STOP_ON_FAILURE)

'Scroll to Submission Checklist screen.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Submission Checklist (Documentary Evidences)'
        , ('tagToBeUsed') : 'div'], FailureHandling.STOP_ON_FAILURE)

'Unselect checkbox.'
WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : '7'], FailureHandling.STOP_ON_FAILURE)

'Unselect checkbox.'
WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : '8'], FailureHandling.STOP_ON_FAILURE)

'Save fields.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Scroll page up.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Please fill up mandatory fields.', ('tagToBeUsed') : 'li'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify error message.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'li', ('textToModify') : 'Please fill up mandatory fields.'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

