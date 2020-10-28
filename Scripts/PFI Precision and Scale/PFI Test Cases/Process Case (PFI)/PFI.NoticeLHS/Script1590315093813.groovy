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

WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue('URL', 
            1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case PFI.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)', ('index') : '4'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Notice'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Notice'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Generate Notice *:'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'structPlans'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDefaultValue'), [('FieldNm') : 'structPlans'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'structPlans'
        , ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/PFILetterTemplate', ('cmbNm') : 'GenerateNotice', ('NoOfVal') : 2
        , ('DelayTime') : 3, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

