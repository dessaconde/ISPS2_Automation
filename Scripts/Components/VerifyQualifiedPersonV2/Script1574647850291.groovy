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

//Component Name: VerifyQualifiedPersonV2
//Dev: Shayne Cardona
//Purpose: To verify the existence of the added qp in the summary lhs

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(1000)

'Highlight qp name.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyQualifiedPersonV2/XPIA_Name'))

'Get QP Name'
qpName = WebUI.getText(findTestObject('Objects.VerifyQualifiedPersonV2/XPIA_Name'))

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(1000)

'Highlight firm name.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyQualifiedPersonV2/XPIA_FirmName'))

'Get firm name'
firmName = WebUI.getText(findTestObject('Objects.VerifyQualifiedPersonV2/XPIA_FirmName'))

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(1000)

'Navigate to Summary LHS.'
WebUI.click(findTestObject('Objects.VerifyQualifiedPersonV2/summary'))

'Wait for 5 seconds.'
Thread.sleep(5000)

not_run: modifiedQPSecInSummary = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQualifiedPersonV2/qpSecInSummary'), 
    'xPath', 'equals', ('(//div[text()="' + qpSecInSummary) + '"])', false)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedQPSecInSummary)

'Verify QP name is present in the summary.'
WebUI.verifyTextPresent(qpName, false)

'Verify firm name is present in the summary.'
WebUI.verifyTextPresent(firmName, false)

