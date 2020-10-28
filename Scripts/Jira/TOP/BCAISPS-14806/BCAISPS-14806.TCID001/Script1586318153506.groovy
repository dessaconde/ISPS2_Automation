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

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 4), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds.'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover to Sys Admin.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Sys Admin'], FailureHandling.STOP_ON_FAILURE)

'Hover to Data Patch for TOP/CSC.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Data Patch for TOP/CSC'], FailureHandling.STOP_ON_FAILURE)

'Click Data Patch for TOP/CSC.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'span', ('linkName') : 'Data Patch for TOP/CSC'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'planRefNo'
        , ('textToBeInputted') : '00470-1998'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'planType', ('textToBeInputted') : 'BPNE'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'planNo', ('textToBeInputted') : '001'], 
    FailureHandling.STOP_ON_FAILURE)

'Click search button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '3'], FailureHandling.STOP_ON_FAILURE)

'Click the first record.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'a', ('linkName') : '00470-1998-C02'
        , ('index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Navigate to Building Info LHS.'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Building Information'], FailureHandling.STOP_ON_FAILURE)

'Highlight the Building Info header.'
WebUI.callTestCase(findTestCase('Components/VerifyPageSuccessfullyLoaded'), [('HeaderName') : 'Building Info'], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Click checkbox.'
WebUI.callTestCase(findTestCase('Components/ClickCheckBox'), [('Index') : '4'], FailureHandling.STOP_ON_FAILURE)

'Delete the selected record.'
WebUI.callTestCase(findTestCase('Components/ClickLinkDependingOnTagTextAndIndex'), [('tagToBeUsed') : 'span', ('linkName') : 'Delete'
        , ('index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Scroll the page down.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'Add', ('tagToBeUsed') : 'span'], FailureHandling.STOP_ON_FAILURE)

'Click commit button.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Commit', ('Index') : '2'], FailureHandling.STOP_ON_FAILURE)

'Wait for 10 seconds'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 10000], FailureHandling.STOP_ON_FAILURE)

'Highlight the message.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Successfully Saved!', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

//[Des 20102020]: Add for additional verification.
'Verify that the page is redirected to Search Summary grid'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Search Summary', ('index') : 1], 
    FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('Datatable').getValue(
            'HomeBanner', 1)], FailureHandling.STOP_ON_FAILURE)

