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

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

'Locates the \'Salutation\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input_Salutation_salutationCd'))

'Dynamically populates the \'Salutation\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input_Salutation_salutationCd'), Salutation)

'Locates the \'IDType\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input_ID Type_idTypeCd'))

'Dynamically populates the \'IDType\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input_ID Type_idTypeCd'), IDType)

'Locates the \'FirmName\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__firmName'))

'Dynamically populates the \'FirmName\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__firmName'), FirmName)

'Locates the \'Designation\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__designation'))

'Dynamically populates the \'Designation\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__designation'), Designation)

'Locates the \'Name\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__name'))

'Dynamically populates the \'Name\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__name'), Name)

GlobalVariable.Developer = Name

'Locates the \'IDNo\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__idNo'))

'Dynamically populates the \'IDNo\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__idNo'), IDNo)

'Locates the \'UEN\' field. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__uenNo'))

'Dynamically populates the \'UEN\' field with a value sourcing from the Datatable. '
WebUI.setText(findTestObject('Objects.PopulateBuilder/Page_ISPS2/input__uenNo'), UEN, FailureHandling.OPTIONAL)

'Wait for a moment before proceeding to execute further automated actions. '
Thread.sleep(3000)

