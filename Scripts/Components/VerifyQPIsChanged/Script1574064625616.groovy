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

//Component Name: VerifyQPIsChanged
//Dev: Shayne Cardona
//Purpose: To verify if the qp is changed is verified in the Verification Check

'Wait for a moment before further proceeding to the next automated actions.'
Thread.sleep(1000)

modifiedVCLink = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/notVerified'), 'xpath', 'equals', 
    ('(//a[text() = "' + link) + '"]//ancestor::td//following-sibling::td)[1]//child::div[@class = \'x-fa fa-circle-thin\']', 
    true)

if (WebUI.verifyElementPresent(modifiedVCLink, 0, FailureHandling.OPTIONAL) == true) {
    modifiedQPLHS = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/div_qpLHS'), 'xPath', 'equals', 
        ('(//div[text() ="' + qpLHS) + '"])', true)

    WebUI.click(modifiedQPLHS)

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/span_Add'))

    WebUI.setText(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/input__qpName'), qpName)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(2000)

    WebUI.sendKeys(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/input__qpName'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/input__qpName'), Keys.chord(Keys.DELETE))

    WebUI.setText(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/input__qpName'), qpName)

    WebUI.sendKeys(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/input__qpName'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/QP_LHS_NV/span_Save'))

    extractedName = WebUI.getText(findTestObject('Objects.VerifyQPIsChanged/nameFromQPLHS'))

    assert ((((WebUI.verifyTextPresent('Updated Successfully!', true, FailureHandling.OPTIONAL) || WebUI.verifyTextPresent(
        'Successfully Saved!', true, FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Successfully saved.', true, 
        FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Successfully saved!', true, FailureHandling.OPTIONAL)) || 
    WebUI.verifyTextPresent('Successfully Saved as Draft', true, FailureHandling.OPTIONAL)) || WebUI.verifyTextPresent('Created Successfully!', 
        true, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/div_Verification Check4'))

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(2000)

    modifiedVCLinkChecklist = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/a_linkToModify'), 
        'xPath', 'equals', ('(//a[text() ="' + link) + '"])', true)

    WebUI.click(modifiedVCLinkChecklist)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(3000)

    WebUI.verifyElementText(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/div_Name'), extractedName)

    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/div_Name'))

    WebUI.setText(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/textarea_Remarks'), remarks)

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/span_Save'))

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(2000)

    WebUI.verifyTextPresent(remarks, false)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(1000 //WebUI.verifyTextPresent(extractedQPNoFromVC, false)
        )
} else {
    modifiedVCLinkChecklist = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/a_linkToModify'), 
        'xPath', 'equals', ('(//a[text() ="' + link) + '"])', true)

    WebUI.click(modifiedVCLinkChecklist)

    WebUI.verifyTextPresent(GlobalVariable.CRN, false)

    extractedNameFromVC = WebUI.getText(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/div_Name'))

    splitString = WebUI.getText(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/XPA_QPNo'))

    parsedString = splitString.replaceAll('\\(', '&')

    extractedQPNoFromVC = (parsedString.split('&')[0])

    WebUI.setText(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/textarea_Remarks'), remarks)

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/VC_LHS_V/span_Save'))

    Thread.sleep(3000)

    WebUI.verifyTextPresent(remarks, false)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(1000)

    modifiedQPLHS = WebUI.modifyObjectProperty(findTestObject('Objects.VerifyQPIsChanged/div_qpLHS'), 'xPath', 'equals', 
        ('(//div[text() ="' + qpLHS) + '"])', true)

    WebUI.click(modifiedQPLHS)

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(3000)

    WebUI.verifyTextPresent(extractedQPNoFromVC, false)

    WebUI.verifyTextPresent(extractedNameFromVC, false)

    WebUI.click(findTestObject('Objects.VerifyQPIsChanged/div_Verification Check4'))

    'Wait for a moment before further proceeding to the next automated actions.'
    Thread.sleep(1000)
}

