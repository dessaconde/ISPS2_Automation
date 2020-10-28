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

//Component Name: VerifyFunctionSubFunctionRenamed
//Dev: Shayne Cardona
//Purpose: To verify the function-subfunction text of reassign case in enquire audit trail

'Wait for 5 secs.'
Thread.sleep(5000)

'Verify the specified text is not present.'
WebUI.verifyTextNotPresent('reassignToOfficer - CMMI_rTO_TCACSUT', false)

'Verify the specified text is present.'
WebUI.verifyTextPresent('Re-assign Case - reassignToOfficer', false)

'Wait for 5 secs.'
Thread.sleep(5000)

'Click close.'
WebUI.click(findTestObject('Objects.VerifyCaseReassignment/span_Close'))

