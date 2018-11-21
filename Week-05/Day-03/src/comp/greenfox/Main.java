package comp.greenfox;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponzor sponsor = new Sponzor();
        people.add(sponsor);
        Sponzor elon = new Sponzor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudents(student);
        awesome.addStudents(john);
        awesome.addMentors(mentor);
        awesome.addMentors(gandhi);
        awesome.info();
	// write your code here
    }
}
