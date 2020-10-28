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
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import com.kms.katalon.core.testobject.RequestObject as RequestObject

//Component Name: VerifyDueOnDate
//Dev: Shayne
//Purpose: To verify the due on date of the case after recommending

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Get date today.'
LocalDate today = LocalDate.now()

'Set variable type into Long.'
long months

'Add months starting today.'
LocalDate oneMonthLater = today.plusMonths(months)

'Modify date format.'
String formattedDate = oneMonthLater.format(DateTimeFormatter.ofPattern('dd MMM yyyy'))

'Get text of the specified div.'
dueOnDate = WebUI.getText(findTestObject('Objects.VerifyDueOnDate/dueOnDateDiv'))

'Highlight element.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Objects.VerifyDueOnDate/taskDescription'))

'Verify text element.'
WebUI.verifyElementText(findTestObject('Objects.VerifyDueOnDate/taskDescription'), 'Recommendation and Decision (SMB)')

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(3000)

'Highlight element.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Objects.VerifyDueOnDate/dueOnDateDiv'))

'Open case.'
WebUI.click(findTestObject('Objects.VerifyDueOnDate/taskDescription'))

'Wait for a moment before proceeding to further automated actions. '
Thread.sleep(2000)

'Open case stages lhs.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.VerifyDueOnDate/caseStagesLHS'), 
    0)

//WebUI.click(findTestObject('Objects.VerifyDueOnDate/caseStagesLHS'))
'Switch to window index.'
WebUI.switchToWindowIndex(1)

'Wait for page to load.'
WebUI.waitForPageLoad(120)

'Highlight element.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Objects.VerifyDueOnDate/stageDesc'))

'Verify element text.'
WebUI.verifyElementText(findTestObject('Objects.VerifyDueOnDate/stageDesc'), 'Recommend')

'Higlight element.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/Objects.VerifyDueOnDate/stageDesc'))

'Format today\'s date.'
String formattedDate1 = today.format(DateTimeFormatter.ofPattern('dd-MMM-yyyy'))

'Get stage date.'
splitString = WebUI.getText(findTestObject('Objects.VerifyDueOnDate/stageDate'))

'Replace all the spaces with "&" character for easy splitting.'
str = splitString.replaceAll(' ', '&')

'Split the captured string starting from the character "&"'
String[] splitStrin1 = str.split('&')

'Get the left part of the splitted string.'
String part1 = splitStrin1[0]

'Verify that the stage date matches the date today.'
WebUI.verifyMatch(formattedDate1, part1, false)

