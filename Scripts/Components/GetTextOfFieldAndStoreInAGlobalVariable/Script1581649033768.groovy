import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


//Component Name: GetTextOfFieldAndStoreInAGlobalVariable
//Author: Shayne Cardona
//Date Created: Feb 14, 2020
//Purpose: To get the value of any field by modifying the tag and name of the object and storing the value in a global variable

'Best Practice: Wait for a second for every component.'
Thread.sleep(1000)

'This line of code will be modifying the tag of the object depending on the needed tag.'
modifiedTagOfField = WebUI.modifyObjectProperty(findTestObject('Objects.GetTextOfFieldAndStoreInAGlobalVariable/objectToBeModified'), 
    'tag', 'equals', tagToBeUsed, false)

'This line of code will be modifying the name(attribute) of the same object depending on the needed field.'
modifiedNameOfField = WebUI.modifyObjectProperty(modifiedTagOfField, 'name', 'equals', nameToBeUsed, true)

'Highlight the field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedNameOfField)

'Click the field.'
WebUI.click(modifiedNameOfField)

'Send keys Ctrl + A'
WebUI.sendKeys(modifiedNameOfField, Keys.chord(Keys.CONTROL, 'a'))

'Send keys Ctrl + C'
WebUI.sendKeys(modifiedNameOfField, Keys.chord(Keys.LEFT_CONTROL, 'c'))

'Get value from clipboard.'
String clipboardValue = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

'Transfer value of clipboard to global variable.'
GlobalVariable.inputFieldText = clipboardValue

