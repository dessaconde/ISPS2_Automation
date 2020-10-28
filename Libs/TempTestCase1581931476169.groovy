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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\BE\\Process Submission Quality Points\\BCAISPS-14656\\BCAISPS-14656.TCID001\\20200217_172436\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Jira/BE/Process Submission Quality Points/BCAISPS-14656/BCAISPS-14656.TCID001', new TestCaseBinding('Test Cases/Jira/BE/Process Submission Quality Points/BCAISPS-14656/BCAISPS-14656.TCID001',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
