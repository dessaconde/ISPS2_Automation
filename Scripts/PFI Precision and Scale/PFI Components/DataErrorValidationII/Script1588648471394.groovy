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

//Component Name: DataErrorValidationII
//Author: Krizia Manuel
//Date Created: 5/5/2020
//Purpose: Verify data error q-tip.
'Wait.'
WebUI.enableSmartWait()

'Modify object property.'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.ClickRadioButton/RadioButton_ID'), 'text', 'equals', 
    textToBeVerified, true)

'Mouse over to the data error q-tip.'
WebUI.mouseOver(NewInputNmField)

'Delay for 5 seconds.'
WebUI.delay(5)

'Get attribute.'
String getRqErrMsg = WebUI.getAttribute(NewInputNmField, 'data-errorqtip')

//'Remove the unnecessary values'
//strToolTip = getRqErrMsg.substring(100)

//'Get the error message display in tool tip'
//toolTipReqErrMsg = strToolTip.substring(100)
		
if(getRqErrMsg.equals(GlobalVariable.RqField)) {
	System.out.println("Test Case Passed");
}
//'Verify if the tooltip error message display is the same of the error message in DB'
//WebUI.verifyMatch(getRqErrMsg, GlobalVariable.RqField, true)
