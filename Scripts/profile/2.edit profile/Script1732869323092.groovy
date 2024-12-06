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

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Login/Page_Home  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Login/Page_Login  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/menu_akun_staff'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/button_Edit Profile'))

WebUI.setText(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/profile_name'), '')

WebUI.setText(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_name'), name)

WebUI.setText(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/profile_phone_number'), '')

WebUI.setText(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_phone_number'), phone_mobile)

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_province'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_province_dkijakarta'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_city'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_city_jkt_timur'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_district'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_district_cakung'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_village'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_village_cakung_timur'))

WebUI.setText(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_address'), '')

WebUI.setText(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/profile_address'), address)

WebUI.setText(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/profile_post_code'), '')

WebUI.setText(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_post_code'), pos_code)

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_update_sucess'), 
    0)

WebUI.closeBrowser()

