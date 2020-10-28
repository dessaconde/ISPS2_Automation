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


RunConfiguration.setExecutionSettingFile('C:\\Users\\20008-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\PFI - Utilities\\Utilities.Create\\20201026_182856\\execution.properties')

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

'Click Create New Group button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Create New Group', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight error message.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Please enter at least one (CSC, Created Date, Last Inspection) for this building group.'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'grpBldType', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click input field.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickElement'), [('nameToBeUsed') : 'gradeTypeCd', ('index') : 1], 
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

'Verify that the page is successfully loaded'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelField'), [('LblName') : 'Create New Building Group'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bpNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bpNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'bpNo', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 1, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpName', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'grpName', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 2, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpBldType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'grpBldType', ('index') : 1, ('NoOfVal') : 9, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT'
        , ('Condition1') : 'CATEGORY = \\'PFI_BUILDING_TYPE\\' and NAME ='], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 3, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'gradeTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'gradeTypeCd', ('index') : 1, ('NoOfVal') : 5, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT'
        , ('Condition1') : 'CATEGORY = \\'PFI_GRADE_TYPE\\' and NAME ='], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 4, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpBldCat', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'grpBldCat', ('index') : 1, ('NoOfVal') : 5, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT'
        , ('Condition1') : 'CATEGORY = \\'PFI_BLDG_CATEGORY\\' and NAME = '], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 5, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agency', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'agency', ('index') : 1, ('NoOfVal') : 16, ('DelayTime') : 2, ('ColNm') : 'AGENCY_DESC', ('DBTbl') : 'VXPFI_AGENCies'
        , ('Condition1') : 'AGENCY_DESC ='], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 6, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agencyOwner', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'agencyOwner'
        , ('NoOfOpt') : 3], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 7, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'topCscRef', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'topCscRef', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'topCscRef', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 8, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

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

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 9, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerTypeCd', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'ownerTypeCd', ('index') : 1, ('NoOfVal') : 17, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT'
        , ('Condition1') : 'CATEGORY = \\'PFI_BLDG_OWNERSHIP_TYPE\\' and NAME ='], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'BP No:'
        , ('index') : 10, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mcstNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click ... button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : '...', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click search button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

'Click link of MCST.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : '1328'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Clear'
        , ('index') : 1, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'projTitleDesc', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'projTitleDesc', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'projTitleDesc', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Clear'
        , ('index') : 2, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'grpDesc', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'grpDesc', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'grpDesc', ('index') : 1, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Group Description '
        , ('index') : 2, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'lastInspDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field accepts numeric chars.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'lastInspDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'lastInspDt', ('SelectCurrentDay') : '31', ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\\'s date.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), 
    [('FldNm') : 'lastInspDt', ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Group Description '
        , ('index') : 3, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'createdDt', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the field accepts numeric chars.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/NumericTextboxValidationIndex'), 
    [('nameToBeUsed') : 'createdDt', ('index') : 1, ('minLen') : 4], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'createdDt', ('SelectCurrentDay') : '31', ('index') : 3, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select today\\'s date.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectTodayInDatePickerIndex'), 
    [('FldNm') : 'createdDt', ('index') : 3, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyFieldsLabel'), [('HeaderLbl') : 'Group Description '
        , ('index') : 4, ('PFIUtil') : 'CreateNewBldg'], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerTypeCd', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agency', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'agencyOwner', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'agencyOwner', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'agency', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'agency'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the mandatory fields.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/RequiredFieldValidationIndex'), [('nameToBeUsed') : 'agencyOwner'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Please fill up the mandatory fields.'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify values in combo box.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/CommonComboBox'), [('FldNm') : 'ownerTypeCd', ('NoOfOpt') : 3], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerTypeCd', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDeleteIndex'), [('nameToBeUsed') : 'mcstNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Clear', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredIconValidation'), [('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Wait for 2 sec'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 3)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.Create', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.Create',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
