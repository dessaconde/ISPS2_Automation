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

/*============================================================================================*
 * TESTER: Krizia Manuel                                             						  *
 * CREATE DATE: 29-Jul-2020                                        							  *
 * PURPOSE: This is to verify the precision and scale of Main Form LHS  					  *
 * ===========================================================================================*
 */
'Login from ISPS2'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 3), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Search for PSI case'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Case (PFI)'], FailureHandling.STOP_ON_FAILURE)

'Click on PSI case link'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Process Case (PFI)', ('index') : '2'], 
    FailureHandling.STOP_ON_FAILURE)

'Go to Site Inspection LHS'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Verify Site Inspection screen is successfully loaded'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoadedII'), [('PageNm') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyNameValues'), [('tagToModify') : 'label', ('textToModify') : 'Safe'
        , ('Name') : 'MainForm', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFICheckboxHashmap'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyNameValues'), [('tagToModify') : 'label', ('textToModify') : 'Unsafe   '
        , ('Name') : 'MainForm', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFICheckboxHashmap'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyNameValues'), [('tagToModify') : 'label', ('textToModify') : 'Require Repair'
        , ('Name') : 'MainForm', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFICheckboxHashmap'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PFI Precision and Scale/PFI Components/VerifyNameValues'), [('tagToModify') : 'label', ('textToModify') : 'Require Full Facade Investigation'
        , ('Name') : 'MainForm', ('CallTCName') : 'Test Cases/PFI Precision and Scale/HashMap Tables/PFICheckboxHashmap'], 
    FailureHandling.STOP_ON_FAILURE)

