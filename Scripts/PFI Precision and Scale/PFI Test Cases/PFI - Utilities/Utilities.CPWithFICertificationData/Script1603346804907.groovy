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

/* COMPONENT NAME: Utilities.CPWithFICertificationData
 * TESTER: Rhodessa Conde
 * CREATED DATE: 22-Oct-2020
 * PURPOSE: This is to verify the precision and scale in CP FI With Certification Data Details (PFI Utilities)
 * REVIEWED BY:
 * REVISION BY:
 * REVISION DATE:
 */

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 3), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Wait for 2 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

'Click on Menu'
WebUI.callTestCase(findTestCase('Components/ClickMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Utilities'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Go to PFI'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'PFI'], FailureHandling.STOP_ON_FAILURE)

'Hover over CP with FI certification data'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'CP with FI certification data'], 
    FailureHandling.STOP_ON_FAILURE)

'Click CP with FI certification data'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'CP with FI certification data'], FailureHandling.STOP_ON_FAILURE)

'Verify that the page is successfully loaded'
WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'CP FI With Cerification Data Details'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify if "Professional Board" label is correct'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'CP FI', ('index') : 5
        , ('PFIUtil') : 'CPFI'], FailureHandling.STOP_ON_FAILURE)

'Verify if the selected value in combobox is in DB'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'qpType'
        , ('index') : 1, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \'CM_PROF_BD_IND\' AND NAME = \''
        , ('DelayTime') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if the selected value in combobox is in DB'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'qpType'
        , ('index') : 1, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \'CM_PROF_BD_IND\' AND NAME = \''
        , ('DelayTime') : 0], FailureHandling.STOP_ON_FAILURE)

'Verify if "Qp No" label is correct'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'CP FI', ('index') : 6
        , ('PFIUtil') : 'CPFI'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Qp No" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'qpNo', ('index') : 1, ('minLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Verify if "Name" label is correct'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'CP FI', ('index') : 7
        , ('PFIUtil') : 'CPFI'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Name" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'name', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if "Company" label is correct'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'CP FI', ('index') : 8
        , ('PFIUtil') : 'CPFI'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Company" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'company', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if "Is Active?" label is correct'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'CP FI', ('index') : 9
        , ('PFIUtil') : 'CPFI'], FailureHandling.STOP_ON_FAILURE)

'Verify if the selected value in combobox is in DB'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'isActive'
        , ('index') : 1, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \'AL_BOOLEAN_MAP\' AND NAME = \''
        , ('DelayTime') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if the selected value in combobox is in DB'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'isActive'
        , ('index') : 1, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \'AL_BOOLEAN_MAP\' AND NAME = \''
        , ('DelayTime') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Add button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if "QP Type" field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'qpType'
        , ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "QP Type" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'qpType'
        , ('index') : 2, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'QpType'
        , ('NoOfVal') : 2, ('DelayTime') : 1, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Verify if "QP No" field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'qpNo'
        , ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "QP No" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'qpNo', ('index') : 2, ('minLen') : 15], FailureHandling.STOP_ON_FAILURE)

'Verify if "Name" field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'name'
        , ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Name" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'name', ('LenChar') : 15, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify if "Company" field is a required field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'company'
        , ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Company" field'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'),
	[('FldNm') : 'company', ('LenChar') : 15, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale for "Is Active" column'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'isActive'
        , ('index') : 2, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'CommonINd'
        , ('NoOfVal') : 2, ('DelayTime') : 1, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Wait for 2 sec'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 3)], FailureHandling.STOP_ON_FAILURE)

