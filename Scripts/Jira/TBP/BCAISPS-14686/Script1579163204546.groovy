import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Login\r\n'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Wait for 5 seconds \r\n'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 5000], FailureHandling.STOP_ON_FAILURE)

'Enter the Process Temporary Building Permit in task description\r\n'
WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process Temporary Building Permit'], FailureHandling.STOP_ON_FAILURE)

'Click the TB-0066-2017 test data \r\n'
WebUI.callTestCase(findTestCase('Components/SmartSelectCaseRefNo'), [('caseRefNo') : 'TB-0066-2017'], FailureHandling.STOP_ON_FAILURE)

'Click the Summary LHS\r\n'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Summary'], FailureHandling.STOP_ON_FAILURE)

'Wait for 3 seconds\r\n'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Verify the TBs Within Construction Site group\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'TBs Within Construction Site'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No. of Container row\r\n\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of Container'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No.of Steel-framed Structures row \r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of Steel-Framed Structures'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No. of show-flat or show-house row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of show-flat or show-house'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the Others row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Others : '], 
    FailureHandling.STOP_ON_FAILURE)

'Click the Main Form LHS\r\n'
WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

'Verify the Within construction site/show -flat group \r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'WITHIN CONSTRUCTION SITE/SHOW-FLAT'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No. of Container row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of Container'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No. of Steel-Framed Structures row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of Steel-Framed Structures'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the No.of show-flat or show-house row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'No. of show-flat or show-house'], 
    FailureHandling.STOP_ON_FAILURE)

'Verify the Others row\r\n'
WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('tagToModify') : 'div', ('textToModify') : 'Others'], 
    FailureHandling.STOP_ON_FAILURE)

'Wait for 3 seconds\r\n'
WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 3000], FailureHandling.STOP_ON_FAILURE)

'Logout\r\n'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

