package comp.greenfox;

public class Mentor extends Person{
    String level;

  Mentor(String name, int age, String gender, String level){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
  public void introduce(){
    System.out.println("Hi, I'm " + name +", a " + age +" year old " + gender + level + "mentor.");
  }
}
