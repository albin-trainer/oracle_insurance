package com.oracle.oops.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEx2 {
public static void main(String[] args) {
	Employee e1=new Employee(101, "Bhavesh", "Accounts");
	Employee e2=new Employee(102, "Greeshma", "HR");
	Employee e3=new Employee(103, "Bikash", "Accounts");
	Employee e4=new Employee(104, "Kaushisk", "HR");
	Employee e5=new Employee(105, "Aiana", "Accounts");
	Employee e6=new Employee(106, "Kshitiz", "HR");
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);
	Map<String, List<Employee>> groups=	list.stream().collect(Collectors.groupingBy(e->e.getDepartmentName()));
	System.out.println(groups);
	System.out.println("--------HR Emps------------------");
	List<Employee> hrEmps=groups.get("HR");
	System.out.println(hrEmps);
}
}
