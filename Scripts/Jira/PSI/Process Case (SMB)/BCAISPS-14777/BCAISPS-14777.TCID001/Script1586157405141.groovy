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
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 3), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Search Result', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Open homepage menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to utilities\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Hover to common'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover to maintenance'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Hover to maintain application'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain Application'], FailureHandling.STOP_ON_FAILURE)

'Click maintain application'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Maintain Application'], FailureHandling.STOP_ON_FAILURE)

'populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'userModuleCmb'
        , ('textToBeInputted') : 'EBNS'], FailureHandling.STOP_ON_FAILURE)

'Send enter key'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'userModuleCmb'], 
    FailureHandling.STOP_ON_FAILURE)

'Click search'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Manipulate case duration'
WebUI.callTestCase(findTestCase('Components/ManipulateCaseDurationConfig'), [('caseDuration') : '2', ('moduleName') : 'EBNS'
        , ('caseTypeCode') : 'SMB'], FailureHandling.STOP_ON_FAILURE)

'Click save'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Open homepage menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to utilities\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Click maintain application'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Open Process Case (SMB) case.'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Recommendation and Decision (SMB)'], FailureHandling.STOP_ON_FAILURE)

'Open selected case'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : '1', ('extractedCaseTypeFromGV') : GlobalVariable.caseType], 
    FailureHandling.STOP_ON_FAILURE)

'Navigate to recommend lhs\r\n'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Recommend'], FailureHandling.STOP_ON_FAILURE)

'Get case ref no'
WebUI.callTestCase(findTestCase('Components/GetCaseRefNo'), [('caseRefNo') : GlobalVariable.caseRefNo], FailureHandling.STOP_ON_FAILURE)

'Populate mandatory fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'
        , ('textToBeInputted') : 'Beetee'], FailureHandling.STOP_ON_FAILURE)

'Send enter key.'
WebUI.callTestCase(findTestCase('Components/SendEnterKey'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'psiRecommendTo'], 
    FailureHandling.STOP_ON_FAILURE)

'Click submit button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Submit', ('Index') : '6'], FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

'Login as the recommended officer.'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('Datatable').getValue('URL', 2)
        , ('LoginPageTextToBeVerified') : findTestData('Datatable').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 18), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Open homepage menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to my tasks'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Click my tasks'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Verify the "due on" date will be dated 2 months from the date it was recommended.'
WebUI.callTestCase(findTestCase('Components/VerifyDueOnDate'), [:], FailureHandling.STOP_ON_FAILURE)

'Switch to window index.'
WebUI.callTestCase(findTestCase('Components/SwitchToIndexedWindow'), [('windowIndex') : '0'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 3)], FailureHandling.STOP_ON_FAILURE)

