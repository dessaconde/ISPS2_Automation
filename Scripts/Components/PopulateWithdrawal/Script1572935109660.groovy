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
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys

//Component Name: PopulateWithdrawal
//Dev: Shayne Cardona
//Purpose: To populate fields in Withdrawal LHS


'Get today\'s date.'
myDate = new Date()

'Wait for a moment before proceeding to execute further automated scripts. '
Thread.sleep(1000)

'Format today\'s date.'
currentDate = myDate.format(((('dd' + ' ') + 'MMM') + ' ') + 'YYYY')

not_run: WebUI.comment(currentDate)

'Verify the Issue On contains the current date today.'
WebUI.verifyTextPresent(currentDate, false)

'Highlight withdrawal status field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/input__withdrawalStatus'))

not_run: WebUI.click(findTestObject(null))

'Send arrow down key on withdrawal status field.'
WebUI.sendKeys(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/input__withdrawalStatus'), Keys.chord(Keys.ARROW_DOWN))

'Modify object\'s property.'
modifiedWithdrawalStat = WebUI.modifyObjectProperty(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/XPA_withdrawalStat'), 
    'text', 'contains', withdrawalStatus, true)

'Click modified object.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(modifiedWithdrawalStat, 0)

'Highlight remarks field.'
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/XPI_Remarks_remarks'))

'Populate remarks field.'
WebUI.setText(findTestObject('Objects.PopulateWithdrawal/Page_ISPS2/XPI_Remarks_remarks'), remarks)

