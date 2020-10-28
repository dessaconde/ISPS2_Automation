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

//Component Name: PopulateRecommendAssignLHS
//DEv: Shayne Cardona
//Purpose: To populate fields in Recommend LHS

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(1000)

'Highlight recommend header.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecommendAssignLHS/div_Recommend'))

'Highlight recommend status field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecommendAssignLHS/input_recostat'))

'Populate recommend status field.'
WebUI.setText(findTestObject('Objects.PopulateRecommendAssignLHS/input_recostat'), recommendStatus)

'Highlight module field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecommendAssignLHS/input_module'))

'Populate module field.'
not_run: WebUI.setText(findTestObject('Objects.PopulateRecommendAssignLHS/input_module'), recommendToModule)

'Highlight officer field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecommendAssignLHS/input_officer'))

'Click officer field using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.PopulateRecommendAssignLHS/input_officer'), 
    0)

'Send arrow down key on officer field.'
WebUI.sendKeys(findTestObject('Objects.PopulateRecommendAssignLHS/input_officer'), Keys.chord(Keys.ARROW_DOWN))

'Wait for 5 secs.'
Thread.sleep(5000)

'Populate recommend to officer field.'
WebUI.setText(findTestObject('Objects.PopulateRecommendAssignLHS/input_officer'), recommendToOfficer)

'Highlight remarks field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateRecommendAssignLHS/input_remarks'))

'Populate remarks field.'
WebUI.setText(findTestObject('Objects.PopulateRecommendAssignLHS/input_remarks'), remarks)

