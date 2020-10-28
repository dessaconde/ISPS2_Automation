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

'Wait for a second before proceeding to execute further automated steps. '
Thread.sleep(1000)

'Verify and locates the \'Component\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_Component Type Test_component'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_Component Type Test_component'), Component)

'Verify and locates the \'OEM\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_oem'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_oem'), OEM)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/XPA_input_This field is required_modelNo'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/XPA_input_This field is required_modelNo'), modelNo)

'Verify and locates the \'Country of Manufacture\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_country'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_country'), countryOfManufacture)

'Verify and locates the \'Certificate Number\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_certNo'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_certNo'), certificateNo)

'Verify and locates the \'Expiry Date\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_fromDt'))

'Clicks the date field before interacting with it. '
WebUI.click(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_fromDt'), FailureHandling.STOP_ON_FAILURE)

'Key press: down arrow to expand the date picker. '
WebUI.sendKeys(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_fromDt'), Keys.chord(
        Keys.ARROW_DOWN))

'Selects the date today. '
WebUI.click(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/XP_Today'))

'Verify and locates the \'Notified Body\' input field before manipulating and interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_ntfdBody'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_ntfdBody'), notifiedBody)

'Verify and locates the \'Emergency Brake Type\' input field before manipulating and interacting with it. '
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_brakeType'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_brakeType'), emergencyBrakeType, 
    FailureHandling.OPTIONAL)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/XPA_input_This field is required_permissibleMass'))

'Populates the input field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/XPA_input_This field is required_permissibleMass'), 
    permissibleMass, FailureHandling.OPTIONAL)

'Populates the input field with a dynamic variable. '
WebUI.sendKeys(findTestObject('Objects.PopulateComponentTypeTest/Page_ISPS2/input_This field is required_oem'), Keys.chord(
        Keys.ENTER))

