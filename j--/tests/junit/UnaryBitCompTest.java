package junit;
import junit.framework.TestCase;
import pass.LBitShift;

public class UnaryBitCompTest extends TestCase {
	private LBitShift leftBitShift;
	
	protected void setUp() throws Exception {
		super.setUp();
		leftBitShift = new LBitShift();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testUBitComp() {
		//this.assertEquals(doUnaryBitwiseComplement(1),-1);
		//TODO : ADD MORE TEST ? Seems good to me

	}
}