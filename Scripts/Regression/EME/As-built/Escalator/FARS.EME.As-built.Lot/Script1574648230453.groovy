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

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 17), ('Password') : findTestData(
            'Datatable').getValue('Password', 18)], FailureHandling.STOP_ON_FAILURE)

'Navigate the user to \'My Tasks\' tab.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter tasks - \'Process EME AS-built Submission\'.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME AS-built Submission'], FailureHandling.STOP_ON_FAILURE)

'Select a case type depending on input - Lift/Escalator.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Escalator'], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Lot\' LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Lot'], FailureHandling.STOP_ON_FAILURE)

'Click the \'Add\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Add Lot\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : 'Mukim 12', ('LotNo') : '15937X', ('IsPartialLot') : 'Yes'], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the reset button. [Temporary disabling the component due to persistent bug in the button.]'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Add Lot\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : 'Town Subdivision 30', ('LotNo') : '35791F', ('IsPartialLot') : 'Yes'], 
    FailureHandling.STOP_ON_FAILURE)

'Click the \'Cancel\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click the \'Add\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Add Lot\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : 'Mukim 04', ('LotNo') : '85264A', ('IsPartialLot') : 'No'], 
    FailureHandling.STOP_ON_FAILURE)

'Click the \'Save\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify successful saved changes.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Lot\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyLotDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Selects a record to be deleted from the table.'
WebUI.callTestCase(findTestCase('Components/SelectRecord'), [('TextToClick') : GlobalVariable.lotNo], FailureHandling.STOP_ON_FAILURE)

'Click the \'Delete\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Delete', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click the \'Add\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Manipulate and populate all the fields in the \'Add Lot\' page. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : 'Mukim 12', ('LotNo') : '61696W', ('IsPartialLot') : 'No'], 
    FailureHandling.STOP_ON_FAILURE)

'Click the \'Save\' button inside the page. '
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Navigate to \'Summary\' LHS. '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify that the data that were set in \'Add Lot\' page is reflecting in a current page. '
WebUI.callTestCase(findTestCase('Components/VerifyLotDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate back to Dashboard before logging out. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logs the user out. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

