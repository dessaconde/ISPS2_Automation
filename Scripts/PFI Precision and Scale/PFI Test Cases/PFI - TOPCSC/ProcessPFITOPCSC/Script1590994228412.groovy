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

WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (PSI-TOPCSC)'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (PSI-TOPCSC)'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Process PSI-TOP/CSC Details'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightLabelFieldXPI'), [('LblName') : 'Actions', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightInputFieldXPI'), [('FldNm') : 'NovaComboBox', ('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickDropDownField'), [('Index') : 8], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/RequiredIconValidation'), [('index') : 1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDisabledDropdownValuesXPI'), 
    [('FldNm') : 'NovaComboBox', ('index') : 2, ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/ConstantHashMap'
        , ('cmbNm') : 'Actions', ('NoOfVal') : 1, ('DelayTime') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ScrollDownToElementIndex'), [('labelNm') : 'HOUSE(H)/BUILDING NAME(B)', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyCellGridDropdown'), [('index') : 8], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/InputCellGridValidation'), [('LenChar') : 5], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxInputGridCellValidation'), [('FieldNm') : 'HB'
        , ('MaxCharLen') : 22], FailureHandling.STOP_ON_FAILURE)
