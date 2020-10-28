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

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Locates the \'Edit Qualified Person\' header. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/div_Edit Qualified Person'))

'Locates the \'QPType/No\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPA_QPTypeNo'))

'Populates the \'QPType/No\' field dynamically by sourcing the value from Datatable.'
WebUI.setText(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPA_QPTypeNo'), QPTypeNo)

'Locates the \'Salutation\' dropwdown field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPI_Salutation'))

'Populates the \'Salutation\' field dynamically by sourcing the value from Datatable.'
WebUI.setText(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPI_Salutation'), Salutation)

'Locates the \'FirmName\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPI_FirmName'))

'Populates the \'FirmName\' field dynamically by sourcing the value from Datatable.'
WebUI.setText(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/XPI_FirmName'), FirmName)

'Locates the \'UEN\' field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/input_UEN_uen'))

'Populates the \'UEN\' field dynamically by sourcing the value from Datatable.'
WebUI.setText(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/input_UEN_uen'), UEN)

'Locates the \'QPName\' dropdown field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/input__qpName'))

'Populates the \'QPName\' field dynamically by sourcing the value from Datatable.'
WebUI.setText(findTestObject('Objects.PopulateQualifiedPerson/Page_ISPS2/input__qpName'), QPName)

