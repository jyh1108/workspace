package edu.kh.jdbc.dto;

public class Employee2 {
		//부서명, 직급명, 이름, 이메일 
	
	private String dept_Title;
	private String job_Name;
	private String emp_Name;
	private String email;
	
	public Employee2() {
	}

	public Employee2(String dept_Title, String job_Name, String emp_Name, String email) {
		super();
		this.dept_Title = dept_Title;
		this.job_Name = job_Name;
		this.emp_Name = emp_Name;
		this.email = email;
	}

	public String getDept_Title() {
		return dept_Title;
	}

	public void setDept_Title(String dept_Title) {
		this.dept_Title = dept_Title;
	}

	public String getJob_Name() {
		return job_Name;
	}

	public void setJob_Name(String job_Name) {
		this.job_Name = job_Name;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
