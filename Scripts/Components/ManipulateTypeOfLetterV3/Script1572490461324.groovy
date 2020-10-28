import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Component Name: ManipulateTypeOfLetterV3
//Developer: Shayne Cardona
//Purpose: To manipulate the type of letter field
'1 sec hard wait.'
Thread.sleep(1000)

'Access project directory.'
String userDir = System.getProperty('user.dir')

'Transfer the directory in a variable.'
docToUpload = (userDir + '/Data Files/Files/test_data_for_replace.docx')

'Transfer the global variable in a local variable.'
def currLHS = GlobalVariable.currentLHS

'Transfer the global variable in a local variable.'
def caseType = GlobalVariable.caseType

'Modify object\'s attribute/s'
modifiedLetter = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/letterToModify'), 
    'text', 'contains', letterToGenerateContains, true)

not_run: WebUI.click(modifiedLetter)

'1 sec hard wait.'
Thread.sleep(1000)

'Click generate button using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedLetter, 0)

'Highlight generate button.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

'Click generate button.'
WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

'Verify letter is being generated.'
WebUI.verifyTextPresent('Generating letter...', false, FailureHandling.OPTIONAL)

'Verify letter was generated succesfully.'
WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, FailureHandling.OPTIONAL)

'3 secs hard wait.'
Thread.sleep(3000)

'Click replace button.'
WebUI.uploadFile(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Replace'), docToUpload)

'If there is no generated letter else..'
if (WebUI.verifyElementVisible(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), FailureHandling.OPTIONAL) == 
true) {
    'Highlight the type of letter field.'
    not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'))

    'Click type of letter field using js.'
    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), 
        0)

    'Click type of letter field.'
    not_run: WebUI.click(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'))

    'Send arrow down key on type of letter field.'
    WebUI.sendKeys(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), Keys.chord(Keys.ARROW_DOWN))
} else {
    '1 sec hard wait.'
    Thread.sleep(1000)

    'Click Delete and regenerate button.'
    not_run: WebUI.click(findTestObject('Objects.ManipulateLetterV2/Page_ISPS2/span_Delete and Re-generate'))

    'Click delete and regenerate'
    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Delete and Re-generate'), 
        0)

    'click type of letter field'
    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), 
        0)

    'send arrow down key'
    WebUI.sendKeys(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), Keys.chord(Keys.ARROW_DOWN))
}

