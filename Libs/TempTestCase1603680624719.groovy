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


RunConfiguration.setExecutionSettingFile('C:\\Users\\20008-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\PFI - Utilities\\Utilities.CreateNewBldgGroup\\20201026_105020\\execution.properties')

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

/*================================================================*
 * COMPONENT NAME: Utilities.CreateNewBldgGroup				      *
 * TESTER: Krizia Manuel                                          *
 * CREATE DATE: 15-Oct-2020                                       *
 * PURPOSE: To verify the P&S Of Create New Bldg Grp   			  *
 * ===============================================================*
 */
'Login from ISPS2.'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 2), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-SG-UAT', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open HomePage Menu.'
not_run: WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to Utilities.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to PFI.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'PFI'], FailureHandling.STOP_ON_FAILURE)

'Hover to Create New Building Group.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Create New Building Group'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Building Group.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Create New Building Group'], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Create New Group', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Create New Group', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Please enter at least one (CSC, Created Date, Last Inspection) for this building group.'
        , ('tagToBeUsed') : 'li'], FailureHandling.STOP_ON_FAILURE)

'Highlight error message.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Please enter at least one (CSC, Created Date, Last Inspection) for this building group.'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'grpBldType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'gradeTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Create New Group', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'topCscDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'ownerTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'grpDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'lastInspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'createdDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click radio button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'grpBldType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'gradeTypeCd', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
not_run: WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Create New Group', ('tagToBeUsed') : 'span'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'topCscDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'ownerTypeCd', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'grpDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'lastInspDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), 
    [('nameToBeUsed') : 'createdDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'BP No:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bpNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bpNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'bpNo', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Name:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'grpName', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Building Type ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpBldType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'grpBldType', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'GrpBldgType', ('NoOfVal') : 9, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Grade Type ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'gradeTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'gradeTypeCd', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'GrdType', ('NoOfVal') : 5, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Grp Building Category:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpBldCat', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'grpBldCat', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'GrpCategory', ('NoOfVal') : 4, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Agency:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agency', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'agency'
        , ('NoOfOpt') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Agency Owner:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agencyOwner', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'agencyOwner'
        , ('NoOfOpt') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Reference No:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topCscRef', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'topCscRef', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'topCscRef', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'TOP/CSC Date ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topCscDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field accepts numeric chars.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'topCscDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'topCscDt', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\\'s date.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), 
    [('FldNm') : 'topCscDt', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Type ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values of combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), 
    [('FldNm') : 'ownerTypeCd', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'OwnerType', ('NoOfVal') : 5, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'MC ST No:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mcstNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click ... button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : '...', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click search button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

'Click link of MCST.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : '1328'], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Project Title Description:'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'projTitleDesc', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'projTitleDesc', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'projTitleDesc', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Group Description ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpDesc', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'grpDesc', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Last Inspection Date ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'lastInspDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field accepts numeric chars.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'lastInspDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'lastInspDt', ('SelectCurrentDay') : '31', ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\\'s date.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'lastInspDt'
        , ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Created Date ', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'createdDt', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that the field accepts numeric chars.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), [
        ('nameToBeUsed') : 'createdDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'createdDt', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\\'s date.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), [('FldNm') : 'createdDt'
        , ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Click reset button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : 'Sign in to ISPS2-SG-UAT'], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.CreateNewBldgGroup', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.CreateNewBldgGroup',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
