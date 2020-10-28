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


RunConfiguration.setExecutionSettingFile('C:\\Users\\20008-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\PFI Precision and Scale\\PFI Test Cases\\PFI - Utilities\\Utilities.OwnerDetails\\20201023_151135\\execution.properties')

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

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpBldType'
        , ('textToBeInputted') : 'Others'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'gradeTypeCd'
        , ('textToBeInputted') : 'A'], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'topCscDt', ('SelectCurrentDay') : '31', ('index') : 1, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'ownerTypeCd'
        , ('textToBeInputted') : 'SINGLE'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'grpDesc'
        , ('textToBeInputted') : 'test description'], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'lastInspDt', ('SelectCurrentDay') : '31', ('index') : 2, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Select specific date in date picker.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/SelectDayInDatePickerWithIndexII'), 
    [('FldNm') : 'createdDt', ('SelectCurrentDay') : '9', ('index') : 3, ('idx') : 1], FailureHandling.STOP_ON_FAILURE)

'Click radio button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Create New Group', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Add New Building to the Group'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'bldgType'
        , ('textToBeInputted') : 'Others'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'height'
        , ('textToBeInputted') : '2'], FailureHandling.STOP_ON_FAILURE)

'Click Create New Group button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'View'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'View'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'Assign Owner'
        , ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click search button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'ownerName'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredFieldValidation'), [('nameToBeUsed') : 'roadId'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Name ', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerName', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'ownerName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'ownerName', ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Owner Status:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'ownerStatus', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), 
    [('FldNm') : 'ownerStatus', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap'
        , ('cmbNm') : 'IND', ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mgt Corp Indicator:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mgtCorp', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesIndex'), 
    [('FldNm') : 'mgtCorp', ('index') : 1, ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/ActiveIndicatorHashmap'
        , ('cmbNm') : 'IND', ('NoOfVal') : 3, ('DelayTime') : 2, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Company Name:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'companyName', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'companyName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'companyName', ('index') : 1, ('MaxCharLen') : 150], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'hseBlkNo', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'hseBlkNo', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'hseBlkNo', ('index') : 1, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'roadId', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDBII'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'121212\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'32323\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'232424\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ABB00H\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ABI00L\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ACC00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADD00H\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADP00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADP01G\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADA00H\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADE00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADE01E\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADI00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADD01P\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADL00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADL01U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADM00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADE02U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADW00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADS00N\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADB00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADB01L\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ADA01S\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AHH00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AHG00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AHW00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AHP00D\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIS00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIH00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ZZZ99G\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIR00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIB00L\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIC00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ZZZ87F\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AIR01Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ZZZ89X\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'AKY00H\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALD00K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALS00D\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALS01K\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALL02Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALB00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALD01U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALA00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALC00Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALC01Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALA01Y\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALA02U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALL00U\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), 
    [('FldNm') : 'roadId', ('index') : 1, ('script') : 'SELECT CONCAT(ROAD_NAME, \\' (\\', ROAD_CODE, \\')\\') AS [ROAD_NAME] FROM VXCM_ROAD where road_code = \\'ALA03N\\''
        , ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'bldgName', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'bldgName', ('LenChar') : 6, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'bldgName', ('index') : 1, ('MaxCharLen') : 100], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'level', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'level', ('LenChar') : 3, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'level', ('index') : 1, ('MaxCharLen') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'unit', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'unit', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'unit', ('index') : 1, ('MaxCharLen') : 10], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'postalCode', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'postalCode', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'postalCode', ('index') : 1, ('MaxCharLen') : 6], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Telephone:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'telNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'telNo', ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'extNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'extNo', ('index') : 1, ('numLength') : 4], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Mobile No:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'mobileNo', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'mobileNo', ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'faxNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'faxNo', ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Email Address:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'email', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify that field accepts alphanumeric values.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'email', ('LenChar') : 4, ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the maximum chars of the input field.'
not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), 
    [('FieldNm') : 'email', ('index') : 1, ('MaxCharLen') : 50], FailureHandling.STOP_ON_FAILURE)

'Highlight Label that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Pager No.:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight input field that you will verify.'
not_run: WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'pagerNo', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxNumericValidationIndex'), 
    [('InputName') : 'pagerNo', ('index') : 1, ('numLength') : 12], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropDownValuesinDB'), [('FldNm') : 'grpBldgType'
        , ('index') : 1, ('NoOfVal') : 9, ('DelayTime') : 2, ('ColNm') : 'NAME', ('DBTbl') : 'PV_CODE_EXT', ('Condition1') : 'CATEGORY = \\'PFI_BUILDING_TYPE\\' and NAME ='], 
    FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.OwnerDetails', new TestCaseBinding('Test Cases/PFI Precision and Scale/PFI Test Cases/PFI - Utilities/Utilities.OwnerDetails',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
