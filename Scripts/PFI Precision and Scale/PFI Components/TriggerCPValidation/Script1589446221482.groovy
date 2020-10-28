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
import java.util.*
import org.openqa.selenium.Keys as Keys

Thread.sleep(3000)

def TriggerCP = [(1) : 'Yes', (2) : 'No']

NewLblNmField = WebUI.modifyObjectProperty(findTestObject('Objects.ApproveOfficerValidation/Page_ISPS2/span_Approve Officer'),
	'text', 'equals', LblNm, true)

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.ApproveOfficerValidation/Page_ISPS2/input__approveOfficerCmb'),
	'name', 'equals', FldNm, true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNmField)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

WebUI.focus(NewInputNmField)

DefaultValue = WebUI.getAttribute(NewInputNmField, 'value')

WebUI.verifyMatch(DefaultValue, '', true)

WebUI.setText(NewInputNmField, EnterAValue)

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

FindValue = WebUI.getAttribute(NewInputNmField, 'value')

ValueFound = TriggerCP.find({
		it.value == FindValue
	})

if (ValueFound == null) {
	WebUI.comment('No Record Found')
} else {
	println(ValueFound)
}

WebUI.focus(NewInputNmField)

for (int itr = 0; itr < TriggerCP.size(); itr++) {
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

	ValueFound = WebUI.getAttribute(NewInputNmField, 'value')

	FoundVal = TriggerCP.find({
			it.value == ValueFound
		})

	if (FoundVal != null) {
		println(FoundVal)
	}
	
	WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
}

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))



