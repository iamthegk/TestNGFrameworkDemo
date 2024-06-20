package demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {
	
	// must add this class in XML file under Listeners tag just below <suite>
	// otherwise it won't work
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        // Called when a test method starts
		 System.out.println(" Called when a test method starts");
		
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Called when a test method passes
	    	System.out.println("Called when a test method passes");
	    
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Called when a test method fails
	    	// like 
	    	System.out.println("Called when a test method fails\r\n"
	    			+ "	    	// like screenshot");
	    	System.out.println(result.getName()); // print out which test failed
	    	
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        // Called when a test method is skipped
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        // Called when a test method fails but within success percentage
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        // Called before any test method is executed
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        // Called after all the test methods have run
	    }

}
