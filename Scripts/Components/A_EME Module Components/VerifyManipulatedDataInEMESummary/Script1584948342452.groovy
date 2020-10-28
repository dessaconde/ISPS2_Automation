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

'Wait for a second before proceeding to further automated actions. '
Thread.sleep(1000)

'Verify that the \'Project Title\' that was set in Main Form page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(projectTitle, false)

'Verify that the \'Description of Building Works\' that was set in Main Form page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(descriptionOfBuildingWorks, false)

'Verify that the \'Submitted Documents\' that was set in Main Form page is updated and reflecting in Summary page. '
WebUI.verifyTextPresent(submittedDocuments, false)

