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

WebUI.navigateToUrl('https://radiant-kataifi-b63e51.netlify.app/')

WebUI.click(findTestObject('Object Repository/Page_Edemia/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Nama Perusahaan_input-106'), 'Seculab')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Alamat Perusahaan_input-109'), 'Jalan secu No 1')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Bidang Perusahaan_input-112'), 'Security System')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Website Perusahaan_input-115'), 'seculab.secu')

WebUI.click(findTestObject('Object Repository/Page_Edemia  Register/span_Pilih File'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Register/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Nama Perusahaan_input-106'), 'Sara')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Nomor Handphone_input-109'), '8126492629')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Bidang Perusahaan_input-112'), 'No 2')

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Register/input_Website Perusahaan_input-115'), 'sara@secu.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Edemia  Register/input_Kata Sandi_input-126'), 'UA4vYDmCBqOHlkVuOidxpg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Edemia  Register/input_Konfirmasi Kata Sandi_input-130'), 
    'UA4vYDmCBqOHlkVuOidxpg==')

WebUI.click(findTestObject('Object Repository/Page_Edemia  Register/div_Konfirmasi Kata Sandi_v-input--selectio_955132'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Register/button_Daftar sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Register/h1_Informasi Perusahaan'))

