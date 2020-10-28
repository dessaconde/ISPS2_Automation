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

/*========================================================================*
 * COMPONENT NAME: PFIA.ReminderLHS 		    					  	  *
 * TESTER: Krizia Manuel                                    			  *
 * CREATE DATE: 10-June-2020                                 			  *
 * PURPOSE:This is to verify the precision and scale of Reminder LHS      *
 * =======================================================================*
 */

'Login.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue('URL', 
            1), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 1), ('Username') : findTestData(
            'ISPS2 Test Data').getValue('Username', 1), ('Password') : findTestData('ISPS2 Test Data').getValue('Password', 
            1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Go to Filter, In task description field populate it with the desired case type'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SMA)'], FailureHandling.STOP_ON_FAILURE)

'Click Process Case SMA.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SMA)', ('index') : '3'], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Reminder/Reject LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Reminder/Reject'], FailureHandling.STOP_ON_FAILURE)

'Verify that the page header is loaded.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Reminder'], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'Reminder Type:', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the existing input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'reminderType', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Validates the drop down values using hashmap'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/VerifyDropdownValuesXPI'), [('FldNm') : 'reminderType'
        , ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFIAConstantHashMap', ('cmbNm') : 'ReminderType'
        , ('NoOfVal') : 1, ('DelayTime') : 1, ('EnterValue') : '', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

