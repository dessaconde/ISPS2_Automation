import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

//Component Name: VerifyCaseStageFromUniversalSearch
//Dev: Shayne Cardona
//Purpose: To access and verify case stage in the universal search


'1 sec hard wait. '
Thread.sleep(1000)

'Modify object property.'
not_run: WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/a_case ref no'), 
    'text', 'equals', GlobalVariable.CRN, false)

'Verify the case ref no is present.'
WebUI.verifyTextPresent(GlobalVariable.CRN, false)

'Modify object property.'
modifiedStat = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStatusInUniversalSearch/Page_ISPS2/caseStatus'), 
    'text', 'equals', caseStat, true)

'Right click modified object.'
WebUI.rightClick(modifiedStat)

'1 sec hard wait. '
Thread.sleep(1000)

'Modify object property.'
WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStageFromUniversalSearch/Page_ISPS2/caseOptions'), 'text', 
    'equals', caseOptions, true)

'Click modified object.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.VerifyCaseStageFromUniversalSearch/Page_ISPS2/caseOptions'), 
    0)

'3 seconds hard wait. '
Thread.sleep(3000)

'Switct to window index 1.'
WebUI.switchToWindowIndex(1)

'Modify application type.'
modifiedApplType = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStageFromUniversalSearch/XPI_applicationType'), 
    'xPath', 'equals', ('(//div[text()="' + applicationType) + '"])[1]', true)

'Highlight modified application type.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedApplType)

'Modify stage description.'
modifiedStageDesc = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStageFromUniversalSearch/XPI_stageDesc'), 
    'xPath', 'equals', ('(//div[text()="' + stageDesc) + '"])[1]', true, FailureHandling.OPTIONAL)

'Highlight stage description.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedStageDesc)

'Modify officer.'
modifiedOfficer = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStageFromUniversalSearch/XPI_officer'), 'xPath', 
    'equals', ('(//div[text()="' + officer) + '"])[1]', true)

'Highlight modified officer.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedOfficer)

'1 sec hard wait. '
Thread.sleep(1000)

'Close window index 1.'
WebUI.closeWindowIndex(1)

