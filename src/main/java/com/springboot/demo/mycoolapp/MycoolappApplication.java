package com.springboot.demo.mycoolapp;

import com.springboot.demo.mycoolapp.dao.AccountDAO;
import com.springboot.demo.mycoolapp.dao.StudentDAO;
import com.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*@SpringBootApplication(
		scanBasePackages = {"com.springboot.demo.mycoolapp",
							"com.mycoolapp.util"}
)*/
@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO, AccountDAO accountDAO){
		return	runner -> {
			//createStudent(studentDAO);

			//readStudent(studentDAO, 6);

			demoBeforeAdvice(accountDAO);
		};
	}

	private void demoBeforeAdvice(AccountDAO accountDAO) {
		accountDAO.addAccount();
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student");
		Student student = new Student( "Ivan", "Ivanov", "ivan@musk.com");

		System.out.println("Saving the student");
		studentDAO.save(student);

		System.out.println("Saved student. Generated id: " + student.getId());
	}

	private void readStudent(StudentDAO studentDAO, Integer id){
		System.out.println("Reading the student");

		Student student = studentDAO.findById(id);
		System.out.println("Found the student " + student);
	}
}
