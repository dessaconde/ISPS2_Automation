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


suiteProperties.put('id', 'Test Suites/Functional Automated Regression Suite (FARS)')

suiteProperties.put('name', 'Functional Automated Regression Suite (FARS)')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Intern\\Desktop\\n\\Reports\\Functional Automated Regression Suite (FARS)\\20200211_164900\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Functional Automated Regression Suite (FARS)', suiteProperties, [new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Lot', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Lot',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.MainForm-Summary', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.MainForm-Summary',  null)])
