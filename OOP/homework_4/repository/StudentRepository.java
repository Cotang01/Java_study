package oop_4_hw.repository;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import oop_4_hw.model.Student;
import oop_4_hw.model.StudentGroup;

@Getter

public class StudentRepository implements UserRepository<Student> {
	
    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }	

	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public void add(Student student) {
		students.add(student);
	}

	@Override
	public void remove(String fullName) {
		for (Student student : students) {
			if (student.getFullName().equals(fullName)) {
				students.remove(student);
			}
		}
	}

	@Override
	public Long getMaxId() {
		Long maxId = 0L;
		for (Student student : students) {
			if (student.getId() > maxId) {
				maxId = student.getId();
			} 
		}
		return maxId;
	}

}
