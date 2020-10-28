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
import org.openqa.selenium.Keys as Keys

//Component Name: ManipulateCaseDurationConfig
//Dev: Shayne
//Purpose: To be able to manipulate the case duration config by month/s

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Wait for page to load.'
WebUI.waitForPageLoad(120)

'Verify the module name.'
WebUI.verifyElementText(findTestObject('Objects.ManipulateCaseDurationConfig/moduleName'), moduleName)

'Verify case type code.'
WebUI.verifyElementText(findTestObject('Objects.ManipulateCaseDurationConfig/caseTypeCode'), caseTypeCode)

'Click edit case config button.'
WebUI.click(findTestObject('Objects.ManipulateCaseDurationConfig/editCaseDurationButton'))

'Double click the case config div.'
WebUI.doubleClick(findTestObject('Objects.ManipulateCaseDurationConfig/caseConfig'))

'Set the duration date (month)'
WebUI.setText(findTestObject('Objects.ManipulateCaseDurationConfig/durationField'), caseDuration)

'Transfer value into a global variable.'
GlobalVariable.caseConfigDuration = caseDuration

'SEnd enter key.'
WebUI.sendKeys(findTestObject('Objects.ManipulateCaseDurationConfig/durationField'), Keys.chord(Keys.ENTER))

