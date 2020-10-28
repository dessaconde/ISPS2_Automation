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
import java.awt.Toolkit
import java.awt.datatransfer.DataFlavor
import org.openqa.selenium.Keys as Keys

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'This line of code will be modifying the tag of the same object depending on the needed field.'
modifiedTagOfField = WebUI.modifyObjectProperty(findTestObject('Objects.SetTextOnField/sampleField'), 'tag', 'equals', tagToBeUsed,
	false)

'This line of code will be modifying the name(attribute) of the same object depending on the needed field.'
modifiedNameOfField = WebUI.modifyObjectProperty(modifiedTagOfField, 'name', 'equals', nameToBeUsed, true)

'Highlight the field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedNameOfField)

'This line of code will be inputting the text on the field depending on the text needed.'
WebUI.setText(modifiedNameOfField, GlobalVariable.numericString)

'Send keys Ctrl + A'
WebUI.sendKeys(modifiedNameOfField, Keys.chord(Keys.CONTROL, 'a'))

'Send keys Ctrl + C'
WebUI.sendKeys(modifiedNameOfField, Keys.chord(Keys.LEFT_CONTROL, 'c'))

'Get value from clipboard.'
String modifiedNameOfField = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

'Transfer value of modified object to a global variable.'
GlobalVariable.inputFieldText = modifiedNameOfField

'Print the length of the string.'
println(modifiedNameOfField.length())

