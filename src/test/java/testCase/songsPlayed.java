package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import common.BaseClass;

public class SongsPlayed extends BaseClass{

	@Test(priority=0)
	public void playS4() throws Exception{
		q.play("S4");
		Assert.assertEquals("S2S3S4", q.show("S4"), "Test Passed: Expected Sequence is getting matched");
	}

	@Test(priority=1, dependsOnMethods="playS4")
	public void playS2() throws Exception{
		q.play("S2");
		Assert.assertEquals("S3S4S2", q.show("S2"), "Test Passed: Expected Sequence is getting matched");
	}

	@Test(priority=2, dependsOnMethods="playS2")
	public void playS1() throws Exception{
		q.play("S1");
		Assert.assertEquals("S4S2S1", q.show("S1"), "Test Passed: Expected Sequence is getting matched");
	}

	//Below test-case is added to test logic if user is adding element(song) even after queue is full
	//Currently I have thrown exception if size if full
	@Test(priority=3)
	public void playS5() throws Exception{
		q.enQue("S5");
	}
}