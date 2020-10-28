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

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMB)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMB.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SMB)', ('index') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Status LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

'Scroll page down.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'LIST OF BLOCKS ASSIGNED TO PE', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the text.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'LIST OF BLOCKS ASSIGNED TO PE'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate input field.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'NovaCodeComboBox-1935-inputEl'
        , ('textToBeInputted') : '\'T3\''], FailureHandling.STOP_ON_FAILURE)

'Click Set.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Set', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify pop-up message text.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Please Select records first!'], 
    FailureHandling.STOP_ON_FAILURE)

'Click OK.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'OK', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Click to Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Scroll to error message.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Nothing to save', ('tagToBeUsed') : 'li'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the error message.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'li', ('textToModify') : 'Nothing to save'], 
    FailureHandling.STOP_ON_FAILURE)

'Reload the Web page.'
WebUI.callTestCase(findTestCase('Components/RefreshPage'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Submission Details.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

'Scroll page down.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'LIST OF BLOCKS ASSIGNED TO PE', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the text.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'LIST OF BLOCKS ASSIGNED TO PE'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Set.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Set', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Highlight the pop-up message.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Please select status!'], 
    FailureHandling.STOP_ON_FAILURE)

'Click OK.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'OK', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Click to Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Scroll to error message.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Nothing to save', ('tagToBeUsed') : 'li'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the error message.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'li', ('textToModify') : 'Nothing to save'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

