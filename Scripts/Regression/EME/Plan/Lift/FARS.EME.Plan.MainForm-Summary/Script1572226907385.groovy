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

'Log-in to ISPS2.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigates the user to \'My Tasks\' tab. '
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter tasks - \'Process EME Plan Application\''
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select a case type depending on input - Lift/Escalator.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Populate all the fields in EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEMainForm'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Lift) //This should be resetted.'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test. //This should be resetted. '
        , ('notificationOfAppointmentDate') : '25/02/2017', ('alternativeSolutionDate') : '29/03/2018', ('waiverModificationFormDate') : '17/06/2019'
        , ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate. //This should be resetted. '], 
    FailureHandling.STOP_ON_FAILURE)

'Checks the functionality of reset button within EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Repopulates the whole EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEMainForm'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Lift)'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test. ', ('notificationOfAppointmentDate') : '24/02/2017'
        , ('alternativeSolutionDate') : '28/03/2018', ('waiverModificationFormDate') : '16/06/2019', ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate. '], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks on the Save button within EME Main Form page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify successful saved changes. '
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigates to Summary LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify all the data that was set and manipulated from EME Main Form page is all reflected in Summary page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyManipulatedDataInEMESummary'), [('projectTitle') : 'Automation Testing - Test Data for CRUD Scenarios (Lift)'
        , ('descriptionOfBuildingWorks') : '\'Description of Building Works\' field automated populate test.', ('submittedDocuments') : '\'Submitted all the documents with exception\' text field autopopulate.'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigates back to Main Form page. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Clicks the Add button to test the functionality of it. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the Back button after clicking the Add button to verify its functionality. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Back', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the Add button again to test all the functionality inside of the Lift Details page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulates and populates all the field inside the Lift Details page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMELiftDetails'), [('liftNumber') : 'L001', ('accessibilityProvision') : 'Accessible Lift'
        , ('fireSafetyProvision') : 'Fire Lift', ('travelHeight') : '3', ('Hoistway') : '144', ('stopsServed') : '24', ('ratedSpeed') : '4'
        , ('brandName') : 'Schindler', ('modelNumber') : 'D013X05', ('liftType') : 'Goods Lift', ('machineRoom') : 'Machine Room'
        , ('gearedGearless') : 'Geared', ('codeCompliance') : 'Alternative Standard', ('codeComplianceTextArea') : '\'Code Compliance with\' field automated test.'
        , ('With') : 'No deviation from code', ('Depth') : '1900', ('Length') : '1400', ('Width') : '1400', ('carMass') : '1150'
        , ('maxPassengerCapacity') : '20', ('ratedLoad') : '2750', ('maxAllowableDecorWeight') : '1820', ('controllerModel') : 'F120'
        , ('machineBreakType') : 'Disc', ('tractionMachineModel') : 'Q970', ('machineBrakeModel') : 'EW4N', ('ropeBeltNumber') : '354'
        , ('suspensionRopeBeltConfigurationsA') : '1:1', ('suspensionRopeBeltConfigurationsB') : 'Single Wrap', ('suspensionRopeBeltConfigurationsC') : 'Underslung'
        , ('ropeBeltSize') : '12000', ('carDoorBrand') : 'Moz Inc.', ('carDoorOperatorModel') : '6UT0M', ('carDoorType') : 'Sliding Up'
        , ('photocellBrand') : 'LCPB032', ('photocellModel') : 'LCPM019', ('mechanicalEdgeProvided') : 'Yes', ('certificateNumber') : 'X0275280'
        , ('expiryDateOfCertificate') : '19/03/2020', ('notifiedBody') : 'Building Construction Authority', ('permissibleMass') : '1150'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Landing Door Locking Devices)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Landing Door Locking Devices'
        , ('OEM') : 'OEM textfield automated string population. ', ('modelNo') : '51N1G4N6', ('countryOfManufacture') : 'Amsterdam'
        , ('certificateNo') : 'AYQN4H', ('expiryDate') : '', ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : ''
        , ('permissibleMass') : ''], FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Landing Door Locking Devices)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Car Door Locking Devices', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'EN19033', ('countryOfManufacture') : 'Denmark', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Safety Gear)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Safety Gear', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'MN95147', ('countryOfManufacture') : 'Switzerland', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Constuction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : '1200'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Overspeed Governor)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Overspeed Governor', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'ISR0442', ('countryOfManufacture') : 'Berlin', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Buffers)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Buffers', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'DL67215', ('countryOfManufacture') : 'Moscow', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : '1600'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (PESSRAL)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'PESSRAL', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'KY75369', ('countryOfManufacture') : 'Kentucky', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Buildin Construction Authority', ('emergencyBrakeType') : '', ('permissibleMass') : ''], FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (ACOP)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'ACOP', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'CN15987', ('countryOfManufacture') : 'Tokyo', ('certificateNo') : 'AYQN4H', ('expiryDate') : ''
        , ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : 'Safety Gears', ('permissibleMass') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (UCMP)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'UCMP', ('OEM') : 'OEM textfield automated string population.'
        , ('modelNo') : 'DF35741', ('countryOfManufacture') : 'Rio', ('certificateNo') : 'AYQN4H', ('expiryDate') : '', ('notifiedBody') : 'Building Construction Authority'
        , ('emergencyBrakeType') : 'Sheave Jammer', ('permissibleMass') : ''], FailureHandling.STOP_ON_FAILURE)

'Clicks Add button to add an entry on Component Type Test. (Landing Door Locking Devices)'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 4], FailureHandling.STOP_ON_FAILURE)

'Populates the Component Type Test with dynamic variables. '
WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Landing Door Locking Devices'
        , ('OEM') : 'OEM textfield automated string population.', ('modelNo') : 'HL85264', ('countryOfManufacture') : 'Oslo'
        , ('certificateNo') : 'AYQN4H', ('expiryDate') : '', ('notifiedBody') : 'Building Construction Authority', ('emergencyBrakeType') : ''
        , ('permissibleMass') : ''], FailureHandling.STOP_ON_FAILURE)

'Deletes the most recent entry in Component Type Test.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Checks on the No button functionality.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'No', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks on Delete button again. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Clicks on Yes button to finally delete the entry. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Yes', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the Save button to reflect changes. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Navigates the user to Summary LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that was set and manipulated from the Lift Details page in Main Form is reflecting in Summary page. '
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/VerifyManipulatedDataInEMELiftDetails'), [('liftNumber') : 'L001', ('accessibilityProvision') : 'Accessible Lift'
        , ('fireSafetyProvision') : 'Fire Lift', ('travelHeight') : '3', ('Hoistway') : '144', ('stopsServed') : '24', ('ratedSpeed') : '4'
        , ('brandName') : 'Schindler', ('modelNumber') : 'D013X05', ('liftType') : 'GOODS LIFT', ('machineRoom') : 'Machine Room'
        , ('gearedGearless') : 'Geared', ('codeCompliance') : 'Alternative Standard', ('codeComplianceTextArea') : '\'Code Compliance with\' field automated test.'
        , ('With') : 'No deviation from code', ('Depth') : '1900', ('Length') : '1400', ('Width') : '1400', ('carMass') : '1150'
        , ('maxPassengerCapacity') : '20', ('ratedLoad') : '2750', ('maxAllowableDecorWeight') : '1820', ('controllerModel') : 'F120'
        , ('machineBreakType') : 'Disc', ('tractionMachineModel') : 'Q970', ('machineBrakeModel') : 'EW4N', ('ropeBeltNumber') : '354'
        , ('suspensionRopeBeltConfigurationsA') : '1:1', ('suspensionRopeBeltConfigurationsB') : 'Single Wrap', ('suspensionRopeBeltConfigurationsC') : 'Underslung'
        , ('ropeBeltSize') : '12000', ('carDoorBrand') : 'Moz Inc.', ('carDoorOperatorModel') : '6UT0M', ('carDoorType') : 'Sliding Up'
        , ('photocellBrand') : 'LCPB032', ('photocellModel') : 'LCPM019', ('mechanicalEdgeProvided') : 'Y', ('certificateNumber') : 'X0275280'
        , ('expiryDateOfCertificate') : '2020', ('notifiedBody') : 'Building Construction Authority'], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

