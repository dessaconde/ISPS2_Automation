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

//Component Name: ClickLinkDependingOnTextAndIndex
//Dev: Shayne Cardona
//Purpose: To be able to click link by modifying the object's text and index

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

println(linkName)
println(index)

'Modify the obj depending on the inputted text and index.'
modifiedLink = WebUI.modifyObjectProperty(findTestObject('Objects.ClickLinkDependingOnTextAndIndex/linkToModify'), 'xpath', 
    'equals', ((('(//a[text()="' + linkName) + '"])[') + index) + ']', true)

'Hard wait.'
Thread.sleep(5000)

'Highlights the newly modified link.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLink)

'Clicks the modified link. '
WebUI.click(modifiedLink)

