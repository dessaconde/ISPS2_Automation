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
import org.openqa.selenium.Keys as Keys

WebUI.enableSmartWait()

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals',
	FldNm, true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

WebUI.clearText(NewInputNmField)

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

def SearchArray = new String[10]

(SearchArray[0]) = '1144'

(SearchArray[1]) = '0433'

(SearchArray[2]) = '6662'

(SearchArray[3]) = 'S9699702G'

(SearchArray[4]) = '6661'

(SearchArray[5]) = '6398'

(SearchArray[6]) = '9075'

(SearchArray[7]) = '1234'

(SearchArray[8]) = '8096'

(SearchArray[9]) = '9249'

for (int NoOfVal = 0; NoOfVal <= NoOfOpt; NoOfVal++) {
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
	
	SearchNo = WebUI.getAttribute(NewInputNmField, 'value')
	
	FoundValue = SearchArray.find {it == SearchNo}
	
	WebUI.verifyMatch(SearchNo, FoundValue, true)
	
	WebUI.delay(5)
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
}