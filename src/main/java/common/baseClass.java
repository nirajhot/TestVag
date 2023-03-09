package common;

import org.testng.annotations.BeforeClass;

public class baseClass {

	protected commonMethods q;
	
	@BeforeClass
	public void setUp(){
		q= new commonMethods();
		q.enQue("S1");
		q.enQue("S2");
		q.enQue("S3");
		q.show("orignal");
	}
}