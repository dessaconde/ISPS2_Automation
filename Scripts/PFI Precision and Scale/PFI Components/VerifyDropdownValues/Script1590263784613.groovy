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
import java.io.File
import java.io.IOException
import java.io.FileOutputStream
import java.io.FileWriter

/*==========================================================*
 * COMPONENT NAME: VerifyDropdownValues 				    *
 * TESTER: Rhodessa Conde                                   *
 * CREATE DATE: 15-May-2020                                 *
 * PURPOSE: This is to verify the values in dropdown fields *
 * =========================================================*
 */
Thread.sleep(1000)

File OutputFile = new File('DropdownValuesResult.txt')

def TimeStamp = new Date()

NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.HighlightElements/input_field'), 'name', 'equals',
		FldNm, true)

GlobalVariable.comboNm = cmbNm

WebUI.focus(NewInputNmField)

WebUI.setText(NewInputNmField, EnterValue)

for (int i = 1; i <= NoOfVal; i++) {
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.delay(DelayTime)

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

    GlobalVariable.ComboBoxValue = WebUI.getAttribute(NewInputNmField, 'value')

    WebUI.callTestCase(findTestCase(CallTCName), [('FindValue') : GlobalVariable.ComboBoxValue, ('DropdownNm') : GlobalVariable.comboNm], 
        FailureHandling.STOP_ON_FAILURE)

	OutputFile.append('Search Value: ' + GlobalVariable.ComboBoxValue + ' ' + 'Found Value: ' +GlobalVariable.ValueFound + TimeStamp + '\n')

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))
}

WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

