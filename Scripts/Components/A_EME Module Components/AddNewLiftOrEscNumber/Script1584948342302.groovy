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
import org.openqa.selenium.Keys as Keys

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Verify that \'Lift Number\' is present on page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddNewLiftOrEscNumber/Page_ISPS2/span_Lift Number'))

'Locates the \'Lift Number\' field before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.AddNewLiftOrEscNumber/Page_ISPS2/input__liftNo'))

'Sets a value from a dynamic variable.'
WebUI.setText(findTestObject('Objects.AddNewLiftOrEscNumber/Page_ISPS2/input__liftNo'), entryNumber)

'Store the value into Global Variable. '
GlobalVariable.liftNumber = entryNumber

'Key press: Enter - to submit new record.'
WebUI.sendKeys(findTestObject('Objects.AddNewLiftOrEscNumber/Page_ISPS2/input__liftNo'), Keys.chord(Keys.ENTER))

