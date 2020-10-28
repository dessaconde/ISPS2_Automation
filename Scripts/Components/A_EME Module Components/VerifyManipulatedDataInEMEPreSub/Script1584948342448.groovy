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

'Wait for a second before proceeding to other automated steps. '
Thread.sleep(1000)

'Verify that the \'Plan Ref. No\' that was set Main Form page is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.planRefNo, false)

'Verify that the \'Qualified Person Name\' that was set Main Form page is reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.qualifiedPerson, false)

'Verify that the \'Qualified Person Tel No.\' that was set Main Form page is reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.qualifiedPersonTelNo, false)

'Verify that the \'Decision\' that was set Main Form page is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Decision, false)

'Verify that the \'Meeting Date\' that was set Main Form page is reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.meetingDate, false)

'Verify that the \'Meeting Time\' that was set Main Form page is reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.meetingTime, false)

'Verify that the \'Remarks\' that was set Main Form page is reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Remarks, false)

