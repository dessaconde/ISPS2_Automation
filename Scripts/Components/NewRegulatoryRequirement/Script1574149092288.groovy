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

'Wait for a second before proceeding to further automated steps. '
Thread.sleep(1000)

'Verify that \'Category of Provision\' is present in page before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/span_CATEGORY OF PROVISION'))

'Locates the \'Category of Provision\' input field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input__regClauseNo'))

'Populates the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input__regClauseNo'), categoryOfProvision)

GlobalVariable.categoryOfProvision = categoryOfProvision

'Verify that \'Provision Made On\' is present in page before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/span_PROVISION MADE ON'))

'Locates the \'Provision Made On\' input field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_provMadeOn'))

'Populates the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_provMadeOn'), provisionMadeOn)

GlobalVariable.provisionMadeOn = provisionMadeOn

'Verify that \'Regulation/Clause\' is present in page before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/span_REGULATIONCLAUSE'))

'Locates the \'Regulation/Clause\' input field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_regDesc'))

'Populates the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_regDesc'), regulationClause)

GlobalVariable.regulationClause = regulationClause

'Verify that \'Description\' is present in page before interacting with it.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/span_DESCRIPTION'))

'Locates the \'Description\' input field. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_provMadeOnDesc'))

'Populates the field with a dynamic variable. '
WebUI.setText(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_provMadeOnDesc'), 
    Description)

GlobalVariable.Description = Description

'Key press: Enter - to submit the current entry.'
WebUI.sendKeys(findTestObject('Objects.NewRegulatoryRequirement/Page_ISPS2/input_This field is required_provMadeOnDesc'), 
    Keys.chord(Keys.ENTER))

