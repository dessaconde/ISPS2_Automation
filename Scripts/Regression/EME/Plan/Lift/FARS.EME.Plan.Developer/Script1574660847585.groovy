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
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate the user to \'My Tasks\' tab.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter tasks - \'Process EME Plan Application\'.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select a case type depending on input - Lift/Escalator.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Developer\' LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Developer'], FailureHandling.STOP_ON_FAILURE)

'Click the \'Add\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Developer Details\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateDeveloper'), [('Salutation') : 'Mr.', ('IDType') : 'MCST', ('FirmName') : 'Nova Solutions'
        , ('Designation') : 'Building Construction Authority', ('Name') : 'Gong Cha', ('IDNo') : 'x0275280', ('UEN') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the Address section.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '19', ('BuildingName') : 'The JMT Corporate Condominium'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '002600', ('RoadName') : 'AIRLINE ROAD (AIR00U)'], FailureHandling.STOP_ON_FAILURE)

'Clicks the reset button. [Temporary disabling the component due to persistent bug in the button.]'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Developer Details\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateDeveloper'), [('Salutation') : 'Ms.', ('IDType') : 'NRIC', ('FirmName') : 'Nova Solutions'
        , ('Designation') : 'Building Construction Authority', ('Name') : 'Cha Tuk Chak', ('IDNo') : 'x0275280', ('UEN') : ''], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the Address section.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '12', ('BuildingName') : 'The Podium'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '002601', ('RoadName') : 'ACCESS ROAD (ACC00Y)'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Cancel\' button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Developer Details\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateDeveloper'), [('Salutation') : 'A/Prof.', ('IDType') : 'Society Number'
        , ('FirmName') : 'Nova Solutions', ('Designation') : 'Building Construction Authority', ('Name') : 'Gong Cha', ('IDNo') : 'x0275280'
        , ('UEN') : ''], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the Address section.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '19', ('BuildingName') : 'The JMT Corporate Condominium'
        , ('Level') : '11', ('Unit') : 'A', ('PostalCode') : '002600', ('RoadName') : 'AIRPORT LINK (ZZZ87F)'], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Save\' button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify successful saved changes.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.Developer], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.houseBlkNo], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.Level], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.Unit], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.buildingName], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.postalCode], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Summary\' LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Developer\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('textToLocate') : GlobalVariable.Developer], FailureHandling.STOP_ON_FAILURE)

'Navigates the user to the homepage before logging out. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

