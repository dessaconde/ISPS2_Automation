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
	(45) : [('eotType') : 'Submission of FSI Report'],
	(46) : [('DForm') : 'D3'],
	(47) : [('DForm') : 'D4'],
	(48) : [('DForm') : 'D5'],
	(49) : [('DForm') : 'D6'],
	(50) : [('DForm') : 'D7'],
	(51) : [('ReportType') : 'Visual Inspection Report'],
	(52) : [('ReportType') : 'Supplementary Visual Inspection Report'],
	(53) : [('ReportType') : 'Supplementary Visual Inspection Report 2'],
	(54) : [('ReportType') : 'Full Structural Inspection Report'],
	(55) : [('ReportType') : 'Supplementary Full Structural Inspection Report'],
	(56) : [('ReportType') : 'Supplementary Full Structural Inspection Report 2'],
	(57) : [('ReportType') : 'Audit Report'],
	(58) : [('ReportType') : 'Site Inspection Report'],
	(59) : [('ModuleNm') :'PSI'],
	(60) : [('ModuleNm') :'ENF'],
	(61) : [('ModuleNm') :'SD'],
	(62) : [('ModuleNm') :'FM'],
	(63) : [('PSI') :'Corres-Request for Extension of Time (CORRES-PSI-EXT)'],
	(64) : [('PSI') :'Corres-General Correspondence (CORRES-PSI-GC)'],
	(65) : [('PSI') :'Corres-Request for Submission Withdrawal (CORRES-PSI-SUBWTH)'],
	(66) : [('PSI') :'Bldg Rec Upload (PSI-UPLD)'],
	(67) : [('PSI') :'PSI Processing (SM)'],
	(68) : [('PSI') :'PSI Audit Processing (SM_A)'],
	(69) : [('PSI') :'PSI Ad Hoc Processing (SM_AH)'],
	(70) : [('PSI') :'PSI-TOPCSC Interface (SM_TC1)'],
	(71) : [('PSI') :'PSI-TOPCSC Processing (SM_TC2)'],
	(72) : [('PSI') :'Appointment of SE under S28 (SM1)'],
	(73) : [('PSI') :'SM1-CR (SM1-CR)'],
	(74) : [('PSI') :'Visual Inspection Report under S28 (SM2)'],
	(75) : [('PSI') :'SM2-CR (SM2-CR)'],
	(76) : [('PSI') :'Visual Insp Report under S28 - Suspected Defects (SM3)'],
	(77) : [('PSI') :'SM3-CR (SM3-CR)'],
	(78) : [('PSI') :'Localised or Full Stru Investigation Rpt under S28 (SM4)'],
	(79) : [('PSI') :'SM4-CR (SM4-CR)'],
	(80) : [('PSI') :'Loc or Full Stru Inv Rpt S28 - Suspected Stru Def (SM5)'],
	(81) : [('PSI') :'SM5-CR (SM5-CR)'],
	(82) : [('PSI') :'Visual Inspection Certification (SM6)'],
	(83) : [('PSI') :'SM6-CR (SM6-CR)'],
	(84) : [('PSI') :'PSI Ad Hoc Processing (SMAH)'],
	(85) : [('PSI') :'Bldg Rec Upload (SMB_UP1)'],
	(86) : [('PSI') :'View/Edit Bldg (SMB_UP2)'],
	(87) : [('PSI') :'ST-PSI Processing (ST_PSI)'],
	(88) : [('ENF') :'Corres-General Correspondence (CORRES-ENF-GC)'],
	(89) : [('ENF') :'Corres-Request for Submission Withdrawal (CORRES-ENF-SUBWTH)'],
	(90) : [('ENF') :'Enforcement Processing (ENF)'],
	(91) : [('ENF') :'Enforcement - Fire and Surveilence (ENF_EFS)'],
	(92) : [('ENF') :'Enforcement - Master Folder (BSPS) (ENF_EM)'],
	(93) : [('ENF') :'Enforcement - Monitoring (ENF_EMF)'],
	(94) : [('ENF') :'Enforcement Ad Hoc Processing (ENFAH)'],
	(95) : [('ENF') :'ST-ENF Processing (ST_ENF)'],
	(96) : [('SD') :'Corres-General Correspondence (CORRES-SD-GC)'],
	(97) : [('SD') :'Corres-Request for Submission Withdrawal (CORRES-SD-SUBWTH)'],
	(98) : [('SD') :'Dangerous Building Processing (SD)'],
	(99) : [('SD') :'Dangerous Building - Monitoring (SD_SDM)'],
	(100) : [('SD') :'Process SD Submission (SD1)'],
	(101) : [('SD') :'Dangerous Building Ad Hoc Processing (SDAH)'],
	(102) : [('SD') :'ST-SD Processing (ST_SD)'],
	(103) : [('FM') :'Feedback Processing (FM)'],
	(104) : [('PresINd') : 'Yes'],
	(105) : [('PresINd') : 'No'],
	(106) : [('DecisionTo') : 'Approved'],
	(107) : [('DecisionTo') : 'Disapproved'],
	(108) : [('Actions') : 'Remove Work Item'],
	(109) : [('CommonINd') : 'Yes'],
	(110) : [('CommonINd') : 'No'],
	(111) : [('QpType') : 'A'],
	(112) : [('QpType') : 'P']
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
	case 'DForm':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.DForm == FindValue }

		break
	case 'ReportType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ReportType == FindValue }

		break
	case 'ModuleNm':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ModuleNm == FindValue }

		break
	case 'PSI':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.PSI == FindValue }

		break
	case 'ENF':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.ENF == FindValue }

		break
	case 'SD':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.SD == FindValue }

		break
	case 'FM':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.FM == FindValue }

		break
	case 'PresINd':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.PresINd == FindValue }

		break
	case 'DecisionTo':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.DecisionTo == FindValue }
		
		break
	case 'Actions':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.Actions == FindValue }
		
		break
	case 'CommonINd':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.CommonINd == FindValue }
		
		break
	case 'QpType':
		GlobalVariable.ValueFound = ConstantTBL.find { it.value.QpType == FindValue }
		
		break
	default:
		WebUI.comment('Not found in the List')

		break
}
