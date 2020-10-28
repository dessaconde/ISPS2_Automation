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
import groovy.io.FileType as FileType

//Component Name: ManipulateAttachExternalDocument
//Author: Shayne Cardona
//Purpose: To add and delete files from Attach External Document section


'Wait 1 second.'
Thread.sleep(1000)

'Access project directory.'
String userDir = System.getProperty('user.dir')

'Wait 3 second.'
Thread.sleep(3000)

'Click Attach External Document.'
WebUI.click(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/a_Attach External Document'))

'Wait 1 second.'
Thread.sleep(1000)

'Declare the files to be uploaded.'
multiUpload = ((((((((((((((((((((((userDir + '/Data Files/Files/jpg.jpg') + '\n') + userDir) + '/Data Files/Files/pdf.pdf') + 
'\n') + userDir) + '/Data Files/Files/ppt.ppt') + '\n') + userDir) + '/Data Files/Files/test.ent') + '\n') + userDir) + 
'/Data Files/Files/txt.txt') + '\n') + userDir) + '/Data Files/Files/docx.docx') + '\n') + userDir) + '/Data Files/Files/xls.xls') + 
'\n') + userDir) + '/Data Files/Files/png.png')

'Wait 3 second.'
Thread.sleep(3000)

'Upload multiple files.'
WebUI.uploadFile(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/XPA_Add File(s)'), multiUpload)

'Wait 7 seconds.'
Thread.sleep(7000)

'Verify the file is ready for upload.'
WebUI.verifyTextPresent('Ready', false)

'Get the filename.'
jpgFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_jpgjpg'))

'Get the filename.'
pdfFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_pdfpdf'))

'Get the filename.'
pptFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_pptppt'))

'Get the filename.'
entFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_testent'))

'Get the filename.'
txtFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_txttxt'))

'Get the filename.'
docxFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_worddocx'))

'Get the filename.'
xlsFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_xlsxls'))

'Get the filename.'
pngFile = WebUI.getText(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_pNGpng'))

'Wait for 3 seconds.'
Thread.sleep(3000)

'Click Start Upload.'
WebUI.click(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/XPA_Start Upload'))

'Wait 7 seconds.'
Thread.sleep(7000)

'Verify the file upload was complete.'
WebUI.verifyTextPresent('Completed', false)

'Mouse over the selected file.'
WebUI.mouseOver(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_pNGpng'))

'Wait for 3 seconds.'
Thread.sleep(3000)

'Click the file.'
CustomKeywords.'com.reusableComponents.clickUsingJS.clickUsingJS'(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/div_pNGpng'), 
    0)

'Wait 1 second.'
Thread.sleep(1000)

'Click remove files.'
WebUI.click(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/span_Remove File(s)'))

'Wait 3 second.'
Thread.sleep(3000)

'Click continue.'
WebUI.click(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/span_Continue'))

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(jpgFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(pdfFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(pptFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(entFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(txtFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(docxFile, false)

'Verify the added file is displayed on the Attach External Document table.'
WebUI.verifyTextPresent(xlsFile, false)

'Verify the file is not displayed on the Attach External Document table.'
WebUI.verifyTextNotPresent(pngFile, false)

//Verify multiple files can be uploaded
//END
'Wait 3 second.'
Thread.sleep(3000)

'Verify deletion of added files on the table are allowed.'
WebUI.click(findTestObject('Objects.ManipulateAttachExternalDocument/Page_ISPS2/Page_ISPS2/XPA_deleteJPG'))

'Wait until the element \'generating letter\' is no longer present.'
WebUI.waitForElementNotPresent(findTestObject('Objects.ManipulateTypeOfLetter/Page_ISPS2/div_Generating letter'), 120, FailureHandling.CONTINUE_ON_FAILURE)

'Verify that the selected file name is no longer present.'
WebUI.verifyTextNotPresent(jpgFile, false)

'Wait 10 seconds.'
Thread.sleep(10000)

