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

//Component Name: VerifyRecordInspectionEME
//Dev: Shayne Cardona
//Purpose: To verify the record inspection is added successfully.

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.VerifyRecordInspectionEME/span_lastPage'), FailureHandling.OPTIONAL)

'Verify added record inspection is succesfully saved.'
if (WebUI.verifyTextNotPresent(GlobalVariable.IRN, false,FailureHandling.OPTIONAL) == true) {
    not_run: WebUI.verifyTextPresent('Succesfully Saved.', false)

    Thread.sleep(2000) //WebUI.verifyTextNotPresent(GlobalVariable.IRN, false)
    //WebUI.verifyTextPresent(GlobalVariable.IRN, false)
} else if (WebUI.verifyTextPresent(GlobalVariable.IRN, false, FailureHandling.OPTIONAL) == true) {
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyRecordInspectionEME/Page_ISPS2/li_Successfully saved'))

}

