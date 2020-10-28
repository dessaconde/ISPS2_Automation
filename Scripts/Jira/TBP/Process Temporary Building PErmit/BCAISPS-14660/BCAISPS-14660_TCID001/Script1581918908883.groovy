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

//Dev: Shayne Cardona

'Log in.\r\n'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search for Process Submission Quality Points.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Temporary Building Permit'], FailureHandling.STOP_ON_FAILURE)

'Select a case from the filtered case type.'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '8', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Verify that the selected/opened case matches the required case type.'
WebUI.callTestCase(findTestCase('Components/VerifySelectedCaseMatchesRequiredCaseType'), [('requiredCaseType') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Get case ref no.'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Navigate to Main Form.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Copy the needed date.'
WebUI.callTestCase(findTestCase('Components/GetTextOfFieldAndStoreInAGlobalVariable'), [('tagToBeUsed') : 'name', ('nameToBeUsed') : 'appvEndDt'], 
    FailureHandling.STOP_ON_FAILURE)

'Compare the copied date with today\'s date.'
WebUI.callTestCase(findTestCase('Components/CompareTwoDates'), [('dateToCompare') : GlobalVariable.inputFieldText], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue Preliminary Approval.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue Preliminary Approval/PTU'], FailureHandling.STOP_ON_FAILURE)

'Populate Issue Approval fields.'
WebUI.callTestCase(findTestCase('Components/PopulateIssueApproval'), [('QPsCertificateList') : 'TBP QP C4', ('ProjectEnded') : 'No'
        , ('Remarks') : 'Remarks textarea automated test. '], FailureHandling.STOP_ON_FAILURE)

'Select specific type of letter.'
WebUI.callTestCase(findTestCase('Components/SelectTypeOFLetter'), [('letterToGenerateContains') : 'BPDSC05_PTU'], FailureHandling.STOP_ON_FAILURE)

'Click commit and dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtons'), [('buttonText') : 'Commit and Dispatch'], FailureHandling.STOP_ON_FAILURE)

'Access uni search.'
WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify case status in universal search'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStatusInUniversalSearch'), [('caseTypeCaseStatus') : 'Permit to erect temporary building works || KIV'
        , ('caseStatus') : 'PTU Issued'], FailureHandling.STOP_ON_FAILURE)

'Verify the label is present in the page.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'font', ('textToModify') : 'Case Kiv Due Date:'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the Case KIV Due Date will be the next day of the present date if the Duration Approved Period To date is backdated '
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'font', ('textToModify') : GlobalVariable.dateToCompare], 
    FailureHandling.STOP_ON_FAILURE)

