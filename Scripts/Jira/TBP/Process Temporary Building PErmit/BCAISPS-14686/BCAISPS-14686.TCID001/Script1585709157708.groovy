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

'Login.'
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Open Process Temporary Building Permit case.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Temporary Building Permit'], FailureHandling.STOP_ON_FAILURE)

'Open selected case'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '1', ('extractedCaseTypeFromGV') : 'Process Temporary Building Permit'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Navigate to main form'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Manipulate grid'
WebUI.callTestCase(findTestCase('Components/ManipulateConstructionSiteShowFlatGrids'), [('structureDescToBeUsed1stGrid') : 'No. of show-flat or show-house'
        , ('valueToBeInputtedOnNoOfStructureInputField') : '2', ('valueToBeInputtedOnSGFAInputeField') : '3', ('structureDescToBeUsed2ndGrid') : 'No. of Container'
        , ('valueToBeInputtedOnNoOfStructureInputField2') : '4', ('valueToBeInputtedOnSGFAInputeField2') : '4'], FailureHandling.STOP_ON_FAILURE)

'Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Navigate to summary'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Scroll down to page'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'DETAILS OF TEMPORARY BUILDING', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the saved values is present in page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : GlobalVariable.WCSSFNoOfStructure], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the saved values is present in page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : GlobalVariable.WCSSFSGFA], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the saved values is present in page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : GlobalVariable.OCSSFNoOfStructure], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the saved values is present in page'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : GlobalVariable.OCSSFSGFA], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

