package finalProjectKW

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

public class SignUp {

	@Keyword
	def signup(String username, String email, String password, String firstname, String lastname, String phonenumber) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "SIGN UP"
		try {

			Mobile.tap(findTestObject('Mobile/LOGIN/btnBottom_divSignUp'), 0)

			// INPUT
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group ACCOUNT DETAILS/inp_userName'), username, 0)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group ACCOUNT DETAILS/inp_email'), email, 0)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group ACCOUNT DETAILS/inp_password'), password, 0)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group ACCOUNT DETAILS/inp_confirmPassword'), password, 0)

			Mobile.hideKeyboard()

			Mobile.scrollToText('CITY', FailureHandling.STOP_ON_FAILURE)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group PERSONAL DETAILS/inp_firstName'), firstname, 0)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group PERSONAL DETAILS/inp_lastName'), lastname, 0)
			Mobile.setText(findTestObject('Mobile/SIGNUP/Group PERSONAL DETAILS/inp_phoneNumber'), phonenumber, 0)

			Mobile.hideKeyboard()

			Mobile.tap(findTestObject('Mobile/SIGNUP/switch_MyLocation'), 0)

			Mobile.tap(findTestObject('Object Repository/Mobile/SIGNUP/btn_REGISTER'), 0)

			Mobile.delay(GlobalVariable.MaxLoading)

			if (Mobile.waitForElementPresent(findTestObject('Object Repository/Mobile/HOME/lbl_Advantage'), 5, FailureHandling.OPTIONAL)){

				defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
				defaultVar["messageList"] << ["message" : "RESULT : Akun Berhasil di daftarkan"]
				defaultVar["messageList"] << ["message" : "Username : ${username}"]
				defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
				defaultVar["messageList"] << ["message" : ""]
			} else {

				defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
				defaultVar["messageList"] << ["message" : "RESULT : User sudah terdaftar,..."]
				defaultVar["messageList"] << ["message" : "Type : Negative Test"]
				defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
				defaultVar["messageList"] << ["message" : ""]
			}
		} catch (Exception e) {

			defaultVar["isSuccess"] = false;
			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "Remark : Error Exception_ ${e}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : NOT GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		}

		new customKW.common().cetak("defaultVar : ${defaultVar}");
		new customKW.common().generateStepReport(defaultVar["isSuccess"], defaultVar["messageList"])
	}
}
