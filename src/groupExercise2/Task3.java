package groupExercise2;
//Create a Class Car that would have the following
//fields:   carPrice   and   color   and   method
//calculateSalePrice() which should be returning a price
//of the car.
//Create 2 sub classes: Sedan and Truck. The Truck
//class   has   field   as   weight   and   has   its   own
//implementation   of   calculateSalePrice()   method   in
//which   returned   price   calculated   as   following:   if
//weight>2000 then returned price car should include
//10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it
//is   own   implementation   of   calculateSalePrice():   if
//length of sedan is >20 feet then returned car price
//should include 5% discount, otherwise 10% discount
class Car{
    double carPrice;
    String color;

    void calculateSalePrice() {
        System.out.println("The price of the car is " + carPrice + " and it is " +color);
    }}

    class Sedan extends Car{
    double length;

    @Override
    void calculateSalePrice() {

        if (length>20){
            System.out.println("The price of the Sedan is " + carPrice*0.95);
    }else{
            System.out.println("The price of the Sedan is " + carPrice*0.90);
        }
}
}
    class Truck extends Car{
    double weight;

    @Override
    void calculateSalePrice() {

        if(weight>2000){
          System.out.println("The price of the Truck is " + carPrice * 0.9);}
        else{
        System.out.println("The price of the Truck is " + carPrice*0.8);
    }
}}
class TestPrice{
    public static void main(String[] args){
    Sedan mySedan=new Sedan();
    mySedan.carPrice=2000;
    mySedan.length=25;

    mySedan.calculateSalePrice();
    Truck myTruck=new Truck();
    myTruck.carPrice=4300;
    myTruck.weight=4800;
    myTruck.calculateSalePrice();
}}