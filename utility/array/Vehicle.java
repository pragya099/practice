public class Vehicle{
    public static void main(String[] args){
     Car c1=new Car();
     Car c2=new Car("Maruti 800",100000,"white",300,5);
    }
    
}
class Driver{
    String name;
    double price;
    String color;
    Driver(){

    }
    Driver(String name, double price, String color){
        this.name=name;
        this.price=price;
        this.color=color;
    }
    public String toString(){
        return "Name is"+name+"price is:"+price;
    }
}
class Car extends Driver{
    int hp;
    int stroke;
Car(){

}
Car(String name,double price,String color,int hp ,int stroke){
    super.name=name;
    super.price=price;
    super.color=color;
    this.hp=hp;
    this.stroke=stroke;
     
}
}
