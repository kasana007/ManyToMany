package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="course_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	private Integer cid;
	private String cname;
	private double fee;
}
