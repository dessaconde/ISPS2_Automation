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

'Wait for a second before proceeding to further automated steps.'
Thread.sleep(1000)

'Modify the \'Text\' property of radio button for it to be dynamic.'
modifiedRadioButton = WebUI.modifyObjectProperty(findTestObject('Objects.SelectOptionFromRadioButtons/Page_ISPS2/label_SS6262017'), 
    'text', 'equals', radioButtonLabel, true)

GlobalVariable.radioButton = radioButtonLabel

'Locates the modified radio button before interacting with it. '
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedRadioButton)

'Clicks the modified radio button. '
WebUI.click(modifiedRadioButton)



