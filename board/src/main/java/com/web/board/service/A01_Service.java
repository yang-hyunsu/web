package com.web.board.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.board.dao.A01_Dao;
import com.web.board.model.Dept;
import com.web.board.model.Employee;
import com.web.board.repository.DeptRepository;
import com.web.board.repository.EmployeeRepository;
import com.web.board.vo.Emp;
// com.web.board.service.A01_Service
@Service
public class A01_Service {
	@Autowired
	private A01_Dao dao;
	
	public List<Emp> empList(Emp sch){
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		return dao.empList(sch);
	}
	//JpaRepository<Employee, Long>
	
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    // 추가한 메서드..
    public List<Employee> findByNameAndJob(Employee sch){
    	return employeeRepository.findByNameAndJob(sch);
    }
    public Optional<Employee> findById(Long empno) {
        return employeeRepository.findById(empno);
    }
    // Emp 테이블에 데이터를 저장..
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
    // Emp의 key을 통해서 특정 row 삭제..
    public void deleteById(Long empno) {
        employeeRepository.deleteById(empno);
    }
    // Emp 테이블의 key인 empno를 통해서 수정 처리..
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
    @Autowired
    private DeptRepository deptRepository;
    
    public List<Dept> findDeptAll() {
        return deptRepository.findAll();
    }
    // 추가한 메서드..
    public List<Dept> findByNameAndLoc(Dept sch){
    	return deptRepository.findByNameAndLoc(sch);
    }
    public Optional<Dept> findByDeptno(Long deptno) {
        return deptRepository.findById(deptno);
    }   
    
}
