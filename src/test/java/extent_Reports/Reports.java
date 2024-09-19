package extent_Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports implements ITestListener {
	
	// create some of the variable

		public ExtentSparkReporter report;
		// it is provide the basic information of the document --> document title  , report name , theme of the report

		public ExtentReports extent;

		// it will provide the basic info of the user --> user name , host name , envirnoment, os , browser

		public ExtentTest test;

		// it will provide the basic info of the test cases --> pass, fail, skip

		// predefined methods (Onstart , OnTestSuccess, OnTestFailure, OnTestSkipped, Onfinish)

		public void OnStart(ITestContext tr) {

			report=new ExtentSparkReporter ("C:\\Users\\durga\\eclipse-workspace\\TestNG_FrameWork\\Reports\\adactin.html");

			//document title

			report.config().setDocumentTitle("Adactin Testing Report");
			report.config().setReportName("Adactin  registeration login searchHotel  selectHotel BookAHotel BookItinerary logout validation Test");
			report.config().setTheme(Theme.STANDARD);


			// provide basic info user
			extent= new  ExtentReports();
			extent.attachReporter(report);

			extent.setSystemInfo("Host name", "Local Host");
			extent.setSystemInfo("user ", " Durgaprasad");
			extent.setSystemInfo("Envirnoment ", "QA");
			extent.setSystemInfo("Os", "Windows 11");
			extent.setSystemInfo("Browser", "Chrome,Edge,Firefox");

		}
		public void onTestSuccess(ITestResult tr) {

			test=extent.createTest(tr.getName());
			test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		}
		public void onTestFailure(ITestResult tr) {

			test=extent.createTest(tr.getName());
			test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

		}

		public void onTestSkipped(ITestResult tr) {

			test=extent.createTest(tr.getName());
			test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.PINK));

		}

		public void onFinish( ITestContext context) {
			extent.flush(); // it will un-necessary data
			
		}

}
