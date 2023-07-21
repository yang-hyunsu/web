package springweb.a05_mvcexp.z01_vo;
// springweb.a05_mvcexp.z01_vo.EmpJob
public class EmpJob {
	private Employee employee;
	private Job job;
	public EmpJob() {
		// TODO Auto-generated constructor stub
	}
	public EmpJob(Employee employee, Job job) {
		this.employee = employee;
		this.job = job;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
}
