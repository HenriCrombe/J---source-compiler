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
		
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(0),-1);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(1),-2);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(2),-3);
		this.assertEquals(unaryBitwiseComp.doUnaryBitwiseComplement(3),-4);

	}
}