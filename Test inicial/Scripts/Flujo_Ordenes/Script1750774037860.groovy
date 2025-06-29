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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cb-bwx005-advisor.brokerservers.com/#/login')

WebUI.waitForElementClickable(findTestObject('Flujos ordenes/Page_Brokerware AdvisorX/input_Sign in_form-control_1_2_3_4_5_6_7'), 
    10)

WebUI.delay(0.5)

WebUI.sendKeys(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Sign in_form-control_1_2_3_4_5_6_7'), 
    'advisor')

WebUI.setEncryptedText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Sign in_form-control_1_2_3_4_5_6_7_8'), 
    '/oMO0e6/eqlEm/+HTn7Lxw==')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/span_Sign in'))

WebUI.waitForElementClickable(findTestObject('Flujos ordenes/Page_Brokerware AdvisorX/boton mas'), 
    10)

WebUI.mouseOver(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/boton mas'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Account_Autosuggest-module_input_FS44_102e65'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Account_Autosuggest-module_input_FS44_102e65_1'), 
    '8')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Account_Autosuggest-module_input_FS44_102e65_1_2'), 
    '84')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Account_Autosuggest-module_input_FS44_102e65_1_2_3'), 
    '845')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/span_Cuenta 845'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Symbol_Autosuggest-module_input_FS44I_2bc598'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Symbol_Autosuggest-module_input_FS44I_2bc598_1'), 
    'P')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/div_PYCII01F5636 - CORPORACION INTERAMERICA_efa9da'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Quantity_form-control'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/input_Quantity_form-control_1'), 
    '2')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/i_Attachment (Max 3MB)_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/div_Attachment_modal-body'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_f'), 'f')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_ff'), 'ff')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_fff'), 'fff')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_ffff'), 'ffff')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_fffff'), 'fffff')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/button_Save'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/div_Other_Account-module_checkbox_2AjVM'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/span_Pre check'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_h'), 'h')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_hh'), 'hh')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/textarea_hhh'), 'hhh')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware AdvisorX/span_Confirm'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/input_Sign in_form-control'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/input_Sign in_form-control_1'), 'o')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/input_Sign in_form-control_1_2'), 'op')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/input_Sign in_form-control_1_2_3'), 
    'ops')

WebUI.setEncryptedText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/input_Sign in_form-control_1_2_3_4'), 
    '/oMO0e6/eqlEm/+HTn7Lxw==')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/i_Authorizations_icon-bell'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/p_Error, insufficient funds (Total2018140.0_31c818'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware OpsX/button_Authorize'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/div_Sign In to your accountSign inForgot pa_f4e53b'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/div_Sign In to your accountSign inForgot pa_f4e53b'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control'), 'r')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1'), '')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control'), 't')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2'), 
    'tr')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2_3'), 
    'tra')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2_3_4'), 
    'trad')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2_3_4_5'), 
    'trade')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2_3_4_5_6'), 
    'trader')

WebUI.setEncryptedText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Sign in_form-control_1_2_3_4_5_6_7'), 
    '/oMO0e6/eqlEm/+HTn7Lxw==')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Ack'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Execs'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/label_Price (PYG)'))

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Price (PYG)_form-control'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Price (PYG)_form-control_1'), 
    '15')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Price (PYG)_form-control_1_2'), 
    '150')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Price (PYG)_form-control'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Counterparty_Autosuggest-module_input_39ea6e'), 
    'al')

WebUI.setText(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/input_Counterparty_Autosuggest-module_input_39ea6e_1'), 
    'all')

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/span_ALLFUNDS INTERNATIONAL S.A'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Confirm execution'))

WebUI.click(findTestObject('Object Repository/Flujos ordenes/Page_Brokerware TraderX/button_Close'))

