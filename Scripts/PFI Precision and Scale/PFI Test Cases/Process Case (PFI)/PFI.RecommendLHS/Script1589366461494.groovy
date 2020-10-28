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
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case PFI.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Recommend LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Recommend To', ('index') : 6], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'psiRecommendTo', ('index') : 2], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'psiRecommendTo'
        , ('index') : 2, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : '', ('NoOfVal') : 27
        , ('DelayTime') : 3, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'psiRecommendTo', ('index') : 2], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'psiRecommendTo'
        , ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Recommend Type:', ('index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'psiRecomType', ('index') : 2], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), [('FldNm') : 'psiRecomType'
        , ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'RecommendType', ('NoOfVal') : 2
        , ('DelayTime') : 2, ('EnterValue') : '', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'Remarks:', ('index') : 12], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'psiRemarks', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'psiRemarks', ('LenChar') : 10, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'psiRemarks'
        , ('index') : 2, ('MaxCharLen') : 4006], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

