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

'Hard coded wait for visualization purposes. '
Thread.sleep(3000)

'Verify that the menu beside ISPS2 banner is visible before clicking it. '
WebUI.verifyElementVisible(findTestObject('Objects.NavigateToDataShare/div_ISPS2-PROD-Verify_component-1013'))

'Click the menu after successful verification that the menu is visible.'
WebUI.click(findTestObject('Objects.NavigateToDataShare/div_ISPS2-PROD-Verify_component-1013'))

'Hover to \'Enquiries\' inside the pane.'
WebUI.mouseOver(findTestObject('Objects.NavigateToDataShare/span_Enquiries'))

'Inside \'Enquiries\' pane, hover to \'Common\'.'
WebUI.mouseOver(findTestObject('Objects.NavigateToDataShare/span_Common'))

WebUI.click(findTestObject('Objects.NavigateToEnquireAuditTrail/span_Enquire Audit Trail'))

WebUI.verifyElementPresent(findTestObject('Objects.NavigateToEnquireAuditTrail/div_Enquire Audit Trail'), 120)

