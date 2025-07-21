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


String usuario = Username
String clave = Password

WebUI.waitForPageLoad(10)
WebUI.delay(3)

TestObject inputUsuario = findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Sign in_form-control_1_2_3_4_5_6_7_8_9')
TestObject inputClave = findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Sign in_form-control_1_2_3_4_5_6_7_8_9_10')
TestObject botonLogin = findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Sign in')


WebUI.waitForElementClickable(inputUsuario, 10)

WebUI.setText(inputUsuario, usuario)

WebUI.waitForElementClickable(inputClave, 10)

WebUI.setText(inputClave, clave)

WebUI.waitForElementClickable(botonLogin, 10)

WebUI.click(botonLogin)

