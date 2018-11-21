package comp.greenfox;

public class Person {
  public String name;
  public int age;
  public String gender;

  public void introduce(){
    System.out.println("Hi, I'm " + name +", a " + age +" year old " + gender + ".");
  }
  public void getGoal(){
    System.out.println( "My goal is: Live for the moment!");
  }
  Person(){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
}
