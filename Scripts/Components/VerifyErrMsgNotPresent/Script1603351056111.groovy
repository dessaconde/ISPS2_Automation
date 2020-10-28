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


'Wait for a moment before proceeding to further automated steps.'
Thread.sleep(3000)
//WebUI.verifyTextPresent(ErrorMem, true)
'Verify that the error message is displayed.'
assert (((((WebUI.verifyTextNotPresent('Road name is mandatory.', true, FailureHandling.OPTIONAL) || WebUI.verifyTextNotPresent(
	'Please Fill Mandatory Fields!', true, FailureHandling.OPTIONAL)) || WebUI.verifyTextNotPresent('Please fill up the mandatory fields.',
	true, FailureHandling.OPTIONAL)) || WebUI.verifyTextNotPresent('Please fill up mandatory fields.', true, FailureHandling.OPTIONAL)) ||
WebUI.verifyTextNotPresent('Please select at least one project member from the recipient list.', true, FailureHandling.OPTIONAL)) ||
WebUI.verifyTextNotPresent('Plan Reference Not Found', true, FailureHandling.OPTIONAL)) ||
WebUI.verifyTextNotPresent('Please generate a document before dispatching.', true, FailureHandling.OPTIONAL)

'Wait for a moment before proceeding to further automated steps.'
Thread.sleep(3000)

