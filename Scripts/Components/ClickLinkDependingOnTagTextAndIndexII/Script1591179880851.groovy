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

//Component Name: Click Link 
//Dev: Krizia Manuel
//Purpose: To click link in page
'Wait for a moment before proceeding to further automated steps.'
Thread.sleep(3000)

'Modify the object\'s tag.'
modifiedTag = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyTextPresent/Page_ISPS2/objectToModify'), 'tag', 'equals', 
   ((( tagToModify ) + '"])[') + index) + ']', true)

'Modify the object\'s text.'
modified = WebUI.modifyObjectProperty(modifiedTag, 'text', 'equals', textToModify, true)

'Highlight the modified object.'
WebUI.click(modified)

