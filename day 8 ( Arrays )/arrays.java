import java.util.*;

public class arrays{


    // creating a function to update a array
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    // Creating a function for liner search
    public static int linerSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);


        // crating a array
        // int marks[]=new int[100]; //size = 0 because nothing is stored in it yet
        // int number[]={1,2,3}; // size=3
        // String fruits[]={"apple","bannana","mango"}; // size=3

        // calculating the length of an array
        // System.out.println("length of marks:"+marks.length);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // System.out.println("phy:"+marks[0]);  // taking output from the array
        // System.out.println("chem:"+marks[1]); // taking output from the array
        // System.out.println("maths:"+marks[0]); // taking output from the array

        // marks[0]=100; // updating
        // marks[1]=marks[1]+1; // updating or changing values
        // System.out.println("updated phy:"+marks[0]);  // taking output from the array
        // System.out.println("updated chem:"+marks[1]); // taking output from the array

        // passing an array as an argument // call by reffrence
        // int marks[]={97,98,99};
        // update(marks);
        // // print our marks
        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println();

        // for liner search
        // int number[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        // int key=10;
        // int index=linerSearch(number, key);
        // if(index==-1){
        //     System.out.println("Key not found");
        // }
        // else{
        //      System.out.print("key is at index"+index);
        // }
       


    }
}
