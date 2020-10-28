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

/*================================================================*
 * COMPONENT NAME: ConstantHashMap				                  *
 * TESTER: Rhodessa Conde                                         *
 * CREATE DATE: 15-May-2020                                       *
 * PURPOSE: This is to find the constant values in HashMap tables *
 * ===============================================================*
 */

def ConstantTBL = [(1) : [('PeriodType') : 'Working Day(s)'],
	(2) : [('PeriodType') : 'Calendar Day(s)'],
	(3) : [('PeriodType') : 'Month(s)'],
	(4) : [('TypeOfLetter') : 'T1'],
	(5) : [('TypeOfLetter') : 'eT1'],
	(6) : [('AOStatus') : '\'T2\''],
	(7) : [('AOStatus') : '\'T3\''],
	(8) : [('AOStatus') : '\'T3*\''],
	(9) : [('AOStatus') : '\'T4\''],
	(10) : [('AOStatus') : '\'T5\''],
	(11) : [('AOStatus') : '\'T6\''],
	(12) : [('AOStatus') : '\'T7\''],
	(13) : [('AOStatus') : '\'T7C\''],
	(14) : [('AOStatus') : '\'TD\''],
	(15) : [('AOStatus') : '\'TG\''],
	(16) : [('AOStatus') : '\'TGC\''],
	(17) : [('AOStatus') : '\'TV\''],
	(18) : [('AOStatus') : '\'TW\''],
	(19) : [('AOStatus') : '\'eT2\''],
	(20) : [('AOStatus') : '\'eT3\''],
	(21) : [('AOStatus') : '\'eT4\''],
	(22) : [('AOStatus') : '\'eT5\''],
	(23) : [('AOStatus') : '\'eT6\''],
	(24) : [('AOStatus') : '\'eT7\''],
	(25) : [('AOStatus') : '\'eT7C\''],
	(26) : [('AOStatus') : '\'TNC\''],
	(27) : [('AOStatus') : 'N'],
	(28) : [('GrdType') : 'A'],
	(29) : [('GrdType') : 'B'],
	(30) : [('GrdType') : 'C'],
	(31) : [('GrdType') : 'D'],
	(32) : [('RecommendType') : 'Recommend'],
	(33) : [('RecommendType') : 'Reply'],
	(34) : [('OrderType') : 'Section 13'],
	(35) : [('OrderType') : 'Section 19'],
	(36) : [('OrderType') : 'Section 25'],
	(37) : [('OrderType') : 'Section 43'],
	(38) : [('OrderType') : 'Section 5'],
	(39) : [('OrderType') : 'Section 23'],
	(40) : [('OrderType') : 'Section 24'],
	(41) : [('OrderType') : 'Section 28'],
	(42) : [('eotType') : 'Appointment of PE for Visual Inspection'],
	(43) : [('eotType') : 'Appointment of PE for FSI'],
	(44) : [('eotType') : 'Submission of VIR'],
	(45) : [('eotType') : 'Submission of FSI Report']
]

switch (DropdownNm) {
	case 'PeriodType':
		GlobalVariable.ValueFound = ConstantTBL.find({
				it.value.PeriodType == FindValue
			})
		
		break
	case 'TypeOfLetter':
		GlobalVariable.ValueFound = ConstantTBL.find({
				it.value.TypeOfLetter == FindValue
			})
		break
	case 'AOStatus':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.AOStatus == FindValue }

		break
	case 'GrdType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.GrdType == FindValue }

		break
	case 'RecommendType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.RecommendType == FindValue }

		break
	case 'OrderType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.OrderType == FindValue }

		break
	case 'eotType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.eotType == FindValue }

		break
	default:
		WebUI.comment('Not found in the List')

		break
}
