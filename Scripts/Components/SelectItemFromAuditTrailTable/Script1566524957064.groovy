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

Thread.sleep(1000)

WebUI.waitForElementVisible(findTestObject('Objects.SelectItemFromAuditTrailTable/Page_ISPS2/div_Search Result'), 120)

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.SelectItemFromAuditTrailTable/Page_ISPS2/span_Audit Date'))

WebUI.click(findTestObject('Objects.SelectItemFromAuditTrailTable/Page_ISPS2/span_Audit Date'))

modifiedSelection = WebUI.modifyObjectProperty(findTestObject('Objects.SelectItemFromAuditTrailTable/Page_ISPS2/LinkToModify'), 
    'text', 'contains', LinkToModify, true)

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(modifiedSelection)

Thread.sleep(3000)

