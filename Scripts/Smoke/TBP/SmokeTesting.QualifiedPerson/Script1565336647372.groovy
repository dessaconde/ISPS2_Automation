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

WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/SearchTask'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Qualified Person'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'CHUA TECK HONG'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickCancelButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : 'dummy case qp name'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/PopulateQualifiedPerson'), [('QPTypeNo') : findTestData('Datatable').getValue(
            'QPTypeNo', 1), ('Salutation') : findTestData('Datatable').getValue('Salutation', 1), ('FirmName') : findTestData(
            'Datatable').getValue('FirmName', 1), ('UEN') : findTestData('Datatable').getValue('UEN', 1), ('QPName') : findTestData(
            'Datatable').getValue('QPName', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickResetButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/PopulateQualifiedPerson'), [('QPTypeNo') : findTestData('Datatable').getValue(
            'QPTypeNo', 1), ('Salutation') : findTestData('Datatable').getValue('Salutation', 1), ('FirmName') : findTestData(
            'Datatable').getValue('FirmName', 1), ('UEN') : findTestData('Datatable').getValue('UEN', 1), ('QPName') : findTestData(
            'Datatable').getValue('QPName', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/ClickSaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/NavigateToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

