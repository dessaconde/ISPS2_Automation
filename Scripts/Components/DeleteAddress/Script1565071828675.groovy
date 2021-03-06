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

//Component Name: DeleteAddress
//Dev: Shayne Cardona
//Purpose: To delete address in Address LHS

'Wait for 2 sec.'
Thread.sleep(2000)

'Modify the object\'s attributes.'
modifiedBuildingName = WebUI.modifyObjectProperty(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_JMT Building'), 'xpath', 
    'equals', ((('(//div[text()="' + BuildingName) + '"])[') + Index) + ']', true)

'Click the modified object.'
WebUI.click(modifiedBuildingName)

'Highlight delete button.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DeleteAddress/Page_ISPS2/span_Delete'))

'Click delete button.'
WebUI.click(findTestObject('Objects.DeleteAddress/Page_ISPS2/span_Delete'))

'Wait for the element with the message to be present.'
WebUI.waitForElementPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Deleting Case Address'), 0)

'Wait for the element to not be displayed.'
WebUI.waitForElementNotPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Deleting Case Address'), 0)

'Wait for the element to be present.'
WebUI.waitForElementPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Loading'), 0)

'Wait until the element loading is no longer present.'
WebUI.waitForElementNotPresent(findTestObject('Objects.DeleteAddress/Page_ISPS2/div_Loading'), 3, FailureHandling.OPTIONAL)

'Wait for 1 sec.'
Thread.sleep(1000)

'Higlight the element that contains the confirmation message.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.DeleteAddress/Page_ISPS2/li_Selected Record(s) are deleted successfully'))

'Verify that the selected record has been deleted.'
WebUI.verifyTextNotPresent(BuildingName, false)

