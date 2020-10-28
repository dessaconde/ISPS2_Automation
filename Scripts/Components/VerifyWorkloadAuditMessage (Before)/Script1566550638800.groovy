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

//Component Name: VerifyWorkloadAuditMessage (Before)
//dev: Shayne Cardona
///Purpose: To verify the message for the before the workload change
'Wait for 1 sec.'
Thread.sleep(1000)

'Verify the specific text is present in page.'
WebUI.verifyTextPresent('Audit before workload change done successfully.', false)

'Wait for 2 secs.'
Thread.sleep(2000)

'Close.'
WebUI.click(findTestObject('Objects.VerifyCaseReassignment/span_Close'))

