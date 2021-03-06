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

'Logs the user in to ISPS2.'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Clicks the ISPS2 Menu on the upper left side of the screen.'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Enquiries'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Data Share'], FailureHandling.STOP_ON_FAILURE)

