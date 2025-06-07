package Java_Programs._11_Operators;

public class P033_Grades_On_Score {
    public static void main(String[] args) {
        //Program that calculates and display the letter grade for a given numerical score
        //A:90-100,B:80-89,C:70-79,D:60-69,F:0-59
        String Score = args[0];
        int s = Integer.parseInt(Score);
        String Grade = (s>=90&&s<=100)?"A":((s>=80&&s<=89)?"B":((s>=70&&s<=79)?"C":((s>=60&&s<=69)?"D":"F")));
        System.out.println(Grade);
    }
}
