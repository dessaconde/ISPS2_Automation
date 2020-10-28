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
import org.openqa.selenium.Keys as Keys

//*******************************************************//
//****************** PopulateVIRSubmitDate ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 29th of January, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
Thread.sleep(1000)

'Wait for a second before proceeding to further automated steps.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/span_VIR Submit Date'))

not_run: WebUI.click(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/VIRSubmitDate'))

'Click the \'VIR Submit Date\' Field'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/VIRSubmitDate'), 
    0)

'Press arrow down key to show the calendar'
WebUI.sendKeys(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/VIRSubmitDate'), Keys.chord(Keys.ARROW_DOWN))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/div_Calendar'))

'Click today'
WebUI.click(findTestObject('Objects.PopulateVIRSubmitDate/Page_ISPS2/Page_ISPS2/span_Today'))

