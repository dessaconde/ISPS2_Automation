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

'Login.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Pre-Submission Consultation Application cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Pre-Submission Consultation Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Select Process EME Pre-Submission Consultation Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Record Inspection LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Record Inspection'], FailureHandling.STOP_ON_FAILURE)

'Get the case ref no of the case.'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Click Add.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Populate record inspection details'
WebUI.callTestCase(findTestCase('Components/ManipulateRecordInpectionDetails'), [('consultationNumber') : '2nd', ('appointmentBy') : 'Post'
        , ('consultationDate') : '22/11/2019', ('dateOfWD') : '21/12/2019', ('QPReplyToWD') : '12/12/2019', ('NoDefectsObserved') : 'Yes'
        , ('inspRemarks') : 'As-built Record Inspection Inspection Remarks testing'], FailureHandling.STOP_ON_FAILURE)

'Click Reset.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Populate record inspection details'
WebUI.callTestCase(findTestCase('Components/ManipulateRecordInpectionDetails'), [('consultationNumber') : '2nd', ('appointmentBy') : 'Post'
        , ('consultationDate') : '22/11/2019', ('dateOfWD') : '21/12/2019', ('QPReplyToWD') : '12/12/2019', ('NoDefectsObserved') : 'Yes'
        , ('inspRemarks') : 'As-built Record Inspection Inspection Remarks testing'], FailureHandling.STOP_ON_FAILURE)

'Click Cancel.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if the details were saved or not saved.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyRecordInspectionEME'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Add.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Populate record inspection details'
WebUI.callTestCase(findTestCase('Components/ManipulateRecordInpectionDetails'), [('consultationNumber') : '2nd', ('appointmentBy') : 'Post'
        , ('consultationDate') : '22/11/2019', ('dateOfWD') : '21/12/2019', ('QPReplyToWD') : '12/12/2019', ('NoDefectsObserved') : 'Yes'
        , ('inspRemarks') : 'As-built Record Inspection Inspection Remarks testing'], FailureHandling.STOP_ON_FAILURE)

'Click Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify if the details were saved or not saved.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyRecordInspectionEME'), [:], FailureHandling.STOP_ON_FAILURE)

'Manipulate record inspection attached plans.'
WebUI.callTestCase(findTestCase('Components/ManipulateRecordInspectionAttachedPlans'), [('remarks') : 'Record Inspection Attached Plans Testing 1'
        , ('remarks2') : 'Record Inspection Attached Plans Testing 2'], FailureHandling.STOP_ON_FAILURE)

'Manipulate record inspection attached plans.'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateRecordInspectionAttachedPlans'), [('remarks') : 'yow', ('remarks2') : 'yow2'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the details were saved succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Cancel'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Verify the saved records were present in the page.'
WebUI.callTestCase(findTestCase('Components/VerifyManipulateRecordInspectionAttachedPlans'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Cancel.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Navigate to Dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

