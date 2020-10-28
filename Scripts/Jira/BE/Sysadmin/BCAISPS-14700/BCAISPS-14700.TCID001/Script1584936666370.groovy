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

//Dev: Shayne Cardona
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 3), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Search Result', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Open homepage menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to Sys Admin.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Sys Admin'], FailureHandling.STOP_ON_FAILURE)

'Select Data Patch For BP/ST.'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Data Patch For BP/ST'], FailureHandling.STOP_ON_FAILURE)

'Populate field.'
WebUI.callTestCase(findTestCase('Components/PopulateInputTypeField'), [('objectName') : 'planRefNo', ('textToBeInputted') : planRefNo], 
    FailureHandling.STOP_ON_FAILURE)

'Populate field.'
WebUI.callTestCase(findTestCase('Components/PopulateInputTypeField'), [('objectName') : 'planType', ('textToBeInputted') : 'MVAM'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate field.'
WebUI.callTestCase(findTestCase('Components/PopulateInputTypeField'), [('objectName') : 'planNo', ('textToBeInputted') : '002'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Search.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Verify that the error message is displayed.'
WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Click add record.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add Record', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify Add Record button functionality is \r\nworking after Search button is clicked and the Plan Reference is not found and the\r\nProject Information screen is displayed.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('TextToModify') : 'Project Information'], 
    FailureHandling.STOP_ON_FAILURE)

'Get text of a field.'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'projectRefNo'], 
    FailureHandling.STOP_ON_FAILURE)

'For double verification that the Project Information screen was displayed.'
WebUI.callTestCase(findTestCase('Components/VerifyTextMatch'), [('actualText1') : planRefNo, ('expectedText1') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 3)], FailureHandling.STOP_ON_FAILURE)

