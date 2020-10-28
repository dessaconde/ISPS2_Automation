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
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Facade Inspector Details'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Merge Building Groups'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Facade Inspector Details'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Facade Inspector Details'
        , ('index') : '1', ('PFIUtil') : 'FacadeInspDet'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'FI Reg No.'
        , ('index') : '1', ('PFIUtil') : 'FacadeInspDet'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'NRIC', ('index') : '1'
        , ('PFIUtil') : 'FacadeInspDet'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Name', ('index') : '163'
        , ('PFIUtil') : 'FacadeInspDet'], FailureHandling.STOP_ON_FAILURE)

'Validate 1st field accepts Alpha Numeric and Special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'inspRegNo'
        , ('LenChar') : 10], FailureHandling.STOP_ON_FAILURE)

'Validate 1st field accepts Alpha Numeric and Special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'nricName'
        , ('LenChar') : 20], FailureHandling.STOP_ON_FAILURE)

'Validate 1st field accepts Alpha Numeric and Special characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [('FldNm') : 'name'
        , ('LenChar') : 20], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'isActive'
        , ('index') : '1', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 2, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Input 10 random characters on the 1st field and Validate Max length can be entered'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'inspRegNo'
        , ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Input 100 random characters on the 2nd fieldand  Validate Max length can be entered'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'nricName'
        , ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Input 100 random characters on the 3rd field and Validate Max length can be entered'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'name', ('MaxCharLen') : 100], 
    FailureHandling.STOP_ON_FAILURE)

'Click Reset'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Click Add'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'inspRegNo', ('LenChar') : 10, ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'sal'
        , ('index') : 1, ('NoOfVal') : 9, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \'SAL_PFI\' AND NAME ='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'nricName', ('LenChar') : 20, ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'name', ('LenChar') : 20, ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'nationality', ('LenChar') : 100, ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'educationInstitute', ('LenChar') : 100, ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'educationQualification', ('LenChar') : 100, ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'graduationYear', ('index') : '1', ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'startDate', ('SelectCurrentDay') : '30', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'endDate', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'startDate', ('SelectCurrentDay') : '1', ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'endDate', ('SelectCurrentDay') : '15', ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'isActive'
        , ('index') : '2', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap', ('cmbNm') : 'IND'
        , ('NoOfVal') : 2, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'inspRegNo', ('index') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'name', ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'nricName', ('index') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'inspRegNo'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'name'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'nricName'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : ''], FailureHandling.STOP_ON_FAILURE)

