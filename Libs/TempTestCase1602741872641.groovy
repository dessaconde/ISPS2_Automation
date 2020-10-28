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


RunConfiguration.setExecutionSettingFile('C:\\Users\\JMML-2~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Jira\\GMEB\\Processing Record Payment\\BCAISPS-14841\\20201015_140422\\execution.properties')

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

'Login '
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Filter '
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process GMEB Design Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Select item in Task description\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 1, ('extractedCaseTypeFromGV') : 'Process GMEB Design Application'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3], FailureHandling.STOP_ON_FAILURE)

'Copy Case Reference Number'
not_run: WebUI.callTestCase(findTestCase('CopyCaseRef'), [(GlobalVariable.caseRefNo) : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
not_run: WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Common in menu'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Admin in menu'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Admin(Counter/Scanning)'], 
    FailureHandling.STOP_ON_FAILURE)

'Hover and Select Record/Update Payment in menu'
not_run: WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Record/Update Payment'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickRecordUpdatePayment'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentGroup'
        , ('textToBeInputted') : 'Green Mark EB Department'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentGroup'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentType'
        , ('textToBeInputted') : 'Gmeb Fee'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentType'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'refNo'
        , ('textToBeInputted') : GlobalVariable.CRN], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickSearchButton'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : GlobalVariable.CRN], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentDate', ('textToBeInputted') : '11/10/2020'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentAmt', ('textToBeInputted') : '8000'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'receiptNo', ('textToBeInputted') : '40'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'receiptDate', ('textToBeInputted') : '11/10/2020'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode', ('textToBeInputted') : 'Cash'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'paymentMode'], FailureHandling.STOP_ON_FAILURE)

'Save update info.'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HighlightSuccessfulMsg'), [('tagname') : '*', ('SuccessfulMsg') : 'Successfully Saved!'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'Home Banner', 1)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Jira/GMEB/Processing Record Payment/BCAISPS-14841', new TestCaseBinding('Test Cases/Jira/GMEB/Processing Record Payment/BCAISPS-14841',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
