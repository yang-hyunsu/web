package com.web.board.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.board.dao.A01_Dao;
import com.web.board.model.Employee;
import com.web.board.repository.EmployeeRepository;
import com.web.board.vo.Emp;

@Service
public class A01_Service {
	@Autowired
	private A01_Dao dao;
	
	public List<Emp> empList(Emp sch){
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		return dao.empList(sch);
	}
	
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }	
    public List<Employee> findByNameAndJob(Employee sch){
    	return employeeRepository.findByNameAndJob(sch);
    }
    public Optional<Employee> findById(Long empno) {
        return employeeRepository.findById(empno);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(Long empno) {
        employeeRepository.deleteById(empno);
    }

    public Employee update(Long empno, Employee updatedEmployee) {
        return employeeRepository.findById(empno)
                .map(employee -> {
                	employee.setEname(updatedEmployee.getEname());
                    employee.setJob(updatedEmployee.getJob());
                    employee.setMgr(updatedEmployee.getMgr());
                    employee.setHiredate(updatedEmployee.getHiredate());
                    employee.setSal(updatedEmployee.getSal());
                    employee.setDeptno(updatedEmployee.getDeptno());
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee Id:" + empno));
    }   
}
