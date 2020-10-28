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
 * CREATE DATE: 5/4/2020                                          							*
 * PURPOSE: This is to verify the precision and scale of Convert to Audit Inspection LHS  	*
 * ===========================================================================================*
 */
'Login.'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue(
            'URL', 1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMB.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '10'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Status LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Convert to Audit Inspection'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Convert to Audit Inspection'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Assign Case(s) To', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'NovaOfficerComboBox', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'NovaOfficerComboBox'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'none'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'NovaOfficerComboBox', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'NovaOfficerComboBox'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'BENGKWEE'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'NovaOfficerComboBox', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'NovaOfficerComboBox'
        , ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 1
        , ('DelayTime') : 2, ('EnterValue') : 'Aaron Sham Wai Lun'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteXPI'), [('nameToBeUsed') : 'NovaOfficerComboBox', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationXPI'), [('nameToBeUsed') : 'NovaOfficerComboBox'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)
