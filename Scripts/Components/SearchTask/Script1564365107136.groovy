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

Thread.sleep(3000)

WebUI.verifyElementPresent(findTestObject('Objects.SearchTask/Page_ISPS2/a_'), 0)

WebUI.click(findTestObject('Objects.SearchTask/Page_ISPS2/a_'))

WebUI.verifyElementVisible(findTestObject('Objects.SearchTask/Page_ISPS2/div_Saved Filter'))

Thread.sleep(3000)

WebUI.click(findTestObject('Objects.SearchTask/Page_ISPS2/span_Reset'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SearchTask/Page_ISPS2/input_Task Description_searchCriteriaPojotaskDescription'))

WebUI.setText(findTestObject('Objects.SearchTask/Page_ISPS2/input_Task Description_searchCriteriaPojotaskDescription'), 
    'Process Temporary Building Permit')

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.SearchTask/Page_ISPS2/div_Process Temporary Building Permit'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SearchTask/Page_ISPS2/span_Search'))

WebUI.click(findTestObject('Objects.SearchTask/Page_ISPS2/span_Search'))

Thread.sleep(500)

WebUI.waitForElementNotPresent(findTestObject('Objects.SearchTask/Page_ISPS2/div_Loading search result Please wait'), 120, 
    FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.scrollToElement(findTestObject('Objects.SearchTask/Page_ISPS2/a_Process Temporary Building Permit'), 0)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.SearchTask/Page_ISPS2/a_Process Temporary Building Permit'))

not_run: WebUI.click(findTestObject('Objects.SearchTask/Page_ISPS2/a_Process Temporary Building Permit'))

CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.SearchTask/Page_ISPS2/a_Process Temporary Building Permit'), 
    0)

Thread.sleep(500)

WebUI.waitForElementPresent(findTestObject('Objects.SearchTask/Page_ISPS2/div_Process Temporary Building Permit_LandingPage'), 
    120)

Thread.sleep(3000)

