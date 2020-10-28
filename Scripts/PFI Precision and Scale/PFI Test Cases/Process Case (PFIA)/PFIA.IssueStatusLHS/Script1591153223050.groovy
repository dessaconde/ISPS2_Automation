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

'Login.'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue(
            'URL', 1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMA)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMA.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SMA)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Status LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'AO Status *:'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'aoStatus', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'aoStatus'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'AO Notes', ('index') : 5], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'aoNotes', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'aoNotes'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Assign To', ('index') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'aoAssignTo', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'aoAssignTo'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Bldg Grp Grade Type', ('index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'gradeType', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'gradeType'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithIndex'), [('Button') : 'Submit', ('index') : 8], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'aoStatus'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'aoNotes'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'aoAssignTo'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'gradeType'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'aoStatus'
        , ('index') : 3, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('NoOfVal') : 24
        , ('DelayTime') : 5, ('cmbNm') : 'AOStatus', ('EnterValue') : '\'T6\''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'aoNotes', ('LenChar') : 10, ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'aoNotes'
        , ('index') : 3, ('MaxCharLen') : 4002], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'aoAssignTo'
        , ('index') : 3, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : 'OfficerLists'
        , ('NoOfVal') : 24, ('DelayTime') : 5, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'gradeType'
        , ('index') : 3, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'GrdType'
        , ('NoOfVal') : 4, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

