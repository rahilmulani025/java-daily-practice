import java.util.*;
    public class patterns{


        //fuction to print a hollow rectrangle
        public static void hollow_rectrangle(int totrows,int totclmn){
            //outer loop
            for(int i=1;i<=totrows;i++){
                // inner - columns
                for(int j=1;j<=totclmn;j++){
                    //cel-(i,j)
                    if(i==1 || i==totrows || j==1 || j==totclmn){
                        //boundry cell
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


        // function to print Inverted and rotated half pyramid
        //    *
        //   **
        //  ***
        // ****
        public static void pyramid(int n){
            for (int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }}


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //calling the function hollow rectriangle
            // System.err.println("Enter No. of rows");
            // int rows=sc.nextInt();
            // System.err.println("Enter no. of columns");
            // int columns=sc.nextInt();
            // hollow_rectrangle(rows,columns);

            // //calling a function
            // pyramid(4);
        }
    }