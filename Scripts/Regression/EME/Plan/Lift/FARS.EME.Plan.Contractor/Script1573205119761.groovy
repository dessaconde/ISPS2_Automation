import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Login.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 15), ('Password') : findTestData(
            'Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Plan Application cases.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Contractor LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Contractor'], FailureHandling.STOP_ON_FAILURE)

'Populate to reset contractor details.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateContractor'), [('Salutation') : 'Mrs.', ('IDType') : 'NRIC'
        , ('FirmName') : 'DUMMY FIRM NAME', ('Designation') : 'DUMMY DESIGNATION', ('Name') : 'DUMMY CONTRACTOR NAME', ('UEN') : '201919981S'], 
    FailureHandling.STOP_ON_FAILURE)

'Tick formatted address.'
not_run: WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Formatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate to reset formatted address.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '13', ('BuildingName') : 'JMT Building'
        , ('Level') : '12', ('Unit') : 'C', ('PostalCode') : '738065', ('RoadName') : 'ADAM PARK (ADP00K)'], FailureHandling.STOP_ON_FAILURE)

'Populate to reset contact details.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateContractorContactDetails'), [('telNo') : '1124587', ('extNo') : '7513'
        , ('faxNo') : '5129534833', ('mobileNo') : '6542269426', ('emailAddress') : 'test1@pavo.com'], FailureHandling.STOP_ON_FAILURE)

'Verify the data will be returned to the default values.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Verify Save button will be disabled.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify error message "" is displayed.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Populate to update contractor details.'
WebUI.callTestCase(findTestCase('Components/PopulateContractor'), [('Salutation') : 'Mrs.', ('IDType') : 'NRIC', ('FirmName') : 'DUMMY FIRM NAME'
        , ('Designation') : 'DUMMY DESIGNATION', ('Name') : 'DUMMY CONTRACTOR NAME', ('UEN') : '201919981S'], FailureHandling.STOP_ON_FAILURE)

'Tick formatted address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Formatted'], FailureHandling.STOP_ON_FAILURE)

'Populate to update formatted address.'
WebUI.callTestCase(findTestCase('Components/PopulateAddress'), [('HouseBlockNo') : '13', ('BuildingName') : 'JMT Building'
        , ('Level') : '12', ('Unit') : 'C', ('PostalCode') : '738065', ('RoadName') : 'ADAM PARK (ADP00K)'], FailureHandling.STOP_ON_FAILURE)

'Populate to update contact details.'
WebUI.callTestCase(findTestCase('Components/PopulateContractorContactDetails'), [('telNo') : '1124587', ('extNo') : '7513'
        , ('faxNo') : '5129534833', ('mobileNo') : '6542269426', ('emailAddress') : 'test1@pavo.com'], FailureHandling.STOP_ON_FAILURE)

'Click Save button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify update was succesful.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Populate to reset contractor details.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateContractor'), [('Salutation') : 'Mr.', ('IDType') : 'NRIC', ('FirmName') : 'dummy firm name'
        , ('Designation') : 'dummy designation', ('Name') : 'dummy contractor name', ('UEN') : '312020092S'], FailureHandling.STOP_ON_FAILURE)

'Tick formatted address.'
not_run: WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Unformatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate to reset unformatted address.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateUnformattedAddress'), [('unformattedAdd') : '3791 Sample Unformatted @ Address PH 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate to reset contact details.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateContractorContactDetails'), [('telNo') : '223598', ('extNo') : '7514'
        , ('faxNo') : '6230645944', ('mobileNo') : '7653370537', ('emailAddress') : 'TEST@pavo.com'], FailureHandling.STOP_ON_FAILURE)

'Verify the data will be returned to the default values.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Reset', ('Index') : 3], FailureHandling.STOP_ON_FAILURE)

'Populate to update contractor details.'
WebUI.callTestCase(findTestCase('Components/PopulateContractor'), [('Salutation') : 'Mrs.', ('IDType') : 'NRIC', ('FirmName') : 'dummy firm name'
        , ('Designation') : 'dummy designation', ('Name') : 'dummy contractor name', ('UEN') : '312020092S'], FailureHandling.STOP_ON_FAILURE)

'Tick formatted address.'
WebUI.callTestCase(findTestCase('Components/TickFormattedOrUnformatted'), [('formattedOrUnformatted') : 'Unformatted'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate to update unformatted address.'
WebUI.callTestCase(findTestCase('Components/PopulateUnformattedAddress'), [('unformattedAdd') : '3791 Sample Unformatted @ Address PH 159471'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate  to update contact details.'
WebUI.callTestCase(findTestCase('Components/PopulateContractorContactDetails'), [('telNo') : '223598', ('extNo') : '7514'
        , ('faxNo') : '6230645944', ('mobileNo') : '7653370537', ('emailAddress') : 'TEST@pavo.com'], FailureHandling.STOP_ON_FAILURE)

'Click Save button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : 1], FailureHandling.STOP_ON_FAILURE)

'Verify update was succesful.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Contractor LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Verify contractor details in summary'
WebUI.callTestCase(findTestCase('Components/VerifyContractorInSummaryPage'), [('Name') : 'dummy contractor name', ('firmName') : 'dummy firm name'], 
    FailureHandling.STOP_ON_FAILURE)

