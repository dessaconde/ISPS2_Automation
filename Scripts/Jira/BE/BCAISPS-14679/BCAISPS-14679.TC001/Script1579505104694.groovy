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

//*******************************************************//
//****************** BCAISPS-14679 **********************//
//*** Author: Rhodessa Conde ****************************//
//*** Date Created: 20th of January, 2020 ***************//
//*** Purpose: The Testing Objective of this JIRA is to *//
//*** verify the inline message, informing that the *****//
//*** AAMIM4130 report is processed and successfully ****//
//*** generated. ****************************************//
//*******************************************************//

'Login to ISPS2'
WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 1), ('Password') : findTestData(
            'Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to Home Menu Bar'
WebUI.callTestCase(findTestCase('Components/OpenHomepageMenu'), [:], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: Report'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Reports'], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: Plan Subm'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Plan Subm'], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: Structural Plan'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Structual Plan Reports'], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: MI Report'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'MI Reports'], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: Extract Data'
WebUI.callTestCase(findTestCase('Components/HoverToAnyMenuSelection'), [('MenuSelection') : 'Extract Data'], FailureHandling.STOP_ON_FAILURE)

'Hover the Menu Selection: AAMIM4130'
WebUI.callTestCase(findTestCase('Components/SelectFromMenu'), [('menuToBeClicked') : 'AAMIM4130 - QP/AC Performance Extraction'], 
    FailureHandling.STOP_ON_FAILURE)

'Populate all fields with AC Recipients'
WebUI.callTestCase(findTestCase('Components/PopulateExtractData'), [('ModifiedRecipients') : 'AC'], FailureHandling.STOP_ON_FAILURE)

'Populate all fields with AC(GEO) Recipients'
WebUI.callTestCase(findTestCase('Components/PopulateExtractData'), [('ModifiedRecipients') : 'AC(GEO)'], FailureHandling.STOP_ON_FAILURE)

'Populate all fields with QP Recipients'
WebUI.callTestCase(findTestCase('Components/PopulateExtractData'), [('ModifiedRecipients') : 'QP'], FailureHandling.STOP_ON_FAILURE)

'Populate all fields with QP(GEO) Recipients'
WebUI.callTestCase(findTestCase('Components/PopulateExtractData'), [('ModifiedRecipients') : 'QP(GEO)'], FailureHandling.STOP_ON_FAILURE)

'Logout from ISPS2'
WebUI.callTestCase(findTestCase('Components/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

