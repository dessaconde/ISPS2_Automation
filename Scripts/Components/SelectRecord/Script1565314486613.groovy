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

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

'Modifies the \'text\' attribute of the object/element that\'s sourcing from the Datatable. (For dynamic purposes.)'
textModifiedObject = WebUI.modifyObjectProperty(findTestObject('Objects.SelectRecord/Page_ISPS2/ObjectToModify'), 'text', 
    'equals', TextToClick, true)

'Locates the newly modified object.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(textModifiedObject)

'Clicks the modified object. '
WebUI.click(textModifiedObject)

