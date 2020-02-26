package logger_task;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class logger {
    public static final Logger LOGGER;
    
    private logger() {}
    
    static {
    	LOGGER = Logger.getLogger(calculateConstructionCost.class);
    	
        BasicConfigurator.configure();
    }
}
