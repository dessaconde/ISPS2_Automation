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

'Login '
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Common in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Admin in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Admin(Counter/Scanning)'], 
    FailureHandling.STOP_ON_FAILURE)

'Hover and Select Record/Update n menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Record/Update Bldg Plan Fee'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Record/Update Bldg Plan Fee'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Record/Update Bldg Plan Fee'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnFieldXpath'), [('NameToBeModified') : 'NovaTextField', ('EnterText') : 'A1720-00005-2014-BP01-54640'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Click Search'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Click Insert Icon to enter Payment details'
WebUI.callTestCase(findTestCase('Components/ClickInsertIcon'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter Payment Amount'
WebUI.callTestCase(findTestCase('Components/SelectAllThenSetText'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.paymentAmt'
        , ('textToBeInputted') : '8500'], FailureHandling.STOP_ON_FAILURE)

'Enter Payment Type'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.paymentType'
        , ('textToBeInputted') : 'Modifications or waiver applications'], FailureHandling.STOP_ON_FAILURE)

'Input Payment Mode'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.paymentMode'
        , ('textToBeInputted') : 'Cash Car'], FailureHandling.STOP_ON_FAILURE)

'Click Enter to set Payment Mode\r\n'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.paymentMode'], 
    FailureHandling.STOP_ON_FAILURE)

'Enter Receipt Number'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.receiptNo'
        , ('textToBeInputted') : '0123456789'], FailureHandling.STOP_ON_FAILURE)

'Enter Receipt Date\r\n'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.receiptDt'
        , ('textToBeInputted') : '21/10/2020'], FailureHandling.STOP_ON_FAILURE)

'Enter Project Category\r\n'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'planFeeBean.projCategoryCd'
        , ('textToBeInputted') : 'All Other Works'], FailureHandling.STOP_ON_FAILURE)

'Click Save Button'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Get payment Date Saved on the Updated Table'
WebUI.callTestCase(findTestCase('Components/ModifyObjectXpath'), [('text') : 'Payment Status', ('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Desktop in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select My Tasks in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Click My Tasks Menu\r\n'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Click Filter  and set task description\r\n'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Enter Case Reference Number'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'searchCriteriaPojo.caseRefNo'
        , ('textToBeInputted') : 'A1720-00005-2014-BP01-54640'], FailureHandling.STOP_ON_FAILURE)

'Click Search\r\n'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtons'), [('buttonText') : 'Search'], FailureHandling.STOP_ON_FAILURE)

'Select item in Task description\r\n'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 1, ('extractedCaseTypeFromGV') : 'Process Waiver Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Verification check'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : '*', ('linkName') : 'Verification Check'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Click Waiver Fee'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : '*', ('linkName') : 'Waiver Fee'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Tick Checkbox for the newly added payment'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : '9'], FailureHandling.STOP_ON_FAILURE)

'Verify that the Payment date on the new payment for waiver fee is same as the payment date set'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : GlobalVariable.textFrXpath, ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Logout'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : ''], FailureHandling.STOP_ON_FAILURE)

