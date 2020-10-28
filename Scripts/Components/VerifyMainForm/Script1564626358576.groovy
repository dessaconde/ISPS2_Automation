import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.VerifyMainForm/Page_ISPS2/div_Main Form'))

Thread.sleep(500)

WebUI.waitForElementNotPresent(findTestObject('Objects.VerifyMainForm/Page_ISPS2/div_Loading Please wait'), 120)

Thread.sleep(2000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyMainForm/Page_ISPS2/div_Main Form_Header'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyMainForm/Page_ISPS2/textarea_Project Title_caseProjectTitle'))

WebUI.click(findTestObject('Objects.VerifyMainForm/Page_ISPS2/textarea_Project Title_caseProjectTitle'))

WebUI.sendKeys(findTestObject('Objects.VerifyMainForm/Page_ISPS2/textarea_Project Title_caseProjectTitle_Clicked'), Keys.chord(
        Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Objects.VerifyMainForm/Page_ISPS2/textarea_Project Title_caseProjectTitle_Clicked'), Keys.chord(
        Keys.CONTROL, 'c'))

String clipboardValue = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

not_run: WebUI.comment(clipboardValue)

Thread.sleep(1000)

WebUI.click(findTestObject('Objects.VerifyMainForm/Page_ISPS2/div_Summary'))

Thread.sleep(5000)

WebUI.verifyTextPresent(clipboardValue, false)

Thread.sleep(1000)

