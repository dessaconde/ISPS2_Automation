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
import java.util.*
import org.openqa.selenium.Keys as Keys

Thread.sleep(1000)

def OfficerLists = [(1) : 'Aaron Sham Wai Lun (AARON)', (2) : 'Azidah Bte Akmad (Mdm) (USAABD)', (3) : 'Chung Fong Nyen (USACFN)'
    , (4) : 'David Tey Dah Wei (DAHWEI)', (5) : 'Han Wann Kuang (WANNKUANG)', (6) : 'Ho You Leong (YOULEONG)', (7) : 'Joseph Lim Pheng Weng (PHENGWENG)'
    , (8) : 'Joyce Lee (USASLL)', (9) : 'Kaliannan Thanabal (KALIANN)', (10) : 'Lim Beng Kwee (BENGKWEE)', (11) : 'Lim Leng Boon (LENGBOON)'
    , (12) : 'Loh Lee Fong (LEEFONG)', (13) : 'Lu Ji Ju (Mdm) (USALJJ)', (14) : 'Mohd Jeffri Bin Abdul Rahim (MOHDJEFFRI)'
    , (15) : 'Mohd Jumat Bin Haji Mohd Hassan (MOHDJUMAT)', (16) : 'Ng Seh Luh (USANSL)', (17) : 'Richard Lim Fang Ping (FANGPING)'
    , (18) : 'RITA WONG SIONG ING (RITAWONG)', (19) : 'Shi Hong Wei (HONGWEI)', (20) : 'Sulaiman Bin Ahmad (USABAS)', (21) : 'Tan Kwan Joo (KWANJOO)'
    , (22) : 'Wong Swee Sheng (WONGSWEE)', (23) : 'Yeo Siew Juay (SIEWJUAY)', (24) : 'Zhao Dianfeng (DIANFENG)', (25) : 'Christopher ANG (CHRISANG)']

GlobalVariable.ValueFound = OfficerLists.find({ 
        it.value == FindValue
    })

if (GlobalVariable.ValueFound == null){
	
	GlobalVariable.ValueFound = 'Not in the List'
}