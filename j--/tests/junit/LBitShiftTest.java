package junit;
import junit.framework.TestCase;
import pass.LBitShift;

public class LBitShiftTest extends TestCase {
	private LBitShift leftBitShift;
	
	protected void setUp() throws Exception {
		super.setUp();
		leftBitShift = new LBitShift();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLeftBitShift() {
		//TODO : ADD MORE TEST ? Seems good to me
		this.assertEquals(leftBitShift.doBitShift(1, 1), 2);
		this.assertEquals(leftBitShift.doBitShift(100, 2), 400);
		this.assertEquals(leftBitShift.doBitShift(243, 3), 1944);
	
	}
}