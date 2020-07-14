

import java.util.*; 



public class P1Highschoolresume {


  public static void main(String[] args) {

    
    Scanner user_input = new Scanner(System.in);

    System.out.println("High School Resume Builder\n");

    System.out.println("Enter your name: ");
   
    String name = user_input.nextLine();

    System.out.println("Enter your phone number: ");

    String phonenumber = user_input.nextLine();

    System.out.println("Enter your email address: ");
    
    String email = user_input.nextLine();

    System.out.println("What job are you going to apply for?");

    String job = user_input.nextLine();

    System.out.println("Enter your achievements: ");

    String achievments = user_input.nextLine();

    System.out.println("Why would you be good at this job?: ");

    String goodjob = user_input.nextLine();

    System.out.println("Enter your skills: ");

    String skills = user_input.nextLine();

    System.out.println("Enter awards: ");

    String awards = user_input.nextLine();


    System.out.println("\n\n\n\n");

   
    System.out.println("Resume\n");
    System.out.println(name);
    System.out.println("           ");
    System.out.println(phonenumber + "\n");
    System.out.println(email +"\n");
    System.out.println("______________________________________________________________\n");
    System.out.println( "Hi my name is " + name + " I was goint to apply for " + job+"\n");
    System.out.println("I think i would be good for this job becuase " + goodjob+ "\n");
    System.out.println("______________________________________________________________________________________\n");
    System.out.println("Some of my awards are" + awards +"\n");
    System.out.println("some skills that would help me in this job are "+ skills+ "\n");
  }
}
