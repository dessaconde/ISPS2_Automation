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

//Pre-req: Open a Process Waiver Application case with "GMW" initials in the Submission No
'Login.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 3), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open process waiver application.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Open specific test data.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : GlobalVariable.caseType, ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that Summary screen is loaded succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Verify that Main Form screen is loaded succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Change the number of residential unit to 10.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'wapMtgDt', ('textToBeInputted') : '29/06/2020'], 
    FailureHandling.STOP_ON_FAILURE)

'Get the field stored.'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'wapMtgDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Save changes.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Summary.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Scroll down.'
not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'No of Residential Units:', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Wait 5 seconds.'
not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/GetTextAndStoreToAGlobalVariable'), [('nameToBeUsed') : 'wapMtgDt', ('tagToBeUsed') : 'input'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextMatch'), [('actualText1') : GlobalVariable.inputFieldText, ('expectedText1') : GlobalVariable.CopiedValue], 
    FailureHandling.STOP_ON_FAILURE)

'Wait 5 seconds.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 3)], FailureHandling.STOP_ON_FAILURE)

