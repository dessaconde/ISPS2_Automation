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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19023-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Components\\00_Precision and Scale\\0_PFI\\EOTRequest\\20200511_203035\\execution.properties')

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

/*=======================================================================*
 * TESTER: Rhodessa Conde                                                *
 * CREATE DATE: 29-Apr-2020                                              *
 * PURPOSE: This is to verify the precision and scale of EOT Request LHS *
 * ======================================================================*
 */
'Login in ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 16), ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Search for Process Case (SM)'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click on Process Case (SM) Link'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify if the Summary Screen is loaded successfully'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/VerifyPageScreenLoad'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on EOT Request LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'EOT Request'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale of EOT Type field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/EOTTypeValidation'), [('LblNm') : 'EOT Type *:', ('FldNm') : 'eotTypeCmb'
        , ('EnterInvalidEOTType') : '1231@#$asdCV'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale of EOT From Date field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'EOT From Date *:', ('FldNm') : 'eotFromDate'
        , ('MinLen') : 5, ('index') : 1, ('PastDtValidation') : 'N'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale of EOT To field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'EOT To Date *:', ('FldNm') : 'eotToDate'
        , ('MinLen') : 10, ('index') : 2, ('PastDtValidation') : 'Y'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale of Approve Officer field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/OfficerValidation'), [('LblNm') : 'Approve Officer *:'
        , ('FldNm') : 'approveOfficerCmb', ('EnterAValue') : '1231@#$asdCV'], FailureHandling.STOP_ON_FAILURE)

'Verify precision and scale of Remarks field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/RemarksValidation'), [('LblNm') : 'Remarks *:', ('FldNm') : 'remarks'
        , ('Minlen') : 10, ('MaxLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Components/00_Precision and Scale/0_PFI/EOTRequest', new TestCaseBinding('Test Cases/Components/00_Precision and Scale/0_PFI/EOTRequest',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
