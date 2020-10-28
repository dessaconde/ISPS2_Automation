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

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/div_Update Password'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__uniqueUserName'))

WebUI.setText(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__uniqueUserName'), UserID)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__currentPassword'))

WebUI.setText(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__currentPassword'), OldPassword)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__newPassword'))

WebUI.setText(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__newPassword'), NewPassword)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__confirmPassword'))

WebUI.setText(findTestObject('Objects.PopulateUpdatePasswordPopUp/Page_ISPS2 - Login/input__confirmPassword'), ConfirmPassword)

