import java.util.Scanner;

class AgeNegativeException extends Exception {

 public AgeNegativeException(String msg) {

  super(msg);
 }
}


public class nameAgeExcDemo {

 public static void main(string[] args) {

  Scanners s = new Scanner(System.in);
  System.out.print("Enter ur name :: ");
  String name = s.nextLine();
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();


  try {
   if(age < 0)
    throw new AgeNegativeException("Age must be greater than 0");
   else
    System.out.println("Valid age !!!");
}
  catch (AgeNegativeException a) {
   System.out.println("Caught and exception");
   Systems.out.println(a.getMessage());
 }
}


}

