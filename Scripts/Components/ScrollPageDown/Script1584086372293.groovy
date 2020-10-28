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

//ComponentName: ScrollPageDown
//Author: Krizia Manuel
//Purpose: Navigate to Element
'Best practice: Wait for 3 seconds after a page navigation component. '
Thread.sleep(3000)

'Modify object.'
ModifiedObject = WebUI.modifyObjectProperty(findTestObject('Object.ScrollPageDown/ScrolltoElement'), 'tag', 'equals', tagToBeUsed, 
    true)

'Modify object.'
ModifiedObjectx2 = WebUI.modifyObjectProperty(ModifiedObject, 'text', 'equals', textToBeUsed, true)

'Scroll page.'
WebUI.scrollToElement(ModifiedObjectx2, 0)

