/*Write a Java program for a student's result.

Store:

Student's name
Total marks obtained
Total marks possible
Percentage
Whether the student passed

Then:

Calculate the percentage from the marks.
Decide whether the student passed.
Print the student's name, percentage, and pass/fail status. */
 public class StudentResult {
    public static void main(String[] args) {
        String Name = "Lakhan";
        double MarksObtained = 77;
        float MarksPossible = 100;
        double percentage = MarksObtained / MarksPossible * 100;
        boolean isPassed = true;
        System.out.println(Name);
        System.out.println(MarksObtained);
        System.out.println(MarksPossible);
        System.out.println(percentage);
        System.out.println(isPassed);


    }
 }