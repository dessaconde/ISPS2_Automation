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



RunConfiguration.setExecutionSettingFile("C:\\Users\\19033-JWVP\\Desktop\\ISPS Automation (Latest)\\Reports\\Jira Automated Regression Suite (JARS)\\20200217_170536\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Jira Automated Regression Suite (JARS)', suiteProperties, [new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID001', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID001',  null), new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID002', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID002',  null), new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID003', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID003',  null), new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID004', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID004',  null), new TestCaseBinding('Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID005', 'Test Cases/Jira/BE/Utilities/BCAISPS-14745/BCAISPS-14745.TCID005',  null)])
