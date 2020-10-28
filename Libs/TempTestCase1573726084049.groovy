import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Intern\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Regression\\EME\\Plan\\Escalator\\FARS.EME.Plan.IssueWD\\20191114_180804\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 
            15), ('Password') : findTestData('Datatable').getValue('Password', 15)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Plan Application cases.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
not_run: WebUI.callTestCase(findTestCase('Components/SmartSelectForEMECaseType'), [('caseType') : 'Escalator'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 6000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Issue WD LHS.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue WD'], FailureHandling.STOP_ON_FAILURE)

'Click Commit and dispatch.'
not_run: WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Verify error messages were displayed.'
not_run: WebUI.callTestCase(findTestCase('Components/VerifyErrorMessageIsDisplayed'), [:], FailureHandling.STOP_ON_FAILURE)

'Get the case ref no of the case.'
not_run: WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Manipulate "on" expiry date fields.'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'on', ('noOfDays') : '12'
        , ('periodType') : 'Working Day(s)', ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

'Manipulate "in" expiry date fields.'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateExpiryDate'), [('inOnOption') : 'in', ('noOfDays') : '3', ('periodType') : 'Calendar Day(s)'
        , ('expiryDate') : '31/10/2019'], FailureHandling.STOP_ON_FAILURE)

'Manipulate Clauses to be included field.'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateClausesToBeIncluded'), [:], FailureHandling.STOP_ON_FAILURE)

'Populate Issue WD fields.'
not_run: WebUI.callTestCase(findTestCase('Components/PopulateIssueWD'), [('ESSExpiryDate') : '31/10/2019', ('ESSComment') : 'ESS Comment field automated populate test. '], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate type of letter.'
WebUI.callTestCase(findTestCase('Components/ManipulateTypeOfLetterV3'), [('generatedletterContains') : 'EME05550', ('letterToGenerateContains') : 'EME05550'], 
    FailureHandling.STOP_ON_FAILURE)

'Manipulate Type of Letter.'
not_run: WebUI.callTestCase(findTestCase('Components/ManipulateTypeOfLetter'), [:], FailureHandling.STOP_ON_FAILURE)

'Manipulate Attach External Document.'
WebUI.callTestCase(findTestCase('Components/ManipulateAttachExternalDocument'), [:], FailureHandling.STOP_ON_FAILURE)

'Manipulate Recipients.'
WebUI.callTestCase(findTestCase('Components/ManipulateRecipients'), [('addedEmailAddress') : 'automation@testing1.com', ('inputRecipient') : 'CHUAH KHAI HUAT'
        , ('addedEmailAddressCC') : 'automation@testing2.com', ('inputRecipientCC') : 'Singapore Land Authority'], FailureHandling.STOP_ON_FAILURE)

'Click Save as draft.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save as Draft', ('Index') : 2], FailureHandling.STOP_ON_FAILURE)

'Verify the decision was saved as draft succesfully.'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Summary LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Verify the the saved information are still displayed.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Issue WD'], FailureHandling.STOP_ON_FAILURE)

'Wait.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Click Commit and Dispatch.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit and Dispatch', ('Index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Search case in the Universal Search.'
WebUI.callTestCase(findTestCase('Components/UniversalSearch'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the case status is correct in the universal search.'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStatusInUniversalSearch'), [('caseTypeCaseStatus') : 'EME Plan Approval || KIV'
        , ('caseStatus') : 'ISSUED WRITTEN DIRECTIONS'], FailureHandling.STOP_ON_FAILURE)

'View Case Stages'
WebUI.callTestCase(findTestCase('Components/VerifyCaseStageFromUniversalSearch'), [('caseOptions') : 'View Case Stages', ('applicationType') : 'EME Plan Approval'
        , ('officer') : 'Nova Solutions Inc.', ('stageDesc') : 'Issued Written Directions', ('caseStat') : 'Issued Written Directions'], 
    FailureHandling.STOP_ON_FAILURE)

'Switch to default window.'
WebUI.callTestCase(findTestCase('Components/SwitchToMainISPS2Window'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to dashboard.'
WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueWD', new TestCaseBinding('Test Cases/Regression/EME/Plan/Escalator/FARS.EME.Plan.IssueWD',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
