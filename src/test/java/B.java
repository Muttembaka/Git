import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class B {
	
	@Test
	public void tc5() {
		System.out.println("test5");

	}

	
	@Test
	public void tc6() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	
	@Ignore
	@Test
	public void tc7() {
		System.out.println("test7");

	}

}
