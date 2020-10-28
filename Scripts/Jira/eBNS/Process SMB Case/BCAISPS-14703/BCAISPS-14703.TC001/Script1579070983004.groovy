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

//Dev: Janelle Carbonell
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 
            1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMB)'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 2, ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMB)'], FailureHandling.STOP_ON_FAILURE)

'Select one test data'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 9, ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Wait for 10 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Click the top most checkbox to select all items'
WebUI.callTestCase(findTestCase('Components/CheckAllListOfIndividualBlocks'), [:], FailureHandling.STOP_ON_FAILURE)

'Click OK button when a pop up message appeared'
WebUI.callTestCase(findTestCase('Components/ClickOKButton'), [:], FailureHandling.OPTIONAL)

not_run: WebUI.callTestCase(findTestCase('Components/GenerateNoticePopupMessage'), [:], FailureHandling.OPTIONAL)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Status'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seonds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click the one of the checkbox'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 33], FailureHandling.STOP_ON_FAILURE)

'Set a value for PSI Status'
WebUI.callTestCase(findTestCase('Components/SetPSIStatus'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click OK button when a popup message appeared'
WebUI.callTestCase(findTestCase('Components/ClickOKButton'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/VerifyIssueStatusPopup'), [:], FailureHandling.OPTIONAL)

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.VerifyIssueStatusPopup/div_Issue Status'), 
    0)

not_run: WebUI.click(findTestObject('Objects.VerifyIssueStatusPopup/span_OK'), FailureHandling.OPTIONAL)

'Navigate to Update Reports'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Update Reports'], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click the one of the checkbox'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 36], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/CheckListOfBlocks'), [:], FailureHandling.STOP_ON_FAILURE)

'Inputs today\'s date in VIR Submit Date Field'
WebUI.callTestCase(findTestCase('Components/PopulateVIRSubmitDate'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Set Button'
WebUI.callTestCase(findTestCase('Components/ClickSetButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Save Button'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Navigate to PE '
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'PE'], FailureHandling.STOP_ON_FAILURE)

'Click one of the checkbox'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 36], FailureHandling.STOP_ON_FAILURE)

'Set PE Details To is a dropdown field, this will select a value to populate the field'
WebUI.callTestCase(findTestCase('Components/SetAllPEDetailsTo'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click Save Button'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Status'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Status'], FailureHandling.STOP_ON_FAILURE)

'Click one of the checkbox'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : 36], FailureHandling.STOP_ON_FAILURE)

'Set a value for PSI Status'
WebUI.callTestCase(findTestCase('Components/SetPSIStatus'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Save Button'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Logout of ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

