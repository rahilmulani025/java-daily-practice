import java.util.*;
public class java1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
       // int b= sc.nextInt();
       // int c= sc.nextInt();
       // int sum = a + b + c;
       // System.out.println(sum/3);

      //int side = sc.nextInt();
      // System.out.println("Area of square: " + (side * side));

      float pencil = sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser = sc.nextFloat();
     float total = pencil + pen + eraser;
     System.out.println("Total cost: " + total);
     System.out.println("With Gst: " + (total+(total*0.18)));
    }
}