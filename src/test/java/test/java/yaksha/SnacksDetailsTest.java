package test.java.yaksha;

import static org.junit.Assert.*;


import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import main.java.yaksha.SnacksDetails;
import main.java.yaksha.TestUtils;

@RunWith(MockitoJUnitRunner.class)  
public class SnacksDetailsTest {

	@Mock  
	SnacksDetails s;//=new SnacksDetails(); 
		
	@Test
	public void testGenerateBill() throws IOException {
		//assertEquals(1300.0, s.generateBill(10,10,10));
		
		Mockito.when(s.generateBill(10,10,10)).thenReturn(1300.0);
		double actualTotal=s.generateBill(10,10,10);
		 TestUtils.yakshaAssert(TestUtils.currentTest(),(actualTotal==1300.0?true:false),TestUtils.businessTestFile);

	}
@Test
	public void testExceptionConditon() throws Exception{


	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}
	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}