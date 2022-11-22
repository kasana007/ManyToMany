package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stu_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private Integer sid;
	private String sname;
	private String sadd;
	
	@ManyToMany
	@JoinTable(name="sc_tbl",joinColumns=@JoinColumn(name="sid_fk"),
	  inverseJoinColumns=@JoinColumn(name="cid_fk"))
	 private List<Course> courses;

	
}
