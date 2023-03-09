package common;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;

public class baseClass {

	protected commonMethods q;
	
	@BeforeClass
	public void setUp() throws Exception{
		String log4jConfPath = System.getProperty("user.dir")+"/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		q= new commonMethods();
		q.enQue("S1");
		q.enQue("S2");
		q.enQue("S3");
		q.show("orignal");
	}
}