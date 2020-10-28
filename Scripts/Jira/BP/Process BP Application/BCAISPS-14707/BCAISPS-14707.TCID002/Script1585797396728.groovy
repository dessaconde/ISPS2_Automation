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

//Dev: Shayne Cardona

'Login.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 21)
        , ('LoginPageTextToBeVerified') : 'Sign in to ISPS2-PROD-Verify', ('Username') : 'sysadmin', ('Password') : '8SQVv/p9jVScEs4/2CZsLw=='], 
    FailureHandling.STOP_ON_FAILURE)

'Open Process Waiver Application case.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Open selected case.'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '2', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to Selected Waiver Application LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Selected Waiver Application'], FailureHandling.STOP_ON_FAILURE)

'Open one record under Regulation Details'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTextAndIndex'), [('linkName') : 'Modification', ('index') : '1'], 
    FailureHandling.STOP_ON_FAILURE)

'Tick any among the checkboxes.'
WebUI.callTestCase(findTestCase('Components/ClickCheckboxII'), [('Index') : '5'], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'others', ('textToBeInputted') : 'sample others'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'others', ('textToBeInputted') : 'sample others'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Add button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'locId', ('textToBeInputted') : 'sample location 1'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'modId', ('textToBeInputted') : 'sample modification 1'], 
    FailureHandling.STOP_ON_FAILURE)

'Send Enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'textarea', ('nameToBeUsed') : 'modId'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Save button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Verify the regulation was saved successfully when \'Others\' was selected'
WebUI.callTestCase(findTestCase('Components/VerifySuccessfulSavedChanges'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

