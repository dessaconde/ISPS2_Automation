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

/* =================================================================
 * TESTER: Rhodessa Conde
 * CREATED DATE: 27-May-2020
 * PURPOSE: This is the hashmap table for lists of Road
 *  =================================================================
 */

Thread.sleep(1000)

def RoadTBL = [
	(6981) : '12121212121212 (121212)',
	(6980) : '2322434234 (32323)',
	(6978) : '234234234234 (232424)',
	(2595) : 'ABBOTSINGH ROAD (ABB00H)',
	(2615) : 'ABINGDON ROAD (ABI00L)',
	(2591) : 'ACCESS ROAD (ACC00Y)',
	(2605) : 'ADAM DRIVE (ADD00H)',
	(2601) : 'ADAM PARK (ADP00K)',
	(2592) : 'ADAM ROAD (ADA00H)',
	(2597) : 'ADIS ROAD (ADI00Y)',
	(2606) : 'ADMIRALTY DRIVE (ADD01P)',
	(2598) : 'ADMIRALTY LANE (ADL00K)',
	(2599) : 'ADMIRALTY LINK (ADL01U)',
	(2600) : 'ADMIRALTY ROAD (ADM00K)',
	(2596) : 'ADMIRALTY ROAD EAST (ADE02U)',
	(2604) : 'ADMIRALTY ROAD WEST (ADW00K)',
	(2603) : 'ADMIRALTY STREET (ADS00N)',
	(6952) : 'ADUR AVENUE - PULAU BRANI (ADB00Y)',
	(6953) : 'ADUR ROAD - PULAU BRANI (ADB01L)',
	(2608) : 'AH HOOD ROAD (AHH00K)',
	(2612) : 'AH SOO GARDEN (AHG00Y)',
	(2631) : 'AH SOO WALK (AHW00Y)',
	(6954) : 'AHMADIYYA CEMETERY PATH 1 (AHP00D)',
	(2637) : 'AIDA STREET (AIS00U)',
	(2634) : 'AIK HOE ROAD (AIH00U)',
	(4894) : 'AIR BASE ROAD (ZZZ99G)',
	(2635) : 'AIRLINE ROAD (AIR00U)',
	(2632) : 'AIRPORT BOULEVARD (AIB00L)',
	(2633) : 'AIRPORT CARGO ROAD (AIC00K)',
	(4937) : 'AIRPORT LINK (ZZZ87F)',
	(2636) : 'AIRPORT ROAD (AIR01Y)',
	(2589) : 'AKYAB ROAD (AKY00H)',
	(6943) : 'ALBERT DOCK (ALD00K)',
	(2584) : 'ALBERT STREET (ALS01K)',
	(3) : 'ALBERT WINSEMIUS LANE (ALL02Y)',
	(6944) : 'ALDE ROAD - PULAU BRANI (ALB00U)',
	(2643) : 'ALDERGROVE (ALD01U)',
	(2590) : 'ALEXANDRA AVENUE (ALA00U)',
	(6946) : 'ALEXANDRA CLOSE (ALC00Y)',
	(6938) : 'ALEXANDRA LANE (ALL00U)',
	(6942) : 'ALEXANDRA ROAD (ALE00N)',
	(6936) : 'ALEXANDRA TERRACE (ALT00Q)',
	(6937) : 'ALEXANDRA VIEW (ALV00A)',
	(2585) : 'ALIWAL STREET (ALS02Q)',
	(2625) : 'ALJUNIED AVENUE 1 (ALA04W)',
	(2626) : 'ALJUNIED AVENUE 2 (ALA05S)',
	(2627) : 'ALJUNIED AVENUE 3 (ALA06H)',
	(2628) : 'ALJUNIED AVENUE 4 (ALA07W)',
	(2629) : 'ALJUNIED AVENUE 5 (ALA08L)',
	(2639) : 'ALJUNIED CRESCENT (ALC02U)'
	]

'Search the entered value in the table'
GlobalVariable.ValueFound = RoadTBL.find({ 
        it.value == FindValue
    })

if (GlobalVariable.ValueFound == null){
	
	GlobalVariable.ValueFound = 'Not in the Road List'
	
}