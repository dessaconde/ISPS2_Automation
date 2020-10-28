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

//Component Name: VerifyCaseStageLHS
//dev: Shayne Cardona
//Purpose: To verify the stage of the case in the case stage lhs


'1 sec hard wait. '
Thread.sleep(1000)

'Highlight case stage details.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyCaseStagesLHS/Page_ISPS2/Page_ISPS2/div_Case Stage Details'))

'Verify the case stage details header is visible.'
WebUI.verifyElementPresent(findTestObject('Objects.VerifyCaseStagesLHS/Page_ISPS2/Page_ISPS2/div_Case Stage Details'), 0)

'1 sec hard wait. '
Thread.sleep(1000)

'modify the case ref no in case stage window.'
modifiedcaseref = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyCaseStagesLHS/Page_ISPS2/XPI_caserefincasestage'), 
    'xpath', 'equals', ((('(//div[(text() = "' + GlobalVariable.CRN) + '" or . = "') + GlobalVariable.CRN) + '")])[1]', 
    true)

'Highlight the modified case ref no.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedcaseref)

