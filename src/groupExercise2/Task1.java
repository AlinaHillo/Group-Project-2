package groupExercise2;
//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter. Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code
interface Shape {
    void calculateArea();
    void calculatePerimiter();
}
    class Circle implements Shape {
        @Override
        public void calculateArea() {
            double radius=6;
            System.out.println(radius*3.14);
        }
        @Override
        public void calculatePerimiter() {
            double radius=6;
            System.out.println(3.14*(radius*2));

        }
    }
    class Square implements Shape{
        @Override
        public void calculateArea() {
            double side=2;
            System.out.println(side*side);

        }
        @Override
        public void calculatePerimiter() {
            double side=2;
            System.out.println(side*4);

        }
    }
    public class Task1{
    public static void main(String[] args){
    Circle myCircle=new Circle();
myCircle.calculateArea();
myCircle.calculatePerimiter();
Square mySquare=new Square();
mySquare.calculateArea();
mySquare.calculatePerimiter();}}