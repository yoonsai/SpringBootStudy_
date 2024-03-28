package com.sist.web.entity;


import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Emp {
	@Id //자동증가번호
	private int empno;
	private int deptno,sal;
	private Integer comm,mgr;
	private String ename,job;
	private Date hiredate;
}
