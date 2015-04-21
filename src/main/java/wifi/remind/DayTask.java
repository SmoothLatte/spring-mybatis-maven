package wifi.remind;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DayTask {
	private static Logger logger = LoggerFactory.getLogger(DayTask.class);
	
	@Scheduled(cron = "0/2 * * * * *")
	public void printTask(){
		logger.debug("Test");
		//System.out.println("Test");
	}
}
