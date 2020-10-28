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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19023-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Components\\Logout\\20200508_013137\\execution.properties')

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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

not_run: Thread.sleep(3000)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/accountDropdown'))

not_run: WebUI.click(findTestObject('Objects.Logout/accountDropdown'))

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.Logout/accountDropdown'), 
    0)

not_run: WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Objects.Logout/accountDropdown'), 30)

not_run: WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/span_Logout'))

not_run: WebUI.click(findTestObject('Objects.Logout/span_Logout'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForPageLoad(30)

not_run: Thread.sleep(3000)

WebUI.verifyTextPresent('LogoutPageTextToBeVerified', false)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Logout/div_Sign in to ISPS2-PROD-Verify'))

WebUI.closeBrowser()

''', 'Test Cases/Components/Logout', new TestCaseBinding('Test Cases/Components/Logout',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
