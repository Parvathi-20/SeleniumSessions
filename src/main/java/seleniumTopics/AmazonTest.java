package seleniumTopics;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://www.Amazon.com");
		
		String Actualtitle = brUtil.getPagetitle();
		Verify.containsValues(Actualtitle, "Amazon");

		String actURL = brUtil.getPageURL();
		Verify.equalValues(actURL, "https://www.amazon.com/");

		brUtil.quitBrowser();

	}

}
