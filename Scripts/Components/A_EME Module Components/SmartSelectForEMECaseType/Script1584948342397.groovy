import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Reads the input of the tester, if the variable contains \'Lift\' then proceed inside the if condition. '
if (caseType == 'Lift') {
    'Verify that there is a list case type from the list. Finds a case reference number with \'LP\'. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SmartSelectOfEMECaseType/XPI.LiftCaseToManipulate'))

    'Right clicks the case first lift case. '
    WebUI.rightClick(findTestObject('Objects.SmartSelectOfEMECaseType/XPI.LiftCaseToManipulate'))
} else if (caseType == 'Escalator') {
    'Else if the input of the variable contains \'Escalator\' then proceed inside this else if condition.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SmartSelectOfEMECaseType/XPI.EscalatorCaseToManipulate'))

    'Verify that there is an escalator case type from the list. Finds a case reference number with \'EP\'. '
    WebUI.rightClick(findTestObject('Objects.SmartSelectOfEMECaseType/XPI.EscalatorCaseToManipulate'))
}

'Verify that \'Process Task\' is present in the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SmartSelectOfEMECaseType/XP.ProcessTask'))

'Clicks the \'Process Task\' to open the case.'
WebUI.click(findTestObject('Objects.SmartSelectOfEMECaseType/XP.ProcessTask'))

'Wait for the loading pop-up to occur.'
WebUI.waitForElementPresent(findTestObject('Objects.SmartSelectOfEMECaseType/div_Loading search result Please wait'), 3)

'Wait for the loading pop-up to disappear.'
WebUI.waitForElementNotPresent(findTestObject('Objects.SmartSelectOfEMECaseType/div_Loading search result Please wait'), 
    120)

'Wait for 3 seconds for the page to load all the UI completely. '
Thread.sleep(3000)

'Verify that the user is navigated inside the selected case. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SmartSelectOfEMECaseType/XP.EMEHeader'))

