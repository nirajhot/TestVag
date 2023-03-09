package testCase;

import org.testng.annotations.Test;
import common.baseClass;

public class songsPlayed extends baseClass{

	@Test(priority=0)
	public void playS4() throws Exception{
		q.play("S4");
	}

	@Test(priority=1, dependsOnMethods="playS4")
	public void playS2() throws Exception{
		q.play("S2");
	}

	@Test(priority=2, dependsOnMethods="playS2")
	public void playS1() throws Exception{
		q.play("S1");
	}
}