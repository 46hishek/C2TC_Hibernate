package com.cg.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store")
public class Manager extends Employee{
	
	private static final long serialVersionUID = 1L;
	private String DepartmentName;
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
