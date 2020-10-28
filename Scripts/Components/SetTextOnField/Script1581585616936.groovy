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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Component Name: SetTextOnField
//Author: Shayne Cardona
//Date Created: Feb 14 2020
//Purpose: To set text on fields buy modifying the tag and the name of the object
//Reviewer:
'Best Practice: Wait for a second for every component.'
Thread.sleep(1000)

'This line of code will be modifying the tag of the object depending on the needed tag.'
modifiedTagOfField = WebUI.modifyObjectProperty(findTestObject('Objects.SetTextOnField/sampleField'), 'tag', 'equals', tagToBeUsed, 
    false)

'This line of code will be modifying the name(attribute) of the same object depending on the needed field.'
modifiedNameOfField = WebUI.modifyObjectProperty(modifiedTagOfField, 'name', 'equals', nameToBeUsed, true)

'Highlight the field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedNameOfField)

'This line of code will be inputting the text on the field depending on the text needed.'
WebUI.setText(modifiedNameOfField, textToBeInputted)


