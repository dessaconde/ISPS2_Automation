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

'Login from ISPS2'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue(
            'URL', 1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search PSI case'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case (SM)'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Written Directions'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Issue WD'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Expiry Date', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'Expiry Date:', ('index') : 10], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'noOfDays', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'noOfDays'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidNumericErrorIndex'), [('FldNm') : 'noOfDays'
        , ('index') : 3, ('EnterInvalidValue') : 'e'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NegativeIntegersErrorIndex'), [('FldNm') : 'noOfDays'
        , ('index') : 3, ('itr') : 10], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'noOfDays', ('index') : 3, ('minLen') : 10], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'periodType', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'periodType'
        , ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'periodType'
        , ('index') : 3, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'PeriodType'
        , ('NoOfVal') : 2, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickRadioButtonII'), [('lblNm') : 'on', ('index') : 6], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'expiryDate', ('index') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDefaultValueIndex'), [('FieldNm') : 'expiryDate'
        , ('index') : 9], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'expiryDate', ('minLen') : 7, ('index') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'expiryDate', ('index') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'expiryDate', ('SelectCurrentDay') : 20, ('index') : 1, ('idx') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'expiryDate'
        , ('index') : 1, ('idx') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'KIV Case Due Date:', ('index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'kivDueDate', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'kivDueDate', ('index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'kivDueDate', ('minLen') : 8, ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InvalidDateErrorValidationIndex'), 
    [('FldNm') : 'kivDueDate', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'kivDueDate', ('SelectCurrentDay') : '6', ('index') : 3, ('idx') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'kivDueDate'
        , ('index') : 2, ('idx') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'File Name:', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'NovaComboBox', ('index') : 16], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'NovaComboBox'
        , ('index') : 16, ('CallTCName') : 'PFI Precision and Scale/PFI Components/PFILetterTemplate', ('cmbNm') : 'IssueWD'
        , ('NoOfVal') : 32, ('DelayTime') : 3, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'Type of Letter:', ('index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'NovaComboBox', ('index') : 17], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'NovaComboBox'
        , ('index') : 17, ('CallTCName') : 'PFI Precision and Scale/PFI Components/ConstantHashMap', ('cmbNm') : 'IssueWD'
        , ('NoOfVal') : 2, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

