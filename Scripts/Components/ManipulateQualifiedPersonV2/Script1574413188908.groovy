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


//Component Name: ManipulateQualifiedPersonV2
//Author: Shayne Cardona
//Purpose: To verify first if the Add button in Qualified Person LHS is clickable and then proceed to further steps if yes

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

'If the Add button is clickable...'
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Objects.ManipulateQualifiedPersonV2/Page_ISPS2/Page_ISPS2/span_Add'), 
    0, FailureHandling.OPTIONAL) == true) {
    'Click Add button.'
    WebUI.click(findTestObject('Objects.ManipulateQualifiedPersonV2/Page_ISPS2/Page_ISPS2/span_Add'))

    'Populate QP Name field.'
    WebUI.setText(findTestObject('Objects.ManipulateQualifiedPersonV2/Page_ISPS2/input__qpName'), qpName)

    'Wait for a moment before proceeding to execute further automated actions. '
    Thread.sleep(1000)

    'Send enter key.'
    WebUI.sendKeys(findTestObject('Objects.ManipulateQualifiedPersonV2/Page_ISPS2/input__qpName'), Keys.chord(Keys.ENTER))
}

