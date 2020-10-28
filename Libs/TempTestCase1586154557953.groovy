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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\PSI\\Process Case (SMB)\\BCAISPS-14457\\BCAISPS-14457.TCID001\\20200406_142912\\execution.properties')

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

//Dev: Shayne Cardona
'Login.'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 21), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open Process Case (SMB) case.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMB)'], FailureHandling.STOP_ON_FAILURE)

'Open selected case'
not_run: WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '2', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to recommend lhs\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
not_run: WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'
        , ('textToBeInputted') : 'Aaron'], FailureHandling.STOP_ON_FAILURE)

'Send enter key.'
not_run: WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'], 
    FailureHandling.STOP_ON_FAILURE)

'Click submit button.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Submit', ('Index') : '6'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Login as the recommended officer.'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 21), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'aaron', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Verify the "due on" date will be dated 2 months from the date it was recommended.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyDueOnDate'), [:], FailureHandling.STOP_ON_FAILURE)

'Switch to window index.'
not_run: WebUI.callTestCase(findTestCase('Components/SwitchToIndexedWindow'), [('windowIndex') : '0'], FailureHandling.STOP_ON_FAILURE)

'Logout.'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Login.'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 21), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open homepage menu.'
not_run: WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to utilities\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to common'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover to maintenance'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Hover to maintain application'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Click maintain application'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Maintain Application'], FailureHandling.STOP_ON_FAILURE)

'populate mandatory fields.'
not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'userModuleCmb'
        , ('textToBeInputted') : 'EBNS'], FailureHandling.STOP_ON_FAILURE)

'Send enter key'
not_run: WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'userModuleCmb'], 
    FailureHandling.STOP_ON_FAILURE)

'Click search'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate case duration'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateCaseDurationConfig'), [('caseDuration') : '2', ('moduleName') : 'EBNS'
        , ('caseTypeCode') : 'SMB'], FailureHandling.STOP_ON_FAILURE)

'Click save'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Login as the recommended officer.'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 21), ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'aaron', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open Process Case (SMB) case.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Recommendation and Decision (SMB)'], FailureHandling.STOP_ON_FAILURE)

'Open selected case'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '2', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to recommend lhs\\r\\n'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'
        , ('textToBeInputted') : 'Aaron'], FailureHandling.STOP_ON_FAILURE)

'Send enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'], 
    FailureHandling.STOP_ON_FAILURE)

'Click submit button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Submit', ('Index') : '6'], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

'Login as the recommended officer.'
WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 21)
        , ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'aaron', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open homepage menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to my tasks'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Click my tasks'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Verify the "due on" date will be dated 2 months from the date it was recommended.'
WebUI.callTestCase(findTestCase('Components/VerifyDueOnDate'), [:], FailureHandling.STOP_ON_FAILURE)

'Switch to window index.'
WebUI.callTestCase(findTestCase('Components/SwitchToIndexedWindow'), [('windowIndex') : '0'], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Jira/PSI/Process Case (SMB)/BCAISPS-14457/BCAISPS-14457.TCID001', new TestCaseBinding('Test Cases/Jira/PSI/Process Case (SMB)/BCAISPS-14457/BCAISPS-14457.TCID001',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
