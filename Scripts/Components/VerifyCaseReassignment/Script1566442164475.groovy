import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.remote.server.DriverFactory as DriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'3 seconds hard wait. '
Thread.sleep(1000)

WebUI.verifyElementPresent(findTestObject('Objects.VerifyCaseReassignment/div_Search Result'), 120000)

WebUI.verifyElementPresent(findTestObject('Objects.VerifyCaseReassignment/span_last page button'), 3000, FailureHandling.OPTIONAL)

'3 seconds hard wait. '
Thread.sleep(3000)

WebUI.click(findTestObject('Objects.VerifyCaseReassignment/span_last page button'), FailureHandling.OPTIONAL)

'3 seconds hard wait. '
Thread.sleep(4000)

WebUI.verifyElementPresent(findTestObject('Objects.VerifyCaseReassignment/div_reassign successfully'), 0)

WebUI.click(findTestObject('Objects.VerifyCaseReassignment/a_Reassign Successfully Link'))

Thread.sleep(5000)

WebUI.verifyTextNotPresent('reassignToOfficer - CMMI_rTO_TCACSUT', false)

Thread.sleep(5000)

WebUI.click(findTestObject('Objects.VerifyCaseReassignment/span_Close'))

