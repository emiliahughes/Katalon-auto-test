import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.openqa.selenium.Keys
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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.testobject.ConditionType
import groovy.json.JsonSlurper
import onboarding.PersonaFinalizer



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cb-bwx002-onboarding.brokerservers.com/#/login')

WebUI.callTestCase(findTestCase('LoginBW'), 
	['Username':'advisor',
	'Password': 'BwInicial2024!'],
	FailureHandling.STOP_ON_FAILURE)


WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_people'), 20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_people'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_new_person'), 20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_new_person'))

if (tipoPersona.equalsIgnoreCase('minima')) {
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_minimal'), 20)
	
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_minimal'))
}

if(['juridica', 'juridical'].any {it.equalsIgnoreCase(tipoPersona)}) {
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_tipo_persona_juridica'), 20)
	
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_tipo_persona_juridica'))
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_type_document_juridical'), 20)
	
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_type_document_juridical'))
		
	WebUI.selectOptionByLabel(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_type_document_juridical'), typeDocumentJuridical,
		false)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_tax'), 20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_tax'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_tax'), tax)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'),20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'))
	
	if (WebUI.waitForAlert(10, FailureHandling.OPTIONAL)) {
		WebUI.acceptAlert()
		WebUI.delay(1) // darle un pequeño respiro al navegador
	}
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'), 20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'), legalName)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'), 20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_name'), legalName)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'),20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'))
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_entity_type'),20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_entity_type'))
	WebUI.selectOptionByLabel(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_entity_type'), entityType, false)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_society_type'),20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_society_type'))
	WebUI.selectOptionByLabel(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_society_type'), societyType, false)
	
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'),20)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'))
	
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'), Keys.chord(Keys.CONTROL, "a"))
	
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'), constitutionDate)
	
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_constitution_date'), Keys.chord(Keys.ENTER))
	
	
	/////Constitution Place:
	WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_constitution_place'),
		15)
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_constitution_place'),
		15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_constitution_place'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_constitution_place'), constitutionPlace)
	WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_constitution_place',
			[('constitutionPlace') : constitutionPlace]), 15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_constitution_place', [('constitutionPlace') : constitutionPlace]))
	WebUI.waitForElementNotPresent(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_constitution_place', [('constitutionPlace') : constitutionPlace]), 5)
	
	
	/////Email:
	WebElement emailInputElement = WebUiCommonHelper.findWebElement(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), 10)
	// Scroll con JavaScript
	//WebUI.executeJavaScript('arguments[0].scrollIntoView({block: \'center\'});', [emailInputElement])
	WebUI.delay(2)
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), 15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'))
	String emailEmpresa = 'empresanueva@gmail.com'
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), emailEmpresa)
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), Keys.TAB.toString( // simula salir del campo
			))
	WebUI.delay(2)
	
	////Issue Place
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_issue_place'), 15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_issue_place'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_issue_place'), issuePlace)
	
	////Share Type
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'), 15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'), shareType)
	
	////
	WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'), 15)
	WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'))
	WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_share_type'), shareType)
	
	
} 

if(['minima', 'phyisical', 'fisica'].any {it.equalsIgnoreCase(tipoPersona)}) {
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_document_number'), 
    20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_document_number'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_document_number'), documentNumber)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'), 
    20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_check_document'))

WebUI.waitForAlert(20)

WebUI.acceptAlert()

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_first_name'), 10)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_first_name'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_first_name'), primerNombre)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_second_name'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_second_name'), segundoNombre)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_first_last_name'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_first_last_name'), primerApellido)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_second_last_name'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_second_last_name'), segundoApellido)

WebElement emailInputElement = WebUiCommonHelper.findWebElement(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), 
    10)

// Scroll con JavaScript
WebUI.executeJavaScript('arguments[0].scrollIntoView({block: \'center\'});', [emailInputElement])

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'))

String email = 'personanueva@gmail.com'

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), email)

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_email'), Keys.TAB.toString( // simula salir del campo
        ))

WebUI.delay(2)

if ('fisica'.equalsIgnoreCase(tipoPersona) || 'physical'.equalsIgnoreCase(tipoPersona)) {
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_gender'), 10)

WebUI.selectOptionByValue(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_gender'), 'M', false)

///////////Country
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_country_of_birth'), 
    10)

//leo el valor actual
String currentValue = WebUI.getAttribute(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_country_of_birth'), 
    'value')

// Chequear si está vacío
if ((currentValue == null) || (currentValue.trim() == '')) {
    // Hacer click para abrir el campo
    WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_country_of_birth'))

    // Escribir Paraguay
    WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_country_of_birth'), 'paraguay')

    // Esperar y seleccionar primera opción
    TestObject opcionLista = new TestObject()

    opcionLista.addProperty('xpath', ConditionType.EQUALS, '//ul[contains(@style,\'position\')]/li[1]')

    WebUI.waitForElementVisible(opcionLista, 5)

    WebUI.click(opcionLista)
} else {
    println("Campo 'country_of_birth' ya tiene valor: $currentValue — no se modifica.")
}

///Fin Country
///////////City
// 1) Abrir dropdown
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_city_of_birth'), 
    10)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_city_of_birth'))

// 2) Buscar input dentro del dropdown
TestObject cityBuscador = new TestObject()

cityBuscador.addProperty('xpath', ConditionType.EQUALS, '//label[text()=\'City of Birth: \']/following::div[contains(@class,\'CustomDropdown-module_dropdownContent\')]//input[@type=\'text\']')

WebUI.waitForElementClickable(cityBuscador, 10)

WebUI.sendKeys(cityBuscador, 'Fuerte')

WebUI.delay(1)

// 3) Crear el TestObject para la opción filtrada <p>
TestObject cityOption = new TestObject()

cityOption.addProperty('xpath', ConditionType.EQUALS, '//label[text()=\'City of Birth: \']/following::div[contains(@class,\'CustomDropdown-module_dropdownContent\')]//p[contains(text(),\'Fuerte Olimpo\')]')

WebUI.waitForElementClickable(cityOption, 10)

WebUI.click(cityOption)

}

/// Fin City
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_nacionalidad'), 10)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_nacionalidad'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_nacionalidad'), nacionalidad)


if (['physical', 'fisica'].any { it.equalsIgnoreCase(tipoPersona) }) {
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_civil_status'), 10)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_civil_status'))

WebUI.selectOptionByValue(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_civil_status'), civilStatus, 
    false)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_profession'), 10)

WebUI.selectOptionByLabel(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_profession'), profession, 
    false)
}


if (['physical', 'fisica', 'juridical', 'juridica'].any { it.equalsIgnoreCase(tipoPersona) }) {
////////////CAMPO Activity Sector
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_activity_sector'), 10)
WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_activity_sector'))

////////////Buscador Activity Sector
TestObject activitySectorBuscador = new TestObject()
activitySectorBuscador.addProperty('xpath', ConditionType.EQUALS, '//label[text()=\'Activity Sector: \']/following-sibling::div[@class=\'CustomDropdown-module_dropdownContent_3o0l3\']/input')
WebUI.waitForElementClickable(activitySectorBuscador, 15)

WebUI.click(activitySectorBuscador)
WebUI.sendKeys(activitySectorBuscador, activitySector)
WebUI.delay(1)

///Opcion de Activity Sector
TestObject activityOption = new TestObject()

String xpathOpcionAS = ('//label[contains(text(),\'Activity Sector\')]/following::div[contains(@class,\'CustomDropdown-module_dropdownContent\')]//p[contains(text(),\'' + 
activitySector) + '\')]'
activityOption.addProperty('xpath', ConditionType.EQUALS, xpathOpcionAS)
WebUI.waitForElementClickable(activityOption, 15)
WebUI.click(activityOption)

////////Campo Secondary Activity Sector
boolean isPresent = WebUI.verifyElementPresent(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_secondary_activity_sector'), 
    10, FailureHandling.OPTIONAL)

if (isPresent) {
    // Si está presente, esperar que sea clickeable y hacer click
    WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_secondary_activity_sector'), 
        10)

    WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/dropdown_secondary_activity_sector'))

    TestObject secondaryActivitySectorBuscador = new TestObject()

    secondaryActivitySectorBuscador.addProperty('xpath', ConditionType.EQUALS, '//label[text()=\'Secondary Activity Sector: \']/following-sibling::div[@class=\'CustomDropdown-module_dropdownContent_3o0l3\']/input')

    WebUI.waitForElementClickable(secondaryActivitySectorBuscador, 15)

    WebUI.click(secondaryActivitySectorBuscador)

    WebUI.sendKeys(secondaryActivitySectorBuscador, activitySector)

    WebUI.delay(2)

    ///Opcion de Secondary Activity Sector
    TestObject secondaryActivityOption = new TestObject()

    String xpathOpcionSAS = ('//label[contains(text(),\'Secondary Activity Sector\')]/following::div[contains(@class,\'CustomDropdown-module_dropdownContent\')]//p[contains(text(),\'' + 
    activitySector) + '\')]'

    secondaryActivityOption.addProperty('xpath', ConditionType.EQUALS, xpathOpcionSAS)

    WebUI.waitForElementClickable(secondaryActivityOption, 15)

    WebUI.click(secondaryActivityOption)
} else {
    WebUI.comment('Campo sector de actividad secundaria NO presente. Se omite.')
}
}
}

//////////////////////Person Qualification:
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_person_qualification'), 
    15)

WebUI.selectOptionByValue(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_person_qualification'), 
    personQualification, false)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/checkbox_subasset'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/checkbox_subasset'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))

WebUI.delay(4)

//WebUI.executeJavaScript('window.scrollTo(0,0);', null)

//////TAB Profile
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_personid'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_personid'))

//si tipoPersona no es minima ==> equalsIgnoreCase no distingue mayusculas ni minusculas.
if (!tipoPersona.equalsIgnoreCase('minima')) {
//////TAB Archives
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_archives'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_archives'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_new_archive'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_new_archive'))

WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_file'), 15)

WebUI.uploadFile(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_file'), rutaArchive)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))

//////TAB Phones
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_phones'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_phones'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_phone'), 20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_phone'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_phone_number'), 20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_phone_number'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_phone_number'), phoneNumber)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 20)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_bank_accounts'), 15)

///// TAB BAnk Accounts
WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_bank_accounts'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_bank_account'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_bank_account'))

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_bank_account'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_bank_account'))

WebUI.selectOptionByLabel(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/select_bank_account'), bank, 
    false)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_personal_name'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_personal_name'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_personal_name'), personalNameBankAccount)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_holder_bankaccount'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_holder_bankaccount'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_holder_bankaccount'), holderBankAccount)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/branch_bank_account'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/branch_bank_account'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/branch_bank_account'), branchBankAccount)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/number_bank_account'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/number_bank_account'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/number_bank_account'), numberBankAccount)

WebUI.executeJavaScript('window.scrollBy(0, 500)', null)

WebUI.delay(2)
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))

WebUI.delay(2)

/////TAB KYC
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_kyc'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_kyc'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_comments_advisor'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_comments_advisor'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_comments_advisor'), commentsAdvisor)

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'), 10)
WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'))
WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'), Keys.chord(Keys.CONTROL, "a"))
WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'), Keys.chord(Keys.BACK_SPACE))
WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'), advisorDate)
WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_calendar_advisor_date'), Keys.chord(Keys.ENTER))


//scroll hacia el final
// Asegura que es clickable
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebElement saveButton = WebUiCommonHelper.findWebElement(
	findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'),
	15
)

// Forza scroll al botón
WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", [saveButton])

WebUI.delay(2) // para que se posicione bien

// Ahora sí, click
WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))

WebUI.delay(2)

//scroll hacia el principio
WebUI.executeJavaScript('window.scrollTo(0, 0)', null)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_legal_address'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_legal_address'))




WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_legal_address'), 
    15)


WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_add_legal_address'))


//////////////Legal Address Country
WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_country'), 
    15)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_country'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_country'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_country'), legalAddressCountry)

WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_country', 
        [('legalAddressCountry') : legalAddressCountry]), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_country', [('legalAddressCountry') : legalAddressCountry]))

WebUI.waitForElementNotPresent(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_country', [('legalAddressCountry') : legalAddressCountry]), 5)


/////////////Legal Address State
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_state'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_state'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_state'), legalAddressState)

WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_state', 
        [('legalAddressState') : legalAddressState]), 15)



WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_state', [('legalAddressState') : legalAddressState]))


WebUI.waitForElementNotPresent(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_state', [('legalAddressState') : legalAddressState]), 5)


//Legal Address City
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_city'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_city'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_city'), legalAddressCity)

WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_city', 
        [('legalAddressCity') : legalAddressCity]), 15)


WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_city', [('legalAddressCity') : legalAddressCity]))

WebUI.waitForElementNotPresent(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/desplegable_legal_address_city', [('legalAddressCity') : legalAddressCity]), 5)


//Legal Address Street:
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_street'), 
    15)


WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_street'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_street'), legalAddressStreet)

//Legal Address Number:
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_number'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_number'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_number'), legalAddressNumber)

//Legal Address Zip code:
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_zip_code'), 
    15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_zip_code'))

WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/input_legal_address_zip_code'), LegalAddressZipCode)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_save'))



}
////////// TAB Extended Data:
WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_extended_data'), 15)

WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_extended_data'))

////////// TAB Finalize + boton Create
// Primer intento de creación
CustomKeywords.'onboarding.PersonaFinalizer.finalizarCreacionPersona'(sitioCompliance, documentNumber)







