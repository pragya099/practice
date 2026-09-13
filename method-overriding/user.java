abstract  class user implements  Service {
// static double r;
// user( r-9){
//     this.r=r;//we can not initialise one static varible which declare with static keyword;
// } //this the main reason why non static method are not allowed inside  interface;
public static final int time=22;
final double radius;
user(double radius){
    this.radius=radius;
}
@Override
public double  getArea(){
    return 0;
}
    
@Override
public double getPerimeter(){
    return 0;
}
}
