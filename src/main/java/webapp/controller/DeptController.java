package webapp.controller;

import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import webapp.beans.Calculator;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	static Log log = LogFactory.getLog(DeptController.class);
	
	@Autowired
	Calendar calendar;
	
	@Autowired
	Calculator calc;
	
	@RequestMapping("/calendar")
	public void getCalendar() {
		
		log.info("#####################");
		log.info("DeptController()...");
		log.info("#####################");
		log.info(calendar.getTime().toLocaleString());
		log.info(calc.sum(100, 50));
	}

}
