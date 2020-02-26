package logger_task;

public final class Interest_Calculation {
	private Interest_Calculation() {}
	
	public static double calculateSimpleInterest(double principal, double time, double Rate) throws NegativeValuesException{
		
		if(principal < 0)
			throw new NegativeValuesException("Principal");
		if(time < 0)
			throw new NegativeValuesException("Time");
		if(Rate < 0)
			throw new NegativeValuesException("Rate");
		
		double result = (principal*time*Rate)/100;
		
		logger.LOGGER.debug("Principal : " + principal + " Time : " + time + " Rate : " + Rate);
		logger.LOGGER.debug("Result : " + result);
		
		return result;
	}
	
	
	public static double calculateCompoundInterest(double principle, double time, double Rate) throws NegativeValuesException {
		
		if(principle < 0)
			throw new NegativeValuesException("Principal < 0");
		if(time < 0)
			throw new NegativeValuesException("Time < 0");
		if(Rate < 0)
			throw new NegativeValuesException("Rate < 0");
		
		double result = Math.floor(principle*Math.pow(1+(Rate/100.00), time));
		result -= principle;
		
		logger.LOGGER.debug("Principal : " + principle + " Time : " + time + " Rate : " + Rate);
		logger.LOGGER.debug("Result : " + result);
		
		return result;
	}
}
