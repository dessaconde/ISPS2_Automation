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

/* ==================================================================
 * COMPONENT NAME: VerifyPageIndexSuccessfullyLoaded
 * TESTER: Rhodessa Conde
 * CREATED DATE: 15-May-2020
 * PURPOSE: This is a reusable component to verify that the page is 
 * successfully loaded. 
 * NOTE: Needs indexing in xpath.
 *  =================================================================
 */
'Wait for 1 sec'
Thread.sleep(1000)

if (index == 'n'){
	
	modifiedInputFld = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.VerifyPageSuccessfullyLoaded/PageHeaderIndex'),
		'xpath', 'equals', ('(//*[contains(@class,\'isps-page-title\')])[' + idx) + ']', true)
	
}else{
	'Modify the object property of the input field'
	modifiedInputFld = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.VerifyPageSuccessfullyLoaded/PageHeaderIndex'), 
	    'xpath', 'equals', ('(//*[contains(@class,\'isps-page-title-1\')])[' + index) + ']', true)
}

'Highlight the Page Header'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedInputFld)

