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
import org.openqa.selenium.Keys as Keys

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

'Modify and enhances the bullet property to recognize unticked bullet of \'Check Plan Fees Declaration\'.'
modifiedUnverified = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/notVerified'), 'xpath', 'equals', 
    ('(//a[text() = "' + link) + '"]//ancestor::td//following-sibling::td)[1]//child::div[@class = \'x-fa fa-circle-thin\']', 
    true)

'Modify and enhances the bullet property to recognize ticked bullet of \'Check Plan Fees Declaration\'.'
modifiedVerified = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/verified'), 'xpath', 
    'equals', ('(//a[text() = "' + link) + '"]//ancestor::td//following-sibling::td)[1]//child::div[@class = \'x-fa fa-check-circle-o\']', 
    true)

'Modify the link to be clicked. '
modifiedVCLinkChecklist = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/a_linkToModify'), 
    'xPath', 'equals', ('(//a[text() ="' + link) + '"])', true)

'If the button is unticked or it\'s unverified then: '
if (WebUI.verifyElementPresent(modifiedUnverified, 0, FailureHandling.OPTIONAL) == true) {
    'Clicks the link to get inside Verification Check > Check Plan Fees Declaration page. '
    WebUI.click(modifiedVCLinkChecklist)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(3000)

    'Clicks the \'Click here to calculate using the rate before [Date]\' link to populate the table. '
    WebUI.click(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/u_Click here to calculate using the rate before 10 September 2017'))

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(1000)

    'Clicks the \'Click here to calculate using the rate before [Date]\' link to populate the table. '
    WebUI.click(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/u_Click here to calculate using the rate before 10 September 2017'))

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(1000)

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_A1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_A1'), '200')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_A2'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_A2'), '2')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_B1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_B1'), '400')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_B2'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_B2'), '4')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_C1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_C1'), '600')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_C2'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_C2'), '6')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_D1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_D1'), '800')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_D2'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_D2'), '8')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_E1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_E1'), '300')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_E2'))

    'Erases the predeclared \'1\' value in the textfield. Delete once defect is fixed. '
    WebUI.sendKeys(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_E2'), Keys.chord(Keys.BACK_SPACE))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_E2'), '3')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_F1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_F1'), '500')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_F2'))

    'Erases the predeclared \'1\' value in the textfield. Delete once defect is fixed. '
    WebUI.sendKeys(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_F2'), Keys.chord(Keys.BACK_SPACE))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_F2'), '5')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_G1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_G1'), '700')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_G2'))

    'Erases the predeclared \'1\' value in the textfield. Delete once defect is fixed. '
    WebUI.sendKeys(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_G2'), Keys.chord(Keys.BACK_SPACE))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_G2'), '7')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_H1'))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_H1'), '900')

    'Locates the input field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_H2'))

    'Erases the predeclared \'1\' value in the textfield. Delete once defect is fixed. '
    WebUI.sendKeys(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_H2'), Keys.chord(Keys.BACK_SPACE))

    'Populates the input field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/input_H2'), '9')

    'Clicks on the \'Remarks\' field. '
    WebUI.click(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/textarea_Remarks_remarks'))

    'Verify that the grand total is displayed and calculated right. '
    WebUI.verifyTextPresent('4300000', false)

    'Locates the \'Remarks\' field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/textarea_Remarks_remarks'))

    'Populates the \'Remarks\' field. '
    WebUI.setText(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/textarea_Remarks_remarks'), '\'Remarks\' field autopopulate test. ')

    'Locates the tick field before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/textarea_Remarks_remarks'))

    'Clicks the \'No Actions Required?\' tick box. '
    WebUI.click(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/Page_ISPS2/XPA_span_No Action Required_NovaCheckbox-2541-displayEl'))

    'Locates the \'Save\' button before interacting with it. '
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/XPI_saveButton'))

    'Clicks the \'Save\' button.'
    WebUI.click(findTestObject('Objects.ManipulateCheckPlanFeesDeclaration/XPI_saveButton'))
} else if (WebUI.verifyElementPresent(modifiedVerified, 0, FailureHandling.OPTIONAL) == true) {
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedVerified)
}

