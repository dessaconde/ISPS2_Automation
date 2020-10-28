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

WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Escalator'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEMainForm'), [('projectTitle') : GlobalVariable.null, ('descriptionOfBuildingWorks') : GlobalVariable.null
        , ('notificationOfAppointmentDate') : GlobalVariable.null, ('alternativeSolutionDate') : GlobalVariable.null, ('waiverModificationFormDate') : GlobalVariable.null
        , ('submittedDocuments') : GlobalVariable.null], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/A_EME Module Components/ManipulateEMEPlanEscalatorDetails'), [('escalatorNumber') : 'String.Length automated testing'
        , ('riseOfEscalator') : '999.99', ('brandName') : 'Brand Name - String.Length automated testing', ('modelNumber') : 'Model Number - String.Length automated testing'
        , ('escalatorType') : 'Escalator (With Steps)', ('inclinationAngle') : '1000.1', ('stepPalletWidth') : '9999.99'
        , ('ratedSpeed') : '9999.99', ('balustradeType') : 'Glass', ('driveChainNumber') : 'Drive Chain Number - String.Length automated testing'
        , ('eStopSwitches') : '10', ('driveChainType') : 'Triplex', ('flatStepsAtLanding') : '11', ('controllerModel') : 'Controller Model - String.Length automated testing'
        , ('driveMachineModel') : 'Drive Machine Model - String.Length automated testing', ('driveMachineBrakeModel') : 'Drive Machine Break Model - String.Length automated testing'
        , ('auxiliaryBrakeModel') : 'Auxiliary Brake Model - String.Length automated testing', ('codeComplianceWith') : 'Alternative Standard'
        , ('codeComplianceWithTextArea') : 'Code Compliance Text Field - String.Length automated testing', ('With') : 'No deviation from code'
        , ('certificateNumber') : 'Certificate Number - String.Length automated testing', ('expiryDate') : '24/02/2020', ('notifiedBody') : 'Notified Body - String.Length automated testing'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 6], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/PopulateComponentTypeTest'), [('Component') : 'Step / Pallet', ('OEM') : 'OEM - String.Length automated testing'
        , ('modelNo') : 'Model No. - String.Length automated testing', ('countryOfManufacture') : 'Country of Manufacture - String.Length automated testing'
        , ('certificateNo') : 'Certificate No. - String.Length automated testing', ('expiryDate') : '', ('notifiedBody') : 'Notified Body - String.Length automated testing'
        , ('emergencyBrakeType') : '', ('permissibleMass') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 7000], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : 'String.Length automated testin'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : '99.9'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : 'String.Length automated testin'], 
    FailureHandling.STOP_ON_FAILURE)

