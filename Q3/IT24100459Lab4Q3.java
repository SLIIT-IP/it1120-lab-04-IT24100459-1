import java.util.Scanner;
 public class IT24100459Lab4Q3 {
 public static void main (String[]args) {
    int number;
    String answer;
    Scanner x =new Scanner(System.in);
  
    System.out.print("Enter a number -  ");
    number=x.nextInt();
    answer=number <0 ? "The number is : Negative": number>0  ? "The number is : Positive":
                 "The number is zero" ;
  
    System.out.println(answer);  
  }
}

