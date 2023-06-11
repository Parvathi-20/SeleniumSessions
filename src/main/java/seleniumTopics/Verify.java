package seleniumTopics;

public class Verify {

	public static boolean equalValues(String ActualResult, String ExpectedResult) {
		if (ActualResult.equals(ExpectedResult)) {
			System.out.println("Pass >> " + ActualResult + " is equal to " + ExpectedResult);
			return true;
		} else {
			System.out.println("fail >> " + ActualResult + " is not equal to " + ExpectedResult);
			return false;
		}

	}

	public static boolean containsValues(String ActualResult, String ExpectedResult) {
		if (ActualResult.contains(ExpectedResult)) {
			System.out.println("Pass >> " + ActualResult + " contains " + ExpectedResult);
			return true;
		} else {
			System.out.println("fail >> " + ActualResult + " does not contains " + ExpectedResult);
			return false;
		}

	}

}
