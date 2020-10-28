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

/*=================================================================	*
 * COMPONENT NAME: RequiredFieldButtonValidation 		    		*
 * TESTER: Krizia Manuel                                    		*
 * CREATE DATE: 10-June-2020                                 		*
 * PURPOSE: This is to validate the data error q-tip for buttons 	*
 * ================================================================	*
 */

'Wait for 1 sec'
Thread.sleep(1000)
	
modifiedLblNm = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/lblField_index'),
	'xpath', 'equals', '(//*[contains(@class, \'x-form-item-label-inner x-form-item-label-inner-default\') and contains(., \'' + LblName + '\')])[' + index + ']', true)
	
'Hover the mouse over the required field'
WebUI.mouseOver(modifiedLblNm)


