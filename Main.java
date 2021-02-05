import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the name of your school?");
    String school1 = scan.next();
    System.out.println("What grade are you in?");
    int gradeNumber = scan.nextInt();

    System.out.println("You go to "+ school1);
    System.out.println("Your current grade is "+ gradeNumber);
  }

}
