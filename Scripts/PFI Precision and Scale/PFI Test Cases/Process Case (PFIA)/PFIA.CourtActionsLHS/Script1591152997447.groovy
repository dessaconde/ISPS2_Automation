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

/*========================================================================*
 * COMPONENT NAME: PFIA.CourtActionsLHS 		    					  *
 * TESTER: Krizia Manuel                                    			  *
 * CREATE DATE: 10-June-2020                                 			  *
 * PURPOSE:This is to verify the precision and scale of Court Action LHS  *
 * =======================================================================*
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

'Navigate to Court Actions LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Court Actions'], FailureHandling.STOP_ON_FAILURE)

'Highlight header name.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Court Actions'], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Notice Order No', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'courtNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'courtNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'courtNo', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accept the maximum number of characters.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'courtNo'
        , ('index') : 1, ('MaxCharLen') : 25], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'courtNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'courtNo'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Notice/Order Date', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'orderDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'orderDt', ('index') : 1, ('minLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Validates the date input is invalid.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'orderDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'orderDt', ('SelectCurrentDay') : 11, ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'orderDt'
        , ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'orderDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'orderDt'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Complaint Officer', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'complaintOfficer', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'complaintOfficer'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'invalid'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'complaintOfficer', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'complaintOfficer'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'AARON'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'complaintOfficer', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'complaintOfficer'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'Christopher ANG'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'complaintOfficer', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'complaintOfficer', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'complaintOfficer'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Case/Group Description', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'caseGrpDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'caseGrpDesc', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'caseGrpDesc', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accept the maximum number of characters.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'caseGrpDesc'
        , ('index') : 1, ('MaxCharLen') : 4006], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Notice/Order Type', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'orderTypeCd', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'orderTypeCd'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'OrderType'
        , ('NoOfVal') : 8, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Bldg Grp Id', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgGrpId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'bldgGrpId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgGrpId', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accept the maximum number of characters.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bldgGrpId'
        , ('index') : 1, ('MaxCharLen') : 101], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Complaint Date', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'complaintDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'complaintDt', ('index') : 1, ('minLen') : 5], FailureHandling.STOP_ON_FAILURE)

'Validates the date input is invalid.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'complaintDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'complaintDt', ('SelectCurrentDay') : 25, ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'complaintDt'
        , ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Offence', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'courtDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'courtDesc', ('LenChar') : 5, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accept the maximum number of characters.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'courtDesc'
        , ('index') : 1, ('MaxCharLen') : 401], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

