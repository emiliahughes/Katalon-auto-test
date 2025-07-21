package onboarding

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import internal.GlobalVariable


class PersonaFinalizer {

	@Keyword
	def finalizarCreacionPersona(String sitioCompliance, String documentNumber) {
		String usuario = ''
		String contrasena = ''
		boolean personaCreada = false
		String url = WebUI.getUrl()
		GlobalVariable.personaId = url.split('/')[5] // index 4 es el ID en esta estructura de URL


		while(!personaCreada) {
			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_finalize'), 15)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/tab_finalize'))

			WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)
			WebUI.delay(2)

			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_create_person'), 15)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_create_person'))

			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_confirm_create'), 30)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_confirm_create'))

			WebUI.waitForAlert(5)
			String alerta = WebUI.getAlertText()

			WebUI.delay(2)
			WebUI.acceptAlert()


			if(alerta.toLowerCase().contains('tobackoffice')){
				usuario = 'ops'
				contrasena = 'BwInicial2024!'
			} else if(alerta.toLowerCase().contains('compliance')) {
				usuario = 'compliance'
				contrasena = 'BwInicial2024!'
			} else if(alerta.toLowerCase().contains('ceo')) {
				usuario = 'ceo'
				contrasena = 'BwInicial2024!'
			} else if(alerta.toLowerCase().contains('created')) {
				usuario = 'compliance'
				contrasena = 'BwInicial2024!'
				personaCreada= true
			} else {
				WebUI.comment("⚠️ Alerta no reconocida: " + alerta)
				break
			}


			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_logout'),10)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_logout'))

			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/logout'),10)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/logout'))
			
			WebUI.delay(2)
			
			//Si la persona esta creada, redirijo al sitio de ComplianceX al usuario, para que verifique si la persona esta creada
			if(personaCreada) {
			WebUI.navigateToUrl(sitioCompliance)
			}
			
			//Login con otro usuario
			WebUI.callTestCase(findTestCase('LoginBW'),
					['Username': usuario ,
						'Password': contrasena],
					FailureHandling.STOP_ON_FAILURE)
			
			WebUI.delay(3)
						
			String urlActual = WebUI.getUrl()
			if (urlActual.toLowerCase().contains("login")) {
				WebUI.comment("⚠️ Redirigido a login, reintentando login...")
				WebUI.callTestCase(findTestCase('LoginBW'), ['Username': usuario, 'Password': contrasena], FailureHandling.STOP_ON_FAILURE)
			}else {
				WebUI.comment("El usuario sigue logueado correctamente")
			}

			String personaId = GlobalVariable.personaId
			WebUI.println(personaId)

			
			//click en boton People
			WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_people'), 20)
			WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/button_people'))
			
			//Si la persona esta creada ==> la busco en el buscador de Compliance por cedula
			if(personaCreada) {
				WebUI.waitForElementClickable(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/barra_buscador'),15)
				WebUI.click(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/barra_buscador'))
				WebUI.sendKeys(findTestObject('Creacion de personas/Page_Brokerware OnboardingX/barra_buscador'), documentNumber)
				
				
				//substring extra una parte del texto. La idea es extraer los últimos N caracteres del texto, donde N = longitud del número
				//primero quita los espacios. luego calcula cuantos caracteres tiene el texto limpio, luego calcula la longitud del numero de documento.
				//Leugo compara lo que tiene el substring con el documentNumber
				String xpath = "//tr[td[substring(normalize-space(text()), string-length(normalize-space(text())) - string-length('" + documentNumber + "') + 1) = '" + documentNumber + "']]"

				TestObject personaEncontrada = new TestObject()
				personaEncontrada.addProperty("xpath", ConditionType.EQUALS, xpath)
				
				WebUI.waitForElementClickable(personaEncontrada,15)
				WebUI.click(personaEncontrada)
				
			}else {
			/////Si la persona continua en OnboardingX ==> selecciono una persona con ID que tome de la URL
			TestObject filaPersona = new TestObject()
			filaPersona.addProperty("xpath", ConditionType.EQUALS, "//tr[td[contains(text(),'" + personaId + "')]]")

			WebUI.waitForElementClickable(filaPersona, 20)

			WebUI.click(filaPersona)
			}
			
		}
	}
}
