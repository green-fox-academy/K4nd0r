package comp.greenfox;

public class Main {

    public static void main(String[] args) {
	// write your code here
      PostIt idea1 = new PostIt("orange", "Idea 1", "blue");
      PostIt awesome = new PostIt("pink", "Awesome", "black");
      PostIt suberb = new PostIt("yellow", "Superb", "green");

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
      Animal cat = new Animal();
      System.out.println(cat.drink());

      Animal dog = new Animal();
      System.out.println(dog.eat());

      dog.play();
      System.out.println(dog.eat());
      dog.play();
      System.out.println(dog.hunger);


    }
}
