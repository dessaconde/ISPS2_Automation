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

'Login '
WebUI.callTestCase(findTestCase('Components/Login'), [('URL') : findTestData('Datatable').getValue('URL', 1), ('LoginPageTextToBeVerified') : findTestData(
            'Datatable').getValue('HomeBanner', 1), ('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Reports'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Common in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Admin in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Adhoc Report'], FailureHandling.STOP_ON_FAILURE)

'Click Adhoc Report'
WebUI.callTestCase(findTestCase('Components/ClickAdhocReport'), [:], FailureHandling.STOP_ON_FAILURE)

'Input Query'
WebUI.callTestCase(findTestCase('Components/SetTextOnField'), [('tagToBeUsed') : '*', ('nameToBeUsed') : 'txtareaQueryStr'
        , ('textToBeInputted') : 'select  * from VXBCBE_SB_APPT_SPLWORK  where sb_Ref_nbr = \'2017-01290\''], FailureHandling.STOP_ON_FAILURE)

'Clcik Run Query'
WebUI.callTestCase(findTestCase('Components/ClickRunQuery'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTable'), [('SPL_BldgValue1') : '', ('SPL_BldgValue2') : ''], FailureHandling.STOP_ON_FAILURE)

'Hamburger Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Desktop'], FailureHandling.STOP_ON_FAILURE)

'Hover and Select Utilities in menu'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Click My Tasks'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter '
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Specialist Builder Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Select item in Task description\r\n'
WebUI.callTestCase(findTestCase('Components/SelectItemFromFilteredTasks'), [('Index') : 7, ('extractedCaseTypeFromGV') : 'Process Specialist Builder Application'], 
    FailureHandling.STOP_ON_FAILURE)

'Wait'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3], FailureHandling.STOP_ON_FAILURE)

'Click Verification Check Link'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Verification Check'], FailureHandling.STOP_ON_FAILURE)

'Click Valid Specialist Builder Link'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'Valid Specialist Builder'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyQueryResultEqualDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : ''], FailureHandling.STOP_ON_FAILURE)

