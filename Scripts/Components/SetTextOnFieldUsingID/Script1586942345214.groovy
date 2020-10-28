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

//Component Name: SetTextOnFieldUsingID
//Author: Krizia Manuel
//Date Created: April 15, 2020
//Purpose: To set text on fields by modifying the ID.

'Best Practice: Wait for a second for every component.'
Thread.sleep(1000)

'This line of code will be modifying the tag of the object depending on the needed tag.'
modifiedTagOfField = WebUI.modifyObjectProperty(findTestObject('Objects.SetTextOnField/Page_ISPS2/sampleFieldwithIndex'), 'tag', 'equals', tagToBeUsed, 
    false)

'This line of code will be modifying the ID (attribute) of the same object depending on the needed field.'
modifiedIdOfField = WebUI.modifyObjectProperty(modifiedTagOfField, 'id', 'equals', idToBeUsed, true)

'Highlight the field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedIdOfField)

'This line of code will be inputting the text on the field depending on the text needed.'
WebUI.setText(modifiedIdOfField, textToBeInputted)
