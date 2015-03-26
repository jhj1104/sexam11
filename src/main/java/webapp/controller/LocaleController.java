package webapp.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;

@Controller
public class LocaleController {
	static Log log = LogFactory.getLog(LocaleController.class);
	
	@Autowired
	LocaleResolver lr;
	
	@RequestMapping(value="/locale",method=RequestMethod.GET)
	public String getForm() {
		return "locale/form";
	}
	
	@RequestMapping(value="/locale",method=RequestMethod.POST)
	public String setLocale(String lang, HttpServletRequest request, HttpServletResponse response) {
		
		log.info("lang = " + lang);
		Locale locale = new Locale(lang);
		lr.setLocale(request, response, locale);
		
		return "locale/index";
	}
	
	

}
