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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import org.openqa.selenium.Keys as Keys
import java.util.*

/* =================================================================
 * TESTER: Rhodessa Conde
 * CREATED DATE: 29-Apr-2020
 * PURPOSE: This is the hashmap table for lists of PE
 *  =================================================================
 */
'Hard wait for 3sec'
Thread.sleep(1000)

'Define PE array list table'
def PEListsTBL = [('0011') : 'QP-Formatted Address', 
	('0012') : 'QP-0012', 
	('0014') : 'QP-0014', 
	('0015') : 'QP-0015', 
	('0016') : 'QP-0016',
	('3214') : 'Dummy QP Name 3861',
	('7004') : 'QP-7004',
	('0017') : '3214',
	('0018') : '0567']

switch (DropdownNm){
	case 'PENo' :
	
	GlobalVariable.ValueFound = ((FindValue + ' (') + PEListsTBL.get(FindValue).toString()) + ')'
		break
		
	case 'PEName':
	
	GlobalVariable.ValueFound = PEListsTBL.find {it.value == FindValue}
		break
		
	default:
	
	WebUI.comment('No matching records')
		break
	
}