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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

//Component Name: CompareTwoDates
//Dev: Shayne Cardona
//Date Created: 20-02-2020
//Purpose: To compare 2 dates

'Wait for a second before proceeding to execute further automated scripts. '
Thread.sleep(1000)

//todaysDate = today.format('dd/mm/yyyy')
'Get today\'s date.'
String todaysDate = new SimpleDateFormat('dd/MM/yyyy')

'If the compared date is after today\'s date, else If the compared date is before today\'s date, else If the compared date is equals with today\'s date'
if (dateToCompare.compareTo(todaysDate) > 0) {
    WebUI.comment('after')
} else if (dateToCompare.compareTo(todaysDate) < 0) {
   myDate = new Date()
   nextDay = myDate + 1
   currentDate = nextDay.format(((('dd' + ' ') + 'MMM') + ' ') + 'YYYY')
   WebUI.comment(currentDate)
   GlobalVariable.dateToCompare = currentDate
} else if (dateToCompare.compareTo(todaysDate) == 0) {
	WebUI.comment('equals')
}


