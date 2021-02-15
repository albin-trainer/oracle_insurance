package com.oracle.oops.lambdas;

public class Employee {
private int empId;
private String empName;
private String departmentName;
public Employee(int empId, String empName, String departmentName) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.departmentName = departmentName;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", departmentName=" + departmentName + "]\n";
}

}
