/**
 * @purpose: The object class for the student grades.
 *
 * @author Ruthie Dignan
 * @version 1/26/2021
 *
 */
 
 
public class StudentGrades
{
   private String n;
   private double q1;
   private double q2;

     
   
   //one parameter constructor, all private instance variables initialized
   public StudentGrades(String name) {
      n = name;
      q1 = 0.0;
      q2 = 0.0;
   }

   //two parameter constructor
   public StudentGrades(String name, double score1, double score2){
      n = name;
      q1 = score1;
      q2 = score2;
   }
   
   public String getName() {
      return n; 
   }
   
   public double getQuiz1() {
      return q1;  
   }
   
   public double getQuiz2() {
      return q2;  
   }
   
   
   public void setName(String name) {
      n = name;
   }
   
   public void setQuiz1(double quiz1) {
      q1 = quiz1;
   }
   
   public void setDiam(double quiz2) {
      q2 = quiz2;
   }
   
   //calculate difference
   public double calcDiff()
   {
       double difference = 0.0;
       difference = q1 - q2;
       return difference;
   }

   //calculate average
   public double calcAvg()
   {
       double average = 0.0;
       average = (q1 + q2) / 2.0;
       return average;
   }

   //overloaded method
   public double calcDiff(int q1, int q2)
   {
       double difference = 0.0;
       difference = q1 - q2;
       return difference;
   }
   
   public double calcAvg(int q1, int q2)
   {
       double average = 0.0;
       average = (q1 + q2) / 2.0;
       return average;
   }
   

   public String toString() {
   
      return String.format("%-10s %-10.1f %-11.1f %-14.1f", getName(), getQuiz1(), getQuiz2(), calcDiff(), calcAvg());  
   }
    
}