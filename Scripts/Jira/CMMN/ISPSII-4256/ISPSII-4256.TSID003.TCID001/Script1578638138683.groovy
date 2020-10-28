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

WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 5), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ReassignCaseFromMyTask'), [('extractedCaseRefNo') : GlobalVariable.CRN, ('formattedTime') : GlobalVariable.currentTime], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Enquiries'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Enquire Audit Trail'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/PopulateEnquireAuditTrail'), [('formattedDate') : GlobalVariable.currentDate
        , ('module') : '', ('functionid') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickSearchButtonInEnquireAuditTrail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectItemFromAuditTrailTable'), [('LinkToModify') : 'Re-assign Case : Reassigned to officer successfully.'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTargetUserIDFromMyTasks'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

