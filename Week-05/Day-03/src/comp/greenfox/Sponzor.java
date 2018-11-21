package comp.greenfox;

public class Sponzor extends Person{
  String company;
  int hiredStudents;

  Sponzor(String name, int age, String gender, String company, int hiredStudents){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public void introduce(){
    System.out.println(
        "Hi, I'm " + name + " , a " + age + " year old " +
            "" + gender + " who represents " + company + "" +
            " and hired " + hiredStudents + " students so far.");
  }
  public int hire(){
    return hiredStudents++;
  }
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
}
