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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19033-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Components\\IntoTheUnknown\\20200213_121102\\execution.properties')

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
            17), ('Password') : findTestData('Datatable').getValue('Password', 18)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Plan Application cases.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME AS-built Submission'], 
    FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
not_run: WebUI.callTestCase(findTestCase('Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Objects.IntoTheUnknown/objectToModify'), 'Project Reference No:')

modifiedTag = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/objectToModify'), 'tag', 'equals', 
    tagToModify, true)

modified = WebUI.modifyObjectProperty(modifiedTag, 'text', 'equals', textToModify, true)

//CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject(modified))

not_run: complexlyModifiedButtonGG = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/objectToModify'), 
    'xPath', 'equals', ((('//"' + tagToModify) + '" [(text() ="') + textToModify) + '")]', false)

not_run: WebUI.verifyElementPresent(modified, 0)

not_run: elementText = WebUI.getText(modified)

not_run: elementText.toUpperCase()

not_run: comparedText = elementText.equalsIgnoreCase(textToModify)

not_run: WebUI.verifyElementText(comparedText, textToModify)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)

''', 'Test Cases/Components/IntoTheUnknown', new TestCaseBinding('Test Cases/Components/IntoTheUnknown',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
