import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.DataFlavor as DataFlavor
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Thread.sleep(1000)

modifiedInputField = WebUI.modifyObjectProperty(findTestObject('Objects.GetTextOfInputFieldAndStoreInAGlobalVariable/XP_ObjectSubjectedToTextCapture'), 
    '', '', '', false)

CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedInputField)

WebUI.click(modifiedInputField)

WebUI.sendKeys(modifiedInputField, Keys.chord(Keys.LEFT_CONTROL, 'a'))

WebUI.sendKeys(modifiedInputField, Keys.chord(Keys.LEFT_CONTROL, 'c'))

String clipboardValue = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null).getTransferData(DataFlavor.stringFlavor)

not_run: WebUI.comment(clipboardValue)

GlobalVariable.inputFieldText = clipboardValue

not_run: WebUI.comment(GlobalVariable.inputFieldText)

