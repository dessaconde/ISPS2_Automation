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


RunConfiguration.setExecutionSettingFile('C:\\Users\\20008-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\Process Case (PFIA)\\PFIA.SiteInspectionLHS\\20200615_093047\\execution.properties')

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

/*============================================================================*
 * COMPONENT NAME: PFIA.SiteInspectionLHS 		    					  	  *
 * TESTER: Krizia Manuel                                    			      *
 * CREATE DATE: 10-June-2020                                 			      *
 * PURPOSE:This is to verify the precision and scale of Site Inspection LHS   *
 * ===========================================================================*
 */
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

'Go to Site Inspection LHS'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Site Inspection'], FailureHandling.STOP_ON_FAILURE)

'Verify Site Inspection screen is successfully loaded'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Site Inspection'], 
    FailureHandling.STOP_ON_FAILURE)

'Click on Add button'
not_run: WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Assign To', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'officer', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'officer', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/OfficerLists', ('cmbNm') : ''
        , ('NoOfVal') : 24, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'officer', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'officer', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Weightage', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspWeight', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'inspWeight'
        , ('minLen') : 5], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters by using spinner'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SpinnerUpIndex'), [('InputName') : 'inspWeight'
        , ('nmIndex') : 1, ('indexUp') : 2, ('itr') : 10], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters by using spinner'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SpinnerDownIndex'), [('InputName') : 'inspWeight'
        , ('nmIndex') : 1, ('indexDown') : 2, ('itr') : 20], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'inspWeight', ('index') : 1, ('numLength') : 11], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspWeight', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum value '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxValueErrorIndex'), [('InputName') : 'inspWeight'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'No of Building Inspected'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'noOfBldg', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/NumericTextboxValidationII'), [('nameToBeUsed') : 'noOfBldg'
        , ('minLen') : 5], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters by using spinner'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SpinnerUpIndex'), [('InputName') : 'noOfBldg'
        , ('nmIndex') : 1, ('indexUp') : 3, ('itr') : 10], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters by using spinner'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SpinnerDownIndex'), [('InputName') : 'noOfBldg'
        , ('nmIndex') : 1, ('indexDown') : 3, ('itr') : 20], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'noOfBldg', ('index') : 1, ('numLength') : 11], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'noOfBldg', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum value'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxValueErrorIndex'), [('InputName') : 'noOfBldg'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Notes', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'notes', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'notes', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'notes', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Module Name', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspModule', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspModule', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'inspModule', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspModule', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'ModuleNm'
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'PSI'], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'App Code', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspCaseType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspCaseType', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'PSI', ('NoOfVal') : 25, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspModule', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspModule', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'ModuleNm'
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'ENF'], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspCaseType', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'ENF', ('NoOfVal') : 8, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspModule', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspModule', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'ModuleNm'
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'SD'], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspCaseType', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'SD', ('NoOfVal') : 7, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspModule', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspModule', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap', ('cmbNm') : 'ModuleNm'
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'FM'], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'inspCaseType', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'FM', ('NoOfVal') : 1, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Inspection From Date', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'inspDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Validates the start time error '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/StartTimeErrorIndex'), [('FldNm') : 'inspDt'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'inspDt', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), 
    [('FldNm') : 'inspDt', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Inspection To Date', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'inspToDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspToDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'inspToDt', ('index') : 1, ('minLen') : 9], FailureHandling.STOP_ON_FAILURE)

'Validates the start time error '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/StartTimeErrorIndex'), [('FldNm') : 'inspToDt'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates selected date can be clicked.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'inspToDt', ('SelectCurrentDay') : '30', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates today date button can be clicked.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), 
    [('FldNm') : 'inspToDt', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the past date error'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/PastDateAfterErrorIndex'), 
    [('FldNm') : 'inspToDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the past date error'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/PastDateBeforeErrorIndex'), 
    [('FldNm') : 'inspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspWeight', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'noOfBldg', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'inspToDt', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'inspWeight', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'noOfBldg', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'inspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field is a mandatory field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'inspToDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickAddButtonII'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Address', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hseBlkNo', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericValidationIndex'), 
    [('FldNm') : 'hseBlkNo', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxAlphaNumericLenIndexValidation'), 
    [('FieldNm') : 'hseBlkNo', ('index') : 1, ('MaxCharLen') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'roadId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), 
    [('FldNm') : 'roadId', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/RoadLists', ('cmbNm') : ''
        , ('NoOfVal') : 1, ('DelayTime') : 2, ('EnterValue') : 'asdsafd'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'roadId', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), 
    [('FldNm') : 'roadId', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/RoadLists', ('cmbNm') : ''
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'ALS02Q'], FailureHandling.STOP_ON_FAILURE)

'Select all then delete values.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'roadId', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), 
    [('FldNm') : 'roadId', ('index') : 1, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/RoadLists', ('cmbNm') : ''
        , ('NoOfVal') : 1, ('DelayTime') : 0, ('EnterValue') : 'ADIS ROAD'], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'buildingName', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'buildingName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'buildingName', ('index') : 1, ('MaxCharLen') : 102], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'postalCode', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'postalCode', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum numeric characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'postalCode', ('index') : 1, ('numLength') : 8], FailureHandling.STOP_ON_FAILURE)

'Click radio button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButtonII'), [('lblNm') : 'Unformatted', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'unformattedAddress', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'unformattedAddress', ('LenChar') : 10, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts maximum characters '
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'unformattedAddress', ('index') : 1, ('MaxCharLen') : 4001], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/DecimalValidation'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'courtNo'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/Process Case (PFIA)/PFIA.SiteInspectionLHS', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/Process Case (PFIA)/PFIA.SiteInspectionLHS',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
