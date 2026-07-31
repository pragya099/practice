public class Encapsulations{
    private String name;
    private int age ;
    private double salary;
    private int id;
private String pwd;
/*we have to declare all data member of a class private a private data memeber will not be visible or accessible from outside the class which is called data hiding mechanism 
    Step2: we have to design public type getters and setters method for evry private data to have indirect and invalidated access
    step3:it is a public type method which is used to set or write or update the details of private data
    step4:it is a public type method which is used to get or read or access the details of private data

  */
// Encapsulations(){
//     this.name=name;
//     this.age=age;
//     this.salary=salary;
//how tthe usernameo validate 
//regualar expression && escape character
// \w for all the world 
//^[\w-\.]+@([\w-]+\.)+[\w-]{2,4} - for mail verification 
//[] means or
//() means and
// }

Encapsulations(String name, int age, double salary, int id ,String pwd) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id=id;
        this.pwd=pwd;
    }
    public void Setage(int age){
if(age>18 && age<=65){
    this.age=age;
}
else{
    System.out.print("age is invalid");
}
    }
    public int getAge(int age){
        return age;
    }
    public double setsalary(double salary){
        this.salary=salary;

        return salary;
    }
    public void setName(String name){
if(name.length()>=3 && !name.isBlank() && name.matches("[A-Za-z\s]+")){
    this.name=name;
}
else{
        System.out.println("name is invalid" );
    }

    }
    public  String getname(String name){
return name;
    }

 public void setId(int id){
    if(name.length()>=5 && !name.isBlank() && name.matches("[\\w\s.- ]")){
this.id=id;

 }
}
public void setPassword(String pwd){
    if(pwd.length()<8){
        System.out.println("invalid pass");
        return;
    }
    int upperCase=0,lowerCase=0,digit=0,specialCharacter=0;
    for(int i=0;i<pwd.length();i++){
        char c=pwd.charAt(i);
        if(c>='A' && c<'z'){
            lowerCase++;
        }
        elseif(c>='A' && c<='Z'){
            upperCase++;
        }
        else if(c>='0' && c<='9'){
            digit++;
        }
        else{
            specialCharacter++;
        }
    }
    if(pwd.length()>=8 && pwd.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]")) {
      
}


}











/* */