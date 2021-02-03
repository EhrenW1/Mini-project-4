import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the name of your school?");
    String name = scan.next();
    System.out.println("What grade are you in?");
    int number = scan.nextInt();
  }
}