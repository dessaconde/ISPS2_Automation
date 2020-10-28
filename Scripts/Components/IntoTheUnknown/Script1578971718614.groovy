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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter

'Login.'
not_run: WebUI.callTestCase(findTestCase('Components/Login'), [('Username') : findTestData('Datatable').getValue('Username', 
            1), ('Password') : findTestData('Datatable').getValue('Password', 1)], FailureHandling.STOP_ON_FAILURE)

'Navigate to My Tasks.'
not_run: WebUI.callTestCase(findTestCase('Components/NavigateToHomepageHeaders'), [('headerText') : 'My Tasks'], FailureHandling.STOP_ON_FAILURE)

'Filter out Process EME Plan Application cases.'
not_run: WebUI.callTestCase(findTestCase('Components/Filter'), [('taskDescription') : 'Process EME Plan Application'], FailureHandling.STOP_ON_FAILURE)

'Select Process EME Plan Application case type.'
not_run: WebUI.callTestCase(findTestCase('Components/A_EME Module Components/SmartSelectForEMECaseType'), [('caseType') : 'Lift'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Objects.IntoTheUnknown/objectToModify'), 'Project Reference No:')

not_run: modifiedTag = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/Page_ISPS2/objectToModify'), 'tag', 
    'equals', tagToModify, true)

not_run: modified = WebUI.modifyObjectProperty(modifiedTag, 'text', 'equals', textToModify, true)

//CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)
not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject(modified))

not_run: complexlyModifiedButtonGG = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/objectToModify'), 
    'xPath', 'equals', ((('//"' + tagToModify) + '" [(text() ="') + textToModify) + '")]', false)

not_run: WebUI.verifyElementPresent(modified, 0)

not_run: elementText = WebUI.getText(modified)

not_run: elementText.toUpperCase()

not_run: comparedText = elementText.equalsIgnoreCase(textToModify)

not_run: WebUI.verifyElementText(comparedText, textToModify)

not_run: CustomKeywords.'com.reusableComponents.HighlightElement.run'(modified)

'Wait.'
not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : 2000], FailureHandling.STOP_ON_FAILURE)

not_run: modifiedCheckBox = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/checkbox'), 'xpath', 'equals', 
    ('(//div[@class=\'x-grid-row-checker\'])[' + Index) + ']', true)

not_run: WebUI.click(modifiedCheckBox)

not_run: WebUI.callTestCase(findTestCase('Components/NavigateToAnyLHS'), [('LHS') : 'Main Form'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : '3000'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Components/ClickRadioButton'), [('Index') : 7], FailureHandling.STOP_ON_FAILURE)

not_run: modifiedcal = WebUI.modifyObjectProperty(findTestObject('Objects.IntoTheUnknown/cal'), 'xPath', 'equals', ('(//div[contains(@class, \'x-form-trigger x-form-trigger-default x-form-date-trigger x-form-date-trigger-default \')])[' + 
    Index) + ']', false)

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedcal, 0)

'Wait for 1 sec.'
not_run: Thread.sleep(3000)

not_run: WebUI.callTestCase(findTestCase('Components/Wait'), [('secondsToWait') : '1000'], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.IntoTheUnknown/today'), 
    0)

not_run: WebUI.click(modifiedcal)

not_run: WebUI.doubleClick(findTestObject('Objects.IntoTheUnknown/today'))

not_run: WebUI.sendKeys(findTestObject('Objects.IntoTheUnknown/today_a'), Keys.chord(Keys.SPACE))

not_run: WebUI.acceptAlert()

not_run: Double d = 234.12413

not_run: String[] splitter = d.toString().split('\\.')

not_run: (splitter[0]).length( // Before Decimal Count
    )

not_run: int decimalLength = (splitter[1]).length()

not_run: WebUI.scrollToElement(findTestObject('Objects.VerifyPlanFeesPaidByQP/divContainingTheDataOfTheColumn'), 30)

not_run: WebUI.scrollToElement(findTestObject(null), 0)

not_run: WebUI.scrollToPosition(300050, 3000)

LocalDate today = LocalDate.now()

LocalDate oneMonthLater = today.plusMonths(2)

String formattedDate = oneMonthLater.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));

println(formattedDate)

