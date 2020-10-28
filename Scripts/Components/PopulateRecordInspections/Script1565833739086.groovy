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

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Locates the \'List of Inspection\' header to verify that the user is currently at Add Record Inspections page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/div_List of Inspections'))

'Locates the \'Inspection Officer\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input_Inspection Officer_inspOfficer'))

'Sets a dynamic text in the \'Inspection Officer\' field sourcing from Datatable. '
WebUI.setText(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input_Inspection Officer_inspOfficer'), InspectionOfficer)

'Locates the \'Inspection Type\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input__inspectionType'))

'Sets a dynamic text in the \'Inspection Type\' field sourcing from Datatable. '
WebUI.setText(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input__inspectionType'), InspectionType)

'Locates the \'Inspection Date\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input__inspectionDate'))

'Sets a dynamic text in the \'Inspection Date\' field sourcing from Datatable. '
WebUI.setText(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/input__inspectionDate'), InspectionDate)

'Locates the \'Remarks\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/textarea_Remarks_remarks'))

'Sets a dynamic text in the \'Remarks\' field sourcing from Datatable. '
WebUI.setText(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/textarea_Remarks_remarks'), Remarks)

'Locates the \'Inspection Reference Number\' to get the text. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XPA_InspectionReferenceNumber'))

'Gets the string value of \'Inspection Reference Number\'. '
inspectionReferenceNumber = WebUI.getText(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XPA_InspectionReferenceNumber'))

'Locates the \'Save\' button.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XP_SaveButton'))

'Clicks the \'Save\' button. '
WebUI.click(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XP_SaveButton'))

WebUI.verifyTextPresent('Successfully saved.', false)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XP_CancelButton'))

WebUI.click(findTestObject('Objects.PopulateRecordInspections/Page_ISPS2/XP_CancelButton'))

WebUI.verifyTextPresent(inspectionReferenceNumber, false)

