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
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Click Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Utilities.\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Data Patch for Common.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Navigate to General.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'General'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Maintain VVIP / NGA / Fast Track.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain VVIP / NGA / Fast Track'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Maintain VVIP / NGA / Fast Track.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Maintain VVIP / NGA / Fast Track'], FailureHandling.STOP_ON_FAILURE)

'Add records.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Add', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'hseblk', ('textToBeInputted') : '123456789'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'lotNo', ('textToBeInputted') : '99999W'], 
    FailureHandling.STOP_ON_FAILURE)

'Scroll the page down.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'STEP 3 (OPTIONAL): TO DEFINE THE PROJECT CRITERIA'
        , ('tagToBeUsed') : 'div'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'planRefNo'
        , ('textToBeInputted') : '98765'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'devName', ('textToBeInputted') : 'Roco'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Save.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Save', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Highlight message for verification.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'li', ('textToModify') : 'Created Successfully!'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Menu.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Utilities.\r\n'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Data Patch for Common.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Navigate to General.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'General'], FailureHandling.STOP_ON_FAILURE)

'Navigate to Maintain VVIP / NGA / Fast Track.'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintain VVIP / NGA / Fast Track'], 
    FailureHandling.STOP_ON_FAILURE)

'Click Maintain VVIP / NGA / Fast Track.'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Maintain VVIP / NGA / Fast Track'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'advhseblk'
        , ('textToBeInputted') : '123456789'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'advlotNo', ('textToBeInputted') : '99999W'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'advplanRef'
        , ('textToBeInputted') : '98765'], FailureHandling.STOP_ON_FAILURE)

'Populate fields.'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : 'input', ('nameToBeUsed') : 'advdevName'
        , ('textToBeInputted') : 'Roco'], FailureHandling.STOP_ON_FAILURE)

'Add records.'
WebUI.callTestCase(findTestCase('Components/ClickBlueButtonsWithXPI'), [('Button') : 'Search', ('Index') : '1'], FailureHandling.STOP_ON_FAILURE)

'Scroll page down.'
WebUI.callTestCase(findTestCase('Components/ScrollPageDown'), [('textToBeUsed') : 'SEARCH SUMMARY', ('tagToBeUsed') : 'div'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight message for verification.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'SEARCH SUMMARY'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight message for verification.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : '123456789'], 
    FailureHandling.STOP_ON_FAILURE)

'Highlight message for verification.'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : '99999W'], 
    FailureHandling.STOP_ON_FAILURE)

'Logout.'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

