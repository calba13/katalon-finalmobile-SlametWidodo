package finalProjectKW

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

public class Login {

	@Keyword
	def login(String username, String password) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "Login"
		try {

			// INPUT
			Mobile.setText(findTestObject('Mobile/LOGIN/inp_Username'), username, 0)
			Mobile.setText(findTestObject('Mobile/LOGIN/inp_Password'), password, 0)
			Mobile.tap(findTestObject('Mobile/LOGIN/btn_LOGIN'), 0)

			// Handle if Login Error (No Connection)
			boolean isErrorLogin = true
			while(isErrorLogin) {

				if(Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/LOGIN/lbl_infoErrLogin'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)) {
					Mobile.tap(findTestObject('Mobile/LOGIN/btn_LOGIN'), GlobalVariable.MaxLoading)
				} else {
					isErrorLogin = false
				}
			}

			// For Verify
			if(Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/HOME/lbl_Advantage'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading)
				Mobile.delay(0.5)
				Mobile.takeScreenshot()

				Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Navigation/LogOut/nav001_Username'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)
				Mobile.verifyElementText(findTestObject('Object Repository/Mobile/Navigation/LogOut/nav001_Username'), username, FailureHandling.STOP_ON_FAILURE)

				//				Mobile.delay(0.5)
				//				Mobile.pressBack()

				defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
				defaultVar["messageList"] << ["message" : "Username : ${username}"]
				defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
				defaultVar["messageList"] << ["message" : ""]
			} else {

				defaultVar["isSuccess"] = false;
				defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
				defaultVar["messageList"] << ["message" : "QC STATUS : NOT GOOD"]
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


