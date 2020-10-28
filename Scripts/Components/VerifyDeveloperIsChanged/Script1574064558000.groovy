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

//Component Name: VerifyDeveloperIsChanged
//Dev: Shayne
//Purpose: To verify if the developer is changed is verified in the Verification Check

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

'If the developer is changed is not verified, else...'
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Objects.VerifyDeveloperIsChanged/notVerified'), 0, FailureHandling.OPTIONAL) == 
true) {
    'Click developer is changed link.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/a_Developer is changed'))

    'Populate remarks lhs.'
    WebUI.setText(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/textarea_Remarks'), remarks)

    'Click no action required checkbox.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/span_No Action Required'))

    'Click cancel.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/span_Cancel3'))

    'Click developer is changed link.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/a_Developer is changed'))

    'Populate remarks lhs.'
    WebUI.setText(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/textarea_Remarks'), remarks)

    'Click no action required checkbox.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/span_No Action Required'))

    'Click save.'
    WebUI.click(findTestObject('Objects.VerifyDeveloperIsChanged/Page_ISPS2/Page_ISPS2/span_Save3'))
} else {
    'Highlight the verified check mark.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyDeveloperIsChanged/verified'))
}

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

