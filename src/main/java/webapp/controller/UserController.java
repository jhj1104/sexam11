package webapp.controller;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webapp.model.Address;
import webapp.model.User;

@Controller
public class UserController {
	
	// /m/user/register?name=hjji&job=programmer&age=25&birthday=2015-03-26&
	//					addrs[0].country=korea&addrs[0].city=seoul&addrs[0].gu=su
	
	@RequestMapping("/user/register")
	public void registar(User user, PrintWriter out) {
		out.println("user.name = " + user.getName() + "<br>");
		out.println("user.age = " + user.getAge() + "<br>");
		out.println("user.birthday = " + user.getBirthday() + "<br>");
		
		
		String[] job = user.getJob();
		if(job!=null)
			for (String j : job)
				out.println("user.job = " + j+"<br>");
		
		List<Address> addrs = user.getAddrs();
		if(addrs!=null)
			for(Address h : addrs) {
				out.println("user.addrs.county = " + h.getCountry()+ "<br>");
				out.println("user.addrs.city = " + h.getCity()+ "<br>");
				out.println("user.addrs.gu = " + h.getGu()+ "<br>");
			}
	}
	
	
	@RequestMapping(value="/user/register", method=RequestMethod.GET)
	public String register() {
		
		return "user/register";
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	public String register(User user, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			model.addAttribute("error", "바인딩에러");
		}
			
		
		return "user/registersucess";
	}

}

