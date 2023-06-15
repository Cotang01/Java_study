package oop_5_hw.service;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import oop_5_hw.model.Student;


public class StudentGroupIterator implements Iterator<Student> {

    private final List<Student> studentList;
    private int position;

    public StudentGroupIterator(List<Student> studentsList) {
        this.studentList = studentsList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return studentList.get(position++);
    }

    @Override
    public void remove() {
        studentList.remove(--position);
    }
}
