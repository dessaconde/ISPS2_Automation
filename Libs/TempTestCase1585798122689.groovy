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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\BP\\Process BP Application\\BCAISPS-14707\\BCAISPS-14707.TCID002\\20200402_112838\\execution.properties')

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
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 21), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open Process Waiver Application case.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Open selected case.'
not_run: WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '2', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Selected Waiver Application LHS.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Selected Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Open one record under Regulation Details'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Modification', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Tick any among the checkboxes.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'others', ('textToBeInputted') : 'sample others'], 
    FailureHandling.STOP_ON_FAILURE)

'Send Enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'regulationCd'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'locId', ('textToBeInputted') : 'sample location 1'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'modId', ('textToBeInputted') : 'sample modification 1'], 
    FailureHandling.STOP_ON_FAILURE)

'Send Enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'modId'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Save button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify the regulation was saved successfully when \\'Others\\' was selected'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Jira/BP/Process BP Application/BCAISPS-14707/BCAISPS-14707.TCID002', new TestCaseBinding('Test Cases/Jira/BP/Process BP Application/BCAISPS-14707/BCAISPS-14707.TCID002',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
