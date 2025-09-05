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

    // CREATING A FUNCTION TO CHECK N IS PRIME OR NOT
       public static boolean prime(int n){  
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println("The no. is not prime");
            }
            else{System.out.println("the no. is prime");
        }

        }}

 

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
        prime(5);


    

    }
}