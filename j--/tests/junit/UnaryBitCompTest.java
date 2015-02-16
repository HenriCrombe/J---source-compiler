package junit;
import junit.framework.TestCase;
import pass.UBitComp;

public class UnaryBitCompTest extends TestCase {
	private UBitComp unaryBitwiseComp;
	
	protected void setUp() throws Exception {
		super.setUp();
		unaryBitwiseComp = new UBitComp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testUBitComp() {
		
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(2147483647),0);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(1),2147483646);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(0),2147483647);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(2),2147483645);

	}
}