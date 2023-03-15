package common;

import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	protected CommonMethods q;
	private String[] initialSongs = {"S1", "S2", "S3"};

	@BeforeClass
	public void setUp() throws Exception{
		String log4jConfPath = System.getProperty("user.dir")+"/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		q= new CommonMethods();
		for(int i=0;i<initialSongs.length;i++){
			q.enQue(initialSongs[i]);
			//q.enQue("S2");
			//q.enQue("S3");
		}
		Assert.assertEquals("S1S2S3", q.show("orignal"), "Test Passed: Expected Sequence is getting matched");
	}
}