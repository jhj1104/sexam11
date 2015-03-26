package webapp.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.beans.Calculator;
import webapp.model.Dept;
import webapp.model.Emp;

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
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String getMessage() {
		return "dept/message";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String RegisterTest(Integer deptno, String dname, String loc) {
		
		log.info("deptno = " + deptno);
		log.info("dname = " + dname);
		log.info("loc = " + loc);
		
		return "dept/registerform";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.GET)
	public String RegisterTest2(HttpServletRequest request, HttpServletResponse response) {
		
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		log.info("deptno = " + deptno);
		log.info("dname = " + dname);
		log.info("loc = " + loc);
		
		return "dept/registerform";
	}
	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public String RegisterTest2(Dept dept) {		
		
		log.info("deptno = " + dept.getDeptno());
		log.info("dname = " + dept.getDname());
		log.info("loc = " + dept.getLoc());
		
		List<Emp> emps = dept.getEmps();
		for(int i=0; i<emps.size() ; i++) {
			log.info("dept.emps[" + i + "].empno = " + emps.get(i).getEmpno());
			log.info("dept.emps[" + i + "].ename = " + emps.get(i).getEname());
		}
		
		return "dept/registerform";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String Registerform() {		
		
		return "dept/registerform";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register() {
		
		return "dept/register";
	}

}
