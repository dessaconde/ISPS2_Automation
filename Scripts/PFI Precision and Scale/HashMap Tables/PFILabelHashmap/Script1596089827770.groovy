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
 * COMPONENT NAME: PFILabelHashmap		                  				*
 * TESTER: Krizia Manuel                                           			*
 * CREATE DATE: 29-July-2020                                       			*
 * PURPOSE: To verify the label against the URS 						*
 * =========================================================================*
 */

def LabelTBL = [
	(1) : [('MainForm') : 'FI Registration Number *:'],
	(2) : [('MainForm') : 'Name of Facade Inspector:'],
	(3) : [('MainForm') : 'Handphone No:'],
	(4) : [('MainForm') : 'Type of Building:'],
	(5) : [('MainForm') : 'Building Facade Condition:'],
	(6) : [('MainForm') : 'Date of TOP:'],
	(7) : [('MainForm') : 'Age:'],
	(8) : [('MainForm') : 'Date of Last PFI:'],
	(9) : [('MainForm') : 'No of Buildings:'],
	(10) : [('MainForm') : 'No of Storeys/Building:'],
	(11) : [('MainForm') : 'Height of Building:'],
	(12) : [('MainForm') : 'Type of Facade:'],
	(13) : [('MainForm') : 'Type of Attachment to the Building:'],

]

switch (Name) {
		case 'MainForm':
		GlobalVariable.ValueFound = LabelTBL.find { it.value.MainForm == FindValue }
			break

		default:
		WebUI.comment('Not found in the List!')

		break
}
