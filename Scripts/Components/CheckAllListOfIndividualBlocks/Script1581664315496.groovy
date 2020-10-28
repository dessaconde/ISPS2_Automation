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

//*******************************************************//
//****************** CheckListOfIndividualBlocks ******************//
//*** Author: Janelle Carbonell *****************//
//*** Date Created: 20th of January, 2020 ************//
//*** Purpose: To... ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Verify if \'List of Individual Blocks\' is present on the page'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.CheckListOfIndividualBlocks/Page_ISPS2/div_LIST OF INDIVIDUAL BLOCKS'))

'Selects a record from the list'
WebUI.click(findTestObject('Objects.CheckListOfIndividualBlocks/Page_ISPS2/div_'))

'Click on Generate button'
WebUI.click(findTestObject('Objects.CheckListOfIndividualBlocks/Page_ISPS2/span_Generate Notice'), FailureHandling.OPTIONAL)

not_run: modifiedCheckBox = WebUI.modifyObjectProperty(findTestObject('Objects.CheckListOfIndividualBlocks/Page_ISPS2/CheckBoxx'), 
    'xpath', 'equals', ((((('(//' + tagToBeUsed) + '[@class = ') + classToBeUsed) + '])[') + Index) + ']', true)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedCheckBox)

not_run: WebUI.click(modifiedCheckBox)

