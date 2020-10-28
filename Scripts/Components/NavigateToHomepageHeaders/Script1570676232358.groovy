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

'Verify page is loaded before proceeding. '
WebUI.waitForPageLoad(30)

'Modifies the \'Text\' property of the preferred header to navigate. '
modifiedHeader = WebUI.modifyObjectProperty(findTestObject('Objects.NavigateToHomepageHeaders/Page_ISPS2/div_Header'), 'text', 
    'equals', headerText, true)

'Verify that the modified header is clickable before interacting with it. '
WebUI.verifyElementClickable(modifiedHeader)

'Clicks the modified header. '
WebUI.click(modifiedHeader)

'Best practice: Wait for 7 seconds after a page navigation component. '
Thread.sleep(7000)

