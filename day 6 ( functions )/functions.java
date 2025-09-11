import java.util.*;
public class functions{


    //CREATING A FUNCTION TO CALCULATE SUM OF TWO NUMBERS

    public static int calculatesum(int a, int b){
        int sum = a + b ;
        System.out.println("sum:"+sum);
        return sum;
    }



    //CREATING A FUNCTION TO SWAP 2 VALUES
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);   }



    //CREATING A FUNCTION TO FIND PRODUCT OF A & B
    public static int multiply(int a, int b){
       int product=a*b;
       return product;
    } 

    //CREATING A FUNCTION TO CALCULATE FACTORIAL OF A NUMBER
    public static int factorial(int n){
        int f=1; 
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    // CRAETING A FUNCTION FOR CALCULATING BINOMAIAL COFF

    public static int bincoff( int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int bc=n_fact/(r_fact*nmr_fact);
        return bc;


    }

    // CREATING A FUNCTION TO CHECK N IS PRIME OR NOT (optimized)
    public static boolean checkprime(int n){
        if (n==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
  
    //Print all prime in range \
    public static void PrimeIR(int n){
        for (int i=2;i<=n;i++){
            
            if (checkprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();  
    }

    // Creating a function to convert a binary number to decimal
    public static void bin2dec(int binNum){
        int mynum=binNum;
        int pow=0;
        int decNum=0;

        while (binNum>0){
            int LD= binNum % 10;
            decNum = decNum + ( LD * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of "+mynum+"="+decNum);
    }

    // creating a function to convert a decimal number to a binary number
    public static void dec2bin(int n){
        int mynum=n;
        int pow = 0;
        int binnum =0;
        while(n>0){
            int rem = n%2;
            binnum = binnum + (rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of"+mynum+"="+binnum);

    }

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  int a =sc.nextInt();
        //  int b =sc.nextInt();
        //  calculatesum(a,b); // calling a function

        //  swaping 2 values - values exchange
        //  int a = 10;
        //  int b = 5;
        //  int temp=a;
        //  a=b;
        //  b=temp;
        //  System.out.println("a="+a);
        //  System.out.println("b="+b);

        // calling function swap
        // swap(10,5);

        // calling function multiply
        //     int a = 10;
        //     int b = 20;
        //    int product = multiply(a,b); // calling
        //    System.out.println(product);

        // caling function factorial
        // System.out.println("enter your number");
        // int a=sc.nextInt();
        // int result=factorial(a);
        // System.out.println("Factorail:"+result);

        // calling coff function
        // System.out.println(bincoff(10,5));

        // calling a function prime
        // System.out.println(checkprime(2));
        

        /// calling a function to cgeck prime in range
        // PrimeIR(200);

        //calling a function to convert a binary number to decimal number
        // System.out.println("Enter a binary no. you want to convert to decimal");
        // int n=sc.nextInt();
        // bin2dec(n);

        //calling a function to convert a decimal number to binary decimal
        // dec2bin(12);

        // Block Scope:
        //     Variables declared within a block of code, which is defined by curly braces { }, have block scope.
        //     This includes variables declared inside methods, if statements, for loops, while loops, and any other code enclosed by curly braces.
        //     A block-scoped variable is only accessible from the point of its declaration until the end of its enclosing block.
        //     Attempting to access a block-scoped variable outside its block will result in a compile-time error.

        //     public class block_scope_Example {
        //     public static void main(String[] args) {
        //     int x = 10; // x has scope within the main method
        //     if (x > 5) {
        //         int y = 20; // y has block scope within this if statement
        //         System.out.println(y); // Accessible
        //     }
        //     // System.out.println(y); // Error: y is out of scope
        // }}

        // Class Scope (Instance and Static Variables):
        // Variables declared directly within a class, but outside of any method or block, have class scope.
        // These are broadly categorized into instance variables (non-static) and static variables (class variables).
        // Instance variables: belong to specific objects (instances) of the class and are accessible within all non-static methods and blocks of that object. Their lifetime is tied to the object's existence.
        // Static variables: belong to the class itself, not to any particular object. They are shared among all instances of the class and are accessible within all methods and blocks of the class (both static and non-static). Their lifetime persists as long as the class is loaded in memory. 
    
        //         public class MyClass {
        //     int instanceVar = 5; // Instance variable, class scope
        //     static int staticVar = 10; // Static variable, class scope

        //     public void myMethod() {
        //         System.out.println(instanceVar); // Accessible
        //         System.out.println(staticVar); // Accessible
        //     }

        //     public static void main(String[] args) {
        //         MyClass obj = new MyClass();
        //         System.out.println(obj.instanceVar); // Accessible via object
        //         System.out.println(MyClass.staticVar); // Accessible via class name
        //     }}

    }
}