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

/*=======================================================================*
 * TESTER: Rhodessa Conde                                                *
 * CREATE DATE: 29-Apr-2020                                              *
 * PURPOSE: This is to verify the precision and scale of EOT Request LHS *
 * ======================================================================*
 */
'Login in ISPS2'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 1)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 1), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Search for Process Case (SM)'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click on Process Case (SM) Link'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)', ('index') : 7], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the default screen is successfully loaded'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Click on EOT Request LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'EOT Request'], FailureHandling.STOP_ON_FAILURE)

'Verify that \'Extension of Time Request\' screen is successfully loaded'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Extension of Time Request'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight EOT Type label'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'EOT Type *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight EOT Type input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'eotTypeCmb'], FailureHandling.STOP_ON_FAILURE)

'Verify the values in dropdown field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'eotTypeCmb'
        , ('index') : 0, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'eotType'
        , ('NoOfVal') : 5, ('DelayTime') : 3, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Higlight EOT From Date field'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'EOT From Date *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight EOT From Date input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'eotFromDate'], FailureHandling.STOP_ON_FAILURE)

'Select any day from the EOT From Date picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectDayInDatePicker'), [('FldNm') : 'eotFromDate'
        , ('SelectDay') : 'June 08'], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT From Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'eotFromDate'
        , ('minLen') : 11, ('index') : 0], FailureHandling.STOP_ON_FAILURE)

'Verify that a Start Time error message is displayed when an invalid date is entered in EOT From Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/StartTimeError'), [('FldNm') : 'eotFromDate', ('index') : 0], 
    FailureHandling.STOP_ON_FAILURE)

'Click on Today button in EOT From Date picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'eotFromDate'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Highlight EOT To Date label'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'EOT To Date *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight EOT To Date input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'eotToDate'], FailureHandling.STOP_ON_FAILURE)

'Select any day from the EOT To Date picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'eotToDate', ('SelectCurrentDay') : '15', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT To Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'eotToDate'
        , ('minLen') : 11, ('index') : 0], FailureHandling.STOP_ON_FAILURE)

'Verify that a Start Time error message is displayed when an invalid date is entered in EOT To Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/StartTimeError'), [('FldNm') : 'eotToDate', ('index') : 0], 
    FailureHandling.STOP_ON_FAILURE)

'Click on Today button in EOT To Date picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'eotToDate'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Verify that a past date error will display in EOT To Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/PastDateAfterError'), [('FldNm') : 'eotToDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the past date error will displayed in EOT From Date field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/PastDateBeforeError'), [('FldNm') : 'eotFromDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Approving Officer field'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Approve Officer *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight Approving Officer input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'approveOfficerCmb'], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'approveOfficerCmb'
        , ('index') : 0, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 24
        , ('DelayTime') : 2, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Remove all the values in Approving Officer field'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'approveOfficerCmb'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the Approving Offier field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'approveOfficerCmb'
        , ('index') : 0], FailureHandling.STOP_ON_FAILURE)

'Highlight the Remarks label'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Remarks *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight the Remarks input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'remarks'], FailureHandling.STOP_ON_FAILURE)

'Verify that the Remarks field accepts alphanumeric and special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'remarks'
        , ('LenChar') : 10, ('index') : 0], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum allowable character that can be entered in Remarks field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'remarks'
        , ('index') : 0, ('MaxCharLen') : 4003], FailureHandling.STOP_ON_FAILURE)

'Remove the values in EOT Type field'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'eotTypeCmb'], 
    FailureHandling.STOP_ON_FAILURE)

'Remove the values in EOT From Date field'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'eotFromDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Remove the values in EOT To Date field'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'eotToDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Remove the values in Reamrks field'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'remarks'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the EOT Type field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'eotTypeCmb'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the EOT From Date field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'eotFromDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the EOT From To field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'eotToDate'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the Remarks field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'remarks'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

