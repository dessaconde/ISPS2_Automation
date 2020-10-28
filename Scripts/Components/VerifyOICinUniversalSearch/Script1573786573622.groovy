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

//Component Name: VerifyOICInUniversalSearch
//Dev: Shayne Cardona
//Purpose: To verify the officer in charge in the universal search

'3 seconds hard wait. '
Thread.sleep(1000)

'Verify the case ref no is present.'
WebUI.verifyTextPresent(GlobalVariable.CRN, true)

'3 seconds hard wait. '
Thread.sleep(1000)

'Highlight officer in charge.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyOICinUniversalSearch/Page_ISPS2/font_Officer In-Charge'))

'Modify object property.'
modifiedOIC = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyOICinUniversalSearch/Page_ISPS2/font_emetester1'), 
    'text', 'equals', oic, true)

'Highlight the modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedOIC)

