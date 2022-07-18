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

WebUI.click(findTestObject('Object Repository/Page_Edemia/a_Masuk'))

WebUI.rightClick(findTestObject('Object Repository/Page_Edemia  Login/div_Masuk_lds-ellipsis'))

WebUI.rightClick(findTestObject('Object Repository/Page_Edemia  Login/div_Masuk_lds-ellipsis'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Login/div_Masuk_v-overlay v-overlay--active theme--dark'))

WebUI.rightClick(findTestObject('Object Repository/Page_Edemia  Login/div_Masuk_lds-ellipsis'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Login/input_Email Perusahaan_input-106'))

WebUI.click(findTestObject('Object Repository/Page_Edemia  Login/div_Email Perusahaan'))

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Login/input_Email Perusahaan_input-106'), 'yoga@wolyhings.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Edemia  Login/input_Kata Sandi_input-109'), 'sdTkv1o6Y3zZUTnOpjet/w==')

WebUI.click(findTestObject('Object Repository/Page_Edemia  Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Kursus'))

WebUI.click(findTestObject('Object Repository/Page_Course/a_tambah kursus'))

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-232'), 'Mempelajari UI/UX')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/textarea__input-235'), 'Belajar UI/UX')

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/button_Pilih File'))

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-249'), 'mODUL 1')

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/div_Kembali tambah kursusMasukan data kursu_b834e9'))

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-249'), 'Modul 1')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-252'), 'www.google.com')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-255'), 'www.google.com')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/textarea__input-261'), 'Bisa ga?')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-265'), 'Bisa')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-267'), 'Bisa banget')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-269'), 'Ga')

WebUI.setText(findTestObject('Object Repository/Page_Course  Add Course/input__input-271'), 'Susah')

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/i_Opsi Jawaban Benar_v-icon notranslate mdi_dff5e2'))

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/div_Bisa'))

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/button_Simpan Kursus'))

WebUI.click(findTestObject('Object Repository/Page_Course  Add Course/button_Simpan Kursus'))

