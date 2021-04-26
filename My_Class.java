class My_Class {
	void myMethod() {   //definition of method
	   //static methods can be directly called without any object creation
    System.out.println("Hello World! in mymethod()");
  }

  public static void main(String[] args) {
	  My_Class ob1=new My_Class();
      //ob1.myMethod();   //calling the method
      ob1.myMethod(); 
	  System.out.println("Hello World! in main method");
  }
}
