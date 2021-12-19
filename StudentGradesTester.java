/**
 * @purpose: Tester to create an array of students' grades.
 *
 * @author Ruthie Dignan
 * @version 1/26/2021
 */
 
 
public class StudentGradesTester
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Connor";
       int quiz1 = 95;
       int quiz2 = 87;
       
       String name2 = "Miz";
       int quiz3 = 86;
       int quiz4 = 99;
       
       String name3 = "Schlatt";
       int quiz5 = 100;
       int quiz6 = 76;
       
       double difference = 0.0;
       double average = 0.0;
       
       StudentGrades[] grades = {new StudentGrades(name1, quiz1,quiz2), new StudentGrades(name2, quiz3,quiz4), new StudentGrades(name3, quiz5,quiz6)};
     
       System.out.printf("%s %12s %10s %14s %11s %n", "Name", "Quiz 1", "Quiz 2", "Difference", "Average");
       System.out.println("======================================================");
       
       //prints the PlanetV10 array of objects using the toString() method
       for(StudentGrades g: grades) {
         difference = g.calcDiff();
         average = g.calcAvg();
         System.out.println(g + " " + average);

       }
       
       
       
   
   }
    
    
}
