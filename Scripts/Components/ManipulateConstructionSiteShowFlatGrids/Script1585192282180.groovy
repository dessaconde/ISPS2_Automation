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
import org.openqa.selenium.Keys as Keys

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

WebUI.verifyElementPresent(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_Label'), 0)

WebUI.verifyElementPresent(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_Grid'), 0)

WebUI.verifyElementPresent(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_Label'), 0)

WebUI.verifyElementPresent(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_Grid'), 0)

WebUI.verifyElementPresent(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSFTableRowToManipulate'), 0)

modifiedTableRow1 = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSFTableRowToManipulate'), 
    'xpath', 'equals', ('((((//span[text()=\'Structure Description\']//ancestor::div[@class=\'x-column-header-inner x-leaf-column-header\'])[5]//ancestor::div[@class=\'x-box-inner\'])[5]//ancestor::div)[30]//following-sibling::div)[4]//child::table//td[1]//div[text()="' + 
    structureDescToBeUsed1stGrid) + '"]', true)

WebUI.doubleClick(modifiedTableRow1)

WebUI.click(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_noOfStructureInputField'))

WebUI.setText(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_noOfStructureInputField'), valueToBeInputtedOnNoOfStructureInputField)

GlobalVariable.WCSSFNoOfStructure = valueToBeInputtedOnNoOfStructureInputField

not_run: WebUI.click(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_SGFAInputField'))

WebUI.setText(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_SGFAInputField'), valueToBeInputtedOnSGFAInputeField)

GlobalVariable.WCSSFSGFA = valueToBeInputtedOnSGFAInputeField

WebUI.sendKeys(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/WCSSF_noOfStructureInputField'), Keys.chord(Keys.ENTER))

modifiedTableRow2 = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSFTableRowToManipulate'), 
    'xpath', 'equals', ('(((//span[text()=\'Structure Description\']//ancestor::div[@class=\'x-column-header-inner x-leaf-column-header\'])[6]//ancestor::div)[30]//following-sibling::div)[4]//child::table//td[1]//div[text()="' + 
    structureDescToBeUsed2ndGrid) + '"]', true)

WebUI.doubleClick(modifiedTableRow2)

WebUI.click(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_noOfStructureInputField'))

WebUI.setText(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_noOfStructureInputField'), valueToBeInputtedOnNoOfStructureInputField2)

GlobalVariable.OCSSFNoOfStructure = valueToBeInputtedOnNoOfStructureInputField2

not_run: WebUI.click(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_SGFAInputField'))

WebUI.setText(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_SGFAInputField'), valueToBeInputtedOnSGFAInputeField2)

GlobalVariable.OCSSFSGFA = valueToBeInputtedOnSGFAInputeField2

WebUI.sendKeys(findTestObject('Objects.ManipulateConstructionSiteShowFlatGrids/OCSSF_SGFAInputField'), Keys.chord(Keys.ENTER))

