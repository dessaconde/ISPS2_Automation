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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

//*******************************************************//
//****************** BCAISPS-14661 **********************//
//*** Author: Rhodessa Conde ****************************//
//*** Date Created: 21/02/2020 **************************//
//*** Purpose: The Testing Objective of this TC001 is  **//
//*** to verify that the saved AC Details are ***********//
//*** reflecting to Manage AC Grid **********************//
//*******************************************************//
'Login to ISPS2. Please set the test data first'
WebUI.callTestCase(findTestCase('null'), [('LinkToBeUsed') : findTestData('ISPS2 Test Data').getValue('URL', 
            2), ('LoginPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue('HomeBanner', 2), ('Username') : findTestData(
            'Datatable').getValue('Username', 1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Components/VerifyTextPresentInPage'), [('TextToModify') : 'Search Result', ('index') : 1], FailureHandling.STOP_ON_FAILURE)

'Click on Menu'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Utilities'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Utilities'], FailureHandling.STOP_ON_FAILURE)

'Go to Common'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Common'], FailureHandling.STOP_ON_FAILURE)

'Go to Maintenance'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Maintenance'], FailureHandling.STOP_ON_FAILURE)

'Go to Maintain AC'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'Maintain AC'], FailureHandling.STOP_ON_FAILURE)

'Click Add Button'
WebUI.callTestCase(findTestCase('Components/ClickAddButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Populate AC Details section'
WebUI.callTestCase(findTestCase('Components/PopulateACDetails'), [('enterACNo') : '0057', ('enterSheetName') : 'MaintainAC'
        , ('enterDBPath') : 'C:\\Users\\19023-RAC\\Desktop\\ISPS2 Automation\\Data Files\\Files\\ISPS2 DB.xlsx'], FailureHandling.STOP_ON_FAILURE)

'Click Save Button'
WebUI.callTestCase(findTestCase('Components/ClickSaveButtonII'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify if AC Details is created successfully'
WebUI.callTestCase(findTestCase('Components/VerifyCreatedSuccessfully'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify the AC Details saved is reflecting in Maintain AC Grid'
WebUI.callTestCase(findTestCase('Components/VerifySavedAC'), [:], FailureHandling.STOP_ON_FAILURE)

'Search the newly created AC IND'
WebUI.callTestCase(findTestCase('Components/SearchManageACGrid'), [:], FailureHandling.STOP_ON_FAILURE)

'Click the AC Name link'
WebUI.callTestCase(findTestCase('Components/ClickLink'), [('LinkToModify') : GlobalVariable.acName], FailureHandling.STOP_ON_FAILURE)

'Update the AC Details'
WebUI.callTestCase(findTestCase('Components/PopulateACDetails'), [('enterACNo') : GlobalVariable.acNo, ('enterSheetName') : 'MaintainAC'
        , ('enterDBPath') : 'C:\\Users\\19023-RAC\\Desktop\\ISPS2 Automation\\Data Files\\Files\\ISPS2 DB.xlsx'], FailureHandling.STOP_ON_FAILURE)

'Click Update Button'
WebUI.callTestCase(findTestCase('Components/ClickUpdateButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify if Updated Successfully'
WebUI.callTestCase(findTestCase('Components/VerifyUpdateSuccessfully'), [:], FailureHandling.STOP_ON_FAILURE)

'Verify if the Updated AC Details are reflecting in Manage AC grid'
WebUI.callTestCase(findTestCase('Components/VerifySavedAC'), [:], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [('LogoutPageTextToBeVerified') : findTestData('ISPS2 Test Data').getValue(
            'HomeBanner', 2)], FailureHandling.STOP_ON_FAILURE)

