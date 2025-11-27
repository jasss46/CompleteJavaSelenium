import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReport1 implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test1;

    public void onStart(ITestContext context){
        sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/myreport.html");   //specify the location
        sparkReporter.config().setDocumentTitle("Automation Testing");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent= new ExtentReports();
        extent.attachReporter(sparkReporter);
    }


    public void onTestSuccess(ITestResult result){
        test1=extent.createTest(result.getName());
        test1.log(Status.PASS,"Test case passed is:"+result.getTestName());


    }
    public void onTestFailure(ITestResult result){
        test1=extent.createTest(result.getName());
        test1.log(Status.FAIL,"Test case failed is:"+result.getTestName());
        test1.log(Status.FAIL,"Test case failed cause is:"+ result.getThrowable());

    }

    public void onTestSkipped(ITestResult result){
        test1=extent.createTest(result.getName());
        test1.log(Status.SKIP,"Test case skipped is:"+result.getTestName());


    }

    public void onFinish(ITestContext context){
        extent.flush();
    }

}


