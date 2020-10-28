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

'Wait for 5 sec.'
Thread.sleep(5000)

'Highlight radio button \'in\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_in'))

'Highlight radio button \'on\''
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_on'))

'If the user inputted \'in\'...'
if (inOnOption == 'in') {
    'Wait for 1 sec.'
    Thread.sleep(1000)

    'Highlight radio button \'in\''
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_in'))

    not_run: WebUI.click(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_in'))

    'Click radio button \'in\''
    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_in'), 
        0)

    'Highlight no of days field'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_in_noOfDays'))

    'Populate no of days field'
    WebUI.setText(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_in_noOfDays'), noOfDays)

    'Highlight period type field'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_in_periodType'))

    'Set text on period type field'
    WebUI.setText(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_in_periodType'), periodType)
} else if (inOnOption == 'on') {
    'Wait for 1 sec.'
    Thread.sleep(1000)

    'Highlight radio button \'on\''
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_on'))

    not_run: WebUI.click(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_on'))

    'Click radio button \'on\''
    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/label_on'), 
        0)

    'Highlight expiry date field'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_on_expiryDate'))

    'Set text on expiry date field'
    WebUI.setText(findTestObject('Objects.ManipulateExpiryDate/Page_ISPS2/input_on_expiryDate'), expiryDate)
}

