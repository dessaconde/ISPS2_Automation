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

'Wait for a moment before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Verifies that the user is in \'Reminder Letter\' page.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/div_Reminder Letter'))

'Locates the \'Remarks\' textfield before populating it with value(s).'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/XPA_Remarks'))

'Populates the \'Remarks\' field with dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/XPA_Remarks'), Remarks)

'Locates the \'ESS Expiry Date\' datepicker before populating it with value(s).'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/input_ESS Expiry Date_expiryDateInternal'))

'Populates the \'ESSExpiryDate\' datefield with dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/input_ESS Expiry Date_expiryDateInternal'), ESSExpiryDate)

'Locates the \'ESS Comment\' textfield before populating it with value(s).'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/textarea_ESS Comment_comment'))

'Populates the \'ESSComment\' field with dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateReminderLetter/Page_ISPS2/textarea_ESS Comment_comment'), ESSComment)

