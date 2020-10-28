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
 * COMPONENT NAME: Utilities.BldgGrpDetails				          *
 * TESTER: Krizia Manuel                                          *
 * CREATE DATE: 19-Oct-2020                                       *
 * PURPOSE: To verify the P&S Of Bldg Group Details   			      *
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

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'grpBldgType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'gradeType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'topDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'ownership', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'grpDescription', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'createdDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'BP No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bpNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bpNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bpNo'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Name:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'grpName'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Building Type ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpBldgType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Industrial (GID)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Institution (GIS)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government Non-Residential (GNR)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Residential (GR)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Commercial (NRC)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Industrial (NRID)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Institution (NRIS)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Others\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'gradeType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_GRADE_TYPE\' and NAME = \'A\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'gradeType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_GRADE_TYPE\' and NAME = \'B\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'gradeType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_GRADE_TYPE\' and NAME = \'C\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'gradeType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_GRADE_TYPE\' and NAME = \'D\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgCategory'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_CATEGORY\' and NAME = \'CAT1\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgCategory'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_CATEGORY\' and NAME = \'CAT2\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgCategory'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_CATEGORY\' and NAME = \'CAT3\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'agency', ('NoOfOpt') : 2], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'agencyOwner', ('NoOfOpt') : 2], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Reference No:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topCscRefNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'topCscRefNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'topCscRefNo'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Date:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexIII'), 
    [('FldNm') : 'topDt', ('SelectCurrentDay') : 3, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\'s date.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'topDt'
        , ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Ownership Type ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownership', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'ownership'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_OWNERSHIP_TYPE\' and NAME = \'MC / MCST\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'ownership'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_OWNERSHIP_TYPE\' and NAME = \'SINGLE\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'ownership'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_OWNERSHIP_TYPE\' and NAME = \'MULTIPLE\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'ownership'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_OWNERSHIP_TYPE\' and NAME = \'Government\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'MC ST No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mcTStNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click ... button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : '...', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click search button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Click link of MCST.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : '1328'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Project Title Description:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'projTitle', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'projTitle', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'projTitle'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Description ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpDescription', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpDescription', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'grpDescription'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Created Date:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'createdDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Updated Successfully!', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add New Building to the Group'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'BP No:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bpNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bpNo', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bpNo'
        , ('index') : 2, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'cscNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'cscNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'cscNo'
        , ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Date:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'cscDate', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexIII'), 
    [('FldNm') : 'cscDate', ('SelectCurrentDay') : 3, ('index') : 3], FailureHandling.STOP_ON_FAILURE)

'Select today\'s date.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'cscDate'
        , ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Building Type ', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Industrial (GID)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Institution (GIS)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government Non-Residential (GNR)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Government-Residential (GR)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Commercial (NRC)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Industrial (NRID)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Non-Residential Institution (NRIS)\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BUILDING_TYPE\' and NAME = \'Others\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Remarks:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'remarks', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'remarks'
        , ('index') : 1, ('MaxCharLen') : 4000], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'roadId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDBII'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'121212\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'32323\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'232424\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ABB00H\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ABI00L\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ACC00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADD00H\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADP00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADP01G\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADA00H\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADE00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADE01E\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADI00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADD01P\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADL00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADL01U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADM00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADE02U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADW00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADS00N\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADB00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADB01L\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ADA01S\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AHH00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AHG00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AHW00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AHP00D\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIS00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIH00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ZZZ99G\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIR00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIB00L\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIC00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ZZZ87F\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AIR01Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ZZZ89X\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'AKY00H\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALD00K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALS00D\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALS01K\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALL02Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALB00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALD01U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALA00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALC00Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALC01Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALA01Y\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALA02U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALL00U\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'roadId'
        , ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \' (\', ROAD_CODE, \')\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \'ALA03N\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bldgName'
        , ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hseBlkNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'hseBlkNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'hseBlkNo'
        , ('index') : 1, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

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
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'MCST No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mcstNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'mcstNo', ('textToBeInputted') : '1328'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Height ', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'height', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'height', ('textToBeInputted') : '10'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add Existing Building to the Group'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC No:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'cscNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'cscNo', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'cscNo'
        , ('index') : 2, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'MCST No:', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mcstNo', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'mcstNo', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'mcstNo'
        , ('index') : 2, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Date:', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topCscDateFrm', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexIII'), 
    [('FldNm') : 'topCscDateFrm', ('SelectCurrentDay') : 5, ('index') : 5], FailureHandling.STOP_ON_FAILURE)

'Select today\'s date.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'topCscDateFrm'
        , ('index') : 3, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'House Blk No:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hsBlkNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'hsBlkNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'hsBlkNo'
        , ('index') : 1, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Building Name / House Name:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgName', ('LenChar') : 6, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'bldgName'
        , ('index') : 2, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Update Building Group Details'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Ungroup Selected Building(s)'], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'OK', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add New Building to the Group'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'bldgType', ('textToBeInputted') : 'Government-Residential (GR)'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'height', ('textToBeInputted') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Ungroup Selected Building(s)'], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'OK', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Reason for building ungroup ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'reasonToUngrp', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'reasonToUngrp', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'reasonToUngrp'
        , ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Building Inactive Type', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 7], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgInactiveType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgInactiveType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_INACTIVE_TYPE\' and name = \'Building Demolished\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgInactiveType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_INACTIVE_TYPE\' and name = \'Building Does Not Existed\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgInactiveType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_INACTIVE_TYPE\' and name = \'Building Rebuilt\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'bldgInactiveType'
        , ('index') : 1, ('script') : 'SELECT NAME FROM PV_CODE_EXT WHERE CATEGORY = \'PFI_BLDG_INACTIVE_TYPE\' and name = \'Others\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Add to Existing Building Group ID'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 8], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'existingGrpBldg', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'existingGrpBldg', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'existingGrpBldg'
        , ('index') : 1, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Create Ad Hoc'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Job Assignment Rule ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 12], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'InActive Building Group'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Update Building Group Details'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'InActive Building Group'], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Deactivate', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Yes', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : 'Sign in to ISPS2-SG-UAT'], FailureHandling.STOP_ON_FAILURE)

