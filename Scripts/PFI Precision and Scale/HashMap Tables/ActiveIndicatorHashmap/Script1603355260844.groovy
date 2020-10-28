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
import java.util.LinkedHashMap as GroovyHashMap

/*==========================================================================*
 * COMPONENT NAME: ActiveIndicatorHashmap                  				    *
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 22-Oct-2020                                       			*
 * PURPOSE: To verify the values of Active Indicator 						*
 * =========================================================================*
 */

def IndTBL = [
	(1) : [('IND') : 'Yes'],
	(2) : [('IND') : 'No'],
	
	]

switch (DropdownNm) {
		case 'IND':
		GlobalVariable.ValueFound = IndTBL.find { it.value.IND == FindValue }
		break

		default:
		WebUI.comment('Not found in the List!')

		break
}
