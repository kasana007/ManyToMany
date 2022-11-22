package com.app.run;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Course;
import com.app.model.Student;
import com.app.repo.CourseRepository;
import com.app.repo.StudentRepository;

@Component
public class InsertDataRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository stuRepo;
	@Autowired
	private CourseRepository crsRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Course c1=new Course(888,"SpringBoot",3000.0);
		Course c2=new Course(999,"Project",5000.0);
		Course c3=new Course(777,"SpringBoot",5000.0);
		
		crsRepo.save(c1);
		crsRepo.save(c2);
		crsRepo.save(c3);
		
		Student s1=new Student(101,"Rohit","MP",Arrays.asList(c1,c2,c3));
		Student s2=new Student(102,"Avinash","MP",Arrays.asList(c1,c2));
		Student s3=new Student(101,"Rahul","UP",Arrays.asList(c1));
		
		stuRepo.save(s1);
		stuRepo.save(s2);
		stuRepo.save(s3);

		
		
		

		
		
		

	}

}
