package logger_task;

public class calculateConstructionCost {
	private calculateConstructionCost() {}
	
	public static double ConstructionCost(String standard, double area, boolean automatedHouse) throws NegativeValuesException {
		
		standard = standard.toLowerCase();
		if(area < 0)
			throw new NegativeValuesException("Area");
		
		if(standard.equals("Standard")) {	
			logger.LOGGER.debug("Standard materials ---  area : " + area);
			return area*1200;
		}else if(standard.equals("Above Standard")) {
			logger.LOGGER.debug("Above Standard materials --- area : " + area);
			return area*1500;
		}else if(standard.equals("High Standard") && !automatedHouse) {
			logger.LOGGER.debug("High Standard materials --- area : " + area);
			return area*1800;
		}else if(standard.equals("High Standard") && automatedHouse) {
			logger.LOGGER.debug("High Standard materials & automated house --- area : " + area);
			return area*2500;
		}
		
		return -1;
	}
}
