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

//Component Name: UniversalSearch
//Dev: Shayne Cardona
//Purpose: To search cases in the universal search

'3 seconds hard wait. '
Thread.sleep(1000)

'Verify that the universal serach field is visible.'
WebUI.verifyElementVisible(findTestObject('Objects.UniversalSearch/input_Universal search field'))

'Populate the universal search with the case ref no.'
WebUI.setText(findTestObject('Objects.UniversalSearch/input_Universal search field'), GlobalVariable.CRN)

'Send enter key on the universal serach field.'
WebUI.sendKeys(findTestObject('Objects.UniversalSearch/input_Universal search field'), Keys.chord(Keys.ENTER))

'Wait for the page to load before moving to the next action.'
WebUI.waitForPageLoad(30)

'3 seconds hard wait. '
Thread.sleep(3000)

'Verify internal page load. '
WebUI.verifyTextPresent('Loading search result. Please wait...', false, FailureHandling.OPTIONAL)

'Wait for the internal page to load before further manipulating objects. '
WebUI.waitForElementNotPresent(findTestObject('Objects.NavigateToDashboard/div_Loading search result Please wait'), 120)

'3 seconds hard wait. '
Thread.sleep(3000)

