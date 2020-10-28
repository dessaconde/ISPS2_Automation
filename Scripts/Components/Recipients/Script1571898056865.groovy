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

Thread.sleep(3000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Recipients/Page_ISPS2/div_to'))

WebUI.click(findTestObject('Objects.Recipients/Page_ISPS2/div_to'))

WebUI.setText(findTestObject('Objects.Recipients/Page_ISPS2/div_to'), addTestEmail)

WebUI.sendKeys(findTestObject('Objects.Recipients/Page_ISPS2/div_to'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Objects.Recipients/Page_ISPS2/span_To'))

Thread.sleep(2000)

WebUI.verifyTextPresent(addTestEmail, false)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Recipients/Page_ISPS2/span_OK'))

WebUI.click(findTestObject('Objects.Recipients/Page_ISPS2/span_OK'))

