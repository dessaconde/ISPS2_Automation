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
import org.openqa.selenium.Keys as Keys

Thread.sleep(1000)

if (WebUI.verifyElementVisible(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), FailureHandling.OPTIONAL) == 
true) {
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'))

    WebUI.sendKeys(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), Keys.chord(Keys.ARROW_DOWN))

    not_run: WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_FirstItemInTypeOfLetterDropdownList'), 
        FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_FirstItemInTypeOfLetterDropdownList'), 
        0)

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'), 
        0)

    WebUI.verifyTextPresent('Generating letter...', false, FailureHandling.OPTIONAL)

    WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, 
        FailureHandling.OPTIONAL)
} else {
    Thread.sleep(1000)
}

