package Generic_Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListnersImplementation implements ITestListener {

	public void onTestStart(ITestResult result) {
	String TestScriptName=result.getMethod().getMethodName();
		System.out.println(TestScriptName+"*****Test Script Execution Started*****");
		
	} 

	public void onTestSuccess(ITestResult result) {
		String TestScriptName=result.getMethod().getMethodName();
		System.out.println(TestScriptName+"*****Test Script Execution passed*****");
		
	}

	public void onTestFailure(ITestResult result) {
		String TestScriptName=result.getMethod().getMethodName();
		System.out.println(TestScriptName+"*****Test Script Execution failed*****");
		System.out.println(result.getThrowable());
		
		//Takes ScreenShot
		String ScreenShotName=TestScriptName+new JavaUtility().getSystemDate();
		WebDriverUtility w=new WebDriverUtility();
		
	}

	public void onTestSkipped(ITestResult result) {
		String TestScriptName=result.getMethod().getMethodName();
		System.out.println(TestScriptName+"*****Test Script Execution Skipped*****");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Suite Execution Started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Suite Execution Finished");
		
		
	}
	

}
