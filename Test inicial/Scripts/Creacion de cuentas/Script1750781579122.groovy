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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cb-bwx005-onboarding.brokerservers.com/#/login')

WebUI.setText(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/input_Sign in_form-control_1_2_3_4_5_6_7_8_9'), 
    'advisor')

WebUI.setEncryptedText(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/input_Sign in_form-control_1_2_3_4_5_6_7_8_9_10'), 
    '/oMO0e6/eqlEm/+HTn7Lxw==')

WebUI.click(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/button_Sign in'))

for (int i = 1; i <= 20; i++) {
    String nombreCuenta = 'CuentaNueva_1' + i

    String numeroCuenta = '46233' + String.format('%03d', i)

    WebUI.comment((('Creando cuenta: ' + nombreCuenta) + ' con número: ') + numeroCuenta)

    WebUI.delay(2)

    WebUI.waitForElementVisible(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_New Account'), 10)

    WebUI.click(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/button_New Account'))

    WebUI.delay(2)

    WebUI.waitForElementVisible(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/NombreCuenta'), 20)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/NombreCuenta'))

    WebUI.setText(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/NombreCuenta'), nombreCuenta)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Number_form-control'))

    WebUI.setText(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/input_Number_form-control'), 
        numeroCuenta)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/select_PYGUSDEURBRLARS'), 
        '2', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/select_GeneralMesa de TradingRecursos Human_5d0846'), 
        '1', true)

    WebUI.waitForElementVisible(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), 5)

    //WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', [findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput')])
    //WebUI.scrollToElement(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), 5)
    //WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'))
    //WebUI.setText(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), 'cuentanueva@gmail.com')
    // Convertí el TestObject a WebElement
    WebElement emailInputElement = WebUiCommonHelper.findWebElement(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), 
        10)

    // Scroll con JavaScript
    WebUI.executeJavaScript('arguments[0].scrollIntoView(true);', [emailInputElement])

    WebUI.delay(2)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'))
	
	String email = 'cuentanueva' + i + '@gmail.com'

    WebUI.sendKeys(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), email)

    WebUI.sendKeys(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/EmailInput'), Keys.TAB.toString( // simula salir del campo
            ))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Creacion cuentas/Page_Brokerware OnboardingX/button_Save'))

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Next'))

    WebUI.waitForElementVisible(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Add_New_Holder'), 5)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Add_New_Holder'))

    WebUI.waitForElementVisible(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Holder'), 10)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Holder'))

    WebUI.sendKeys(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/input_Holder'), 'p')

    TestObject opcionLista = new TestObject()

    opcionLista.addProperty('xpath', ConditionType.EQUALS, '//ul[contains(@style,\'position\')]/li[1]')

    WebUI.waitForElementVisible(opcionLista, 5)

    WebUI.click(opcionLista)

    WebUI.delay(2)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Save_Holder'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/flecha_holder'), 10)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/flecha_holder'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/candado_holder'), 5)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/candado_holder'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/checkbox_main_holder'), 10)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/checkbox_main_holder'))

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/candado_holder'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Save'), 10)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Save'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Next'), 5)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Next'))

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Next'))

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_Next'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_create_account'), 
        5)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_create_account'))

    WebUI.waitForElementClickable(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_confirm_account'), 
        0)

    WebUI.click(findTestObject('Creacion cuentas/Page_Brokerware OnboardingX/button_confirm_account'))

    WebUI.waitForAlert(10)

    WebUI.acceptAlert()
}

