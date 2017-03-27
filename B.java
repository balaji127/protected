package mypack;  
import pack.*;                //Importing the package 
  
class B extends A{           //inheriting the class A over Here
  public static void main(String args[]){  
   B obj = new B();         
   obj.msg();  //callin the protected method in another package
  }  
}