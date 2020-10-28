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

WebUI.click(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/div_Record Inspection'))

Thread.sleep(5000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/div_Record Inspection_Header'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_RecordInspectionTableColumn1'))

if (WebUI.verifyElementPresent(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_RecordInspectionTableColumn1'), 
    3, FailureHandling.OPTIONAL) == true) {
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionNo'))

    inspectionNo = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionNo'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionDate'))

    inspectionDate = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionDate'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionOfficer'))

    inspectionOfficer = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionOfficer'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionType'))

    inspectionType = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_InspectionType'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_BlkShe'))

    blkHse = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_BlkShe'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_CaseStatusDate'))

    caseStatusDate = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_CaseStatusDate'))

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_CaseStatus'))

    caseStatus = WebUI.getText(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/XPA_CaseStatus'))

    Thread.sleep(2000)

    WebUI.click(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/div_Summary'))

    Thread.sleep(5000)

    WebUI.scrollToElement(findTestObject('Objects.VerifyRecordInspection/Page_ISPS2/div_Record Inspection_SummaryPage'), 
        0)

    Thread.sleep(1000)

    WebUI.verifyTextPresent(inspectionNo, false)

    WebUI.verifyTextPresent(inspectionDate, false)

    WebUI.verifyTextPresent(inspectionOfficer, false)

    WebUI.verifyTextPresent(inspectionType, false)

    WebUI.verifyTextPresent(blkHse, false)

    WebUI.verifyTextPresent(caseStatusDate, false)

    WebUI.verifyTextPresent(caseStatus, false)
} else {
    WebUI.click(findTestObject('Objects.VerifyOwnerOfThePremisesAndDetails/Page_ISPS2/div_Summary'))

    Thread.sleep(3000)
}

