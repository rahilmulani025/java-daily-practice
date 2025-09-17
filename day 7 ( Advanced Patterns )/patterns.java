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

        // function for printitng inverted pyramid with numbers
        public static void inverted_number_pyramid(int n){
            for(int i=1;i<=n;i++){
                //inner - numbers
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }
                System.out.println();
            }}

        //function to print floyds traingle
            public static void floyd_pattern(int n){
                int counter =1;
                for(int i=1;i<=n;i++){
                     for(int j=1; j<=i;j++){
                        System.out.print(counter+" ");
                        counter++;
            }
            System.out.println();
            }}

            // function to print 0-1 triangle
            public static void zero1triangle(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        if((i+j)%2==0){
                            System.out.print("1");
                        }
                        else{
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }

        
            // CREATING A FUNCTON TO PRINT BUTTERFLY PATTERN
              public static void butterfly(int n){
                //1st half
                for(int i=1; i<=n ;i++){
                    // stars = i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }

                    //spaces = 2*(n-1)
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }

                    //stars =i
                     for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }

                //2nd half
                for(int i=n;i>=1;i--){
                     // stars = i
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }

                    //spaces = 2*(n-1)
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }

                    //stars =i
                     for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();

                }
              }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //calling the function hollow rectriangle
            // System.err.println("Enter No. of rows");
            // int rows=sc.nextInt();
            // System.err.println("Enter no. of columns");
            // int columns=sc.nextInt();
            // hollow_rectrangle(rows,columns);

            // //calling a function to print pyramid 
            // pyramid(4);

            // calling a function to print inverted half number pyramid
            // inverted_number_pyramid(10);

            //calling a function to print floyds trainagle pattern
            // floyd_pattern(5);
            // // // //

            //0-1 triangle
            // zero1triangle(5);

            //butterfly pattern
            // butterfly(4);
             
        }
    }