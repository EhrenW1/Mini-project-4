import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the name of your school?");
    String school1 = scan.next();
    System.out.println("What grade are you in?");
    int gradeNumber = scan.nextInt();
 int oneYear = 1;
    System.out.println("You go to "+ school1);
    System.out.println("Your current grade is "+ gradeNumber);

    int  gradeInoneYear = getGradeinOneyear( gradeNumber, oneYear);
    System.out.println(finalStatment(gradeInoneYear));
  }
   
 
  static int getGradeinOneyear(int gradeNumber, int oneYear)
  {
    int gradeInoneYear = gradeNumber + oneYear;
    return gradeInoneYear;
  }

  static String finalStatment(int gradeInoneYear)
  {
    String statment = "According to your current grade, in one year the grade you will be in is, " + gradeInoneYear;
    return statment;
  }

}
