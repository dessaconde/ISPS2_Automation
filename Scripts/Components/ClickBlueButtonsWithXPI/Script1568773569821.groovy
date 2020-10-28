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

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//Component NAme: ClickBlueButtonsWithXPI
//Author: Shayne Cardona
//Purpose: To click the blue colored buttons by modifying the object's text and index
'Wait for 1 sec.'
Thread.sleep(1000)

'Modify the text and index of the xpath/property of the object.'
complexlyModifiedButtonGG = WebUI.modifyObjectProperty(findTestObject('Objects.ClickBlueButtonsWithXPI/span_Reset'), 'xPath', 
    'equals', ((('(//*[text()="' + Button) + '"])[') + Index) + ']', true)

//'Wait for 5 secs.'
//Thread.sleep(5000)

//'Wait for 5 secs.'
//Thread.sleep(5000)

'Click the modified object.'
WebUI.click(complexlyModifiedButtonGG)

//'Wait for 5 secs.'
//Thread.sleep(5000)

