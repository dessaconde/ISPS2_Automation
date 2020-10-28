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

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseLHS/div_Close Case'))

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseLHS/input_Project Ended'))

WebUI.setText(findTestObject('Objects.PopulateCloseCaseLHS/input_Project Ended'), ProjectEnded)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseLHS/input_temp bldg status'))

WebUI.setText(findTestObject('Objects.PopulateCloseCaseLHS/input_temp bldg status'), TempBldgStatus)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateCloseCaseLHS/XPI_remarks'))

WebUI.setText(findTestObject('Objects.PopulateCloseCaseLHS/XPI_remarks'), Remarks)

