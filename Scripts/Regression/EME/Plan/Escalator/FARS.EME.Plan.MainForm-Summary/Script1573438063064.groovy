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

'Login to ISPS2.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigates the user to \'My Tasks\' tab. '
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter tasks - \'Process EME Plan Application\''
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select a case type depending on input - Lift/Escalator.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Escalator'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Populate all the fields in EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEMainForm'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Esc) //This should be resetted.'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test. //This should be resetted. '
        , ('notificationOfAppointmentDate') : '25/02/2017', ('alternativeSolutionDate') : '29/03/2018', ('waiverModificationFormDate') : '17/06/2019'
        , ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate. //This should be resetted. '], 
    FailureHandling.STOP_ON_FAILURE)

'Checks the functionality of reset button within EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Repopulates the whole EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEMainForm'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Esc)'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test. ', ('notificationOfAppointmentDate') : '24/02/2016'
        , ('alternativeSolutionDate') : '28/03/2017', ('waiverModificationFormDate') : '16/06/2020', ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks on the Save button within EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify successful saved changes. '
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigates to Summary LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify all the data that was set and manipulated from EME Main Form page is all reflected in Summary page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyManipulatedDataInEMESummary'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Esc)'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test.', ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate.'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigates back to Main Form page. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Clicks the Add button to test the functionality of it. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Clicks the Back button after clicking the Add button to verify its functionality. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Back', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Clicks the Add button again to test all the functionality inside of the Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Manipulates and populates all the field inside the Esc Details page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEPlanEscalatorDetails'), [('escalatorNumber') : 'ESC001', ('riseOfEscalator') : '16'
        , ('brandName') : 'Fujitec', ('modelNumber') : 'FJTC0032', ('escalatorType') : 'Escalator (With Steps)', ('inclinationAngle') : '19'
        , ('stepPalletWidth') : '925', ('ratedSpeed') : '32', ('balustradeType') : 'Glass', ('driveChainNumber') : '12A'
        , ('eStopSwitches') : '2', ('driveChainType') : 'Triplex', ('flatStepsAtLanding') : '1', ('controllerModel') : 'CM121632'
        , ('driveMachineModel') : 'DMM01921', ('driveMachineBrakeModel') : 'DMB75325', ('auxiliaryBrakeModel') : 'AVM89046'
        , ('codeComplianceWith') : 'Alternative Standard', ('codeComplianceWithTextArea') : '\'Code Compliance with\' text.'
        , ('With') : 'No deviation from code', ('certificateNumber') : 'D013X05', ('expiryDate') : '24/02/2020', ('notifiedBody') : 'Building Construction Authority'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Step/Pallet)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 6], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Step / Pallet', ('OEM') : 'OEM textfield automated string population. '
        , ('modelNo') : 'FDC85264', ('countryOfManufacture') : 'Scotland', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (PESSRAE)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 6], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'PESSRAE', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'X0275280', ('countryOfManufacture') : 'Singapore', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Step/Pallet)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 6], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Step / Pallet', ('OEM') : 'OEM textfield automated string population. '
        , ('modelNo') : 'FDC85264', ('countryOfManufacture') : 'Scotland', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Deletes the most recent entry in Component Type Test.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Checks on the \'No\' button functionality.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'No', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks on \'Delete\' button again. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Clicks on \'Yes\' button to finally delete the entry. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Yes', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Save\' button to reflect changes. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigates the user to Summary LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that was set and manipulated from the Esc Details page in Main Form is reflecting in Summary page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyManipulatedDataInEMEPlanEscalator'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

