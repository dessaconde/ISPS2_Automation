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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19023-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\BE\\Utilities\\BCAISPS-14745\\BCAISPS-14745.TCID002\\20200902_191951\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

'Log in.\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open hamburger menu.'
not_run: WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover over Utilities.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover over common.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover over Maintenance.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Hover over Maintain AC.'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

'Click Maintain AC'
not_run: WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

'Set text on AC No field.'
not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'acNo'
        , ('textToBeInputted') : '1160'], FailureHandling.STOP_ON_FAILURE)

'Click Search'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : 3], 
    FailureHandling.STOP_ON_FAILURE)

'Click link under AC Name.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'dummy ac name'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButtonII'), [('lblNm') : 'Unformatted', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Set new value on unformatted address field.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'foreignAddr'
        , ('textToBeInputted') : 'Blk 87 Lot 10 PH'], FailureHandling.STOP_ON_FAILURE)

'Get text of unformatted address field.'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'foreignAddr'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Update', ('tagToBeUsed') : 'span'], FailureHandling.STOP_ON_FAILURE)

'Click Update'
WebUI.callTestCase(findTestCase('Components/ClickUpdateButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify if the updated address is the same as the address in results table.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : '*', ('textToModify') : GlobalVariable.inputFieldText], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID002', new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID002',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
