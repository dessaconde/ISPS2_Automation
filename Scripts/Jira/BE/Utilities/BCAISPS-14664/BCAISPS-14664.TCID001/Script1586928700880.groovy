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
WebUI.callTestCase(findTestCase('Components/Login'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Utilities.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to Common.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover to Maintenance.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Hover to Maintain Application.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain Application'], FailureHandling.STOP_ON_FAILURE)

'Select Maintain Application.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Maintain Application'], FailureHandling.STOP_ON_FAILURE)

'Populate the field: PA_BE'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'userModuleCmb'
        , ('textToBeInputted') : 'PA_BE'], FailureHandling.STOP_ON_FAILURE)

'Click Search.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Modify text.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('TextToModify') : 'BCA-BE-ST submission'], 
    FailureHandling.STOP_ON_FAILURE)

'Click justice scale icon.'
WebUI.callTestCase(findTestCase('Components/ClickJusticeScaleIcon'), [('Index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Verify screen is loaded successfully'
WebUI.callTestCase(findTestCase('Components/HighlightPageHeader'), [('PgHeader') : 'Page Section / Decision Section'], FailureHandling.STOP_ON_FAILURE)

'Scroll page.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Decision Section', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Issue WD link.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : 'Issue WD'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Highlight the Page Sub Header'
WebUI.callTestCase(findTestCase('Components/HighlightPageSubHeader'), [('PgSubHeader') : 'CaseType Decision Clauses'], FailureHandling.STOP_ON_FAILURE)

'Click Add.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'span', ('linkName') : 'Add'
        , ('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Populate field.'
WebUI.callTestCase(findTestCase('Components/AddClauseComboBox'), [('FldNm') : 'stageCd'], FailureHandling.STOP_ON_FAILURE)

'Populate Display Order input field'
WebUI.callTestCase(findTestCase('Components/SetTextOnFieldUsingIndex'), [('NameToBeModified') : 'displayOrder', ('index') : '2'
        , ('EnterText') : '3'], FailureHandling.STOP_ON_FAILURE)

'Populate field.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'freeText'
        , ('textToBeInputted') : 'dummy text 123456789'], FailureHandling.STOP_ON_FAILURE)

'Click Save.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'span', ('linkName') : 'Save'
        , ('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Scroll up.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'CaseType Decision Clauses', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify saved successful.'
WebUI.callTestCase(findTestCase('Components/HighlightSuccessfulMsg'), [('tagname') : 'li', ('SuccessfulMsg') : 'Successfully Saved!'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

