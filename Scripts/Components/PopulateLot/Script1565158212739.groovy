import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Verify \'Add Lot\' text is visible in the page before proceeding to populate.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateLot/Page_ISPS2/div_Add Lot'))

'Locate MkTs dropdown field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTsmkTsCdId'))

'Click MkTs field to be able to send key for the next step.'
WebUI.click(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTsmkTsCdId'))

'Sets a dynamic text in the MK/TS field that sources from the datatable. '
WebUI.setText(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTsmkTsCdId'), MkTs)

GlobalVariable.MkTs = MkTs

//'Clicks the down arrow for the complete MkTs dropdown field to display.'
//WebUI.sendKeys(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTsmkTsCdId'), Keys.chord(Keys.ARROW_DOWN))
//
//'Wait for a specific time before proceeding to other automated steps.'
//Thread.sleep(1000)
//
////'Modifies the xPath of one item in the dropdown list to be able to select a value dynamically. '
////modifiedMkTsSelection = WebUI.modifyObjectProperty(findTestObject('null'), 'xpath', 'equals', 
////    '//div[(text() = ' + MkTs + ')]', false)
//
//modifiedMkTsSelection = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateLot/Page_ISPS2/div_Mukim 02'), 'text', 
//    'equals', 'Mukim 04', false)
//
//'Highlights the virtually modified object.'
//CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedMkTsSelection)
//
//'Clicks the virtually modified object from the MkTs dropdown list.'
//WebUI.click(modifiedMkTsSelection)
'Wait for a specific time before proceeding to other automated steps.'
Thread.sleep(1000)

'Locates Lot No dropdown field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTslotNo'))

'Sets a dynamic text in the Lot No. field that sources from the datatable. '
WebUI.setText(findTestObject('Objects.PopulateLot/Page_ISPS2/input__caseLotMkTslotNo'), LotNo)

GlobalVariable.lotNo = LotNo

'Wait for a specific time before proceeding to other automated steps.'
Thread.sleep(1000)

'Locates the IsPartialLot dropdown field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'))

'Click IsPartialLot field to be able to send key for the next step.'
WebUI.click(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'))

'Sets a dynamic text in the IsPartialLot field that sources from the datatable. '
WebUI.setText(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'), IsPartialLot)

GlobalVariable.yesNo = IsPartialLot

'Highlights the IsPartialLot populated field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'))

//'Clicks the down arrow for the complete IsPartialLot dropdown field to display.'
//WebUI.sendKeys(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'), Keys.chord(
//        Keys.ARROW_DOWN))
//
//'Wait for a specific time before proceeding to other automated steps.'
//Thread.sleep(1000)
//'Modifies the xPath of one item in the dropdown list to be able to select a value dynamically. '
//modifiedIPLSelection = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateLot/Page_ISPS2/input_Is Partial Lot_caseLotMkTspartialLotInd'), 
//    'xpath', 'equals', '//div[(text() = ' + IsPartialLot + ')]', false)
//'Modifies the xPath of one item in the dropdown list to be able to select a value dynamically. '
//modifiedIPLSelection = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateLot/Page_ISPS2/div_Yes'), 'text', 'equals', 
//    'No', false)
//
//'Highlights the virtually modified object.'
//CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedIPLSelection)
//
//'Clicks the virtually modified object from the IsPartialLot dropdown list.'
//WebUI.click(modifiedIPLSelection)
'Wait for a specific time before proceeding to other automated steps.'
Thread.sleep(1000)

