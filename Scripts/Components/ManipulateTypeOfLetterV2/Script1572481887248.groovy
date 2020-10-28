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

'1 sec hard wait.'
Thread.sleep(1000)

'If there letter list field is present else..'
if (WebUI.verifyElementVisible(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), FailureHandling.OPTIONAL) == 
true) {
    'Highlight the type of letter field.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'))

    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV2/Page_ISPS2/XPA_TypeOfLetterField'), 
        0)

    WebUI.sendKeys(findTestObject('Objects.ManipulateTypeOfLetterV2/Page_ISPS2/XPA_TypeOfLetterField'), Keys.chord(Keys.ARROW_DOWN))

    modifiedLetter = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateTypeOfLetterV2/Page_ISPS2/letterToModify'), 
        'text', 'contains', letterToGenerateContains, true)

    WebUI.click(modifiedLetter)

    'Highlight generate button.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Click generate button.'
    WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Verify letter is being generated.'
    WebUI.verifyTextPresent('Generating letter...', false, FailureHandling.OPTIONAL)

    'Verify letter was generated succesfully.'
    WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, 
        FailureHandling.OPTIONAL)
} else {
    '1 sec hard wait.'
    Thread.sleep(1000)

    'Click Delete and regenerate button.'
    not_run: WebUI.click(findTestObject('Objects.ManipulateLetterV2/Page_ISPS2/span_Delete and Re-generate'))
}

