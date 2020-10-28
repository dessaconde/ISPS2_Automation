import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\19023-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\PFI.IssueStatusLHS\\20200524_131452\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue(
            'URL', 1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SM.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Court Actions LHS.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyPageIndexSuccessfullyLoaded'), [('index') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'AO Status *:'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'aoStatus'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDefaultValue'), [('FieldNm') : 'aoStatus'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'AO Notes *:'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'aoNotes'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDefaultValue'), [('FieldNm') : 'aoNotes'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Assign To *:'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'aoAssignTo'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDefaultValue'), [('FieldNm') : 'aoAssignTo'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Bldg Grp Grade Type *:'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'gradeType'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDefaultValue'), [('FieldNm') : 'gradeType'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Submit', ('Index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'aoStatus'
        , ('index') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'aoNotes'
        , ('index') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'aoAssignTo'
        , ('index') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'gradeType'
        , ('index') : 0], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'aoStatus', ('index') : 0
        , ('CallTCName') : 'PFI Precision and Scale/PFI Components/ConstantHashMap', ('NoOfVal') : 10, ('DelayTime') : 5
        , ('cmbNm') : 'AOStatus', ('EnterValue') : '\\'T2\\''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/AlphaNumericSpecialInputValidation'), [
        ('FldNm') : 'aoNotes', ('LenChar') : 10, ('index') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/MaxCharLengthValidation'), [('FldNm') : 'aoNotes'
        , ('index') : 0, ('MaxCharLen') : 4002], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'aoAssignTo'
        , ('index') : 0, ('CallTCName') : 'PFI Precision and Scale/PFI Components/OfficerLists', ('cmbNm') : 'OfficerLists'
        , ('NoOfVal') : 24, ('DelayTime') : 5, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'gradeType'
        , ('index') : 0, ('CallTCName') : 'PFI Precision and Scale/PFI Components/ConstantHashMap', ('cmbNm') : 'GrdType'
        , ('NoOfVal') : 4, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/PFI.IssueStatusLHS', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/PFI.IssueStatusLHS',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
