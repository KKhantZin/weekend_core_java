package com.jdc.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.entity.Student;
import com.jdc.entity.Teacher;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
public class MemberTest {

    private Student student;
    private Teacher teacher;

    @BeforeEach
    public void setUp() {
        // Initialize objects before each test
		student = new Student("S001", "Peter Parker", "10th", "Paid", "Address : England");
		teacher = new Teacher("T001", "George", "Science", "Unit 5", 5);
    }

    @Test
    @Order(1)
    public void testStudentGetDetails() {
        String expected = "Student ID : S001, Name : Peter Parker, Grade : 10th";
        String actual = student.showDetails();
        assertEquals(expected, actual, "Student showDetails() should return the correct details");
    }

    @Test
    @Order(2)
    public void testStudentAccessClassInfo() {
        String expected = "Class info for Peter Parker: Grade 10th";
        String actual = student.accessClassInfo();
        assertEquals(expected, actual, "Student accessClassInfo() should return the correct class info");
    }

    @Test
    @Order(3)
    public void testTeacherGetDetails() {
        String expected = "Teacher ID : T001, Name : George, Subject : Science, Assigned Course : Unit 5, Experience Year : 5";
        String actual = teacher.showDetails();
        assertEquals(expected, actual, "Teacher showDetails() should return the correct details");
    }

    //@Test
    public void testTeacherCreateCourse() {
        String courseName = "Java Programming";
        String expected = "Course 'Java Programming' created by Mg Mg";
        String actual = teacher.createCourse(courseName);
        assertEquals(expected, actual, "Teacher createCourse() should return the correct message");
    }

    //@Test
    public void testStudentAccessPublicInfo() {
        String expected = "Public info accessed by Student: Aung Aung";
        String actual = student.accessPublicInfo();
        assertEquals(expected, actual, "Student accessPublicInfo() should return the correct message");
    }

    //@Test
    public void testTeacherAccessPublicInfo() {
        String expected = "Public info accessed by Teacher: Mg Mg";
        String actual = teacher.accessPublicInfo();
        assertEquals(expected, actual, "Teacher accessPublicInfo() should return the correct message");
    }
}