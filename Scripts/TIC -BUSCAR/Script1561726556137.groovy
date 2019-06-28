import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.setText(findTestObject('Object Repository/Page_Estudia Derecho en Popayn  U Cooperativa/input_Buscar un pregrado_ctl00_ctl52_g_af544b04_ddd6_4ac6_8d10_0100e861a158_csr_sbox'), 
    'ADMINISTRACION')

WebUI.click(findTestObject('Object Repository/Page_Estudia Derecho en Popayn  U Cooperativa/a_Buscar un pregrado_ctl00_ctl52_g_af544b04_ddd6_4ac6_8d10_0100e861a158_csr_SearchLink'))

WebUI.click(findTestObject('Object Repository/Page_Estudia Derecho en Popayn  U Cooperativa/i_Administracin de Empresas_fa fa-dot-circle-o'))

