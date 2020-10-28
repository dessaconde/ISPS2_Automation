import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//*******************************************************//
//****************** ChooseValidCaseTypeForCloseCase ******************//
//*** Author: Fatima Shayne Cardona*****************//
//*** Date Created: 14th of January 2020 ************//
//*** Purpose: To choose valid test data for PFI/PSI close case ********************************//
//*** Reviewer: fullFirstName surname ***************//
//*******************************************************//
'Hard wait for 2 seconds.'
Thread.sleep(2000)

'If the specfied messga eis displayed in the screen.. '
if (WebUI.verifyTextPresent('The case status is not T1a, T2a, T5a, T6a, T7a, TAC. The case cannot be closed', true, FailureHandling.OPTIONAL)) {
    'While the message is still present in the page...'
    while (WebUI.verifyTextPresent('The case status is not T1a, T2a, T5a, T6a, T7a, TAC. The case cannot be closed', true, 
        FailureHandling.OPTIONAL) == true) {
        'Add +1 to the global variable Index'
        Index = (GlobalVariable.Index.toInteger() + 1)

        'Best practice: Wait for 3 seconds after a page navigation component. '
        Thread.sleep(3000)

        'Get text of the element where the case ref no is.'
        splitString = WebUI.getText(findTestObject('Objects.GetCaseRefNo/Page_ISPS2/div_deets'))

        'Split the captured string starting from the character ":"'
        parsedString = (splitString.split(':')[1])

        'Replace all the spaces with "&" character for easy splitting.'
        str = parsedString.replaceAll(' ', '&')

        'Split the string starting after the character "&"'
        str2 = (str.split('&')[1])

        'Assign the splitted/parsed string in a global variable for easy access'
        GlobalVariable.CRN = str2

        'Navigate to dashboard.'
        WebUI.click(findTestObject('Objects.IntoTheUnknown/a_ISPS2-PROD-Verify'))

        'Wait for the page to load before moving to the next action.'
        WebUI.waitForPageLoad(30)

        '3 seconds hard wait. '
        Thread.sleep(3000)

        'Verify internal page load. '
        WebUI.verifyTextPresent('Loading search result. Please wait...', false, FailureHandling.OPTIONAL)

        'Wait for the internal page to load before further manipulating objects. '
        WebUI.waitForElementNotPresent(findTestObject('Objects.IntoTheUnknown/div_Loading search result Please wait'), 120)

        '3 seconds hard wait. '
        Thread.sleep(3000)

        'Wait for a second before proceeding to execute further automated scripts. '
        Thread.sleep(1000)

        'Click the filter icon. '
        WebUI.click(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/XP.Embutidooo'))

        'Verify that the \'Reset\' button is present before interacting with it. '
        CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/span_Reset'))

        'Click the \'Reset\' button.'
        WebUI.click(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/span_Reset'))

        'Verify and highight the \'Task Description\' textbox. '
        CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/TextBoxTaskDescription'))

        'Populate the \'Task Description\' field with a dynamic variable.'
        WebUI.setText(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/TextBoxTaskDescription'), taskDescription)

        'Send enter key on task description field'
        WebUI.sendKeys(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/TextBoxTaskDescription'), Keys.chord(Keys.ENTER))

        'Press the \'Enter\' key after successful input of the filter. '
        not_run: WebUI.sendKeys(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/TextBoxTaskDescription'), Keys.chord(Keys.ENTER))

        'Verify that the \'Search\' button is present before interacting with it. '
        CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.Filter/Page_ISPS2/span_Search'))

        'Click the \'Search\' button.'
        WebUI.click(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/span_Search'))

        'Wait for a second before proceeding to execute further automated scripts. '
        Thread.sleep(5000)

        'Hard wait for 2 seconds.'
        Thread.sleep(2000)

        'Transfer the value of Index into the global variable Index.'
        GlobalVariable.Index = Index

        'Modify the case type and the index.'
        modifiedTaskDescription = WebUI.modifyObjectProperty(findTestObject('Objects.SelectItemFromFilteredTasks/Page_ISPS2/a_caseType'), 
            'xPath', 'equals', ((('(//a[text()="' + extractedCaseTypeFromGV) + '"])[') + Index) + ']', true)

        'Hard wait for 3 seconds.'
        Thread.sleep(3000)

        'Highlight the modified object.'
        CustomKeywords.'com.reusableComponents.HighlightElement.run'(modifiedTaskDescription)

        'Click the successfully modified object.'
        WebUI.click(modifiedTaskDescription)

        'Hard wait for 2 seconds.'
        Thread.sleep(3000)

        'Wait for a moment before proceeding to further automated actions. '
        Thread.sleep(1000)

        'Modifies the \'text\' property of the object to dynamically click it. '
        modifiedLHS = WebUI.modifyObjectProperty(findTestObject('Objects.NavigateToAnyLHS/Page_ISPS2/LHSToModify'), 'text', 
            'equals', LHS, true)

        'Clicks the modified object and navigates the user to the desired LHS. '
        WebUI.click(modifiedLHS)

        'Get text of the LHS'
        GlobalVariable.currentLHS = WebUI.getText(modifiedLHS)

        'Wait for 5 secs'
        Thread.sleep(5000)
    }
    
    'Populate remarks text field.'
    WebUI.setText(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/textarea_Remarks_remarks'), 'Test.')

    'Click close.'
    WebUI.click(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/span_Close Case'))

    '3 seconds hard wait. '
    Thread.sleep(5000)

    'Click OK'
    WebUI.click(findTestObject('Objects.ChooseValidCaseTypeForCloseCase/span_Ok'))
}

