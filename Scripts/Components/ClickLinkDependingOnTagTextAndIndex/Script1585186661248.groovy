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

//Component Name: ClickDependingOnTagTextAndIndex
//Dev: Shayne Cardona
//Date Finished: 26Mar2020
//Purpose: To click desired link by modifying the tag, text and index of the object

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

'Modify the obj depending on the inputted text and index.'
modifiedLink = WebUI.modifyObjectProperty(findTestObject('Objects.ClickLinkDependingOnTextAndIndex/linkToModify'), 'xpath', 
    'equals', ((((('(//' + tagToBeUsed) + '[text()="') + linkName) + '"])[') + index) + ']', true)

'Hard wait.'
Thread.sleep(5000)

'Highlights the newly modified link.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedLink)

'Clicks the modified link. '
WebUI.click(modifiedLink)

'Just a little reminder.\r\n'
WebUI.comment('Note that if this fails, it simply means that the specified link is not presen tin the page and that is okay. This step is just to make sure that you are in the right link.')

