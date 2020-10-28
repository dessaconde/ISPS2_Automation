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

/*============================================================================*
 * COMPONENT NAME: PFIA.SiteAuditReportLHS 		    					  	  *
 * TESTER: Krizia Manuel                                    			      *
 * CREATE DATE: 10-June-2020                                 			      *
 * PURPOSE:This is to verify the precision and scale of Site Audit Report LHS *
 * ===========================================================================*
 */

'Login.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue('URL', 
            1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMA)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMA.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SMA)', ('index') : '3'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Status LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Site Audit Report'], FailureHandling.STOP_ON_FAILURE)

'Highlight text.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Site Audit Report'], FailureHandling.STOP_ON_FAILURE)

'Click link.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : '01 Jun 2020'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'inspDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'noOfBldg', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Click checkbox.'
WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Validates that it is a mandatory button.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredButtonValidation'), [('LblName') : 'Drawing Referred by PE '
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'officerId', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'officerId'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'bldgAge', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Site Audit Date ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'inspDt', ('index') : 1, ('minLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Validates the date input is invalid.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'inspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'inspDt', ('SelectCurrentDay') : 11, ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'inspDt'
        , ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'No of Bldg. Inspected:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'noOfBldg', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'noOfBldg', ('index') : 1, ('minLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : '>=20 Years ', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'PE:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'peNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peNo', ('index') : 1
        , ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'PE', ('NoOfVal') : 2
        , ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Date Report Submitted:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'rptSubmDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'rptSubmDt', ('index') : 1, ('minLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Validates the date input is invalid.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'rptSubmDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'rptSubmDt', ('SelectCurrentDay') : 25, ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'rptSubmDt'
        , ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Click checkbox.'
WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'officerId', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'officerId'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'ReferToOfficer'
        , ('NoOfVal') : 5, ('DelayTime') : 1, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'noOfSty'
        , ('minLen') : 15, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'bldgAge'
        , ('minLen') : 15, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peName', ('index') : 1
        , ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'PEName'
        , ('NoOfVal') : 2, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Drawing Referred by PE ', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'notes', ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'notes'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'notes', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Building 20 years or older', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that it is a mandatory button.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredButtonValidation'), [('LblName') : 'Reported '
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that it is a mandatory button.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredButtonValidation'), [('LblName') : 'Audit Findings '
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'structTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'StructureType'
        , ('NoOfVal') : 4, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'comments', ('LenChar') : 500, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'materialTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'Material'
        , ('NoOfVal') : 4, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 500, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'One Page Report (OPR) / Frequent PE Submission Details'
        , ('tagToBeUsed') : 'div'], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Validates that it is a mandatory button.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredButtonValidation'), [('LblName') : 'Status '
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'checksTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'CheckTypes'
        , ('NoOfVal') : 5, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 500, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

