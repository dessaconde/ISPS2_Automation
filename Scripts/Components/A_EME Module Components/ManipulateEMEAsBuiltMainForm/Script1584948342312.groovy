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

'Wait for a second before proceeding to further automated steps. '
Thread.sleep(1000)

'Verify that the user is in Main Form page. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/div_Main Form'))

'Verify and locates the \'Project Title\'.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/span_Project Title'))

'Locates the \'Project Title\' field before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/input__projTitle'))

'Populates the \'Project Title\' field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/input__projTitle'), projectTitle)

'Verify and locates the \'Description of Building\'.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/span_Description of Building Works'))

'Locates the \'Description of Building Works\' field before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/textarea_Description of Building Works_descBldgWorks'))

'Populates the \'Description of Building Works\' field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/textarea_Description of Building Works_descBldgWorks'), 
    descriptionOfBuildingWorks)

'Verify and locates the \'Clause 1\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause1'))

'Ticks the \'Clause 1\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause1'))

'Verify and locates the \'Clause 2\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause2'))

'Ticks the \'Clause 2\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause2'))

'Verify and locates the \'Clause 3\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause3'))

'Ticks the \'Clause 3\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause3'))

'Verify and locates the \'Clause 4\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause4'))

'Ticks the \'Clause 4\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause4'))

'Verify and locates the \'Others\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Others'))

'Ticks the \'Others\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Others'))

'Verify and locates the \'Clause 2\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause2'))

'Ticks the \'Clause 2\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause2'))

'Verify and locates the \'Clause 4\' tick box.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause4'))

'Ticks the \'Clause 4\' selection. '
WebUI.click(findTestObject('Objects.ManipulateEMEAsBuiltMainForm/Page_ISPS2/label_Clause4'))

