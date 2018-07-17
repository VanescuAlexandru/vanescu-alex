package sumNumbers;

import org.junit.*;

public class SumIterativeTest {
	private SumIterative sumIterative;
	private SumRecursiv sumRecursiv;

	public SumIterativeTest() {
		sumIterative = new SumIterative();
		sumRecursiv = new SumRecursiv();
	}

	@Test
	public void sumRecursiv() {

		Assert.assertEquals(12, sumRecursiv.sumNumbers("a12b"));
		Assert.assertEquals(12, sumRecursiv.sumNumbers("12"));
		Assert.assertEquals(0, sumRecursiv.sumNumbers(""));
		Assert.assertEquals(12, sumRecursiv.sumNumbers("a12c"));
		Assert.assertEquals(16, sumRecursiv.sumNumbers("adsda12cascas4fsa"));
		Assert.assertEquals(124, sumRecursiv.sumNumbers("..120..4"));
		Assert.assertEquals(0, sumRecursiv.sumNumbers("abc"));
		Assert.assertEquals(80, sumRecursiv.sumNumbers("50a10aa20"));
	}

	@Test
	public void sumIterative() {

		Assert.assertEquals(12, sumIterative.sumNumbers("a12b"));
		Assert.assertEquals(12, sumIterative.sumNumbers("12"));
		Assert.assertEquals(0, sumIterative.sumNumbers(""));
		Assert.assertEquals(12, sumIterative.sumNumbers("a12c"));
		Assert.assertEquals(16, sumIterative.sumNumbers("adsda12cascas4fsa"));
		Assert.assertEquals(124, sumIterative.sumNumbers("..120..4"));
		Assert.assertEquals(0, sumIterative.sumNumbers("abc"));
		Assert.assertEquals(80, sumIterative.sumNumbers("50a10aa20"));
	}

}
