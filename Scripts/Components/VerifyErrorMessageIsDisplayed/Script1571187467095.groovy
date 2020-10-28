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

//Component Name: VerifyErrorMessageIsDisplayed
//Dev: Shayne Cardona
//Purpose: To verify that the error message is displayed

'Wait for 1 sec.'
Thread.sleep(1000)

//errorMess = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyErrorMessageIsDisplayed/Page_ISPS2/li_Please Fill Mandatory Fields'), 
//    'text', 'equals', ErrorMem, false)
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject(errorMess))

//WebUI.verifyTextPresent(ErrorMem, true)
'Verify that the error message is displayed.'
assert (((((WebUI.verifyTextPresent('Road name is mandatory.', true, FailureHandling.OPTIONAL) || WebUI.verifyTextPresent(
    'Please Fill Mandatory Fields!', true, FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Please fill up the mandatory fields.', 
    true, FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Please fill up mandatory fields.', true, FailureHandling.OPTIONAL)) || 
WebUI.verifyTextPresent('Please select at least one project member from the recipient list.', true, FailureHandling.OPTIONAL)) || 
WebUI.verifyTextPresent('Plan Reference Not Found', true, FailureHandling.OPTIONAL)) || 
WebUI.verifyTextPresent('Please generate a document before dispatching.', true, FailureHandling.OPTIONAL)

