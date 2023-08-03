class EmpDetails{
//instance variable
int empid;
String name;
long phone;
String email;
double sal;

//parameter constructor
EmpDetails(int empid,String name,long phone,String email,double sal){
this.empid=empid;
this.name=name;
this.phone=phone;
this.email=email;
this.sal=sal;
}
//non static method
void display(){
System.out.println(empid+" "+name+" "+phone+" "+email+" "+sal);
}
public static void  main (String args[]){
EmpDetails em=new EmpDetails(1 ,"mamta" ,98765431 ,"mam@gmail.com.co" ,765.3);
em.display();//call method
}
}