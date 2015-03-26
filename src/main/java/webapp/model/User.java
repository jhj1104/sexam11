package webapp.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	String name;
	Integer age;
	@DateTimeFormat(pattern="yyyymmdd")
	Date birthday;	
	
	String[] job;
	List<Address> addrs;
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String[] getJob() {
		return job;
	}
	
	public void setJob(String[] job) {
		this.job = job;
	}
	
	public List<Address> getAddrs() {
		return addrs;
	}
	
	public void setAddrs(List<Address> addrs) {
		this.addrs = addrs;
	}
	

}
