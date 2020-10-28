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


RunConfiguration.setExecutionSettingFile('C:\\Users\\19023-~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Components\\00_Precision and Scale\\0_PFI\\D2Forms\\20200511_201338\\execution.properties')

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
 * CREATE DATE: 28-Apr-2020                                              *
 * PURPOSE: This is to verify the precision and scale of EOT Request LHS *
 * =======================================================================*
 */
'Login in ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/LoginV2.0'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 16), ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Search for Process Case (SM)'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click the Process Case (SM) Link'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Verify if the Summary screen is loaded successfully'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/VerifyPageScreenLoad'), [:], FailureHandling.STOP_ON_FAILURE)

'Click the D2 Forms LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'D2 Forms (Second Stage)'], FailureHandling.STOP_ON_FAILURE)

'Verify the precision and scale of Inspection D2 Receive Date field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'Inspection D2 Receive Date *:'
        , ('FldNm') : 'd2RecvDt', ('index') : 1, ('MinLen') : 5, ('PastDtValidation') : 'N'], FailureHandling.STOP_ON_FAILURE)

'Verify the precision and scale of Inspection D2 Compliance Date field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'Inspection D2 Compliance Date *:'
        , ('FldNm') : 'd2ComplDt', ('index') : 2, ('MinLen') : 6, ('PastDtValidation') : 'N'], FailureHandling.STOP_ON_FAILURE)

'Verify the precision and scale of Inspection D2a Receive Date field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'Inspection D2a Receive Date *:'
        , ('FldNm') : 'd2aRecvDt', ('index') : 3, ('MinLen') : 9, ('PastDtValidation') : 'N'], FailureHandling.STOP_ON_FAILURE)

'Verify the precision and scale of Inspection D2a Compliance Date field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/DateValidation'), [('LblNm') : 'Inspection D2a Compliance Date *:'
        , ('FldNm') : 'd2aComplDt', ('index') : 4, ('MinLen') : 12, ('PastDtValidation') : 'N'], FailureHandling.STOP_ON_FAILURE)

'Verify the precision and scale of PE Reference No field'
WebUI.callTestCase(findTestCase('Components/00_Precision and Scale/PEValidation'), [('LblNm') : 'PE Reference No *:', ('FldNm') : 'peRegNbr'
        , ('EnterInvalidPE') : 'Zh&2', ('PEEnabled') : 'Y', ('PEName') : 'N', ('RqdField') : 'Y', ('NoOfOpt') : 6], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Components/00_Precision and Scale/0_PFI/D2Forms', new TestCaseBinding('Test Cases/Components/00_Precision and Scale/0_PFI/D2Forms',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
