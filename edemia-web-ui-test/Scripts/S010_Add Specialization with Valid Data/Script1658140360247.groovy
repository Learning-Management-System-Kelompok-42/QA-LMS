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

WebUI.click(findTestObject('Object Repository/Page_Edemia/span_Masuk'))

WebUI.rightClick(findTestObject('Object Repository/Page_Edemia  Login/div_Masuk_lds-ellipsis'))

WebUI.setText(findTestObject('Object Repository/Page_Edemia  Login/input_Email Perusahaan_input-106'), 'yoga@wolyhings.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Edemia  Login/input_Kata Sandi_input-109'), 'sdTkv1o6Y3zZUTnOpjet/w==')

WebUI.click(findTestObject('Object Repository/Page_Edemia  Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Spesialisasi'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Tambah Spesialisasi'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Nama Spesialisasi'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Nama Spesialisasi_input-253'), 'Front-End')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_tambah spesialisasi (1)'))

WebUI.closeBrowser()

