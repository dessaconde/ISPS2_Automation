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

'Wait for a second before proceeding to further automated steps. '
Thread.sleep(1000)

'Verify that the user is in Main Form page.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/div_Main Form'))

'Verify that the \'Plan Ref. No\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Plan Ref No'))

'Locate the \'Plan Ref. No\' in the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/XPA_planRefNoValue'))

'Gets the \'Plan Ref. No\' of the case and store it in a Global Variable for further verification. '
planRefNo = WebUI.getText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/XPA_planRefNoValue'))

'Store the captured \'Plan Ref. No\' to its respective Global Variable. '
GlobalVariable.planRefNo = planRefNo

'Verify that the \'Send Date\' is present on the page. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Send Date'))

'Verify that the \'Qualified Person Name\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Qualified Person Name'))

'Gets the \'Qualified Person Name\' of the case and store it in a Global Variable for further verification. '
qualifiedPersonName = WebUI.getText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/XPA_qualifiedPersonNameValue'))

'Store the captured \'Qualified Person Name\' to its respective GLobal Variable. '
GlobalVariable.qualifiedPerson = qualifiedPersonName

'Verify that the \'Qualified Person Tel No\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Qualified Person Tel No'))

'Gets the \'Qualified Person Tel No.\' of the case and store it in a Global Variable for further verification. '
qualifiedPersonTelNo = WebUI.getText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/XPA_qualifiedPersonTelNoValue'))

'Store the captured \'Qualified Person Tel No.\' to its respective GLobal Variable. '
GlobalVariable.qualifiedPersonTelNo = qualifiedPersonTelNo

'Verify that the \'Decision\' is present on the page. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Decision'))

'Verify that the \'Decision\' input field is present in the page before manipulating. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__decisionCd'))

'Populate the field with a dynamic variable. '
not_run: WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__decisionCd'), Decision)

'Store the captured \'Decision\' to its respective GLobal Variable. '
not_run: GlobalVariable.Decision = Decision

'Verify that the \'Meeting Date\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Meeting Date'))

'Verify that the \'Meeting Date\' input field is present in the page before manipulating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__meetingDate'))

'Populate the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__meetingDate'), meetingDate)

'Store the captured \'Meeting Date\' to its respective GLobal Variable. '
GlobalVariable.meetingDate = meetingDate

'Verify that the \'Meeting Time\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Meeting Time'))

'Verify that the \'AM/PM\' input field is present in the page before manipulating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__amPm'))

'Populate the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input_hh_min'), AMPM)

'Verify that the \'Minute\' input field is present in the page before manipulating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input_hh_min'))

'Populate the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input_hh_min'), Minute)

'Verify that the \'Hour\' input field is present in the page before manipulating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__hour'))

'Populate the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/input__hour'), Hour)

'Store the captured \'Meeting Time\' to its respective GLobal Variable. '
GlobalVariable.meetingTime = ''

'Verify that the \'Remarks\' is present on the page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/span_Remarks'))

'Verify that the \'Remarks\' input field is present in the page before manipulating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/textarea_Remarks_remarks'))

'Populate the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEPreSubMainForm/Page_ISPS2/textarea_Remarks_remarks'), Remarks)

'Store the captured \'Remarks\' to its respective GLobal Variable. '
GlobalVariable.Remarks = Remarks

