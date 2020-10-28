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

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
'Login.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 16), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Pre-Submission Consultation Application cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Pre-Submission Consultation Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Select Process EME Pre-Submission Consultation Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Address LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Address'], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Tick Formatted Address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Formatted'], FailureHandling.STOP_ON_FAILURE)

'Populate Formatted Address.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '12', ('BuildingName') : 'JMT Building'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '001800', ('RoadName') : 'ALEXANDRA LANE (ALL00U)'], FailureHandling.STOP_ON_FAILURE)

'Click reset button.\r\n'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Click Save button'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify error message'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Populate Formatted Address.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '12', ('BuildingName') : 'JMT Building'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '001800', ('RoadName') : 'BULIM STREET (BUS25)'], FailureHandling.STOP_ON_FAILURE)

'Click Cancel button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Tick Formatted Address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Formatted'], FailureHandling.STOP_ON_FAILURE)

'Populate Formatted Address.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '12', ('BuildingName') : 'JMT Building'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '001800', ('RoadName') : ''], FailureHandling.STOP_ON_FAILURE)

'Click Save button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the formatted address was saved succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifyAddedAddress'), [('HouseBlockNo') : '12', ('BuildingName') : 'JMT Building'
        , ('Level') : '11', ('Unit') : 'B', ('PostalCode') : '001800'], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Tick Unformatted Address.'
not_run: WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Unformatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate unformatted address.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateUnformattedAddress'), [('unformattedAdd') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Click reset button.\r\n'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Click Save button'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify error message'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Tick Unformatted Address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Unformatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate unformatted address.'
WebUI.callTestCase(findTestCase('Components/PopulateUnformattedAddress'), [('unformattedAdd') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Cancel button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Cancel', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickAddButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Tick Unformatted Address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Unformatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate unformatted address.'
WebUI.callTestCase(findTestCase('Components/PopulateUnformattedAddress'), [('unformattedAdd') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Save button'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify the unformatted address was saved successfully.'
WebUI.callTestCase(findTestCase('Components/VerifyAddedUnformattedAddress'), [('addSuccessful') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Summary LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify address in summary page.'
WebUI.callTestCase(findTestCase('Components/VerifyAddressInSummaryPage'), [('formattedAdd') : 'BULIM STREET', ('unformattedAdd') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Address LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Address'], FailureHandling.STOP_ON_FAILURE)

'Verify that the formatted address can be deleted.'
WebUI.callTestCase(findTestCase('Components/DeleteFormattedAddress'), [('BuildingName') : 'JMT Building', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the unformatted address can be deleted.'
WebUI.callTestCase(findTestCase('Components/DeleteUnformattedAddress'), [('roadName') : '3791 Jalan Bukit Merah#06-18 E-Centre @ Redhill Singapore 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Summary.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Verify error message'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

