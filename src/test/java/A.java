import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class A {

	@Test
	public void tc1() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);

	}

	@Ignore
	@Test
	public void tc2() {
		System.out.println("test2");

	}

	@Test
	public void tc3() {
		System.out.println("test3");

	}

}
