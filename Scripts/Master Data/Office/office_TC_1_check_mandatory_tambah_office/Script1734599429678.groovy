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

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_button_tambah'))

WebUI.click(findTestObject('Object Repository/Master Data/Office/office_tambah_button_create'))

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Alamat Gedung_Bangunan Wajib diisi'), alamat)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Company Name Wajib diisi'), company_name)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Email Wajib diisi'), email)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Initial Name Wajib diisi'), initial)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Kabupaten_Kota Wajib dipilih'), kota)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Number of code Wajib diisi'), number)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Provinsi Wajib dipilih'), provinsi)

WebUI.verifyElementText(findTestObject('Object Repository/Master Data/Office/validation/office_tambah_validation_Telepon Wajib diisi'), tlp)

WebUI.closeBrowser()