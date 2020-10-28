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

//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//Component Name: PopulateAddress
//Dev: Shayne Cardona
//Purpose: To populate fields in Address LHS

not_run: Thread.sleep(1000)

not_run: WebUI.click(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Formatted'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Formatted'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Formatted'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Unformatted'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddresshseBlkNo'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressroadId'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressbuildingName'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input__caseAddresslevel'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_-_caseAddressunitNo'))

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Postal Code_caseAddresspostalCode'))

'Wait for 1 sec.'
Thread.sleep(1000)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Formatted'))

not_run: WebUI.click(findTestObject('Objects.PopulateAddress/Page_ISPS2/label_Formatted'))

'Highlight postal code field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Postal Code_caseAddresspostalCode'))

'Set text on house/blk no field.'
WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddresshseBlkNo'), HouseBlockNo)

'Transfer value from a local variable to a global variable.'
GlobalVariable.houseBlkNo = HouseBlockNo

'Highlight road name field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressroadId'))

'Click road name field.'
WebUI.click(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressroadId'))

'send arrow down key on road name field.'
WebUI.sendKeys(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressroadId'), Keys.chord(Keys.ARROW_DOWN))

'Wait for 5 sec.'
Thread.sleep(5000)

//CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/div_ACCESS ROAD (ACC00Y)'))
//
//WebUI.click(findTestObject('Objects.PopulateAddress/Page_ISPS2/div_ACCESS ROAD (ACC00Y)'))
'Modify object\'s property.'
modifiedSelection = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateAddress/Page_ISPS2/div_ACCESS ROAD (ACC00Y)'), 
    'xpath', 'equals', ('//div[(text() = ' + RoadName) + ')]', false)

not_run: WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/div_ACCESS ROAD (ACC00Y)'), RoadName)

'Highlight modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedSelection)

'Click modified object.'
WebUI.click(modifiedSelection)

'Highlight building name field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressbuildingName'))

'Populate building name field.'
WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Unformatted_caseAddressbuildingName'), BuildingName)

'Transfer value from a local variable to a global variable.'
GlobalVariable.buildingName = BuildingName

'Highlight level field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input__caseAddresslevel'))

'Populate level field.'
WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/input__caseAddresslevel'), Level)

'Transfer value from local variable to a global variable.'
GlobalVariable.Level = Level

'Highlight unit no field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_-_caseAddressunitNo'))

'Populate unit no field.'
WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_-_caseAddressunitNo'), Unit)

'Transfer value from local variable to global variable.'
GlobalVariable.Unit = Unit

'Highlight postal code field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Postal Code_caseAddresspostalCode'))

'Populate postal code field.'
WebUI.setText(findTestObject('Objects.PopulateAddress/Page_ISPS2/input_Postal Code_caseAddresspostalCode'), PostalCode)

'Transfer value from local variable to a global variable.'
GlobalVariable.postalCode = PostalCode

