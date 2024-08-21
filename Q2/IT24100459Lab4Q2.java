import java.util.Scanner;

public class IT24100459Lab4Q2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
  int exmMark,labMark;
 double exmPerc,labPerc,finalMark;

 System.out.print("Please enter exam marks (out of 100) : ");
 exmMark=x.nextInt(); 

if(exmMark<0 || exmMark>100) {
    System.out.println("Invalid input for exam marks .Terminating program.");
     return; }
 
  System.out.print("Please enter lab submission marks (out of 100) : ");
    labMark=x.nextInt();

if (labMark<0 || labMark>100) {
    System.out.println("Invalid input for Lab marks.Terminating program.");
    return;}

  System.out.print("Please Enter the percentage given for the exam: ");
  exmPerc=x.nextDouble();
   
   System.out.print("Please Enter the percentage given for the lab submission: ");
  labPerc=x.nextDouble();
 
if(exmPerc+labPerc==100) {
 finalMark=exmMark*(exmPerc/100) + labMark*(labPerc/100);
 System.out.println("Final Exam mark is - "+finalMark); }
else {
  System.out.println("The percentages must add up to 100.Terminate program."); }
 }
}
 
    