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
import java.lang.String as String

'Login '
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Filter '
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process GMEB Design Application'], FailureHandling.STOP_ON_FAILURE)

'Select item in Task description\r\n'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 1, ('extractedCaseTypeFromGV') : 'Process GMEB Design Application'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 60], FailureHandling.STOP_ON_FAILURE)

'Copy case Reference number\r\n'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Common in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Admin in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Admin(Counter/Scanning)'], 
    FailureHandling.STOP_ON_FAILURE)

'Hover and Select Record/Update Payment in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Record/Update Payment'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Record/Update Payment'], FailureHandling.STOP_ON_FAILURE)

'Click Receord Update Payment menu\r\n'
WebUI.callTestCase(findTestCase('Components/ClickRecordUpdatePayment'), [:], FailureHandling.STOP_ON_FAILURE)

'Set Text on for Payment Group Module'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentGroup', ('textToBeInputted') : 'Green Mark EB Department'], 
    FailureHandling.STOP_ON_FAILURE)

'Enter set text\r\n'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentGroup'], 
    FailureHandling.STOP_ON_FAILURE)

'Set Text on for Payment Type'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentType', ('textToBeInputted') : 'Gmeb Fee'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Enter to select'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentType'], FailureHandling.STOP_ON_FAILURE)

'Input Case Reference number'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'refNo', ('textToBeInputted') : GlobalVariable.CRN], 
    FailureHandling.STOP_ON_FAILURE)

'Click search button\r\n'
WebUI.callTestCase(findTestCase('Components/ClickSearchButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Click latest history payment'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : GlobalVariable.CRN], FailureHandling.STOP_ON_FAILURE)

'Update payment date\r\n'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentDate', ('textToBeInputted') : '11/10/2020'], 
    FailureHandling.STOP_ON_FAILURE)

'Update payment Amount'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentAmt', ('textToBeInputted') : '8000'], 
    FailureHandling.STOP_ON_FAILURE)

'Update receipt number'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'receiptNo', ('textToBeInputted') : '40'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

'Update receipt date'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'receiptDate', ('textToBeInputted') : '11/10/2020'], 
    FailureHandling.STOP_ON_FAILURE)

'Clear text on payment mode'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode'], 
    FailureHandling.STOP_ON_FAILURE)

'Update payment mode'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode', ('textToBeInputted') : 'Cash'], 
    FailureHandling.STOP_ON_FAILURE)

'Click enter  to select payment mode'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode'], FailureHandling.STOP_ON_FAILURE)

'Save update info.'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

'Higllight successful message'
WebUI.callTestCase(findTestCase('Components/HighlightSuccessfulMsg'), [('tagname') : '*', ('SuccessfulMsg') : 'Successfully Saved!'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify successful message is present'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Modify  object xpath to locate data in web table and copy to a global variable'
WebUI.callTestCase(findTestCase('Components/ModifyObjectXpath'), [('index') : '5', ('text') : 'Receipt Number'], FailureHandling.STOP_ON_FAILURE)

'Get text from text field'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentAmt'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextMatch'), [('actualText1') : GlobalVariable.textFrXpath, ('expectedText1') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10], FailureHandling.STOP_ON_FAILURE)

'Logout from website'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

