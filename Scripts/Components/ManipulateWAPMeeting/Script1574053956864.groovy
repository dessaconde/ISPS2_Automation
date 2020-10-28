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

'Wait for moment before proceeding to further automated steps. '
Thread.sleep(1000)

'Verify that WAP Meeting field is present in page before manipulating it\'s input field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateWAPMeeting/Page_ISPS2/span_Wap Meeting'))

'Locates the WAP Meeting field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateWAPMeeting/Page_ISPS2/input_Wap Meeting_wapMtgDate'))

'Populates the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateWAPMeeting/Page_ISPS2/input_Wap Meeting_wapMtgDate'), WAPMeetingDate)

