import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Component Name: DeleteUnformattedAddress
//Dev: Shayne Cardona
//Purpose: To delete specific unformatted address

'Wait for 2 sec.'
Thread.sleep(2000)

not_run: modifiedAdd = WebUI.modifyObjectProperty(findTestObject('Objects.DeleteUnformattedAddress/Page_ISPS2/unformattedAdd'), 
    'text', 'equals', roadName, false)

'Click the \'unformatted\' radio button.'
WebUI.click(findTestObject('Objects.DeleteUnformattedAddress/Page_ISPS2/XPA_radioButton'))

'Highlight the delete button.\r\n'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DeleteAddress/Page_ISPS2/span_Delete'))

'Click the delete button.'
WebUI.click(findTestObject('Objects.DeleteAddress/Page_ISPS2/span_Delete'))

'Wait for the confirmation message that the address is being deleted.'
WebUI.waitForElementPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Deleting Case Address'), 0)

'Wait for the element to not be present.'
WebUI.waitForElementNotPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Deleting Case Address'), 0)

'Wait for the loading element to be present.'
WebUI.waitForElementPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Loading'), 0)

'Wait until the loading element is no longer present.'
WebUI.waitForElementNotPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Loading'), 3, FailureHandling.OPTIONAL)

'Wait for 1 sec.'
Thread.sleep(1000)

'Highlight the confirmation that the selected record/s was deleted successfully.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DeleteAddress/Page_ISPS2/li_Selected Record(s) are deleted successfully'))

'Verify that the address was deleted successfully.'
WebUI.verifyTextNotPresent(roadName, false)

