import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\BE\\BCAISPS-14745\\BCAISPS-14745.TCID001\\20200213_164235\\execution.properties')

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

'Log in.\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 
            1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'dummy ac name'], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Jira/BE/BCAISPS-14745/BCAISPS-14745.TCID001', new TestCaseBinding('Test Cases/Jira/BE/BCAISPS-14745/BCAISPS-14745.TCID001',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
