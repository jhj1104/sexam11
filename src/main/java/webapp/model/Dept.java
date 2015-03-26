package webapp.model;

import java.util.List;

public class Dept {
	Integer deptno;
	String dname;
	String loc;
	List<Emp> emps;
	
	public Dept() {
		
	}
	
	public Dept(Integer deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Dept target = (Dept)obj;
		boolean rtn=true;
		
		 if (this.deptno != target.deptno) rtn = false;
		
		 if (this.dname == null) {
			 if (this.dname != target.dname) rtn = false;
		 }
		 else {
			 if (!this.dname.equals(target.dname)) rtn = false;
		 }
		 
		 if (this.loc == null) {
			 if (this.loc != target.loc) rtn = false;
		 }
		 else {
			 if (!this.loc.equals(target.loc)) rtn = false;
		 }
		
		return rtn;
	}
	
}
