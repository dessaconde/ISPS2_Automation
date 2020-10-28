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

/*=======================================================================*
 * TESTER: Rhodessa Conde                                                *
 * CREATE DATE: 08-May-2020                                              *
 * PURPOSE: This is to verify the precision and scale of PE LHS          *
 * ======================================================================*
 */
'Login in ISPS2'
not_run: WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue(
            'URL', 16), ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Search for PSI case'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (SM)'], FailureHandling.STOP_ON_FAILURE)

'Click on the Process Case (SM) link'
not_run: WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (SM)'
        , ('index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Click on the PE LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'PE'], FailureHandling.STOP_ON_FAILURE)

'Verify that PE screen is successfully loaded'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'PE'], FailureHandling.STOP_ON_FAILURE)

'Double click in the cell grid to enable the field'
WebUI.callTestCase(findTestCase('Components/DoubleClickToEnable'), [('HeaderCellName') : 'Registration No', ('index') : 2], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight the PE No input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'peRegNo'], FailureHandling.STOP_ON_FAILURE)

'Remove all the values'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'peRegNo'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peRegNo', ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/PELists'
        , ('cmbNm') : 'PENo', ('NoOfVal') : 10, ('DelayTime') : 8, ('EnterValue') : '00'], FailureHandling.STOP_ON_FAILURE)

'Click on Cancel icon'
WebUI.callTestCase(findTestCase('Components/ClickCancelIcon'), [:], FailureHandling.STOP_ON_FAILURE)

'Double click in the cell grid to enable the field'
WebUI.callTestCase(findTestCase('Components/DoubleClickToEnable'), [('HeaderCellName') : 'PE Name', ('index') : 3], FailureHandling.STOP_ON_FAILURE)

'Highlight the PE Name input field'
WebUI.callTestCase(findTestCase('Components/HighlightInputField'), [('InputFldName') : 'peName'], FailureHandling.STOP_ON_FAILURE)

'Remove all the values'
WebUI.callTestCase(findTestCase('Components/SelectAllThenDelete'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'peName'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the dropdown values'
WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyDropdownValues'), [('FldNm') : 'peName', ('CallTCName') : 'PFI Precision and Scale/HashMap Tables/PELists'
        , ('cmbNm') : 'PEName', ('NoOfVal') : 10, ('DelayTime') : 5, ('EnterValue') : ''], FailureHandling.STOP_ON_FAILURE)

'Click on Cancel icon'
WebUI.callTestCase(findTestCase('Components/ClickCancelIcon'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
not_run: WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

