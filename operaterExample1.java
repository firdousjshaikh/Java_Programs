class operaterExample1{
//static method
static void  calc_arithmetic(){
int num1=80,num2=87,res;
System.out.println("Addition is"+(num1+num2));
System.out.println("Subtraction is"+(num1-num2));
System.out.println("Multiplication is"+(num1*num2));
System.out.println("Division is"+(num1/num2));
}
//static method
  static void calc_relational(){
  double num1=89.45,num2=45.46;
  System.out.println("Greater number is"+(num1>num2));
  System.out.println("Lesser number is"+(num1<num2));
  }
  //static method
  static void calc_assingment(){
  int num1=768;
  num1+=20;//num1=num1+20//768+20 num1=788
  System.out.println(num1);
  int num2=54;
  num2-=40;//num2=num2-40//54-40 num2=14
  System.out.println(num2);
  }
 public static void main(String args[]){
	  //calling static method with classname
	  operaterExample.calc_arithmetic();
	  operaterExample.calc_relational();
	  operaterExample.calc_assingment();
 }
}
  