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

//Component Name: PopulateCloseCaseForEME
//DEv: Shayne Cardona
//Purpose: To populate fields in Close Case LHS of EME Module

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Highlight action dropdown.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/input__Action'))

'Set text on action dropdown.'
WebUI.setText(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/input__Action'), actionForCloseCase)

'Enter.'
WebUI.sendKeys(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/input__Action'), Keys.chord(Keys.ENTER))

'Highlight remarks textbox field'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/textarea_Remarks'))

'Set text on remarks textbox field.'
WebUI.setText(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/textarea_Remarks'), remarksForCloseCase)

'Enter.'
WebUI.sendKeys(findTestObject('Objects.PopulateCloseCaseForEME/Page_ISPS2/textarea_Remarks'), Keys.chord(Keys.ENTER))

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

