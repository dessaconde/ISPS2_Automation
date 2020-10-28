import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Component Name: ManipulateRecordInspectionDetails
//Author: Shayne Cardona
//Purpose: To manipulate the record inspection details screen/lhs

'Wait for 1 sec.\r\n'
Thread.sleep(1000)

'Get inspection reference no.'
GlobalVariable.IRN = WebUI.getText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/div_insprefno'))

// = tempVar
'Verify that the case ref no is present/the same.'
WebUI.verifyTextPresent(GlobalVariable.CRN, false)

'Highlight the consultation no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__consultationNumber'))

'Set text on the consultation no field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__consultationNumber'), consultationNumber)

'Highlight the appointment by field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__AppointmentBy'))

'Set text on the appointment by field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__AppointmentBy'), appointmentBy)

'Highlight the consultation date field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__consultationDate'))

'Set text on the consultation date field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input__consultationDate'), consultationDate)

'Highlight date of wd date field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_Date of WD'))

'Set text on the date of wd date field.'
not_run: WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_Date of WD'), dateOfWD)

'Highlight reply to qp date field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_QP Reply to WD'))

'Set text on the reply to qp date field.'
not_run: WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_QP Reply to WD'), QPReplyToWD)

'Highlight no of defects observed field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_No Defects Observed'))

'Set text on the no of defects observed field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/input_No Defects Observed'), NoDefectsObserved)

'Highlight inspection remarks field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/textarea_Inspection Remarks'))

'Set text on inspection remarks field.'
WebUI.setText(findTestObject('Objects.ManipulateRecordInspectionDetails/Page_ISPS2/textarea_Inspection Remarks'), inspRemarks)

