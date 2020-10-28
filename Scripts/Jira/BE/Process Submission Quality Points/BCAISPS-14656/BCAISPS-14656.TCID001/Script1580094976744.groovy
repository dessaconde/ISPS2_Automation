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

'Log in.\r\n'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search for Process Submission Quality Points.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Submission Quality Points'], FailureHandling.STOP_ON_FAILURE)

'Select a case from the filtered case type.'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '1', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the selected/opened case matches the required case type.'
WebUI.callTestCase(findTestCase('Components/VerifySelectedCaseMatchesRequiredCaseType'), [('requiredCaseType') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Hard wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

'Highlight the text.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Process Submission Quality Points'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Dashboard'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

