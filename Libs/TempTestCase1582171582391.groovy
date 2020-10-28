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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Components\\IntoTheUnknown\\20200220_120622\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Login.'
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 
            1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Plan Application cases.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
not_run: WebUI.callTestCase(findTestCase('Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Objects.IntoTheUnknown/objectToModify'), 'Project Reference No:')

not_run: modifiedTag = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/objectToModify'), 'tag', 
    'equals', tagToModify, true)

not_run: modified = WebUI.modifyObjectProperty(modifiedTag, 'text', 'equals', textToModify, true)

//CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject(modified))

not_run: complexlyModifiedButtonGG = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/objectToModify'), 
    'xPath', 'equals', ((('//"' + tagToModify) + '" [(text() ="') + textToModify) + '")]', false)

not_run: WebUI.verifyElementPresent(modified, 0)

not_run: elementText = WebUI.getText(modified)

not_run: elementText.toUpperCase()

not_run: comparedText = elementText.equalsIgnoreCase(textToModify)

not_run: WebUI.verifyElementText(comparedText, textToModify)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)

'Wait.'
not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

not_run: modifiedCheckBox = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/checkbox'), 'xpath', 'equals', 
    ('(//div[@class=\\'x-grid-row-checker\\'])[' + Index) + ']', true)

not_run: WebUI.click(modifiedCheckBox)

not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : '3000'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 7], FailureHandling.STOP_ON_FAILURE)

modifiedcal = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/cal'), 'xPath', 'equals', ('(//div[contains(@class, \\'x-form-trigger x-form-trigger-default x-form-date-trigger x-form-date-trigger-default \\')])[' + 
    Index) + ']', false)

CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedcal, 0)

'Wait for 1 sec.'
not_run: Thread.sleep(3000)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : '1000'], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.IntoTheUnknown/today'), 
    0)

not_run: WebUI.click(modifiedcal)

WebUI.click(findTestObject('Objects.IntoTheUnknown/today'))

not_run: WebUI.sendKeys(findTestObject('Objects.IntoTheUnknown/today_a'), Keys.chord(Keys.SPACE))

''', 'Test Cases/Components/IntoTheUnknown', new TestCaseBinding('Test Cases/Components/IntoTheUnknown',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
