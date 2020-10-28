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

//*******************************************************//
//****************** ClickRadioButtonRegulatoryRequirement ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 4th of February, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Highlight Approved Document'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ClickRadioButtonRegulatoryRequirements/ApprovedDocument'))

'Choose approved document'
not_run: WebUI.click(findTestObject('Objects.ClickRadioButtonRegulatoryRequirements/span_Building Control (Environment Sustainability) Regulations 2008_radiofield-1851-displayEl'))

modifiedRadioButton = WebUI.modifyObjectProperty(findTestObject('Objects.ClickRadioButton/DynamicRadioButton'), 'xpath', 
    'equals', ('(//span[contains(@class, \'x-form-field x-form-radio x-form-radio-default x-form-cb x-form-cb-default \')])[' + 
    Index) + ']', true)

'Highlights the chosen radio button'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedRadioButton)

'Clicks the radio button'
WebUI.click(modifiedRadioButton)

