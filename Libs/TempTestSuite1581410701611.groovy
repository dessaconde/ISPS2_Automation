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



RunConfiguration.setExecutionSettingFile("C:\\Users\\Intern\\Desktop\\n\\Reports\\Functional Automated Regression Suite (FARS)\\20200211_164501\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Functional Automated Regression Suite (FARS)', suiteProperties, [new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Address', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Address',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.CaseStages', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.CaseStages',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.CloseCase', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.CloseCase',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Contractor', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Contractor',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.DataValidations', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.DataValidations',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Developer', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Developer',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueApproval', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueApproval',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueDisapproval', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueDisapproval',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueWD', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueWD',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.KIV', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.KIV',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Lot', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Lot',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.MainForm-Summary', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.MainForm-Summary',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonInstallation', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonInstallation',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonSubmission', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonSubmission',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonTesting', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.QualifiedPersonTesting',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Recommend', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Recommend',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.VerificationCheck', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.VerificationCheck',  null), new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Withdrawal', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.Withdrawal',  null)])
