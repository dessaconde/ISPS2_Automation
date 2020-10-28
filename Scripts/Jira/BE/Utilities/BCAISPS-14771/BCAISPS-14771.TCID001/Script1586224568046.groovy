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
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Search Result', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Open homepage menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to utilities\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to permit.\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Permit'], FailureHandling.STOP_ON_FAILURE)

'Click record site insp.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Record Site Insp'], FailureHandling.STOP_ON_FAILURE)

'Click search.\r\n'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Select a proj.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Select', ('index') : '7'], 
    FailureHandling.STOP_ON_FAILURE)

'Get proj ref no.'
WebUI.callTestCase(findTestCase('Components/GetTextUsingTagClassAndIndex'), [('classToUse') : 'x-form-display-field x-form-display-field-default'
        , ('tagToUse') : 'div', ('indexToUse') : '24'], FailureHandling.STOP_ON_FAILURE)

'Navigate to issue wd.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue WD'], FailureHandling.STOP_ON_FAILURE)

'Click delete and regenerate button is present.\r\n'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete and Re-generate', ('Index') : '1'], 
    FailureHandling.OPTIONAL)

'Click commit and dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : '1'], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Verify that there must be an error message if \'commit and dispatched\' button is clicked in issue wd.'
WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to inspection details.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Inspection Details'], FailureHandling.STOP_ON_FAILURE)

'Navigate to issue wd.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue WD'], FailureHandling.STOP_ON_FAILURE)

'Click delete and regenerate button is present.\r\n'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete and Re-generate', ('Index') : '1'], 
    FailureHandling.OPTIONAL)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'NovaComboBox-2006-inputEl'
        , ('textToBeInputted') : '[BCBE-SIWDA]'], FailureHandling.STOP_ON_FAILURE)

'Send enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'NovaComboBox-2006-inputEl'], 
    FailureHandling.STOP_ON_FAILURE)

'Click commit and dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Generate', ('Index') : '1'], FailureHandling.CONTINUE_ON_FAILURE)

'Click commit and dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : '1'], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'projectRefNo'
        , ('textToBeInputted') : GlobalVariable.inputFieldText], FailureHandling.STOP_ON_FAILURE)

'Click search.\r\n'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Verify that it is unable to search.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No records found to display'], 
    FailureHandling.STOP_ON_FAILURE)

'Log Out'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

