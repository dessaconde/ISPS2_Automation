import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

Thread.sleep(3000)

formattedDate = new Date().format('hh:mm')

WebUI.setText(findTestObject('Objects.PopulateEnquireAuditTrail/input_Subject Reference Number_caseRefNo'), GlobalVariable.CRN, 
    FailureHandling.OPTIONAL)

formattedDate = new Date().format('dd/MM/yyyy')

GlobalVariable.currentDate = formattedDate

Thread.sleep(4000)

WebUI.setText(findTestObject('Objects.PopulateEnquireAuditTrail/input__dtFrom'), formattedDate)

WebUI.setText(findTestObject('Objects.PopulateEnquireAuditTrail/input__dtTo'), formattedDate)

WebUI.setText(findTestObject('Objects.PopulateEnquireAuditTrail/input_Module_module'), module, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Objects.PopulateEnquireAuditTrail/input_Function ID_function'), functionid, FailureHandling.OPTIONAL)

