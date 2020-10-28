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
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

/*==========================================================================*
 * COMPONENT NAME: CommonComboBox			                  			    *
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 01-June-2020                                       			*
 * PURPOSE: This is to find the constant values	in Combobox					*
 * =========================================================================*
 */

'Wait.'
WebUI.enableSmartWait()

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals',
	FldNm, true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)
	

for ( int i=1; i<NoOfOpt; i++) {

	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
}
	