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

//Component NAe: VerifyAddressInSummaryPage
//Dev: Shayne Cardona
//Purpose: To verify that the added address is also displayed in the Summary LHS.

'Wait 3 seconds.'
Thread.sleep(3000)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyAddressInSummaryPage/Page_ISPS2/Page_ISPS2/div_Address'))

'Wait 3 seconds.'
Thread.sleep(3000)

'Verify the formatted address is displayed.\r\n'
WebUI.verifyTextPresent(formattedAdd, false)

'Verify the unformatted address is displayed.'
WebUI.verifyTextPresent(unformattedAdd, false)

