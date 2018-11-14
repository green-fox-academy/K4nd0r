package comp.greenfox;

import java.util.Scanner;

import static java.awt.Color.BLACK;
import static java.awt.Color.black;

public class Main {

    public static void main(String[] args) {

	// POST-IT

      PostIt idea1 = new PostIt("orange", "Idea 1", "blue");
      PostIt awesome = new PostIt("pink", "Awesome", "black");
      PostIt suberb = new PostIt("yellow", "Superb", "green");

      //BLogPOST

      BlogPost first = new BlogPost(
          "John Doe",
          "Lorem Ipsum",
          "Lorem ipsum dolor sit amet.",
          "2000.05.04."
      );
      BlogPost secound = new BlogPost(
          "Tim Urban",
          "Wait but why",
          "A popular long-form, stick-figure-illustrated blog about almost everything.",
          "2010.10.10."
      );
      BlogPost third = new BlogPost(
          "William Turton",
          "One Engineer Is Trying to Get IBM to Reckon With Trump",
          "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
              " When I asked to take his picture outside one of IBM’s New York City offices," +
              " he told me that he wasn’t really into the whole organizer profile thing.",
          "2017.03.28."
      );

      //Animal

      Animal cat = new Animal();
      System.out.println(cat.drink());

      Animal dog = new Animal();
      System.out.println(dog.eat());

      dog.play();
      System.out.println(dog.eat());
      dog.play();
      System.out.println(dog.hunger);

      //Sharpie

      Sharpie one = new Sharpie("BLACK", 20, 80);
      Sharpie two = new Sharpie("black",12, 20);
      Sharpie three = new Sharpie("black",10, 0);
      System.out.println(one.use());
      System.out.println(two.use());
      System.out.println(three.use());
      SharpieSet set = new SharpieSet();

      System.out.println(set.countUsable());
      set.removeTrash();


      //Counter

      Counter numOne = new Counter();
      System.out.println("add a number");
      Scanner scannar = new Scanner(System.in);
      int number = scannar.nextInt();
      numOne.add(number);

      System.out.println(numOne.get());
      System.out.println(numOne.reset());

    }
}
