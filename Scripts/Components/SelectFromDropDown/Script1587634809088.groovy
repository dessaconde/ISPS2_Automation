import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

'Modify Object '
modified = WebUI.modifyObjectProperty(findTestObject('Objects.ClickDropDownField/dropdownfield'), 'xpath', 'equals', ('(//div[@class=\'x-form-trigger x-form-trigger-default x-form-arrow-trigger x-form-arrow-trigger-default \'])[' +
	Index) + ']', true)

'Click.'
WebUI.click(modified)

'Modify object.'
ModifiedObject = WebUI.modifyObjectProperty(findTestObject('Objects.ClickDropDownField/list'), 'tag', 'equals', tagToBeUsed,
	true)

'Modify object.'
ModifiedObjectx2 = WebUI.modifyObjectProperty(ModifiedObject, 'aria-owns', 'equals', ariaToBeUsed, true)

'Modify object.'
ModifiedObjectx3 = WebUI.modifyObjectProperty(ModifiedObjectx2, 'id', 'equals', idToBeUsed, true)

'Locates the newly modified link.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(ModifiedObjectx3)

'Clicks the modified link. '
WebUI.click(ModifiedObjectx3)
