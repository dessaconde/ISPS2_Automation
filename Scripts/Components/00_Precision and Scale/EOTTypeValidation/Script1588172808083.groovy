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

/*=======================================================================*
 * TESTER: Rhodessa Conde                                                *
 * CREATE DATE: 29-Apr-2020                                              *
 * PURPOSE: This is to verify the precision and scale of EOT Request LHS *
 * ======================================================================*
 */
WebUI.enableSmartWait()

NewLblNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/label_FieldName'), 'text', 'equals', LblNm, 
    true)

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals', 
    FldNm, true)

NewErrRqMsg = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/RqFieldNm'), 'name', 'equals', FldNm, true)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewLblNmField)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

WebUI.focus(NewInputNmField)

DefaultValue = WebUI.getAttribute(NewInputNmField, 'value')

WebUI.verifyMatch(DefaultValue, '', true)

WebUI.setText(NewInputNmField, EnterInvalidEOTType)

GlobalVariable.SearchValue = WebUI.getAttribute(NewInputNmField, 'value')

def EOTType = [(1) : [('EOTType') : 'Appointment of PE for Visual Inspection'], (2) : [('EOTType') : 'Appointment of PE for FSI']
    , (3) : [('EOTType') : 'Submission of VIR'], (4) : [('EOTType') : 'Submission of FSI Report']] 

GlobalVariable.FoundValue = EOTType.find({ 
        it.value.EOTType == GlobalVariable.SearchValue
    })

if (GlobalVariable.FoundValue == null) {
    WebUI.comment('No matching qp found')
} else {
    WebUI.comment('Match QP Found!')

    println(GlobalVariable.FoundValue)
}

WebUI.clearText(NewInputNmField)

WebUI.focus(NewInputNmField)

WebUI.mouseOver(NewErrRqMsg)

getRqErrMsg = WebUI.getAttribute(NewErrRqMsg, 'data-errorqtip')

'Remove the unnecessary values'
strToolTip = getRqErrMsg.substring(29, 61)

'Get the error message display in tool tip'
toolTipReqErrMsg = strToolTip.substring(0, 22)

'Verify if the tooltip error message display is the same of the error message in DB'
WebUI.verifyMatch(toolTipReqErrMsg, GlobalVariable.RqField, true)

WebUI.focus(NewInputNmField)

WebUI.click(findTestObject('Objects.PELSH/Dropdown_Arrow'))

WebUI.setText(NewInputNmField, 'A')

for (int itr = 1; itr < EOTType.size(); itr++) {
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

    GlobalVariable.SearchValue = WebUI.getAttribute(NewInputNmField, 'value')

    println(GlobalVariable.SearchValue)

    FoundVal = EOTType.find({ 
            it.value.EOTType == GlobalVariable.SearchValue
        })
	
	if (FoundVal != null){
		WebUI.comment('Matching EOT Type is Found!')
		println(FoundVal)
	}

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
}
