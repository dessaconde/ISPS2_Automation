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
 * CREATE DATE: 28-Apr-2020                                              *
 * PURPOSE: This is to verify the precision and scale of EOT Request LHS *
 * =======================================================================*
 */
'Login in ISPS2'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 16), ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Search for Process Case (SM)'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click the Process Case (SM) Link'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Click the D2 Forms LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'D2 Forms (Second Stage)'], FailureHandling.STOP_ON_FAILURE)

'Verify that the D Forms (Second Stage) screen is successfully loaded'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'D Forms (Second Stage)'], FailureHandling.STOP_ON_FAILURE)

'Click on Submit button'
WebUI.callTestCase(findTestCase('Components/ClickSubmitButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify that the field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'd2RecvDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'd2ComplDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'd2aRecvDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'd2aComplDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'peRegNbr'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight label name: Inspection D2 Receive Date'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Inspection D2 Receive Date *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight the input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'd2RecvDt'], FailureHandling.STOP_ON_FAILURE)

'Verify that the input date field only accepts numeric values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'd2RecvDt'
        , ('minLen') : 5], FailureHandling.STOP_ON_FAILURE)

'Verify the tooltip error is displayed when the input value is invalid'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/InvalidDateErrorValidation'), [('FldNm') : 'd2RecvDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Select a specific day in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'd2RecvDt', ('SelectCurrentDay') : '11', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'd2RecvDt'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Highlight label name: Inspection D2 Compliance Date'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Inspection D2 Compliance Date *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight the input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'd2ComplDt'], FailureHandling.STOP_ON_FAILURE)

'Verify that the input date field only accepts numeric values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'd2ComplDt'
        , ('minLen') : 6], FailureHandling.STOP_ON_FAILURE)

'Verify the tooltip error is displayed when the input value is invalid'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/InvalidDateErrorValidation'), [('FldNm') : 'd2ComplDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Select a specific day in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'd2ComplDt', ('SelectCurrentDay') : '15', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'd2ComplDt'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Highlight label name: Inspection D2a Receive Date'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Inspection D2a Receive Date *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight the input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'd2aRecvDt'], FailureHandling.STOP_ON_FAILURE)

'Verify that the input date field only accepts numeric values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'd2aRecvDt'
        , ('minLen') : 8], FailureHandling.STOP_ON_FAILURE)

'Verify the tooltip error is displayed when the input value is invalid'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/InvalidDateErrorValidation'), [('FldNm') : 'd2aRecvDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Select a specific day in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'd2aRecvDt', ('SelectCurrentDay') : '21', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'd2aRecvDt'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight label name: Inspection D2a Compliance Date'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Inspection D2a Compliance Date *:'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'd2aComplDt'], FailureHandling.STOP_ON_FAILURE)

'Verify that the input date field only accepts numeric values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'd2aComplDt'
        , ('minLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Verify the tooltip error is displayed when the input value is invalid'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/InvalidDateErrorValidation'), [('FldNm') : 'd2aComplDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Select a specific day in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'd2aComplDt', ('SelectCurrentDay') : '9', ('index') : 7], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'd2aComplDt'
        , ('index') : 4], FailureHandling.STOP_ON_FAILURE)

'Highlight label name: PE Reference No'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'PE Reference No *:'], FailureHandling.STOP_ON_FAILURE)

'Highlight the input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'peRegNbr'], FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peRegNbr', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PELists'
        , ('cmbNm') : 'PENo', ('NoOfVal') : 10, ('DelayTime') : 5, ('EnterValue') : '0016'], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

