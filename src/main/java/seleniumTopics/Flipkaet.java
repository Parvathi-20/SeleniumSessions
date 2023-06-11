package seleniumTopics;

public class Flipkaet {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://www.myherbalife.com");
		
		String Actualtitle = brUtil.getPagetitle();
		Verify.containsValues(Actualtitle, "myHerbalife");

		String actURL = brUtil.getPageURL();
		Verify.equalValues(actURL, "https://www.myherbalife.com/");

		brUtil.quitBrowser();

	}

}
