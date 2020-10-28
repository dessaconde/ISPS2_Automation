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

//Component Name: ConvertToAuditValidation
//Author: Krizia Manuel
//Date Created: 5/5/2020
//Purpose: To verify the list of drop down fields.
'Wait.'
WebUI.enableSmartWait()

'Modify object property.'
NewInputNmField = WebUI.modifyObjectProperty(findTestObject('Objects.NameValidation/input_FieldName'), 'name', 'equals', 
    FldNm, true)

'Highlight the modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(NewInputNmField)

'For loop for drop down.'
for (int i = 1; i < NoOfOpt; i++) {
    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(NewInputNmField, Keys.chord(Keys.ENTER))
}

