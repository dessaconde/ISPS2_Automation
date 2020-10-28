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

Thread.sleep(1000)

def ExtAgencyTBL = [
	(1) : 'HDB',
	(2) : 'AVA',
	(3) : 'CAAS',
	(4) : 'DSTA',
	(5) : 'EXXONMOBIL',
	(6) : 'Embassy',
	(7) : 'JTC Cat 1A',
	(8) : 'MBS- Marina Bay Sands',
	(9) : 'MCYS',
	(10) : 'MICA',
	(11) : 'MUIS',
	(12) : 'Ministry of Defence',
	(13) : 'Ministry of Education',
	(14) : 'Ministry of Foreign Affairs',
	(15) : 'Ministry of Health',
	(16) : 'Ministry of Home Affairs',
	(17) : 'National Environment Agency',
	(18) : 'National Heritage Board',
	(19) : 'National Parks Board',
	(20) : 'POWER GRID',
	(21) : 'PUB, the National Water Agency',
	(22) : 'People\'s Association',
	(23) : 'Polytechnic',
	(24) : 'Port of Singapore Authority',
	(25) : 'RWS - Resorts World Sentosa',
	(26) : 'S\'pore Sports Council',
	(27) : 'SENTOSA',
	(28) : 'SHELL',
	(29) : 'SPC',
	(30) : 'University',
	(31) : 'JTC Cat 1',
	(32) : 'JTC Cat 2',
	(33) : 'LTA',
	(34) : 'Singapore Land Authority'
	]

GlobalVariable.ValueFound = ExtAgencyTBL.find({
	it.value == FindValue
})