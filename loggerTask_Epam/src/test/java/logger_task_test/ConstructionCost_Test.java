package logger_task_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logger_task.NegativeValuesException;
import logger_task.calculateConstructionCost;


public class ConstructionCost_Test {
	
	@Test
	public void testConstructionCostStandard() throws NegativeValuesException   {
		assertEquals(24000.00,calculateConstructionCost.ConstructionCost("Standard", 20, false), 0.01);
	}
	
	@Test
	public void testConstructionCostHighStandard() throws NegativeValuesException   {
		assertEquals(3600000.00,calculateConstructionCost.ConstructionCost("High Standard", 2000, false), 0.01);
	}
	
	@Test
	public void testConstructionCostAboveStandard() throws NegativeValuesException  {
		assertEquals(300000.00,calculateConstructionCost.ConstructionCost("Above Standard", 200, false), 0.01);
	}
	
	@Test
	public void testConstructionCostHighStandardAutomated() throws NegativeValuesException  {
		assertEquals(25000.00,calculateConstructionCost.ConstructionCost("High Standard", 10, true), 0.01);
	}
	
	@Test
	public void testConstructionCostInvalidStandard()  throws NegativeValuesException   {
		assertEquals(-1,calculateConstructionCost.ConstructionCost("High", 100, true), 0.01);
	}
	
	@Test
	public void testConstructionNegative() throws NegativeValuesException  {

			try{ assertEquals(100.00,calculateConstructionCost.ConstructionCost("High Standard", -200, false), 0.01);	}		
			catch(NegativeValuesException ex) {
				assertEquals("Area", ex.getMessage());
			}
		}
	}
	

