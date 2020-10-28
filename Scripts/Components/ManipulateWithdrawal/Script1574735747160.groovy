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

//Component Name: ManipulateWithdrawal
//Developer: Shayne Cardona
//Purpose: To manipulate some fields in Withdrawal LHS

'1 sec hard wait.'
Thread.sleep(1000)

'Access project directory.'
String userDir = System.getProperty('user.dir')

'Transfer value in a local variable.'
docToUpload = (userDir + '/Data Files/Files/test_data_for_replace.docx')

'Transfer value of a global variable in a local variable.'
def currLHS = GlobalVariable.currentLHS

'Transfer value of a global variable in a local variable.'
def caseType = GlobalVariable.caseType

'Get today\'s date.'
myDate = new Date()

'Wait for a moment before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Format today\'s date.'
currentDate = myDate.format(((('dd' + ' ') + 'MMM') + ' ') + 'YYYY')

'Verify the Issue On contains the current date today.'
WebUI.verifyTextPresent(currentDate, false)

'Highlight remarks field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/XPI_Remarks_remarks'))

'Set text on remarks field.'
WebUI.setText(findTestObject('Objects.ManipulateWithdrawal/XPI_Remarks_remarks'), remarks)

'Highlight withdrawal status.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/input__withdrawalStatus'))

'Modify withdrawal status\' attributes.'
modifiedWithdrawalStat = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/XPA_withdrawalStat'), 
    'text', 'contains', withdrawalStatus, true)

'Send arrow down key on withdrawal status field.'
WebUI.sendKeys(findTestObject('Objects.ManipulateWithdrawal/input__withdrawalStatus'), Keys.chord(Keys.ARROW_DOWN))

'Click chosen withdrawal status using js.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedWithdrawalStat, 0)

not_run: WebUI.sendKeys(findTestObject('Objects.ManipulateWithdrawal/XPA_withdrawalStat'), Keys.chord(Keys.ARROW_DOWN))

'If the withdrawal status is approved, else if it is disapproved...'
if (withdrawalStatus == 'Approved') {
    'If the type of letter list id visible.'
    if (WebUI.verifyElementVisible(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), FailureHandling.OPTIONAL) == 
    true) {
        '1 sec hard wait.'
        Thread.sleep(1000)
    } else {
        '1 sec hard wait.'
        Thread.sleep(1000)

        CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Delete and Re-generate'), 
            0)

        CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), 
            0)
    }
    
    'Modify the object\'s attributes.'
    modifiedLetter = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/letterToModify'), 
        'text', 'contains', letterToGenerateContains, true)

    '1 sec hard wait.'
    Thread.sleep(1000)

    not_run: WebUI.click(modifiedLetter)

    not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedLetter, 0)

    'Highlight generate button.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Click generate button.'
    WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Verify letter is being generated.'
    WebUI.verifyTextPresent('Generating letter...', false, FailureHandling.OPTIONAL)

    'Verify letter was generated succesfully.'
    WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, 
        FailureHandling.OPTIONAL)

    '3 secs hard wait.'
    Thread.sleep(3000)

    'Click replace button.'
    WebUI.uploadFile(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Replace'), docToUpload)
} else if (withdrawalStatus == 'Disapproved') {
    'If the type of letter list id visible.'
    if (WebUI.verifyElementVisible(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_TypeOfLetterField'), FailureHandling.OPTIONAL) == 
    true) {
        '1 sec hard wait.'
        Thread.sleep(1000)
    } else {
        '1 sec hard wait.'
        Thread.sleep(1000)

        CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Delete and Re-generate'), 
            0)

        CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/XPA_TypeOfLetterField'), 
            0)
    }
    
    'Modify the object\'s attributes.'
    modifiedLetter = WebUI.modifyObjectProperty(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/letterToModify'), 
        'text', 'contains', letterToGenerateContains, true)

    '1 sec hard wait.'
    Thread.sleep(1000)

    not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedLetter, 0)

    'Highlight generate button.'
    CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Click generate button.'
    WebUI.click(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/XPA_GenerateButton'))

    'Verify letter is being generated.'
    WebUI.verifyTextPresent('Generating letter...', false, FailureHandling.OPTIONAL)

    'Verify letter was generated succesfully.'
    WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, 
        FailureHandling.OPTIONAL)

    '3 secs hard wait.'
    Thread.sleep(3000)

    'Click replace button.'
    WebUI.uploadFile(findTestObject('Objects.ManipulateTypeOfLetterV3/Page_ISPS2/span_Replace'), docToUpload)
}

