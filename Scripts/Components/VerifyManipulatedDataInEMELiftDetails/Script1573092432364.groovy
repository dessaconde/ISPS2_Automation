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

'Verify that the \'Lift Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.liftNumber, false)

'Verify that the \'Accessibility Provision\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.accessibilityProvision, false)

'Verify that the \'Fire Safety Provision\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.fireSafetyProvision, false)

'Verify that the \'Travel Height\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.travelHeight, false)

'Verify that the \'Maximum Blind Hoistway Height\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Hoistway, false)

'Verify that the \'No. of Stops Served\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.stopsServed, false)

'Verify that the \'Rated Speed\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.ratedSpeed, false)

'Verify that the \'Brand Name\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.brandName, false)

'Verify that the \'Model Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.modelNumber, false)

'Verify that the \'Lift Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.liftType, false)

'Verify that the \'Machine Room/Machine Roomless\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.machineRoom, false)

'Verify that the \'Geared/Gearless\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.gearedGearless, false)

'Verify that the \'Code Compliance With\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.codeComplianceWith, false)

'Verify that the \'Code Compliance With\' textfield that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.codeComplianceWithTextArea, false)

'Verify that the \'With\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.With, false)

'Verify that the \'Depth\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Depth, false)

'Verify that the \'Length\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Length, false)

'Verify that the \'Width\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.Width, false)

'Verify that the \'Car Mass\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.carMass, false)

'Verify that the \'Max Passenger Capacity\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.maxPassengerCapacity, false)

'Verify that the \'Rated Load\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.ratedLoad, false)

'Verify that the \'Max Allowable Decor Weight\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.maxAllowableDecorWeight, false)

'Verify that the \'Controller Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.controllerModel, false)

'Verify that the \'Machine Brake Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.machineBrakeType, false)

'Verify that the \'Traction Machine Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.tractionMachineModel, false)

'Verify that the \'Machine Brake Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.machineBrakeModel, false)

'Verify that the \'Rope/Belt Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.ropeBeltNumber, false)

'Verify that the \'Rope/Belt Size\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.ropeBeltSize, false)

'Verify that the \'Suspension Rope/Belt Configurations\' first dropdown that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.suspensionRopeBeltConfigurationsA, false)

'Verify that the \'Suspension Rope/Belt Configurations\' second dropdown that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.suspensionRopeBeltConfigurationsB, false)

'Verify that the \'Suspension Rope/Belt Configurations\' third dropdown that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.suspensionRopeBeltConfigurationsC, false)

'Verify that the \'Car Door Brand\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.carDoorBrand, false)

'Verify that the \'Car Door Operator Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.carDoorOperatorModel, false)

'Verify that the \'Car Door Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.carDoorType, false)

'Verify that the \'Light Curtain/Photocell Brand\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.photocellBrand, false)

'Verify that the \'Light Curtain/Photocell Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.photocellModel, false)

'Verify that the \'Mechanical Edge Provided\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.mechanicalEdgeProvided, false)

'Verify that the \'Certificate Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.certificateNumber, false)

'Verify that the \'Notified Body\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.notifiedBody, false)

