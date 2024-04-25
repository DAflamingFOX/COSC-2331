package prob02;

class XYZ
{
    double a; // instance variable
    double b; // instance variable
    double c; // instance variable
    double d; // instance variable
    XYZ() // Constructor - no-arg
    {
        a = 0.0;
        b = 1.0;
        c = 0.0;
        d = 1.0;
    }
    XYZ(double a) // constructor - parameterized
    {
        this.a = this.b = this.c = this.d = a;
    }
    XYZ(double a1, double a2, double a3, double a4) // constructor - parameterized
    {
        a = a1;
        b = a2;
        c = a3;
        d = a4;
    }
    void prodAll() // member function
    {
    	// the this keyword ensures you are accessing the instance variable, instead of any passed arguments with the same name
        this.d = this.a*this.b*this.c;  //Explain this keyword role here
    }
    void printProdAll() // member function
    {
        System.out.println("a = "+this.a+" b = "+b+" c = "+this.c+" \nproduct d = "+d);
    }
}

class XYZDemo // class
{
    public static void main(String args[]) // member function, and main method entry point
    {
        XYZ A1; // object reference
        A1 = new XYZ(); // object creation
        XYZ A2 = new XYZ(); 
        XYZ A3; // object reference
        A3 = new XYZ(10); // object creation
        XYZ A4 = new XYZ(1,2,3,4); // object reference & object creation 
        XYZ A5 = A4; // object reference, assigned to previous object
        A1.printProdAll(); 
        A2.printProdAll(); // member function of A2 object
        A3.printProdAll(); // member function of A3 object
        A4.printProdAll();  //why identical results here and from next line
        A5.printProdAll(); // member function of A4 object, of which A5 also references to
        A1.prodAll(); // member function of A1 object
        A2.prodAll(); // member function of A2 object
        A3.prodAll(); // member function of A3 object
        A4.prodAll(); // member function of A4 object
        A5.prodAll(); // member function of A4/A5 object
        A1.printProdAll(); // member function of A1 object
        A2.printProdAll(); // member function of A2 object
        A3.printProdAll(); // member function of A3 object
        A4.printProdAll(); //why identical results here and from next line
        A5.printProdAll(); // member function of A4 object, of which A5 also references to
    }
}