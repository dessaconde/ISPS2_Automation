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

//Component Name: SelectTypeOfLetter
//Dev: Shayne Cardona
//Date Created: 21-02-2020
//Purpose: To be able to select any letter on Type Of Letter fields

'1 sec hard wait.'
Thread.sleep(1000)

'Modify object\'s attribute/s'
modifiedLetter = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/letterToModify'), 
    'text', 'contains', letterToGenerateContains, true)

'Click type of letter field using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), 
    0)

'Send arrow down key on type of letter field.'
WebUI.sendKeys(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), Keys.chord(Keys.ARROW_DOWN))

'Highlight the letter.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLetter)

'Click generate button using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedLetter, 0)

'Highlight generate button.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

'Click generate button.'
WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

