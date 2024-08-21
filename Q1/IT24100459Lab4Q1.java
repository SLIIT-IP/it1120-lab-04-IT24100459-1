import java.util.Scanner;
 public class IT24100459Lab4Q1 {
 public static void main (String[]args) {
    int number;
    Scanner x =new Scanner(System.in);
  
    System.out.print("Enter a number -  ");
    number=x.nextInt();
  

  if(number<0) {
            System.out.println("The number is - Negative");}
  else if (number>0){
            System.out.println("The number is - Positive");}
  else {
             System.out.println("The number is Zero "); }
  }
}

