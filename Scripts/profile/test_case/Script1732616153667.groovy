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

WebUI.navigateToUrl('https://trial.rpl.id/')

WebUI.click(findTestObject('Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Login'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Email_email'), 'rplkeysuper@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/profile/add user child/mentahan/input_Lupa Password_password'), 
    'wp1F1Z7fk3D1p8vGoyZBqQ==')

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Masuk'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/a_Akun Staff'))

WebUI.rightClick(findTestObject('Object Repository/profile/add user child/mentahan/form_Ubah FotoNameEmailPhoneProvinsiKabupat_d8d452'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Tambah'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/input_Upload Photo_m_office_id'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/span_01 RPL Jakarta'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Username_username'), 'test')

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Email_email'), 'test@test.test')

WebUI.setEncryptedText(findTestObject('Object Repository/profile/add user child/mentahan/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/profile/add user child/mentahan/input_Konfirmasi Password_confirm'), 
    'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Telepon_telepon'), '66532553242')

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Telepon_role'), '')

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/input_Telepon_role'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/role_Admin'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/input_Telepon_division'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/li_Operasinal'))

