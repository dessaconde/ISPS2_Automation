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

/*================================================================*
 * COMPONENT NAME: Utilities.OwnerDetails				          *
 * TESTER: Krizia Manuel                                          *
 * CREATE DATE: 23-Oct-2020                                       *
 * PURPOSE: To verify the P&S Of Owner Details   			      *
 * ===============================================================*
 */
'Login from ISPS2.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-SG-UAT', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open HomePage Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to Utilities.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to PFI.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'PFI'], FailureHandling.STOP_ON_FAILURE)

'Hover to Create New Building Group.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Create New Building Group'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Building Group.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Create New Building Group'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpBldType'
        , ('textToBeInputted') : 'Others'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'gradeTypeCd'
        , ('textToBeInputted') : 'A'], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'topCscDt', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'ownerTypeCd'
        , ('textToBeInputted') : 'SINGLE'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpDesc', ('textToBeInputted') : 'test description'], 
    FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'lastInspDt', ('SelectCurrentDay') : '31', ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'createdDt', ('SelectCurrentDay') : '9', ('index') : 3, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Click radio button.'
WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Create New Group', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add New Building to the Group'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'bldgType', ('textToBeInputted') : 'Others'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'height', ('textToBeInputted') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'View'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'Assign Owner'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Update Owner Details'], FailureHandling.STOP_ON_FAILURE)

'Click search button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'ownerName'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'roadId'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Name ', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'ownerName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'ownerName'
        , ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Status:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerStatus', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'ownerStatus'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mgt Corp Indicator:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mgtCorp', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'mgtCorp'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Company Name:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'companyName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'companyName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'companyName'
        , ('index') : 1, ('MaxCharLen') : 150], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hseBlkNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'hseBlkNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'hseBlkNo'
        , ('index') : 1, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'roadId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bldgName'
        , ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'level', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'level', ('LenChar') : 3, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'level'
        , ('index') : 1, ('MaxCharLen') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'unit', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'unit', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'unit'
        , ('index') : 1, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'postalCode', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'postalCode', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'postalCode'
        , ('index') : 1, ('MaxCharLen') : 6], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Telephone:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'telNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'telNo'
        , ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'extNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'extNo'
        , ('index') : 1, ('numLength') : 4], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mobile No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mobileNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'mobileNo'
        , ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'faxNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'faxNo'
        , ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Email Address:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'email', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'email', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'email'
        , ('index') : 1, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Pager No.:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'pagerNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'pagerNo'
        , ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Assign Owner'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Name/Firm Name ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'NovaTextField-1617-inputEl'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'NovaTextField-1617-inputEl', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'NovaTextField-1617-inputEl'
        , ('index') : 1, ('MaxCharLen') : 20], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Assign New Owner to Unit'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Name:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerName', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'ownerName', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'ownerName'
        , ('index') : 2, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Status:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerStatus', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'ownerStatus'
        , ('index') : 2, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mgt Corp Indicator:', ('index') : 2], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mgtCorp', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'mgtCorp'
        , ('index') : 2, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Company Name:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'companyName', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'companyName', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'companyName'
        , ('index') : 2, ('MaxCharLen') : 150], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hseBlkNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'hseBlkNo', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'hseBlkNo'
        , ('index') : 2, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'roadId', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgName', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgName', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bldgName'
        , ('index') : 2, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'level', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'level', ('LenChar') : 3, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'level'
        , ('index') : 2, ('MaxCharLen') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'unit', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'unit', ('LenChar') : 4, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'unit'
        , ('index') : 2, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'postalCode', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'postalCode', ('LenChar') : 4, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'postalCode'
        , ('index') : 2, ('MaxCharLen') : 6], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Telephone:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'telNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'telNo'
        , ('index') : 2, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'extNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'extNo'
        , ('index') : 2, ('numLength') : 4], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mobile No:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mobileNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'mobileNo'
        , ('index') : 2, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'faxNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'faxNo'
        , ('index') : 2, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Email Address:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'email', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'email', ('LenChar') : 4, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'email'
        , ('index') : 2, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Pager No.:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'pagerNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), [('InputName') : 'pagerNo'
        , ('index') : 2, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : 'Sign in to ISPS2-SG-UAT'], FailureHandling.STOP_ON_FAILURE)

