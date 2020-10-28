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

//Component Name: ClickBlueButtons
//Dev: Shayne Cardona
//Purpose: To click blue colored buttons
'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Modify button\'s text.'
modifiedButton = WebUI.modifyObjectProperty(findTestObject('Objects.ClickBlueButtons/Page_ISPS2/span_Reset'), 'text', 'equals', 
    buttonText, false)

not_run: WebUI.scrollToElement(modifiedButton)

'Highlight the modified button.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedButton)

WebUI.click(modifiedButton)

'Click the modified button using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedButton, 0)

