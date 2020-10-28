import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Log in.\r\n'
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1)
        , ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open hamburger menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover over Utilities.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover over common.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover over Maintenance.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Hover over Maintain AC.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

'Click Maintain AC'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

'Set text on AC No field.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'acNo', ('textToBeInputted') : '1160'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Search'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Click link under AC Name.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'dummy ac name'], FailureHandling.STOP_ON_FAILURE)

'Click Unformatted radio button.'
WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Get text of unformatted address field.'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'foreignAddr'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Back'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Back', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if the address is the same as the address in results table.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('TextToModify') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Log Out.\r\n'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

