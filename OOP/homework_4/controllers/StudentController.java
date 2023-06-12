package oop_4_hw.controllers;

import java.util.List;

import oop_4_hw.model.Student;
import oop_4_hw.service.StudentService;

public class StudentController implements UserController<Student> {

    public StudentService studentService;
    
	@Override
	public void create(String fullName, Integer age, String phoneNumber) {
		studentService.create(fullName, age, phoneNumber);
	}

	@Override
	public List<Student> getAllSortUsers() {
		return studentService.getAllSortUsers();
	}

	@Override
	public List<Student> getAllSortUsersByFamilyName() {
		return studentService.getAllSortUsersByFamilyName();
	}

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }
    
	public List<Student> getAll() {
		return studentService.getAll();
	}

	@Override
	public void edit(String fullName, Integer age, String phoneNumber) {
		studentService.edit(fullName, age, phoneNumber);
	}

}
