<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>guardar_legal_address</name>
   <tag></tag>
   <elementGuidId>11cf9f41-9a43-4c3d-a066-b297d6a8c432</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;postPerson\&quot;: {\n    \&quot;PersonOnboardingId\&quot;: \&quot;0\&quot;,\n    \&quot;PersonType\&quot;: \&quot;Physical\&quot;,\n    \&quot;PersonStatus\&quot;: \&quot;Inactive\&quot;,\n    \&quot;PhysicalPersonFirstName\&quot;: \&quot;${primerNombre}\&quot;,\n    \&quot;PhysicalPersonSecondName\&quot;: \&quot;${segundoNombre}\&quot;,\n    \&quot;PhysicalPersonFirstLastName\&quot;: \&quot;${primerApellido}\&quot;,\n    \&quot;PhysicalPersonSecondLastName\&quot;: \&quot;${segundoApellido}\&quot;,\n    \&quot;PhysicalPersonEmail\&quot;: \&quot;${email}\&quot;,\n    \&quot;PhysicalPersonNationality\&quot;: \&quot;${nacionalidad}\&quot;,\n    \&quot;PhysicalPersonCivilStatus\&quot;: \&quot;${civilStatus}\&quot;,\n    \&quot;PersonProfessionId\&quot;: \&quot;1\&quot;,\n    \&quot;PersonProfessionName\&quot;: \&quot;${profession}\&quot;,\n    \&quot;PersonActivitySectorId\&quot;: \&quot;1\&quot;,\n    \&quot;PersonActivitySectorName\&quot;: \&quot;${activitySector}\&quot;,\n    \&quot;PersonQualification\&quot;: \&quot;${personQualification}\&quot;,\n    \&quot;Phone\&quot;: [\n      {\n        \&quot;PhoneId\&quot;: \&quot;2\&quot;,\n        \&quot;PhoneType\&quot;: \&quot;Business\&quot;,\n        \&quot;PhoneNumber\&quot;: \&quot;${phoneNumber}\&quot;\n      }\n    ],\n    \&quot;PhysicalPersonMainDocumentNumber\&quot;: \&quot;${documentNumber}\&quot;,\n    \&quot;PhysicalPersonMainDocumentType\&quot;: \&quot;CEDULA DE IDENTIDAD\&quot;,\n    \&quot;PhysicalPersonMainDocumentTypeId\&quot;: \&quot;3\&quot;,\n    \&quot;PhysicalPersonGender\&quot;: \&quot;M\&quot;,\n    \&quot;PhysicalPersonPatrimonyId\&quot;: \&quot;4\&quot;,\n    \&quot;PhysicalPersonPatrimonyDescription\&quot;: \&quot;Menos de 100.000\&quot;,\n    \&quot;PhysicalPersonDateOfBirth\&quot;: \&quot;2025-07-11\&quot;,\n    \&quot;PhysicalPersonCountryOfBirthId\&quot;: \&quot;151\&quot;,\n    \&quot;PhysicalPersonCountryOfBirthName\&quot;: \&quot;Paraguay\&quot;,\n    \&quot;PhysicalPersonCityOfBirthId\&quot;: \&quot;27465\&quot;,\n    \&quot;PhysicalPersonCityOfBirthName\&quot;: \&quot;Fuerte Olimpo\&quot;,\n    \&quot;PhysicalPersonPublicPositionId\&quot;: \&quot;1\&quot;,\n    \&quot;PhysicalPersonPublicPositionName\&quot;: \&quot;Ninguno\&quot;,\n    \&quot;PhysicalPersonLinkId\&quot;: \&quot;1\&quot;,\n    \&quot;PhysicalPersonLinkName\&quot;: \&quot;Ninguno\&quot;,\n    \&quot;PersonLinkPublicPositionId\&quot;: \&quot;1\&quot;,\n    \&quot;PersonLinkPublicPositionName\&quot;: \&quot;Ninguno\&quot;,\n    \&quot;PersonCompanyLinkId\&quot;: \&quot;1\&quot;,\n    \&quot;PersonCompanyLinkName\&quot;: \&quot;Ninguno\&quot;,\n    \&quot;PersonCurrencyType\&quot;: \&quot;Local\&quot;,\n    \&quot;PersonProfileRisk\&quot;: \&quot;2\&quot;,\n    \&quot;PersonRisk\&quot;: \&quot;low\&quot;,\n    \&quot;PersonRelatedFrom\&quot;: \&quot;App\&quot;,\n    \&quot;PersonTransactionalLimit\&quot;: \&quot;0.00\&quot;,\n    \&quot;PersonSubAssetClass\&quot;: [\n      {\n        \&quot;PersonSubAssetClassId\&quot;: \&quot;1\&quot;,\n        \&quot;PersonSubAssetClassName\&quot;: \&quot;\&quot;\n      }\n    ],\n    \&quot;PersonQuestion\&quot;: [\n      {\n        \&quot;QuestionId\&quot;: \&quot;1\&quot;,\n        \&quot;QuestionDescription\&quot;: \&quot;¿Qué tanto conoces sobre las alternativas de inversión en el mercado de capitales?\&quot;,\n        \&quot;PersonAnswer\&quot;: [\n          {\n            \&quot;AnswerId\&quot;: \&quot;1\&quot;,\n            \&quot;AnswerDescription\&quot;: \&quot;Casi nada – Nunca invertí y no sé nada\&quot;,\n            \&quot;AnswerIsResponse\&quot;: true\n          }\n        ]\n      }\n    ],\n    \&quot;KYC\&quot;: {\n      \&quot;KYCDate\&quot;: \&quot;2025-07-11\&quot;,\n      \&quot;KYCAdvisorUser\&quot;: \&quot;\&quot;,\n      \&quot;KYCValidatedDate\&quot;: \&quot;2025-07-11\&quot;,\n      \&quot;KYCValidatedUser\&quot;: \&quot;\&quot;,\n      \&quot;KYCPersonDocumentNumber\&quot;: \&quot;${documentNumber}\&quot;,\n      \&quot;KYCPersonName\&quot;: \&quot;${primerNombre} ${primerApellido}\&quot;,\n      \&quot;KYCPersonNationality\&quot;: \&quot;${nacionalidad}\&quot;,\n      \&quot;KYCPersonRisk\&quot;: \&quot;low\&quot;,\n      \&quot;KYCIsPLD\&quot;: false,\n      \&quot;KYCStatus\&quot;: \&quot;New\&quot;,\n      \&quot;KYCReason\&quot;: \&quot;New\&quot;,\n      \&quot;KYCId\&quot;: \&quot;0\&quot;,\n      \&quot;KYCActivateDate\&quot;: \&quot;0000-00-00\&quot;,\n      \&quot;KYCExternalStatus\&quot;: \&quot;\&quot;,\n      \&quot;KYCFlags\&quot;: \&quot;\&quot;,\n      \&quot;KYCValidateComments\&quot;: \&quot;\&quot;,\n      \&quot;KYCAdvisorComments\&quot;: \&quot;${commentsAdvisor}\&quot;,\n      \&quot;KYCMaturedDate\&quot;: \&quot;2028-07-11\&quot;,\n      \&quot;KYCPersonActivity\&quot;: \&quot;${activitySector} - 1\&quot;,\n      \&quot;KYCPersonTransactionalLimit\&quot;: \&quot;0.00\&quot;\n    },\n    \&quot;LegalAddress\&quot;: [\n{\n      \&quot;LegalAddressId\&quot;: 2,\n      \&quot;LegalAddressType\&quot;: \&quot;Personal\&quot;,\n      \&quot;LegalAddressStreet\&quot;: \&quot;aaa\&quot;,\n      \&quot;LegalAddressNumber\&quot;: \&quot;22\&quot;,\n      \&quot;LegalAddressZipCode\&quot;: 222,\n      \&quot;LegalAddressCityId\&quot;: \&quot;2659\&quot;,\n      \&quot;LegalAddressCityName\&quot;: \&quot;Praia\&quot;,\n      \&quot;LegalAddressStateId\&quot;: \&quot;99\&quot;,\n      \&quot;LegalAddressStateName\&quot;: \&quot;Praia\&quot;,\n      \&quot;LegalAddressCountryId\&quot;: \&quot;36\&quot;,\n      \&quot;LegalAddressCountryName\&quot;: \&quot;CABO VERDE, REPÚBLICA DE\&quot;,\n      \&quot;LegalAddressCountryIso\&quot;: \&quot;\&quot;,\n      \&quot;LegalAddressExtraInformation1\&quot;: \&quot;\&quot;,\n      \&quot;LegalAddressExtraInformation2\&quot;: \&quot;\&quot;\n    }\n    ],\n    \&quot;PersonFiscalResidence\&quot;: [],\n    \&quot;PersonFiscalResidenceCountryId\&quot;: \&quot;2\&quot;,\n    \&quot;PersonFiscalResidenceCountryName\&quot;: \&quot;URUGUAY\&quot;,\n    \&quot;PersonFiscalResidenceNoTINOpt\&quot;: \&quot;Option1\&quot;,\n    \&quot;PersonFiscalResidenceNoTINSpecify\&quot;: \&quot;\&quot;,\n    \&quot;PersonFiscalResidenceTIN\&quot;: \&quot;\&quot;,\n    \&quot;PersonFiscalResidenceTaxId\&quot;: \&quot;\&quot;,\n    \&quot;Archives\&quot;: [\n      {\n        \&quot;PersonArchiveId\&quot;: \&quot;1\&quot;,\n        \&quot;PersonArchivesName\&quot;: \&quot;${rutaArchive}\&quot;,\n        \&quot;PersonArchivesTypeId\&quot;: \&quot;3\&quot;,\n        \&quot;PersonArchivesTypeDescription\&quot;: \&quot;Persona\&quot;,\n        \&quot;PersonArchivesSubTypeId\&quot;: \&quot;1\&quot;,\n        \&quot;PersonArchivesSubTypeDescription\&quot;: \&quot;Referencias Comerciales\&quot;,\n        \&quot;PersonArchiveSubTypeInternalName\&quot;: \&quot;\&quot;,\n        \&quot;PersonArchivesHasExpirationDate\&quot;: true,\n        \&quot;PersonArchivesExpirationDate\&quot;: \&quot;2025-07-11\&quot;,\n        \&quot;PersonArchivesBlob\&quot;: \&quot;\&quot;,\n        \&quot;PersonArchivesExtension\&quot;: \&quot;png\&quot;,\n        \&quot;PersonArchivesEnabled\&quot;: true,\n        \&quot;PersonArchivesTemporalFileId\&quot;: \&quot;0\&quot;,\n        \&quot;ContractDocumentId\&quot;: \&quot;0\&quot;,\n        \&quot;LegalContractId\&quot;: \&quot;0\&quot;\n      }\n    ],\n    \&quot;Documents\&quot;: [\n      {\n        \&quot;PhysicalPersonDocumentTypeId\&quot;: \&quot;3\&quot;,\n        \&quot;PhysicalPersonDocumentTypeName\&quot;: \&quot;CEDULA DE IDENTIDAD\&quot;,\n        \&quot;PhysicalPersonDocumentNumber\&quot;: \&quot;${documentNumber}\&quot;,\n        \&quot;PersonDocumentIssueCountryId\&quot;: \&quot;151\&quot;,\n        \&quot;PersonDocumentIssueCountryName\&quot;: \&quot;Paraguay\&quot;,\n        \&quot;PhysicalPersonDocumentAdmissionDate\&quot;: \&quot;0000-00-00\&quot;,\n        \&quot;PhysicalPersonDocumentExpirationDate\&quot;: \&quot;0000-00-00\&quot;,\n        \&quot;PhysicalPersonDocumentIssueDate\&quot;: \&quot;0000-00-00\&quot;,\n        \&quot;PhysicalPersonDocumentWithoutExpiration\&quot;: true,\n        \&quot;PhysicalPersonDocumentIsMain\&quot;: true,\n        \&quot;PysicalPersonDocumentState\&quot;: \&quot;\&quot;\n      }\n    ]\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>71b2ad4a-0186-498b-8ae3-f9a27b481e2f</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${GlobalVariable.AuthToken}</value>
      <webElementGuid>38544848-0e69-46f5-be10-e09c8a344aee</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.2.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://cb-bwx002-api-onboarding.brokerservers.com/api/api/v1/accounts/updateOnboardingPerson</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
