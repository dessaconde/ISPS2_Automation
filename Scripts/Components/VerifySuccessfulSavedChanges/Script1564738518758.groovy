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

Thread.sleep(3000)

not_run: WebUI.scrollToElement(findTestObject('Objects.VerifySuccessfulSavedChanges/XP_Header'), 3, FailureHandling.OPTIONAL)

assert ((WebUI.verifyTextPresent('Updated Successfully!', true, FailureHandling.OPTIONAL) || WebUI.verifyTextPresent('Successfully Saved!', 
    true, FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Successfully saved.', true, FailureHandling.OPTIONAL)) || 
WebUI.verifyTextPresent('Successfully saved!', true, FailureHandling.OPTIONAL) || 
WebUI.verifyTextPresent('Record Inspection Attached Plans are successfully saved.', true, FailureHandling.OPTIONAL) ||
WebUI.verifyTextPresent('Successfully Saved as Draft', true, FailureHandling.OPTIONAL) ||
WebUI.verifyTextPresent('Created Successfully!', true, FailureHandling.OPTIONAL) ||
WebUI.verifyTextPresent('Successfully Saved.', true, FailureHandling.OPTIONAL) || 
WebUI.verifyTextPresent('Saved Successfully!', true, FailureHandling.OPTIONAL)