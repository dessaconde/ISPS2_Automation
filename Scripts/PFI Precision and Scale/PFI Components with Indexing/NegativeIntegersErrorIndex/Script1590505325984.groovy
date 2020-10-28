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

/* ======================================================================*
 * COMPONENT NAME: NegativeIntegers                                      *
 * TESTER: Rhodessa Conde                                                *
 * CREATED DATE: 15-May-2020                                             *
 * PURPOSE: This is a reusable component to verify invalid numeric input *
 *  =====================================================================*
 */
'Hard Wait for 1sec'
Thread.sleep(1000)

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Object Repository/Objects.HighlightElements/input_field_index'), 
    'xpath', 'equals', '(//*[contains(@class,\'x-form-text\') and (@name=\'' + FldNm + '\')])[' + index + ']', true)

WebUI.setText(NewInputNmField, '0')

for (int i = 0; i <= itr; i++) {
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
}

WebUI.mouseOver(NewInputNmField)

ToolTipErr = WebUI.getAttribute(NewInputNmField, 'data-errorqtip')

TotalLength = (ToolTipErr.length() - 10)

ActualErrMsg = ToolTipErr.substring(29, TotalLength)

WebUI.verifyMatch(ActualErrMsg, 'The value in this field is invalid', true)

