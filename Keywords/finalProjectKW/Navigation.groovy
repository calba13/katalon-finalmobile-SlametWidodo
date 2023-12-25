package finalProjectKW

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable

public class Navigation {

	@Keyword
	def pilihMenu(String target) {

		try {
			Mobile.tap(findTestObject('Mobile/Navigation/nav000_HamburgerMenu'), GlobalVariable.MaxLoading)

			switch (target) {
				case 'login':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav00_divLogin'), GlobalVariable.MaxLoading)
					break
				case 'home':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav01_divHome'), GlobalVariable.MaxLoading)
					break
				case 'laptops':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav02_SBC_Laptops'), GlobalVariable.MaxLoading)
					break
				case 'headphone':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav03_SBC_Headphone'), GlobalVariable.MaxLoading)
					break
				case 'tablets':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav04_SBC_Tablets'), GlobalVariable.MaxLoading)
					break
				case 'speakers':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav05_SBC_Speakers'), GlobalVariable.MaxLoading)
					break
				case 'mice':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav06_SBC_Mice'), GlobalVariable.MaxLoading)
					break
				case 'cart':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav07_divCart'), GlobalVariable.MaxLoading)
					break
				case 'setting':
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav08_divSettings'), GlobalVariable.MaxLoading)
					break
				default:
				// LOGOUT
					Mobile.tap(findTestObject('Object Repository/Mobile/Navigation/nav00_divLogin'), GlobalVariable.MaxLoading)
					break
			}
		} catch (Exception e) {
		}
	}
}
