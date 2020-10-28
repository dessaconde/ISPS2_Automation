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

'Login using dynamic credentials that sources from Datatable. '
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to landing page before proceeding to further automated components. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks the filter button and key-in \'Process Temporary Building Permit\' then clicks on \'Search\' button. '
WebUI.callTestCase(findTestCase('Components/SearchTask'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks \'Lot\' from left-hand side.'
WebUI.callTestCase(findTestCase('Components/NavigateToLotLHS'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Add\' button to add another lot record. '
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks cancel button to check if the \'Cancel\' button is working. '
WebUI.callTestCase(findTestCase('Components/ClickCancelButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks \'Add\' button to populate the Lot field. '
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Populates MkTs, LotNo and IsPartialLot field, all dynamically from Datatable. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : findTestData('Datatable').getValue('MkTs', 1), ('LotNo') : findTestData(
            'Datatable').getValue('LotNo', 1), ('IsPartialLot') : findTestData('Datatable').getValue('IsPartialLot', 1)], 
    FailureHandling.STOP_ON_FAILURE)

'Clicks the \'Reset\' button to check that button is working. '
WebUI.callTestCase(findTestCase('Components/ClickResetButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Repeats to populate the Lot fields after being reset. '
WebUI.callTestCase(findTestCase('Components/PopulateLot'), [('MkTs') : findTestData('Datatable').getValue('MkTs', 1), ('LotNo') : findTestData(
            'Datatable').getValue('LotNo', 1), ('IsPartialLot') : findTestData('Datatable').getValue('IsPartialLot', 1)], 
    FailureHandling.STOP_ON_FAILURE)

'Submit populated fields by clicking the \'Save\' button. '
WebUI.callTestCase(findTestCase('Components/ClickSaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks the newly added Lot to check if the record could open. '
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : findTestData('Datatable').getValue('MkTs', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Clicks \'Cancel\' button to navigate back in the Lot list. '
WebUI.callTestCase(findTestCase('Components/ClickCancelButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Clicks on IsPartialLot part of the newly added Lot to tick the record.'
WebUI.callTestCase(findTestCase('Components/SelectRecord'), [('TextToClick') : findTestData('Datatable').getValue('IsPartialLot', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Proceed to delete the ticked record by clicking the \'Delete\' button. '
WebUI.callTestCase(findTestCase('Components/ClickDeleteButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate back to ISPS2. '
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Log out and close browser. '
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

