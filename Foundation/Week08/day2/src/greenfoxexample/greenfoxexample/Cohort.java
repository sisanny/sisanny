//Create a Cohort class that has the following
//
//fields:
//name: the name of the cohort
//students: a list of Students
//mentors: a list of Mentors
//methods:
//addStudent(Student): adds the given Student to students list
//addMentor(Mentor): adds the given Mentor to mentors list
//info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
//The Cohort class has the following constructors:
//
//Cohort(name): beside the given parameter, it sets students and mentors as empty lists

package greenfoxexample;

import java.util.ArrayList;

public class Cohort {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println(name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
