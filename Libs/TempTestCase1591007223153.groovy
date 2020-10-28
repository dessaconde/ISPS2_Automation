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


RunConfiguration.setExecutionSettingFile('C:\\Users\\20008-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\Process Case (PFIA)\\PFIA.SiteAuditReport\\20200601_182658\\execution.properties')

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
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMA)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMA.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SMA)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Status LHS.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Site Audit Report'], FailureHandling.STOP_ON_FAILURE)

'Highlight text.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Site Audit Report'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : '01 Jun 2020'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'bldgAge', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Update', ('Index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight text.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'li', ('textToModify') : 'Please fill up the mandatory fields.'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'inspDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify data error q-tip.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/DataErrorValidationII'), [('textToBeVerified') : 'Auto Update Building Records? '], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Audit Officer\\'s Conclusion '
        , ('tagToBeUsed') : 'span'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'notes'], 
    FailureHandling.STOP_ON_FAILURE)

'Select any day from the EOT To Date picker'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'inspDt', ('SelectCurrentDay') : '27', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peNo'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'PE'
        , ('NoOfVal') : 2, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT From Date field'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'noOfBldg'
        , ('minLen') : 11, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT From Date field'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'rptSubmDt'
        , ('minLen') : 15, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'rptSubmDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Select any day from the EOT To Date picker'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndex'), 
    [('FldNm') : 'rptSubmDt', ('SelectCurrentDay') : '27', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT From Date field'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'noOfSty'
        , ('minLen') : 15, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that only numeric characters can be typed in EOT From Date field'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'bldgAge'
        , ('minLen') : 15, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peName'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'PEName'
        , ('NoOfVal') : 2, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Audit Officer\\'s Conclusion '
        , ('tagToBeUsed') : 'span'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'notes', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'notes', ('index') : 1, ('MaxCharLen') : 4000], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Building 20 years or older', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Building 20 years or older'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'structTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'StructureType'
        , ('NoOfVal') : 4, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'comments', ('LenChar') : 500, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'materialTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'Material'
        , ('NoOfVal') : 4, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'One Page Report (OPR) / Frequent PE Submission Details'
        , ('tagToBeUsed') : 'div'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'One Page Report (OPR) / Frequent PE Submission Details'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 500, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the values in Approving Officer combo box'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'checksTypeCd'
        , ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'CheckTypes'
        , ('NoOfVal') : 5, ('DelayTime') : 5, ('EnterValue') : '', ('idx') : 0], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 500, ('index') : 2], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/Process Case (PFIA)/PFIA.SiteAuditReport', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/Process Case (PFIA)/PFIA.SiteAuditReport',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
