package groupExercise2;
//We have to calculate the average of marks obtained
//in three subjects by student A and by student B.
//Create   class   'Marks'   with   an   abstract   method
//'getPercentage' that will be returning the average
//percentage   of   marks.   Provide   implementation   of
//abstract   method   in   classes   'A'   and   'B'.   The
//constructor of student A takes the marks in three
//subjects as its parameters and the marks in four
//subjects as its parameters for student B. Test your
//code
abstract class Marks{
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    abstract void getPercentage();
    }
class A extends Marks{
    public A(int mark1, int mark2, int mark3) {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void getPercentage(){
    int averageA=(mark1+mark2+mark3)/3;
    System.out.println("The average mark for student A is " + averageA);
}}
class B extends Marks {

     public B(int mark1, int mark2, int mark3, int mark4) {
         this.mark1 = mark1;
         this.mark2 = mark2;
         this.mark3 = mark3;
         this.mark4 = mark4;
     }
void getPercentage(){
    int averageB=(mark1+mark2+mark3+mark4)/4;
    System.out.println("The average mark for student B is " + averageB);
} }
public class Task2{
        public static void main(String[] args){
            Marks A=new A(56,82,99);
            A.getPercentage();
            Marks B=new B(36,56,89,95);
            B.getPercentage();
}}