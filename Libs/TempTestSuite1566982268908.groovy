import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Jira Automated Regression Suite (JARS)')

suiteProperties.put('name', 'Jira Automated Regression Suite (JARS)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\19033-JWVP\\Desktop\\ISPS2 Automation\\Reports\\Jira Automated Regression Suite (JARS)\\20190828_165108\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Jira Automated Regression Suite (JARS)', suiteProperties, [new TestCaseBinding('Test Cases/Jira/ISPSII-4256/ISPSII-4256.TSID002.TCID001', 'Test Cases/Jira/ISPSII-4256/ISPSII-4256.TSID002.TCID001',  null), new TestCaseBinding('Test Cases/Jira/ISPSII-4256/ISPSII-4256.TSID004.TCID001', 'Test Cases/Jira/ISPSII-4256/ISPSII-4256.TSID004.TCID001',  null)])
