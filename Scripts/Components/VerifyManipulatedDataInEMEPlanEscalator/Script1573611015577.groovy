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

Thread.sleep(7000)

'Verify that the \'Escalator Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.escalatorNumber, false)

'Verify that the \'Rise of Escalator\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.riseOfEscalator, false)

'Verify that the \'Brand Name\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.brandName, false)

'Verify that the \'Model Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.modelNumber, false)

'Verify that the \'Escalator Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.escalatorType, false)

'Verify that the \'Inclination Angle\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.inclinationAngle, false)

'Verify that the \'Step/Pallet Width\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.stepPalletWidth, false)

'Verify that the \'Rated Speed\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.ratedSpeed, false)

'Verify that the \'Balustrade Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.balustradeType, false)

'Verify that the \'Drive Chain Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.driveChainNumber, false)

'Verify that the \'Number of e-Stop Switches\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.eStopSwitches, false)

'Verify that the \'Drive Chain Type\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.driveChainType, false)

'Verify that the \'Number of Flat Steps at Landing\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.flatStepsAtLanding, false)

'Verify that the \'Controller Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.controllerModel, false)

'Verify that the \'Drive Machine Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.driveMachineModel, false)

'Verify that the \'Drive Machine Brake Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.driveMachineBrakeModel, false)

'Verify that the \'Auxiliary Brake Model\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.auxiliaryBrakeModel, false)

'Verify that the \'Code Compliance with\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.codeComplianceWith, false)

'Verify that the \'Code Compliance with - textarea\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.codeComplianceWithTextArea, false)

'Verify that the \'With\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.With, false)

'Verify that the \'Certificate Number\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.certificateNumber, false)

'Verify that the \'Expiry Date of Certificate\' that was set in Main Form Group page is updated and reflecting in Summary page. '
not_run: WebUI.verifyTextPresent(GlobalVariable.expiryDate, false)

'Verify that the \'Notified Body\' that was set in Main Form Group page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(GlobalVariable.notifiedBody, false)

