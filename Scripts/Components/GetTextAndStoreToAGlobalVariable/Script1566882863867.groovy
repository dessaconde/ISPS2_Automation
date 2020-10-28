import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


//Component Name: GetTextOfFieldAndStoreInAGlobalVariable
//Dev: Shayne Cardona
//Purpose: To get the text on a field and store value in a global variable
'Wait for 1 sec.'
Thread.sleep(1000)

'Modify object.'
ModifiedObject = WebUI.modifyObjectProperty(findTestObject('Objects.GetTextAndStoreToAGlobalVariable/ObjectToBeModified'), 
    'tag', 'equals', tagToBeUsed, true)

'Modify object.'
ModifiedObjectx2 = WebUI.modifyObjectProperty(ModifiedObject, 'name', 'equals', nameToBeUsed, true)

'Highlight the modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedObjectx2)

'Click the field.'
WebUI.click(ModifiedObjectx2)

'Send keys Ctrl + A'
WebUI.sendKeys(ModifiedObjectx2, Keys.chord(Keys.CONTROL, 'a'))

'Send keys Ctrl + C'
WebUI.sendKeys(ModifiedObjectx2, Keys.chord(Keys.LEFT_CONTROL, 'c'))

'Get value from clipboard.'
String clipboardValue = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)


'Get text of the modified object.'
GlobalVariable.CopiedValue = clipboardValue

