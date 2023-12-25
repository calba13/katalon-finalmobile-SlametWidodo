package finalProjectKW

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

import internal.GlobalVariable

public class SignOut {

	@Keyword
	def signOut() {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "SIGN OUT"
		try {

			if(Mobile.verifyElementExist(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading, FailureHandling.OPTIONAL)) {
				Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading)
			}

			Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav00_divLogin'), GlobalVariable.MaxLoading)
			Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/LogOut/btnYES_confirmationLogout'), GlobalVariable.MaxLoading)
			Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading)
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
