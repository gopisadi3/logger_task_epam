package logger_task_test;

import org.junit.Test;

import logger_task.logger;
import logger_task.Interest_Calculation;
import logger_task.NegativeValuesException;

import static org.junit.Assert.assertEquals;

public class InterestTest {

	@Test
	public void testCompoundInterest() throws NegativeValuesException {
		assertEquals(10.0,Interest_Calculation.calculateCompoundInterest(100, 1, 10), 0.001);
	}
	
	@Test
	public void testSimpleInterest() throws NegativeValuesException {
		assertEquals(20.0,Interest_Calculation.calculateSimpleInterest(100, 2, 10), 0.001);
	}

	@Test
	public void testSimpleInterestRate(){	
		try {
			Interest_Calculation.calculateSimpleInterest(100, 1, -10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Rate", ex.getMessage());
		}
	}
	
	@Test
	public void testSimpleInterestTime(){	
		try {
			Interest_Calculation.calculateSimpleInterest(100, -1, 10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Time", ex.getMessage());
		}
	}
	
	@Test
	public void testSimpleInterestPrincipal() {	
		try {
			Interest_Calculation.calculateSimpleInterest(-100, 1, 10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Principal", ex.getMessage());
		}
	}
	
	@Test
	public void testCompoundInterestRate() throws Exception{	
		try {
			Interest_Calculation.calculateCompoundInterest(100, 1, -10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Rate < 0", ex.getMessage());
		}
	}
	
	@Test
	public void testCompoundInterestTime() throws Exception{	
		try {
			Interest_Calculation.calculateCompoundInterest(100, -1, 10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Time < 0", ex.getMessage());
		}
	}
	
	@Test
	public void testCompoundInterestPrincipal() throws Exception{	
		try {
			Interest_Calculation.calculateCompoundInterest(-100, 1, 10);			
		}catch(NegativeValuesException ex) {
			logger.LOGGER.debug(ex.getMessage());
			assertEquals("Principal < 0", ex.getMessage());
		}
	}
}
