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

/*===========================================================================================*
 * TESTER: Krizia Manuel                                             						*
 * CREATE DATE: 5/8/2020                                        							*
 * PURPOSE: This is to verify the precision and scale of Update Reports LHS  				*
 * ===========================================================================================*
 */
'Login.'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue(
            'URL', 2), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 2), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SM.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Update Reports LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Update Reports'], FailureHandling.STOP_ON_FAILURE)

'Verify that the Update Reports screen is successfully loade'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Update Reports'], FailureHandling.STOP_ON_FAILURE)

'Click on Add button'
WebUI.callTestCase(findTestCase('Components/ClickAddButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify that the input field is a required field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'dFormCode'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the input field is a required field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'rptRecvDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the input field is a required field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'rptTypeCode'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the input field is a required field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'rptComplyDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the input field is a required field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'submitBy'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values of D Form column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'dFormCode'
        , ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'DForm', ('NoOfVal') : 5
        , ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select a specific date in Date Picker of Report Receive Date column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'rptRecvDt', ('SelectCurrentDay') : '19', ('index') : 5], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'rptRecvDt'
        , ('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values of Report Type column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'rptTypeCode'
        , ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'ReportType'
        , ('NoOfVal') : 8, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select a specific date in Date Picker of Report Compliance Date column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'rptComplyDt', ('SelectCurrentDay') : '15', ('index') : 6], FailureHandling.STOP_ON_FAILURE)

'Click on Today button in Date Picker'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/SelectTodayInDatePicker'), [('FldNm') : 'rptComplyDt'
        , ('index') : '6'], FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values of Submit By (PE) column'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'submitBy'
        , ('CallTCName') : 'PFI Precision and Scale/PFI Components/PELists', ('cmbNm') : 'PENo', ('NoOfVal') : 10, ('DelayTime') : 0
        , ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Verify that Report Description column accepts Alphanumeric and Special Characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'rptDesc'
        , ('LenChar') : 15], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum length for Report Description column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'rptDesc'
        , ('MaxCharLen') : 4008], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

