package comp.greenfox;

import java.util.ArrayList;


public class Cohort {

  String name;
  ArrayList<String> students = new ArrayList<>();
  ArrayList<String> mentors = new ArrayList<>();

  Cohort(String name) {
    this.name = name;
    this.students = new ArrayList();
    this.mentors = new ArrayList();
  }

  public void addStudents(Student student){
    students.add(student.toString());
  }
  public void addMentors(Mentor mentor){
    mentors.add(mentor.toString());
  }
  public String info() {
    return "The " + name  + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.";
  }
}
