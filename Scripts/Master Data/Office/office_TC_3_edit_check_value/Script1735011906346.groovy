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

WebUI.navigateToMaskedUrl(url)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Master Data/menu_master_data'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/menu_office'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_button_Edit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Master Data/Office/Validation Value/office_tambah_company_name_value'), 0)

//sampai sini

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_initial_name'), initial)

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_number_of_code'), number)

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_email'), email)

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_telepon'), tlp)

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_dropdown_provinsi'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_dropdown_provinsi_jakarta'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_dropdown_kota'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_dropdown_kota_jakarta_barat'))

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_alamat'), alamat)

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_button_pin_point'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Master Data/Office/office_tambah_button_pin_point_search'), 'Jakarta Barat')

WebUI.sendKeys(findTestObject('Object Repository/Master Data/Office/office_tambah_button_pin_point_search'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_pin_point_button_terapkan_lokasi'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_button_create'))

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/office_tambah_pop_up_Berhasil Disimpan'), 'Data Office Berhasil Disimpan')

WebUI.closeBrowser()

