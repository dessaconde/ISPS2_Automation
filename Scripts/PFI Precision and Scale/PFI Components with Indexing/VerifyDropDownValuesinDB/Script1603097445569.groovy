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
import java.io.File as File
import java.io.IOException as IOException

/*==========================================================*
 * COMPONENT NAME: VerifyDropdownValuesinDB 				*
 * TESTER: Krizia Manuel                                    *
 * CREATE DATE: 19-Oct-2020                                 *
 * PURPOSE: This is to verify the values in dropdown fields *
 * =========================================================*
 */
Thread.sleep(1000)

File OutputFile = new File('DBResult.txt')

def TimeStamp = new Date()

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', ((('(//*[contains(@class,\'x-form-text\') and (@name=\'' + FldNm) + '\')])[') + index) + ']', true)

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

for (int i = 1; i <= NoOfVal; i++) {

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
		
		WebUI.delay(DelayTime)
	
		WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
	
		GlobalVariable.store = WebUI.getAttribute(NewInputNmField, 'value')
	
		println(GlobalVariable.store)
		
CustomKeywords.'com.SQLdb.ExecuteSQLQuery.openDBConnection'(findTestData('Datatable').getValue(1, 23), findTestData('Datatable').getValue(
        2, 23), findTestData('Datatable').getValue(3, 23))
		
	        ModifiedQryScript = (((((((('SELECT ' + ColNm) + ' FROM ') + DBTbl) + ' WHERE ') + Condition1) + '\'') + GlobalVariable.store) +
			'\'')
		
			Result = CustomKeywords.'com.SQLdb.ExecuteSQLQuery.executeQuery'(ModifiedQryScript)
		
			println(ModifiedQryScript)
		
			Match = WebUI.verifyMatch(GlobalVariable.store, Result, false)
		
	
		OutputFile.append((((((('Search Value: ' + GlobalVariable.store) + ' ') + 'Found Value: ') + Result) + ' ') + TimeStamp) +
			'\n')
	
		WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	}
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

CustomKeywords.'com.SQLdb.ExecuteSQLQuery.closeDBConnection'()

