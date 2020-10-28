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

/*============================================================================*
 * COMPONENT NAME: PFIA.CloseCaseLHS 		    					  	      *
 * TESTER: Krizia Manuel                                    			      *
 * CREATE DATE: 10-June-2020                                 			      *
 * PURPOSE:This is to verify the precision and scale of Close Case LHS        *
 * ===========================================================================*
 */

'Login in ISPS2'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 1)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 1), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Open home page menu.'
WebUI.callTestCase(findTestCase('Components/ClickMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Click Desktop.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Click My Tasks.'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search for Recommendation and Decision (SMA)'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Recommendation and Decision (SMA)'], FailureHandling.STOP_ON_FAILURE)

'Click on Recommendation and Decision (SMA) Link'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Recommendation and Decision (SMA)'
        , ('index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Click on the Close Case LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Close Case'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Close Case LHS.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Close Case'], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Label Field.'
WebUI.callTestCase(findTestCase('Components/HighlightLabelIndexField'), [('LblName') : 'Remarks:', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Highlight the existing Input Field.'
WebUI.callTestCase(findTestCase('Components/HighlightInputIndexField'), [('InputName') : 'remarks', ('index') : 4], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accepts alphanumeric characters'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/AlphaNumericSpecialValidationIndex'), 
    [('FldNm') : 'remarks', ('LenChar') : 10, ('index') : 4], FailureHandling.STOP_ON_FAILURE)

'Validates that the field accept the maximum number of characters.'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components with Indexing/MaxCharLengthIndexValidation'), [('FieldNm') : 'remarks'
        , ('index') : 4, ('MaxCharLen') : 4005], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

