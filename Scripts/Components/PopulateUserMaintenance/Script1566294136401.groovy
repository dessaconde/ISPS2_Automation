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

Thread.sleep(1000)

WebUI.verifyTextPresent('User Maintainance', false)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Username_userid'))

WebUI.setText(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Username_userid'), Username, FailureHandling.OPTIONAL)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Name_name'))

Thread.sleep(1000)

WebUI.setText(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Name_name'), Name, FailureHandling.OPTIONAL)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Role_role'))

WebUI.setText(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Role_role'), Role, FailureHandling.OPTIONAL)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Status_status'))

WebUI.setText(findTestObject('Objects.PopulateUserMaintenance/Page_ISPS2/input_Status_status'), Status, FailureHandling.OPTIONAL)

