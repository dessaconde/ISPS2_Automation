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

'Login from ISPS2.'
WebUI.callTestCase(findTestCase('Components/Login'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 22), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 22), ('Username') : findTestData('Datatable').getValue('Username', 22), ('Password') : findTestData(
            'Datatable').getValue('Password', 22)], FailureHandling.STOP_ON_FAILURE)

'Open HomePage Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to Utilities.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to PFI.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'PFI'], FailureHandling.STOP_ON_FAILURE)

'Hover to Merge Building Groups'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Merge Building Groups'], FailureHandling.STOP_ON_FAILURE)

'Click Merge Building Groups'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Merge Building Groups'], FailureHandling.STOP_ON_FAILURE)

'Verify First Informational Message is present on page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'All references under Group Building ID 2 will be filed under Group Building ID 1 after the merge'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify First Informational Message is present on page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Building group with Group Building ID 2 will be deleted after the merge.'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Group Building ID 1 '
        , ('index') : '1', ('PFIUtil') : 'MergeBldg'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Group Building ID 2 '
        , ('index') : '1', ('PFIUtil') : 'MergeBldg'], FailureHandling.STOP_ON_FAILURE)

'Validate 1st field accepts Alpha Numeric and Special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'grpPlanRef1'
        , ('LenChar') : 20], FailureHandling.STOP_ON_FAILURE)

'Validate 1st field accepts Alpha Numeric and Special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'grpPlanRef2'
        , ('LenChar') : 20], FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Input on the 1st field'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpPlanRef1'
        , ('textToBeInputted') : 'BldgID1'], FailureHandling.STOP_ON_FAILURE)

'Click Merge Group'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Merge Groups', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify Error message appeared on  page'
WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify Error message in not present on the page'
WebUI.callTestCase(findTestCase('Components/VerifyErrMsgNotPresent'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Input on the 2nd field'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpPlanRef2'
        , ('textToBeInputted') : 'BldgID2'], FailureHandling.STOP_ON_FAILURE)

'Click Merge Group'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Merge Groups', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify Error message appeared on  page'
WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Verify Error message in not present on the page'
WebUI.callTestCase(findTestCase('Components/VerifyErrMsgNotPresent'), [:], FailureHandling.STOP_ON_FAILURE)

'Input 100 random characters on the 1st field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'grpPlanRef1'
        , ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Input 100 random characters on the 2nd field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'grpPlanRef2'
        , ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Input Text on the 1st field'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpPlanRef1'
        , ('textToBeInputted') : 'SameText'], FailureHandling.STOP_ON_FAILURE)

'Input Text on the 2nd field same as the 1st field'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpPlanRef2'
        , ('textToBeInputted') : 'SameText'], FailureHandling.STOP_ON_FAILURE)

'Get Text from the 1st input field'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'grpPlanRef1'], 
    FailureHandling.STOP_ON_FAILURE)

'Get Text from the 2nd input field'
WebUI.callTestCase(findTestCase('Components/GetTextAndStoreToAGlobalVariable'), [('nameToBeUsed') : 'grpPlanRef2', ('tagToBeUsed') : '*'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Merge Group'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Merge Groups', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify Text of 2 fields is the same'
WebUI.callTestCase(findTestCase('Components/VerifyTextMatch'), [('actualText1') : GlobalVariable.CopiedValue, ('expectedText1') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

'Verify error message that the Building Group Ids should not be equal'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MergeBldgGrpErrorMessage'), [('index') : '13'], 
    FailureHandling.STOP_ON_FAILURE)

'Delete 1st Input field text'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'grpPlanRef1'], 
    FailureHandling.STOP_ON_FAILURE)

'Delete 2nd Input field text'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'grpPlanRef2'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify field is required'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'grpPlanRef1'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify field is required'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'grpPlanRef2'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : ''], FailureHandling.STOP_ON_FAILURE)

