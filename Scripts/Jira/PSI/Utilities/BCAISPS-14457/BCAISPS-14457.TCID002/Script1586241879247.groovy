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
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 21)
        , ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open process permit application.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (PSI-TOPCSC)'], FailureHandling.STOP_ON_FAILURE)

'Open specific test data.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : GlobalVariable.caseType, ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Process PSI-TOP/CSC Details'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'TOP-CSC BUILDING ADDRESS', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that page is loaded successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'span', ('textToModify') : 'TOP-CSC BUILDING ADDRESS'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that page is loaded successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : '7 ARMENIAN STREET'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/GetTextUsingTagClassAndIndex'), [('classToUse') : 'x-grid-cell x-grid-td x-grid-cell-gridcolumn-1822'
        , ('tagToUse') : 'td', ('indexToUse') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'PSI'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Create Case Utility Search'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Create Case Utility Search'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'NovaComboBox-1948-inputEl'
        , ('textToBeInputted') : 'Periodical Structural Inspection (SM)'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'roadId', ('textToBeInputted') : 'ARMENIAN STREET (ARS01Q)'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Retrieve Groups', ('Index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'BG 2006-06-01633'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add Existing Building to the Group'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'hsBlkNo', ('textToBeInputted') : '7'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'roadId', ('textToBeInputted') : 'ARMENIAN STREET (ARS01Q)'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : ' SFG 2017-09-20486'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify that page is loaded successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'label', ('textToModify') : 'Yes'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that page is loaded successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'label', ('textToModify') : 'Formatted'], 
    FailureHandling.STOP_ON_FAILURE)

