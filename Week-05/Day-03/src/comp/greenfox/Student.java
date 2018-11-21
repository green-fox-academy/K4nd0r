package comp.greenfox;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  Student(String name, int age, String gender, String previousOrganization){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }
  Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }
  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }
  public void introduce(){
    System.out.println(
        "Hi, I'm " + name + "," +
            " a "+ age +" year " + gender + " from " + previousOrganization + " who" +
            " skipped " + skippedDays + " days from the course already."
    );
  }
  public int skipDays(int numberOfDays){
    this.skippedDays = skippedDays + numberOfDays;
    return skippedDays;
  }

}
