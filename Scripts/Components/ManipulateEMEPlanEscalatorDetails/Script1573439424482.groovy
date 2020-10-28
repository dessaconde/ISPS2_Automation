import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Wait for a second before proceeding to further automated steps. '
Thread.sleep(1000)

'Verify that the user is currently in the \'Escalator Details\' page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_div_Esc Details'))

'Locates and interacts with the \'Quantity\' field to populate. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/input_Quantity_escTypeCnt'))

'Double clicks the \'Quantity\' field to manipulate. '
WebUI.doubleClick(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/input_Quantity_escTypeCnt'))

'Clicks up key to add new section.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/input_Quantity_escTypeCnt'), Keys.chord(Keys.ARROW_UP))

'Verify that the \'Escalator Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/span_ESC NUMBER'))

'Locates the \'Escalator Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/input_Quantity_escNumber'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/input_Quantity_escNumber'), escalatorNumber)

'Store the captured \'Escalator Number\' to its respective Global Variable. '
GlobalVariable.escalatorNumber = escalatorNumber

'Verify that the \'Rise of Escalator\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/span_RISE OF ESCALATOR(m)'))

'Locates the \'Rise of Escalator\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_This field is required_escalatorRise'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_This field is required_escalatorRise'), 
    riseOfEscalator)

'Store the captured \'Rise of Escalator\' to its respective Global Variable. '
GlobalVariable.riseOfEscalator = riseOfEscalator

'Press enter after populating all fields in the current table.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_This field is required_escalatorRise'), 
    Keys.chord(Keys.ENTER))

'[Basic Escalator Details] Verify that the \'Brand Name\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/XPI_span_Brand Name'))

'[Basic Escalator Details] Locates the \'Brand Name\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escBrandName'))

'[Basic Escalator Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escBrandName'), brandName)

'Store the captured \'Brand Name\' to its respective Global Variable. '
GlobalVariable.brandName = brandName

'[Basic Escalator Details] Verify that the \'Model Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/XPI_span_Model Number'))

'[Basic Escalator Details] Locates the \'Model Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escModelNo'))

'[Basic Escalator Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escModelNo'), modelNumber)

'Store the captured \'Model Number\' to its respective Global Variable. '
GlobalVariable.modelNumber = modelNumber

'[Basic Escalator Details] Verify that the \'Escalator Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Escalator Type'))

'[Basic Escalator Details] Locates the \'Escalator Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escType'))

'[Basic Escalator Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__escType'), escalatorType)

'Store the captured \'Escalator Type\' to its respective Global Variable. '
GlobalVariable.escalatorType = escalatorType

'[Specifications] Verify that the \'Inclination Angle\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Inclination Angle'))

'[Specifications] Locates the \'Inclination Angle\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__angleOfIncCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__angleOfIncCnt'), inclinationAngle)

'Store the captured \'Inclination Angle\' to its respective Global Variable. '
GlobalVariable.inclinationAngle = inclinationAngle

'[Specifications] Verify that the \'Step/Pallet Width\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_StepPallet Width'))

'[Specifications] Locates the \'Steps/Pallet Width\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__stepWidthCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__stepWidthCnt'), stepPalletWidth)

'Store the captured \'Step/Pallet Width\' to its respective Global Variable. '
GlobalVariable.stepPalletWidth = stepPalletWidth

'[Specifications] Verify that the \'Rated Speed (Highest Speed)\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Rated Speed (Highest Speed)'))

'[Specifications] Locates the \'Rated Speed\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Rated Speed (Highest Speed)_escRatedSpeedCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Rated Speed (Highest Speed)_escRatedSpeedCnt'), 
    ratedSpeed)

'Store the captured \'Rated Speed\' to its respective Global Variable. '
GlobalVariable.ratedSpeed = ratedSpeed

'[Specifications] Verify that the \'Balustrade Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Balustrade Type'))

'[Specifications] Locates the \'Balustrade Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__balustradeType'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__balustradeType'), balustradeType)

'Store the captured \'Balustrade Type\' to its respective Global Variable. '
GlobalVariable.balustradeType = balustradeType

'Verify that the \'Drive Chain Number\' section is present before interacting with it. [Specifications] '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Drive Chain Number'))

'[Specifications] Locates the \'Drive Chain Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__driveChainNum'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__driveChainNum'), driveChainNumber)

'Store the captured \'Drive Chain Number\' to its respective Global Variable. '
GlobalVariable.driveChainNumber = driveChainNumber

'[Specifications] Verify that the \'Number of e-Stop Switches\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Number of E-Stop Switches'))

'[Specifications] Locates the \'Number of e-Stop Switches\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Number of E-Stop Switches_nbrSwitches'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Number of E-Stop Switches_nbrSwitches'), 
    eStopSwitches)

'Store the captured \'E-Stop Switches\' to its respective Global Variable. '
GlobalVariable.eStopSwitches = eStopSwitches

'[Specifications] Verify that the \'Drive Chain Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Drive Chain Type'))

'[Specifications] Locates the \'Drive Chain Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__driveChainType'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input__driveChainType'), driveChainType)

'Store the captured \'Drive Chain Type\' to its respective Global Variable. '
GlobalVariable.driveChainType = driveChainType

'[Specifications] Verify that the \'Number of Flat Steps at Landing\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Number of Flat Steps at Landing'))

'[Specifications] Locates the \'Number of Flat Steps at Landing\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Number of Flat Steps at Landing_noOfLanding'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Number of Flat Steps at Landing_noOfLanding'), 
    flatStepsAtLanding)

'Store the captured \'Number of Flat Steps at Landing\' to its respective Global Variable. '
GlobalVariable.flatStepsAtLanding = flatStepsAtLanding

'[Specifications] Verify that the \'Controller Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/XPI_span_Controller Model'))

'[Specifications] Locates the \'Controller Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Controller Model_escctrlModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Controller Model_escctrlModel'), 
    controllerModel)

'Store the captured \'Controller Model\' to its respective Global Variable. '
GlobalVariable.controllerModel = controllerModel

'[Specifications] Verify that the \'Drive Machine Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Drive Machine Model'))

'[Specifications] Locates the \'Drive Machine Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Drive Machine Model_driveMachineModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Drive Machine Model_driveMachineModel'), 
    driveMachineModel)

'Store the captured \'Drive Machine Model\' to its respective Global Variable. '
GlobalVariable.driveMachineModel = driveMachineModel

'[Specifications] Verify that the \'Drive Machine Brake Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Drive Machine Brake Model'))

'[Specifications] Locates the \'Drive Machine Brake Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Drive Machine Brake Model_driveMachineBrakeModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Drive Machine Brake Model_driveMachineBrakeModel'), 
    driveMachineBrakeModel)

'Store the captured \'Drive Machine Brake Model\' to its respective Global Variable. '
GlobalVariable.driveMachineBrakeModel = driveMachineBrakeModel

'[Specifications] Verify that the \'Auxiliary Brake Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/span_Auxiliary Brake Model'))

'[Specifications] Locates the \'Auxiliary Brake Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Auxiliary Brake Model_auxBrakeModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/Page_ISPS2/input_Auxiliary Brake Model_auxBrakeModel'), 
    auxiliaryBrakeModel)

'Store the captured \'Auxilliary Brake Model\' to its respective Global Variable. '
GlobalVariable.auxiliaryBrakeModel = auxiliaryBrakeModel

'[Code Compliance] Verify that the \'Code Compliance with\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_codeComplianceWith'))

'[Code Compliance] Locates the \'Code Compliance with\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_inputCodeComplianceWith'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_inputCodeComplianceWith'), codeComplianceWith)

'Store the captured \'Code Compliance with\' to its respective Global Variable. '
GlobalVariable.codeComplianceWith = codeComplianceWith

'[Code Compliance] Key press: Enter; after populating field. '
WebUI.sendKeys(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_inputCodeComplianceWith'), Keys.chord(Keys.ENTER))

'[Code Compliance] Locates the \'Code Compliance with (textarea)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_inputCodeComplianceWithTextArea'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_inputCodeComplianceWithTextArea'), codeComplianceWithTextArea)

'Convert entire string to upper case.'
not_run: codeComplianceWithTextAreaToUpperCase = codeComplianceWithTextArea.toUpperCase()

'Store the captured \'Code Compliance with (TextArea)\' to its respective Global Variable. '
not_run: GlobalVariable.codeComplianceWithTextArea = codeComplianceWithTextAreaToUpperCase

'[Code Compliance] Verify that the \'With\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_With'))

'[Code Compliance] Locates the \'With\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_inputWith'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_inputWith'), With)

'Store the captured \'With\' to its respective Global Variable. '
GlobalVariable.With = With

'[System Type Test] Verify that the \'Certificate Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_certificateNumber'))

'[System Type Test] Locates the \'Certificate Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_certificateNumber'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_certificateNumber'), certificateNumber)

'Store the captured \'Certificate Number\' to its respective Global Variable. '
GlobalVariable.certificateNumber = certificateNumber

'[System Type Test] Verify that the \'Expiry Date of Certificate\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_expiryDateOfCertificate'))

'[System Type Test] Locates the \'Expiry Date of Certificate\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_expiryDateOfCertificate'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_expiryDateOfCertificate'), expiryDate)

'Store the captured \'Expiry Date of Certificate\' to its respective Global Variable. '
GlobalVariable.expiryDate = expiryDate

'[System Type Test] Verify that the \'Notified Body\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XPI_notifiedBody'))

'[System Type Test] Locates the \'Notified Body\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_notifiedBody'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMEPlanEscalatorDetails/XP_notifiedBody'), notifiedBody)

'Store the captured \'Notified Body\' to its respective Global Variable. '
GlobalVariable.notifiedBody = notifiedBody

