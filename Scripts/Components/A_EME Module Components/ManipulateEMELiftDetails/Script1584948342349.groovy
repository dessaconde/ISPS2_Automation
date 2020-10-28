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

'Verify that the user is currently in the \'Lift Details\' page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_div_Lift Details'))

'Locates and interacts with the \'Quantity\' field to populate. '
WebUI.doubleClick(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Quantity_liftTypeCnt'))

'Clicks up key to add new section.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Quantity_liftTypeCnt'), Keys.chord(Keys.ARROW_UP))

'Verify that the \'Lift Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_LIFT NUMBER'))

'Locates the \'Lift Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Quantity_liftNumber'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Quantity_liftNumber'), liftNumber)

'Store the captured \'Lift Number\' to its respective Global Variable. '
GlobalVariable.liftNumber = liftNumber

'Verify that the \'Accessibility Provision\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_ACCESSIBILITY PROVISION'))

'Locates the \'Accessibility Provision\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_accProv'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_accProv'), accessibilityProvision)

'Store the captured \'Accessibility Provision\' to its respective Global Variable. '
GlobalVariable.accessibilityProvision = accessibilityProvision

'Verify that the \'Fire Safety Provision\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_FIRE SAFETY PROVISION'))

'Locates the \'Fire Safety Provision\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_fireSafetyProv'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_fireSafetyProv'), 
    fireSafetyProvision)

'Store the captured \'Fire Safety Provision\' to its respective Global Variable. '
GlobalVariable.fireSafetyProvision = fireSafetyProvision

'Verify that the \'Travel Height (M)\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_TRAVEL HEIGHT (M)'))

'Locates the \'Travel Height (M)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_travelHeight'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_travelHeight'), travelHeight)

'Store the captured \'Travel Height\' to its respective Global Variable. '
GlobalVariable.travelHeight = travelHeight

'Verify that the \'Maximum Blind Hoistway Height (M)\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_MAXIMUM BLIND HOISTWAY HEIGHT (M)'))

'Locates the \'Maximum Blind Hoistway Height (M)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_maxBlindHoistWay'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_maxBlindHoistWay'), 
    Hoistway)

'Store the captured \'Maximum Blind Hoistway Height\' to its respective Global Variable. '
GlobalVariable.Hoistway = Hoistway

'Verify that the \'Number of Stops Served\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_NO OF STOPS SERVED'))

'Locates the \'Number of Stops Served\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_noOfStopsServed'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_noOfStopsServed'), 
    stopsServed)

'Store the captured \'Number of Stops Served\' to its respective Global Variable. '
GlobalVariable.stopsServed = stopsServed

'Verify that the \'Rated Speed\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_RATED SPEED'))

'Locates the \'Rated Speed\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_ratedSpeed'))

'Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_ratedSpeed'), ratedSpeed)

'Store the captured \'Rated Speed\' to its respective Global Variable. '
GlobalVariable.ratedSpeed = ratedSpeed

'Press enter after populating all fields in the current table.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_This field is required_ratedSpeed'), Keys.chord(
        Keys.ENTER))

'[Basic Lift Details] Verify that the \'Brand Name\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Brand Name'))

'[Basic Lift Details] Locates the \'Brand Name\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__brandName'))

'[Basic Lift Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__brandName'), brandName)

'Store the captured \'Brand Name\' to its respective Global Variable. '
GlobalVariable.brandName = brandName

'[Basic Lift Details] Verify that the \'Model Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Model Number'))

'[Basic Lift Details] Locates the \'Model Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__modelNo'))

'[Basic Lift Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__modelNo'), modelNumber)

'Store the captured \'Model Number\' to its respective Global Variable. '
GlobalVariable.modelNumber = modelNumber

'[Basic Lift Details] Verify that the \'Lift Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Lift Type'))

'[Basic Lift Details] Locates the \'Lift Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__liftType'))

'[Basic Lift Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__liftType'), liftType)

'Store the captured \'Lift Type\' to its respective Global Variable. '
GlobalVariable.liftType = liftType

'[Basic Lift Details] Verify that the \'Machine Room/Machine Room Less\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Machine Room Machine Room Less'))

'[Basic Lift Details] Locates the \'Machine Room/Machine Room Less\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Room Machine Room Less_machineRoomCmb'))

'[Basic Lift Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Room Machine Room Less_machineRoomCmb'), 
    machineRoom)

'Store the captured \'Machine Room/Machine Room Less\' to its respective Global Variable. '
GlobalVariable.machineRoom = machineRoom

'[Basic Lift Details] Verify that the \'Geared/Gearless\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Geared  Gearless'))

'[Basic Lift Details] Locates the \'Geared/Gearless\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Geared  Gearless_gearCmb'))

'[Basic Lift Details] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Geared  Gearless_gearCmb'), gearedGearless)

'Store the captured \'Geared/Gearless\' to its respective Global Variable. '
GlobalVariable.gearedGearless = gearedGearless

'[Code Compliance] Verify that the \'Code Compliance With\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Code Compliance with'))

'[Code Compliance] Locates the \'Code Compliance With\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Code Compliance with_compA'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Code Compliance with_compA'), codeCompliance)

'Store the captured \'Code Compliance\' to its respective Global Variable. '
GlobalVariable.codeComplianceWith = codeCompliance

'[Code Compliance] Key press - Enter.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Code Compliance with_liftCompC'), Keys.chord(
        Keys.ENTER))

'[Code Compliance] Locates the \'Code Compliance With (textarea)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Code Compliance with_liftCompC'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Code Compliance with_liftCompC'), codeComplianceTextArea)

'Store the captured \'Code Compliance textarea\' to its respective Global Variable. '
GlobalVariable.codeComplianceWithTextArea = codeComplianceTextArea

'[Code Compliance] Verify that the \'With\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_with'))

'[Code Compliance] Locates the \'With\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_with_compB'))

'[Code Compliance] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_with_compB'), With)

'Store the captured \'Code Compliance With\' to its respective Global Variable. '
GlobalVariable.With = With

'[Specifications] Verify that the \'Depth\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Depth'))

'[Specifications] Locates the \'Depth\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Depth_heightCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Depth_heightCnt'), Depth)

'Store the captured \'Depth\' to its respective Global Variable. '
GlobalVariable.Depth = Depth

'[Specifications] Verify that the \'Length\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Length'))

'[Specifications] Locates the \'Length\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Length_lengthCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Length_lengthCnt'), Length)

'Store the captured \'Length\' to its respective Global Variable. '
GlobalVariable.Length = Length

'[Specifications] Verify that the \'Width\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Width'))

'[Specifications] Locates the \'Width\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Width_widthCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Width_widthCnt'), Width)

'Store the captured \'Width\' to its respective Global Variable. '
GlobalVariable.Width = Width

'[Specifications] Verify that the \'Car Mass\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Car mass'))

'[Specifications] Locates the \'Car Mass\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car mass_carMassCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car mass_carMassCnt'), carMass)

'Store the captured \'Car Mass\' to its respective Global Variable. '
GlobalVariable.carMass = carMass

'[Specifications] Verify that the \'Max Passenger Capacity\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Max Passenger Capacity'))

'[Specifications] Locates the \'Max Passenger Capacity\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Max Passenger Capacity_maxPasCapCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Max Passenger Capacity_maxPasCapCnt'), maxPassengerCapacity)

'Store the captured \'Max Passenger Capacity\' to its respective Global Variable. '
GlobalVariable.maxPassengerCapacity = maxPassengerCapacity

'[Specifications] Verify that the \'Rated Load\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Rated Load'))

'[Specifications] Locates the \'Rated Load\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Rated Load_ratedLoadCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Rated Load_ratedLoadCnt'), ratedLoad)

'Store the captured \'Rated Load\' to its respective Global Variable. '
GlobalVariable.ratedLoad = ratedLoad

'[Specifications] Verify that the \'Max Allowable Decor Weight\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Max Allowable Decor Weight (based on manufactures recommendation)'))

'[Specifications] Locates the \'Max Allowable Decor Weight\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Max Allowable Decor Weight (based on manufactures recommendation)_maxAllwnceCnt'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Max Allowable Decor Weight (based on manufactures recommendation)_maxAllwnceCnt'), 
    maxAllowableDecorWeight)

'Store the captured \'Max. Allowable Decor Weight\' to its respective Global Variable. '
GlobalVariable.maxAllowableDecorWeight = maxAllowableDecorWeight

'[Specifications] Verify that the \'Controller Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Controller Model'))

'[Specifications] Locates the \'Controller Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Controller Model_liftctrlModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Controller Model_liftctrlModel'), controllerModel)

'Store the captured \'Controller Model\' to its respective Global Variable. '
GlobalVariable.controllerModel = controllerModel

'[Specifications] Verify that the \'Brake Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Machine Brake Type'))

'[Specifications] Locates the \'Brake Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Brake Type_machineBreakType'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Brake Type_machineBreakType'), machineBreakType)

'Store the captured \'Machine Brake Type\' to its respective Global Variable. '
GlobalVariable.machineBrakeType = machineBreakType

'[Specifications] Verify that the \'Machine Traction Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Traction Machine Model'))

'[Specifications] Locates the \'Machine Traction Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Traction Machine Model_tractMachineModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Traction Machine Model_tractMachineModel'), 
    tractionMachineModel)

'Store the captured \'Traction Machine Model\' to its respective Global Variable. '
GlobalVariable.tractionMachineModel = tractionMachineModel

'[Specifications] Verify that the \'Brake Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Machine Brake Model'))

'[Specifications] Locates the \'Brake Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Brake Model_machineBrkModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Machine Brake Model_machineBrkModel'), machineBrakeModel)

'Store the captured \'Machine Brake Model\' to its respective Global Variable. '
GlobalVariable.machineBrakeModel = machineBrakeModel

'[Specifications] Verify that the \'Rope/Belt Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_RopeBelt Number'))

'[Specifications] Locates the \'Rope/Belt Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_RopeBelt Number_ropeBeltNum'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_RopeBelt Number_ropeBeltNum'), ropeBeltNumber)

'Store the captured \'Rope Belt Number\' to its respective Global Variable. '
GlobalVariable.ropeBeltNumber = ropeBeltNumber

'[Specifications] Verify that the \'Rope/Belt Size\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_RopeBelt Size'))

'[Specifications] Locates the \'Rope/Belt Size\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_RopeBelt Size_ropeBeltSize'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_RopeBelt Size_ropeBeltSize'), ropeBeltSize)

'Store the captured \'Rope Belt Size\' to its respective Global Variable. '
GlobalVariable.ropeBeltSize = ropeBeltSize

'[Specifications] Verify that the \'Suspension Rope/Belt Configurations\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Suspension RopeBelt Configurations'))

'[Specifications] Locates the \'Suspension Rope/Belt Configurations (firstTextfield)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigA'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigA'), suspensionRopeBeltConfigurationsA)

'Store the captured \'Suspension Rope Belt Configurations A\' to its respective Global Variable. '
GlobalVariable.suspensionRopeBeltConfigurationsA = suspensionRopeBeltConfigurationsA

'[Specifications] Locates the \'Suspension Rope/Belt Configurations (secondTextfield)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigB'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigB'), suspensionRopeBeltConfigurationsB)

'Store the captured \'Suspension Rope Belt Configurations B\' to its respective Global Variable. '
GlobalVariable.suspensionRopeBeltConfigurationsB = suspensionRopeBeltConfigurationsB

'[Specifications] Locates the \'Suspension Rope/Belt Configurations (thirdTextfield)\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigC'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_MM_ropeConfigC'), suspensionRopeBeltConfigurationsC)

'Store the captured \'Suspension Rope Belt Configurations C\' to its respective Global Variable. '
GlobalVariable.suspensionRopeBeltConfigurationsC = suspensionRopeBeltConfigurationsC

'[Specifications] Verify that the \'Car Door Brand\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Car Door Brand'))

'[Specifications] Locates the \'Car Door Brand\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Brand_carDoorBrand'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Brand_carDoorBrand'), carDoorBrand)

'Store the captured \'Car Door Brand\' to its respective Global Variable. '
GlobalVariable.carDoorBrand = carDoorBrand

'[Specifications] Verify that the \'Car Door Operator Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Car Door Operator Model'))

'[Specifications] Locates the \'Car Door Operator Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Operator Model_carDoorOperatorModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Operator Model_carDoorOperatorModel'), 
    carDoorOperatorModel)

'Store the captured \'Car Door Operator Model\' to its respective Global Variable. '
GlobalVariable.carDoorOperatorModel = carDoorOperatorModel

'[Specifications] Verify that the \'Car Door Type\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Car Door Type'))

'[Specifications] Locates the \'Car Door Type\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Type_carTypeModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Car Door Type_carTypeModel'), carDoorType)

'Store the captured \'Car Door Type\' to its respective Global Variable. '
GlobalVariable.carDoorType = carDoorType

'[Specifications] Verify that the \'Light Curtain/Photocell Brand\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Light Curtain  Photocell Brand'))

'[Specifications] Locates the \'Light Curtain/Photocell Brandl\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Light Curtain  Photocell Brand_lightCurtainPhotoCellBrand'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Light Curtain  Photocell Brand_lightCurtainPhotoCellBrand'), 
    photocellBrand)

'Store the captured \'Light Curtain/Photocell Brand\' to its respective Global Variable. '
GlobalVariable.photocellBrand = photocellBrand

'[Specifications] Verify that the \'Light Curtain/Photocell Model\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Light Curtain  Photocell Model'))

'[Specifications] Locates the \'Light Curtain/Photocell Model\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Light Curtain  Photocell Model_lightCurtainPhotoCellModel'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Light Curtain  Photocell Model_lightCurtainPhotoCellModel'), 
    photocellModel)

'Store the captured \'Light Curtain/Photocell Model\' to its respective Global Variable. '
GlobalVariable.photocellModel = photocellModel

'[Specifications] Verify that the \'Mechanical Edge Provided\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Mechanical Edge Provided'))

'[Specifications] Locates the \'Mechanical Edge Provided\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Mechanical Edge Provided_mechanicalEdgeProvided'))

'[Specifications] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Mechanical Edge Provided_mechanicalEdgeProvided'), 
    mechanicalEdgeProvided)

'Store the captured \'Mechanical Edge Provided\' to its respective Global Variable. '
GlobalVariable.mechanicalEdgeProvided = mechanicalEdgeProvided

'[Specifications] Key-in values from a dynamic variable.'
WebUI.sendKeys(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input_Mechanical Edge Provided_mechanicalEdgeProvided'), 
    Keys.chord(Keys.ENTER))

Thread.sleep(1000)

'[System Type Test] Verify that the \'Certificate Number\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Certificate Number'))

'[System Type Test] Locates the \'Certificate Number\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__sysTypeCertNo'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__sysTypeCertNo'), certificateNumber)

'Store the captured \'Certificate Number\' to its respective Global Variable. '
GlobalVariable.certificateNumber = certificateNumber

'[System Type Test] Verify that the \'Expiry Date of Certificate\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Expiry Date of Certificate'))

'[System Type Test] Locates the \'Expiry Date of Certificate\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__liftSysTypeExpryDateOfCert'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__liftSysTypeExpryDateOfCert'), expiryDateOfCertificate)

'Store the captured \'Expiry Date of Certificate\' to its respective Global Variable. '
GlobalVariable.expiryDate = expiryDateOfCertificate

'[System Type Test] Verify that the \'Notified Body\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/XPI_span_Notified Body'))

'[System Type Test] Locates the \'Notified Body\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__sysTypeNotifiedBody'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__sysTypeNotifiedBody'), notifiedBody)

'Store the captured \'Notified Body\' to its respective Global Variable. '
GlobalVariable.notifiedBody = notifiedBody

'[System Type Test] Verify that the \'Permissible Mass\' section is present before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/span_Permissible Mass'))

'[System Type Test] Locates the \'Permissible Mass\' input field before populating. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__permissibleMass'))

'[System Type Test] Key-in values from a dynamic variable.'
WebUI.setText(findTestObject('Objects.ManipulateEMELiftDetails/Page_ISPS2/input__permissibleMass'), permissibleMass)

'Store the captured \'Permissible Mass\' to its respective Global Variable. '
GlobalVariable.permissibleMass = permissibleMass

