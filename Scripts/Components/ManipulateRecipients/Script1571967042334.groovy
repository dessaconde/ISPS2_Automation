import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Component Name: ManipulateRecipients
//Author: Shayne Cardona
//Purpose: To manipulate (add, edit, delete, read) the recipients field

'Wait for 3 seconds.'
Thread.sleep(3000)

'Highlight the to tag.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_toTag'))

'Click the to tag where the email address will be inputted.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_toTag'))

'Input the email address to be added.\r\n'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_toTag'), addedEmailAddress)

'Enter.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_toTag'), Keys.chord(Keys.ENTER))

'Click To Button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Verify the added email address is present in the Select Recipient(s) pop up window.'
WebUI.verifyTextPresent(addedEmailAddress, false)

'Click the to tag inside the select recipient(s) pop up window.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_toInsideSelectRec'))

'Click backspace.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_toInsideSelectRec'), Keys.chord(Keys.BACK_SPACE))

'Wait for 1 second.'
Thread.sleep(1000)

'Click Ok'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/a_OK'))

'Wait for 1 second.'
Thread.sleep(1000)

'Verify the the added email address is deleted successfully.'
WebUI.verifyTextNotPresent(addedEmailAddress, false, FailureHandling.OPTIONAL)

'Click To button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Highlight the serach field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Click the search field.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Set/Search for the recipient name.'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'), inputRecipient)

'Modify the div of the recipient to be selected.'
modifiedSelectRec = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/div_selectRec'), 
    'xpath', 'equals', ('//div[text() = "' + inputRecipient) + '"]', true)

'Wait for 5 seconds.'
Thread.sleep(5000)

'Click the modified div of the recipient.'
WebUI.click(modifiedSelectRec)

'Highlight Cancel button.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_Cancel'))

'Click Cancel button'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_Cancel'))

'Verify the selected recipient wasnt added when cancel button was clicked.'
WebUI.verifyTextNotPresent(inputRecipient, false, FailureHandling.OPTIONAL)

'Click To button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Highlight the serach field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Click the search field.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Set/Search for the recipient name.'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'), inputRecipient)

'Modify the div of the recipient to be selected.'
modifiedSelectRec = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/div_selectRec'), 
    'xpath', 'equals', ('//div[text() = "' + inputRecipient) + '"]', true)

'Wait for 5 seconds.'
Thread.sleep(5000)

'Click the modified div of the recipient.'
WebUI.click(modifiedSelectRec)

'Click Ok button'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/a_OK'))

'Verify the selected recipient was added succesfully.'
WebUI.verifyTextPresent(inputRecipient, false)

'Highlight CC tag.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_ccTag'))

'Click CC tag.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_ccTag'))

'Input the email address for the CC.'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_ccTag'), addedEmailAddressCC)

'Enter.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/input_ccTag'), Keys.chord(Keys.ENTER))

'Click To Button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Verify the added email address is present in the Select Recipient(s) pop up window.'
WebUI.verifyTextPresent(addedEmailAddressCC, false)

'Wait for 1 second.'
Thread.sleep(1000)

'Click the CC tag inside the select recipient(s) pop up window.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_ccInsideSelectRec'))

'Wait for 1 second.'
Thread.sleep(1000)

'Click backspace.'
WebUI.sendKeys(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_ccInsideSelectRec'), Keys.chord(Keys.BACK_SPACE))

'Click Ok'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/a_OK'))

'Verify the the added email address is deleted successfully.'
WebUI.verifyTextNotPresent(addedEmailAddressCC, false, FailureHandling.OPTIONAL)

'Click To button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Click the CC > button inside the Select Recipient(s) pop up.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/span_Cc  '))

'Highlight the serach field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Click the search field.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Set/Search for the recipient name.'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'), inputRecipientCC)

'Modify the div of the recipient to be selected.'
modifiedSelectRecCC = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/div_selectRec'), 
    'xpath', 'equals', ('//div[text() = "' + inputRecipientCC) + '"]', true)

'Wait for 5 seconds.'
Thread.sleep(5000)

'Click the modified recipient for CC.'
WebUI.click(modifiedSelectRecCC)

'Highlight Cancel button.'
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_Cancel'))

'Click Cancel button'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_Cancel'))

'Verify the the added email address is deleted successfully.'
WebUI.verifyTextNotPresent(addedEmailAddressCC, false)

'Click To button.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPI_toButton'))

'Wait for 1 second.'
Thread.sleep(1000)

'Click the CC > button inside the Select Recipient(s) pop up.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/span_Cc  '))

'Highlight the serach field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Click the search field.'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'))

'Set/Search for the recipient name.'
WebUI.setText(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/XPA_searchInsideSelectRec'), inputRecipientCC)

'Modify the div of the recipient to be selected.'
modifiedSelectRecCC = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/div_selectRec'), 
    'xpath', 'equals', ('//div[text() = "' + inputRecipientCC) + '"]', true)

'Wait for 5 seconds.'
Thread.sleep(5000)

'Click the modified recipient for CC.'
WebUI.click(modifiedSelectRecCC)

'Click Ok button'
WebUI.click(findTestObject('Objects.ManipulateRecipients/Page_ISPS2/a_OK'))

'Verify the selected recipient was added succesfully.'
WebUI.verifyTextPresent(inputRecipientCC, false)

